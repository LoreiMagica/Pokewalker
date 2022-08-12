package com.lorei.pokwalker

import android.os.Bundle
import android.util.Log
import android.util.Log.DEBUG
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.synnapps.carouselview.CarouselView
import com.synnapps.carouselview.ImageListener

class FragmentInicial : Fragment() {

    lateinit var fondoInicial: CarouselView
    lateinit var botonSiguiente : ImageView
    lateinit var botonAnterior : ImageView
    lateinit var botonAceptar : ImageView
    lateinit var nombreInicial : TextView
    val imagenInicial = mutableListOf<Int>()



    val listaInicial = arrayOf<Pokemon>(
        ActivityContenedor.pokedexTotal[0],
        ActivityContenedor.pokedexTotal[3],
        ActivityContenedor.pokedexTotal[6],
        ActivityContenedor.pokedexTotal[151],
        ActivityContenedor.pokedexTotal[154],
        ActivityContenedor.pokedexTotal[157],
        ActivityContenedor.pokedexTotal[251],
        ActivityContenedor.pokedexTotal[254],
        ActivityContenedor.pokedexTotal[257],
        ActivityContenedor.pokedexTotal[386],
        ActivityContenedor.pokedexTotal[389],
        ActivityContenedor.pokedexTotal[392],
        ActivityContenedor.pokedexTotal[494],
        ActivityContenedor.pokedexTotal[497],
        ActivityContenedor.pokedexTotal[500]

    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_inicial, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        botonSiguiente = requireView().findViewById<ImageView>(R.id.boton_siguiente)
        botonAnterior = requireView().findViewById<ImageView>(R.id.boton_atras_mochila)
        botonAceptar = requireView().findViewById<ImageView>(R.id.boton_aceptar)
        nombreInicial = requireView().findViewById<TextView>(R.id.nombreInicial)

        nombreInicial.text = listaInicial[0].nombre




        for (i in listaInicial) {
            imagenInicial.add(i.icono)
        }
        fondoInicial = requireView().findViewById(R.id.icono_inicial)
        val imageListener = ImageListener { position, imageView -> imageView.setImageResource(imagenInicial.get(position)) }
        fondoInicial.setImageListener(imageListener)
        fondoInicial.setPageCount(listaInicial.size)



        siguienteEdificio()
        anteriorEdificio()
        botonAceptar()

    }

    fun siguienteEdificio() {
        botonSiguiente.setOnClickListener {
            var posicionAcual = fondoInicial.currentItem + 1
            if (posicionAcual >= imagenInicial.size ){
                posicionAcual = 0
            }
            nombreInicial.text = listaInicial[posicionAcual].nombre
            fondoInicial.setCurrentItem(posicionAcual)
        }
    }

    fun anteriorEdificio() {
        botonAnterior.setOnClickListener {
            var posicionAcual = fondoInicial.currentItem - 1
            if (posicionAcual < 0 ){
                posicionAcual = imagenInicial.size - 1
            }
            nombreInicial.text = listaInicial[posicionAcual].nombre
            fondoInicial.setCurrentItem(posicionAcual)
        }
    }

    fun botonAceptar() {
        botonAceptar.setOnClickListener { view ->
            ActivityContenedor.pokemonUsado = listaInicial[fondoInicial.currentItem]
            ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual[listaInicial[fondoInicial.currentItem].numero.toInt()].numero.toInt()-2, listaInicial[fondoInicial.currentItem])
            Toast.makeText(getActivity(), "Ahora sales de paseo con " + ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()

                val fragmentPaseo =
                    FragmentBase()
                val transaction = requireActivity().supportFragmentManager.beginTransaction()
                transaction.replace(R.id.contenedor, fragmentPaseo, "ficha")
                transaction.addToBackStack(null)
                transaction.commit()
            }
        }
}