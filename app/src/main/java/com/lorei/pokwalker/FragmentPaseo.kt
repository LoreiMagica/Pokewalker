package com.lorei.pokwalker

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.graphics.drawable.AnimationDrawable
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide

class FragmentPaseo : Fragment(), SensorEventListener {
    private var sensorManager: SensorManager? = null
    private var running = false
    private var pasosTotales = 0f
    private var totalPasosPrevio = 0f
    lateinit var imagenPokemon: ImageView
    lateinit var animacionEmocion: AnimationDrawable
    lateinit var cuadroAfecto: ImageView
    lateinit var botonAtras : ImageView
    lateinit var botonCombate : ImageView
    lateinit var tv_pasosDados : TextView


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_paseo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loadData()
        imagenPokemon = requireView().findViewById<ImageView>(R.id.icono_pokemon)
        botonAtras = requireView().findViewById<ImageView>(R.id.boton_atras)
        botonCombate = requireView().findViewById<ImageView>(R.id.boton_combate)
        tv_pasosDados = requireView().findViewById<TextView>(R.id.pasosDados)
        var biomaFondo = requireView().findViewById<ImageView>(R.id.bioma_fondo)


        comprobarAmistad()
        terminarPaseo()
        resetSteps()
        combate()


        cuadroAfecto = requireView().findViewById<ImageView>(R.id.emocion)
        cuadroAfecto.setBackgroundResource(R.drawable.animacion_puntos)
        animacionEmocion = cuadroAfecto.getBackground() as AnimationDrawable
        cuadroAfecto.setVisibility(ImageView.INVISIBLE)

        Glide.with(requireActivity())
            .load(ActivityContenedor.pokemonUsado.icono)
            .into(imagenPokemon)

