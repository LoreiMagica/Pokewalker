package com.lorei.pokwalker

import android.content.Context
import android.content.res.Resources
import android.graphics.drawable.AnimationDrawable
import android.media.AudioManager
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.Resource
import com.synnapps.carouselview.CarouselView
import com.synnapps.carouselview.ImageListener

class FragmentBase : Fragment() {

    lateinit var fondoEdificio: CarouselView
    lateinit var botonSiguiente : ImageView
    lateinit var botonAnterior : ImageView
    lateinit var botonAceptar : ImageView
    lateinit var imagenPokemon : ImageView
    lateinit var animacionEmocion: AnimationDrawable
    lateinit var cuadroAfecto: ImageView



    val listaEdificios = intArrayOf(
        R.drawable.edificio_tienda,
        R.drawable.edificio_centro_pokemon,
        R.drawable.edificio_mochila,
        R.drawable.edificio_salir
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_base, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        botonSiguiente = requireView().findViewById<ImageView>(R.id.boton_siguiente)
        botonAnterior = requireView().findViewById<ImageView>(R.id.boton_atras_mochila)
        imagenPokemon = requireView().findViewById<ImageView>(R.id.icono_pokemon)
        botonAceptar = requireView().findViewById<ImageView>(R.id.boton_aceptar)


        comprobarAmistad()
        cuadroAfecto = requireView().findViewById<ImageView>(R.id.emocion)
        cuadroAfecto.setBackgroundResource(R.drawable.animacion_puntos)
        animacionEmocion = cuadroAfecto.getBackground() as AnimationDrawable
        cuadroAfecto.setVisibility(ImageView.INVISIBLE)

        fondoEdificio = requireView().findViewById<CarouselView>(R.id.fondo_edificio)
        val imageListener = ImageListener { position, imageView -> imageView.setImageResource(listaEdificios.get(position)) }
        fondoEdificio.setImageListener(imageListener)
        fondoEdificio.setPageCount(listaEdificios.size)


        siguienteEdificio()
        anteriorEdificio()
        botonAceptar()
        ActivityContenedor.mensajeLegendario = false


        Glide.with(requireActivity())
            .load(ActivityContenedor.pokemonUsado.icono)
            .into(imagenPokemon)


        val db = requireActivity().openOrCreateDatabase("baseGuardado.db", Context.MODE_PRIVATE, null)
        val contexto = requireActivity()

        val activityContenedor = ActivityContenedor()
       activityContenedor.guardarDatos(db, contexto)

    }

    fun siguienteEdificio() {
        botonSiguiente.setOnClickListener {
            val animacionSalto: Animation = AnimationUtils.loadAnimation(requireActivity(), R.anim.jump_pokemon)

            var mediaPlayer: MediaPlayer = MediaPlayer.create(context, R.raw.sonido_click)
            mediaPlayer.start()

            imagenPokemon.startAnimation(animacionSalto)
            var posicionAcual = fondoEdificio.currentItem + 1
            if (posicionAcual >= listaEdificios.size ){
                posicionAcual = 0
            }
            fondoEdificio.setCurrentItem(posicionAcual)
        }
    }

    fun anteriorEdificio() {
        botonAnterior.setOnClickListener {
            val animacionSalto: Animation = AnimationUtils.loadAnimation(requireActivity(), R.anim.jump_pokemon)
            val player= MediaPlayer.create(requireContext(), R.raw.sonido_click)
            player.start()
            imagenPokemon.startAnimation(animacionSalto)
            var posicionAcual = fondoEdificio.currentItem - 1
            if (posicionAcual < 0 ){
                posicionAcual = listaEdificios.size - 1
            }
            fondoEdificio.setCurrentItem(posicionAcual)
        }
    }

    fun comprobarAmistad() {
        imagenPokemon.setVisibility(ImageView.VISIBLE)
        imagenPokemon.setOnClickListener {
            cuadroAfecto.setVisibility(ImageView.VISIBLE)

            val mediaPlayer: MediaPlayer = MediaPlayer.create(context, ActivityContenedor.pokemonUsado.sonido)
            mediaPlayer.start()

            if (ActivityContenedor.pokemonUsado.amistad < 70){
                cuadroAfecto.setBackgroundResource(R.drawable.animacion_puntos)
            } else if (ActivityContenedor.pokemonUsado.amistad in 70..149) {
                cuadroAfecto.setBackgroundResource(R.drawable.animacion_feliz)
            } else if (ActivityContenedor.pokemonUsado.amistad in 150..199) {
                cuadroAfecto.setBackgroundResource(R.drawable.animacion_musica)
            } else if (ActivityContenedor.pokemonUsado.amistad in 200..254) {
                cuadroAfecto.setBackgroundResource(R.drawable.animacion_corazon_pequeno)
            } else if (ActivityContenedor.pokemonUsado.amistad == 255.toShort()){
                cuadroAfecto.setBackgroundResource(R.drawable.animacion_corazon_grande)
            }
            animacionEmocion = cuadroAfecto.getBackground() as AnimationDrawable
            animacionEmocion.start()
            val handler = Handler()
            handler.postDelayed( {cuadroAfecto.setVisibility(ImageView.INVISIBLE)}, 2000)
        }

    }

    fun botonAceptar() {
        botonAceptar.setOnClickListener { view ->
            val mediaPlayer: MediaPlayer = MediaPlayer.create(context, R.raw.sonido_click)
            mediaPlayer.start()
            if (fondoEdificio.currentItem == 0) {
                val fragmentTienda =
                    FragmentTienda()
                val transaction = requireActivity().supportFragmentManager.beginTransaction()
                transaction.replace(R.id.contenedor, fragmentTienda, "ficha")
                transaction.addToBackStack(null)
                transaction.commit()
            } else if (fondoEdificio.currentItem == 1) {
                val fragmentCentroPokemon =
                    FragmentCentroPokemon()
                val transaction = requireActivity().supportFragmentManager.beginTransaction()
                transaction.replace(R.id.contenedor, fragmentCentroPokemon, "ficha")
                transaction.addToBackStack(null)
                transaction.commit()

            } else if (fondoEdificio.currentItem == 2) {
                val fragmentMochila =
                    FragmentMochila()
                val transaction = requireActivity().supportFragmentManager.beginTransaction()
                transaction.replace(R.id.contenedor, fragmentMochila, "ficha")
                transaction.addToBackStack(null)
                transaction.commit()
            }  else if (fondoEdificio.currentItem == 3) {
                val fragmentPaseo =
                    FragmentBioma()
                val transaction = requireActivity().supportFragmentManager.beginTransaction()
                transaction.replace(R.id.contenedor, fragmentPaseo, "ficha")
                transaction.addToBackStack(null)
                transaction.commit()
            }
        }
    }

}