        Glide.with(requireActivity())
            .load(ActivityContenedor.biomaUsado.icono)
            .into(biomaFondo)
        sensorManager = activity?.getSystemService(Context.SENSOR_SERVICE) as SensorManager
    }

    override fun onSensorChanged(event: SensorEvent?) {
        if (running) {
            pasosTotales = event!!.values[0]

            val pasosActuales = pasosTotales.toInt() - totalPasosPrevio.toInt()

            if (pasosActuales > 3000 && !ActivityContenedor.mensajeLegendario && ActivityContenedor.biomaUsado.esLegendario) {
                Toast.makeText(getActivity(), "Sientes la presencia de un pokémon amenazante cerca", Toast.LENGTH_SHORT).show()
                ActivityContenedor.mensajeLegendario = true
            }

            if (ActivityContenedor.pokemonUsado.nivel < 100.toByte()) {
                ActivityContenedor.pokemonUsado.siguienteNv -=5
                if (ActivityContenedor.pokemonUsado.siguienteNv <= 0) {
                    ActivityContenedor.pokemonUsado.nivel++
                    ActivityContenedor.pokemonUsado.siguienteNv = Math.pow(ActivityContenedor.pokemonUsado.nivel.toDouble(), 3.0).toInt()
                    ActivityContenedor.pokemonUsado.amistad++
                    Toast.makeText(getActivity(), ActivityContenedor.pokemonUsado.nombre + " ha subido al nivel " + ActivityContenedor.pokemonUsado.nivel, Toast.LENGTH_SHORT).show()
                }
            }


            if (ActivityContenedor.pokemonUsado.amistad < 255){
                ActivityContenedor.pokemonUsado.amistad = (ActivityContenedor.pokemonUsado.amistad+2).toShort()
            } else if (ActivityContenedor.pokemonUsado.amistad > 255) {
                ActivityContenedor.pokemonUsado.amistad = 255
            }

            Log.d("amistad", ActivityContenedor.pokemonUsado.amistad.toString())
            tv_pasosDados.text = ("$pasosActuales")
            val animacionSalto: Animation = AnimationUtils.loadAnimation(context, R.anim.jump_pokemon)
            imagenPokemon.startAnimation(animacionSalto)
        }
    }

    override fun onResume() {
        super.onResume()
        running = true
        val stepSensor = sensorManager?.getDefaultSensor(Sensor.TYPE_STEP_COUNTER)

        if (stepSensor == null) {
            Toast.makeText(getActivity(), "No se detecta sensor de pasos en este dispositivo", Toast.LENGTH_SHORT).show();
        } else {
            // Rate suitable for the user interface
            sensorManager?.registerListener(this, stepSensor, SensorManager.SENSOR_DELAY_UI)
        }
    }

    fun comprobarAmistad() {
        imagenPokemon.visibility = ImageView.VISIBLE
        imagenPokemon.setOnClickListener {
            val player= MediaPlayer.create(requireContext(), ActivityContenedor.pokemonUsado.sonido)
            player.start()
            cuadroAfecto.setVisibility(ImageView.VISIBLE)

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

    private fun resetSteps() {
        val tv_pasosDados = requireView().findViewById<TextView>(R.id.pasosDados)

        tv_pasosDados.setOnLongClickListener {
            totalPasosPrevio = pasosTotales
            tv_pasosDados.text = 0.toString()

            saveData()
            true
        }
    }

    fun terminarPaseo() {
        botonAtras.setOnClickListener {
            val player= MediaPlayer.create(requireContext(), R.raw.sonido_atras)
            player.start()
            for (i in 1 until ActivityContenedor.pokedexActual.size) {
                if (ActivityContenedor.pokedexActual.get(i).nombre.equals(ActivityContenedor.pokemonUsado.nombre)){
                    ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(i)), ActivityContenedor.pokemonUsado)
                    Log.d("pokemonActualizado", ActivityContenedor.pokedexActual.get(i).toString())
                }
            }
            if (pasosTotales- totalPasosPrevio > 0) {
                ActivityContenedor.dinero += (pasosTotales- totalPasosPrevio).toInt()

            }
            resetSteps()

            val comprobarEvolucion = ComprobarEvolucion()
            if (comprobarEvolucion.comprobarNivel(ActivityContenedor.pokemonUsado)) {
                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
            } else if (comprobarEvolucion.comprobarAmistad(ActivityContenedor.pokemonUsado)) {
                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
            }

            val fragmentbase =
                FragmentBase()
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.contenedor, fragmentbase, "ficha")
            transaction.addToBackStack(null)
            transaction.commit()

        }
    }

    fun combate() {
        botonCombate.setOnClickListener {
            var mediaPlayer: MediaPlayer? = MediaPlayer.create(context, R.raw.sonido_click)
            mediaPlayer?.start()
            if(ActivityContenedor.dinero >= 50) {

                val builder = AlertDialog.Builder(context)
                builder.setTitle("Pokéradar")
                builder.setMessage("¿Deseas usar 50 monedas para usar el pokéradar? Tienes "+ ActivityContenedor.dinero +" monedas" )
                builder.setPositiveButton(
                    "Usar",
                    DialogInterface.OnClickListener{ dialog, which -> ActivityContenedor.dinero -= 50
                        for (i in 1 until ActivityContenedor.pokedexActual.size) {
                            if (ActivityContenedor.pokedexActual.get(i).nombre.equals(ActivityContenedor.pokemonUsado.nombre)){
                                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(i)), ActivityContenedor.pokemonUsado)
                                Log.d("pokemonActualizado", ActivityContenedor.pokedexActual.get(i).toString())
                            }
                        }
                        ActivityContenedor.dinero += (pasosTotales- totalPasosPrevio).toInt()

                        val fragmentbase =
                            FragmentCombate((pasosTotales- totalPasosPrevio).toInt())
                        val transaction = requireActivity().supportFragmentManager.beginTransaction()
                        transaction.replace(R.id.contenedor, fragmentbase, "ficha")
                        transaction.addToBackStack(null)
                        transaction.commit()
                    }
                )

                builder.setNegativeButton(
                    "Cancelar",
                    DialogInterface.OnClickListener{ dialog, which -> dialog.dismiss() }
                )
                builder.show()
            } else {
                Toast.makeText(context, "No tienes suficiente dinero", Toast.LENGTH_SHORT).show()
            }
             }
    }

    private fun saveData() {

        val sharedPreferences = requireActivity().getSharedPreferences("myPrefs", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putFloat("key1", totalPasosPrevio)
        editor.apply()
    }

    private fun loadData() {

        val sharedPreferences = requireActivity().getSharedPreferences("myPrefs", Context.MODE_PRIVATE)
        val savedNumber = sharedPreferences.getFloat("key1", 0f)

        totalPasosPrevio = savedNumber
    }




    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
    }


}


