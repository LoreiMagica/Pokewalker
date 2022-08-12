package com.lorei.pokwalker


import android.app.AlertDialog
import android.content.DialogInterface
import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.*
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import kotlin.math.pow
import kotlin.random.Random

class FragmentCombate(pasos : Int) : Fragment() {

    lateinit var imagenPokemonAliado: ImageView
    lateinit var imagenPokemonEnemigo: ImageView
    var vidaMaxAliado :Byte= 4
    var vidaMaxEnemigo :Byte= 4
    var vidaActualEnemigo = 4
    val obtenerEnemigo = ObtenerEnemigo()
    val pokemonEnemigo : Pokemon = obtenerEnemigo.obtenerEnemigoPorBioma(pasos)
    var ataqueAliado = true


    lateinit var botonHuir : Button
    lateinit var botonAtacar : Button
    lateinit var botonEsquivar : Button
    lateinit var botonCapturar : Button
    lateinit var textoCombate: TextView
    lateinit var vidaAliado : TextView
    lateinit var vidaEnemigo : TextView
    lateinit var barraExp : ProgressBar




    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_combate, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        imagenPokemonAliado = requireView().findViewById(R.id.icono_pokemon_aliado)
        val nombreAliado = requireView().findViewById<TextView>(R.id.nombre_aliado)
        vidaAliado = requireView().findViewById(R.id.numero_vida_aliado)
        textoCombate = requireView().findViewById(R.id.texto_combate)

        imagenPokemonEnemigo = requireView().findViewById(R.id.icono_pokemon_enemigo)
        val nombreEnemigo = requireView().findViewById<TextView>(R.id.nombre_enemigo)
        vidaEnemigo = requireView().findViewById(R.id.numero_vida_enemigo)
        val biomaFondo = requireView().findViewById<ImageView>(R.id.bioma_fondo)
        val pokemonCapturado = requireView().findViewById<ImageView>(R.id.icono_pokemon_capturado)


        botonAtacar = requireView().findViewById(R.id.botonAtacar)
        botonEsquivar = requireView().findViewById(R.id.botonEsquivar)
        botonCapturar = requireView().findViewById(R.id.botonCapturar)
        botonHuir = requireView().findViewById(R.id.botonHuir)
        barraExp = requireView().findViewById(R.id.barraExp)


        vidaMaxEnemigo = ActivityContenedor.pokemonUsado.vida
        vidaMaxEnemigo = pokemonEnemigo.vida

        if (!ActivityContenedor.pokedexActual[pokemonEnemigo.numero-1].nombre.equals(pokemonEnemigo.nombre)) {
            pokemonCapturado.visibility = ImageView.INVISIBLE
        }
        textoCombate.text = "¿Qué debería hacer " + ActivityContenedor.pokemonUsado.nombre + "?"


        Glide.with(requireActivity())
            .load(ActivityContenedor.pokemonUsado.icono)
            .into(imagenPokemonAliado)
        nombreAliado.text = ActivityContenedor.pokemonUsado.nombre
        vidaAliado.text = ActivityContenedor.pokemonUsado.vida.toString()

        Glide.with(requireActivity())
            .load(pokemonEnemigo.icono)
            .into(imagenPokemonEnemigo)
        nombreEnemigo.text = pokemonEnemigo.nombre
        vidaEnemigo.text = pokemonEnemigo.vida.toString()

        Glide.with(requireActivity())
            .load(ActivityContenedor.biomaUsado.icono)
            .into(biomaFondo)
        val mediaPlayer: MediaPlayer = MediaPlayer.create(context, pokemonEnemigo.sonido)
        mediaPlayer.start()

        atacar()
        esquivar()
        capturar()
        huir()

        barraExp.max = Math.pow(ActivityContenedor.pokemonUsado.nivel.toDouble(), 3.0).toInt()
        barraExp.progress = ActivityContenedor.pokemonUsado.siguienteNv
        //barraExp.min = 0
    }



    fun atacar() {
        botonAtacar.setOnClickListener{
            ataqueAliado = true
            turnos()
        }
    }

    fun esquivar() {
        botonEsquivar.setOnClickListener{
            ataqueAliado = false
            turnos()
        }
    }

    fun turnos() {
        botonAtacar.isEnabled = false
        botonEsquivar.isEnabled = false
        botonCapturar.isEnabled = false
        botonHuir.isEnabled = false

        val ataqueEnemigo = Random.nextBoolean()
        if (ataqueAliado && ataqueEnemigo) {
            textoCombate.text = "¡Ambos pokémon atacan! Al golpearse, ambos pierden 1 punto de salud"
            val animacionSalto: Animation = AnimationUtils.loadAnimation(context, R.anim.ataque_pokemon_aliado)
            val animacionAtaqueEnemigo: Animation = AnimationUtils.loadAnimation(context, R.anim.ataque_pokemon_enemigo)

            imagenPokemonAliado.startAnimation(animacionSalto)
            imagenPokemonEnemigo.startAnimation(animacionAtaqueEnemigo)

            pokemonEnemigo.vida --
            vidaEnemigo.text = pokemonEnemigo.vida.toString()
            ActivityContenedor.pokemonUsado.vida --
            vidaAliado.text = ActivityContenedor.pokemonUsado.vida.toString()

        } else if (ataqueAliado && !ataqueEnemigo) {
            textoCombate.text = ActivityContenedor.pokemonUsado.nombre +" ataca. ¡Pero " +  pokemonEnemigo.nombre + " lo esquiva! "+ ActivityContenedor.pokemonUsado.nombre +" pierde 1 punto de salud al caerse"
            val animacionSalto: Animation = AnimationUtils.loadAnimation(context, R.anim.ataque_pokemon_aliado)
            imagenPokemonAliado.startAnimation(animacionSalto)
            imagenPokemonEnemigo.startAnimation(animacionSalto)

            ActivityContenedor.pokemonUsado.vida --
            vidaAliado.text = ActivityContenedor.pokemonUsado.vida.toString()

        } else if (!ataqueAliado && ataqueEnemigo) {
            textoCombate.text =
                pokemonEnemigo.nombre + " ataca. ¡Pero " + ActivityContenedor.pokemonUsado.nombre + " lo esquiva! " + pokemonEnemigo.nombre + " pierde 1 punto de salud al caerse"
            val animacionSalto: Animation = AnimationUtils.loadAnimation(context, R.anim.ataque_pokemon_enemigo)
            imagenPokemonAliado.startAnimation(animacionSalto)
            imagenPokemonEnemigo.startAnimation(animacionSalto)

            pokemonEnemigo.vida--
            vidaEnemigo.text = pokemonEnemigo.vida.toString()

        }else if (!ataqueAliado && !ataqueEnemigo) {
            textoCombate.text = "¡Ambos pokémon se han puesto en posición de esquivar!... Pero nada ha sucedido"
        }
        botonAtacar.isEnabled = true
        botonEsquivar.isEnabled = true
        botonCapturar.isEnabled = true
        botonHuir.isEnabled = true

        if (pokemonEnemigo.vida == 0.toByte()) {
            botonAtacar.isEnabled = false
            botonEsquivar.isEnabled = false
            botonCapturar.isEnabled = false
            botonHuir.isEnabled = false
            textoCombate.text = "¡"+ pokemonEnemigo.nombre +" se ha debilitado!. Has recibido 200 monedas y " + ActivityContenedor.pokemonUsado.nivel*(14*ActivityContenedor.pokemonUsado.nivel/3) +" puntos de experiencia." + System.getProperty("line.separator") + "Toca para continuar"
            ActivityContenedor.dinero += 100
            ActivityContenedor.pokemonUsado.amistad = (ActivityContenedor.pokemonUsado.amistad + 2).toShort()
            if (ActivityContenedor.pokemonUsado.amistad > 255.toShort()) {
                ActivityContenedor.pokemonUsado.amistad = 255
            }

            if (ActivityContenedor.pokemonUsado.nivel < 100.toByte()) {
                if ((ActivityContenedor.pokemonUsado.siguienteNv - ActivityContenedor.pokemonUsado.nivel*((14*ActivityContenedor.pokemonUsado.nivel)/3)) >0) {
                    ActivityContenedor.pokemonUsado.siguienteNv = ActivityContenedor.pokemonUsado.siguienteNv - ActivityContenedor.pokemonUsado.nivel*((14*ActivityContenedor.pokemonUsado.nivel)/3)

                } else {
                    val expRestante = ActivityContenedor.pokemonUsado.nivel*((14*ActivityContenedor.pokemonUsado.nivel)/3) - ActivityContenedor.pokemonUsado.siguienteNv
                    ActivityContenedor.pokemonUsado.nivel++
                    ActivityContenedor.pokemonUsado.siguienteNv = Math.pow(ActivityContenedor.pokemonUsado.nivel.toDouble(), 3.0).toInt()
                    ActivityContenedor.pokemonUsado.siguienteNv -= expRestante
                    Toast.makeText(getActivity(), ActivityContenedor.pokemonUsado.nombre + " ha subido al nivel " + ActivityContenedor.pokemonUsado.nivel, Toast.LENGTH_SHORT).show()
                }
                barraExp.progress = ActivityContenedor.pokemonUsado.siguienteNv

            }


            ActivityContenedor.pokemonUsado.vida = vidaMaxAliado
            ActivityContenedor.pokedexTotal[pokemonEnemigo.numero-1].vida = vidaMaxEnemigo

            textoCombate.setOnClickListener{
                val fragmentbase =
                    FragmentPaseo()
                val transaction = requireActivity().supportFragmentManager.beginTransaction()
                transaction.replace(R.id.contenedor, fragmentbase, "ficha")
                transaction.addToBackStack(null)
                transaction.commit()            }

            val comprobarEvolucion = ComprobarEvolucion()
            if (comprobarEvolucion.comprobarNivel(ActivityContenedor.pokemonUsado)) {
                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
            } else if (comprobarEvolucion.comprobarMovimiento(ActivityContenedor.pokemonUsado)) {
                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
            } else if (comprobarEvolucion.comprobarAmistad(ActivityContenedor.pokemonUsado)) {
                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
            }else if (comprobarEvolucion.comprobarBioma(ActivityContenedor.pokemonUsado)) {
                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
            }

        } else if(ActivityContenedor.pokemonUsado.vida == 0.toByte()) {
            botonAtacar.isEnabled = false
            botonEsquivar.isEnabled = false
            botonCapturar.isEnabled = false
            botonHuir.isEnabled = false
            textoCombate.text = "¡ Oh no,"+ ActivityContenedor.pokemonUsado.nombre +" se ha debilitado!. Huyes del combate para curarlo" + System.getProperty("line.separator") + "Toca para continuar"

            ActivityContenedor.pokemonUsado.vida = vidaMaxAliado
            ActivityContenedor.pokedexTotal[pokemonEnemigo.numero-1].vida = vidaMaxEnemigo

            textoCombate.setOnClickListener{
                val fragmentbase =
                    FragmentPaseo()
                val transaction = requireActivity().supportFragmentManager.beginTransaction()
                transaction.replace(R.id.contenedor, fragmentbase, "ficha")
                transaction.addToBackStack(null)
                transaction.commit()            }
        }


    }


    fun capturar() {
        botonCapturar.setOnClickListener {
            var ratioPokeball : Double = 1.0
            var pokeballUsada = R.drawable.pokeball_poke_ball
        val listapokeballs = ArrayList<CharSequence>()
        val listapokeballsItem = ArrayList<Objeto>()



        val builder = AlertDialog.Builder(context)
        //builder.setTitle("objeto.nombre")
        builder.setTitle("¿Deseas capturar el pokémon salvaje?")

        for (item in ActivityContenedor.listaInventario) {
            if (!item.esEvolutivo) {
                if (item.cantidad > 0) {

                    when (item.nombre) {
                        "Pokéball" -> {
                            listapokeballs.add("Pokéball")
                            listapokeballsItem.add(item)
                        }

                        "Superball" -> {
                            listapokeballs.add("Superball")
                            listapokeballsItem.add(item)
                        }

                        "Ultraball" -> {
                            listapokeballs.add("Ultraball")
                            listapokeballsItem.add(item)
                        }
                    }
                }
            }
        }
                    builder.setItems(listapokeballs.toTypedArray()) { dialog : DialogInterface, which : Int ->
                        when (which) {
                            0 -> {
                                when (listapokeballs[0]) {
                                    "Pokéball" -> {
                                        ratioPokeball = 1.0
                                        listapokeballsItem[0].cantidad --
                                        pokeballUsada = R.drawable.pokeball_poke_ball
                                        for (i in 1 until ActivityContenedor.listaInventario.size) {
                                            if (ActivityContenedor.listaInventario.get(i).nombre.equals("Pokéball")){
                                                ActivityContenedor.listaInventario.set(ActivityContenedor.listaInventario.indexOf(ActivityContenedor.listaInventario.get(i)), listapokeballsItem[0])
                                            }
                                        }
                                        capturatest(ratioPokeball, pokeballUsada)
                                    }

                                    "Superball" -> {
                                        ratioPokeball = 1.5
                                        listapokeballsItem[0].cantidad --
                                        pokeballUsada = R.drawable.pokeball_super_ball
                                        for (i in 1 until ActivityContenedor.listaInventario.size) {
                                            if (ActivityContenedor.listaInventario.get(i).nombre.equals("Superball")){
                                                ActivityContenedor.listaInventario.set(ActivityContenedor.listaInventario.indexOf(ActivityContenedor.listaInventario.get(i)), listapokeballsItem[0])
                                            }
                                            capturatest(ratioPokeball, pokeballUsada)
                                        }
                                    }

                                    "Ultraball" -> {
                                        ratioPokeball = 2.0
                                        listapokeballsItem[0].cantidad --
                                        pokeballUsada = R.drawable.pokeball_ultra_ball
                                        for (i in 1 until ActivityContenedor.listaInventario.size) {
                                            if (ActivityContenedor.listaInventario.get(i).nombre.equals("Ultraball")){
                                                ActivityContenedor.listaInventario.set(ActivityContenedor.listaInventario.indexOf(ActivityContenedor.listaInventario.get(i)), listapokeballsItem[0])
                                            }
                                        }
                                        capturatest(ratioPokeball, pokeballUsada)
                                    }
                                }
                            }
                            1 -> {
                                when (listapokeballs[1]) {
                                    "Pokéball" -> {
                                        ratioPokeball = 1.0
                                        listapokeballsItem[1].cantidad --
                                        pokeballUsada = R.drawable.pokeball_poke_ball
                                        for (i in 1 until ActivityContenedor.listaInventario.size) {
                                            if (ActivityContenedor.listaInventario.get(i).nombre.equals("Pokéball")){
                                                ActivityContenedor.listaInventario.set(ActivityContenedor.listaInventario.indexOf(ActivityContenedor.listaInventario.get(i)), listapokeballsItem[1])
                                            }
                                        }
                                        capturatest(ratioPokeball, pokeballUsada)
                                    }

                                    "Superball" -> {
                                        ratioPokeball = 1.5
                                        pokeballUsada = R.drawable.pokeball_super_ball
                                        listapokeballsItem[1].cantidad --
                                        for (i in 1 until ActivityContenedor.listaInventario.size) {
                                            if (ActivityContenedor.listaInventario.get(i).nombre.equals("Superball")){
                                                ActivityContenedor.listaInventario.set(ActivityContenedor.listaInventario.indexOf(ActivityContenedor.listaInventario.get(i)), listapokeballsItem[1])
                                            }
                                        }
                                        capturatest(ratioPokeball, pokeballUsada)
                                    }

                                    "Ultraball" -> {
                                        ratioPokeball = 2.0
                                        listapokeballsItem[1].cantidad --
                                        pokeballUsada = R.drawable.pokeball_ultra_ball
                                        for (i in 1 until ActivityContenedor.listaInventario.size) {
                                            if (ActivityContenedor.listaInventario.get(i).nombre.equals("Ultraball")){
                                                ActivityContenedor.listaInventario.set(ActivityContenedor.listaInventario.indexOf(ActivityContenedor.listaInventario.get(i)), listapokeballsItem[1])
                                            }
                                        }
                                        capturatest(ratioPokeball, pokeballUsada)
                                    }
                                }
                            }
                            2 -> {
                                when (listapokeballs[0]) {
                                    "Pokéball" -> {
                                        ratioPokeball = 1.0
                                        pokeballUsada = R.drawable.pokeball_ultra_ball
                                        listapokeballsItem[2].cantidad --
                                        for (i in 1 until ActivityContenedor.listaInventario.size) {
                                            if (ActivityContenedor.listaInventario.get(i).nombre.equals("Pokéball")){
                                                ActivityContenedor.listaInventario.set(ActivityContenedor.listaInventario.indexOf(ActivityContenedor.listaInventario.get(i)), listapokeballsItem[2])
                                            }
                                        }
                                        capturatest(ratioPokeball, pokeballUsada)
                                    }

                                    "Superball" -> {
                                        ratioPokeball = 1.5
                                        listapokeballsItem[2].cantidad --
                                        pokeballUsada = R.drawable.pokeball_super_ball
                                        for (i in 1 until ActivityContenedor.listaInventario.size) {
                                            if (ActivityContenedor.listaInventario.get(i).nombre.equals("Superball")){
                                                ActivityContenedor.listaInventario.set(ActivityContenedor.listaInventario.indexOf(ActivityContenedor.listaInventario.get(i)), listapokeballsItem[2])
                                            }
                                        }
                                        capturatest(ratioPokeball, pokeballUsada)
                                    }

                                    "Ultraball" -> {
                                        ratioPokeball = 2.0
                                        listapokeballsItem[2].cantidad --
                                        pokeballUsada = R.drawable.pokeball_ultra_ball
                                        for (i in 1 until ActivityContenedor.listaInventario.size) {
                                            if (ActivityContenedor.listaInventario.get(i).nombre.equals("Ultraball")){
                                                ActivityContenedor.listaInventario.set(ActivityContenedor.listaInventario.indexOf(ActivityContenedor.listaInventario.get(i)), listapokeballsItem[2])
                                            }
                                        }
                                        capturatest(ratioPokeball, pokeballUsada)
                                    }
                                }

                        }
                    }
                }
            if (listapokeballs.size < 1) {
                builder.setMessage("No tienes ninguna pokéball para usar")
            }
            builder.create().show();


        }
    }


    fun huir() {
        botonHuir.setOnClickListener {

            ActivityContenedor.pokemonUsado.vida = ActivityContenedor.pokedexActual[ActivityContenedor.pokemonUsado.numero-1].vida
            ActivityContenedor.pokedexTotal[pokemonEnemigo.numero-1].vida = vidaMaxEnemigo

            val fragmentbase =
                FragmentPaseo()
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.contenedor, fragmentbase, "ficha")
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }

    fun capturatest(ratioPokeball : Double, pokeballUsada :Int) {
        botonAtacar.isEnabled = false
        botonEsquivar.isEnabled = false
        botonCapturar.isEnabled = false
        botonHuir.isEnabled = false

        var pokemonCapturado = false
        var ratioCaptura :Double = 0.0
        //(((3*vidaMax - 2*vidaActual) * ratioPokemon * ratioPokeball)/ 3*vidamax) + nrandom / Rpokm normal 50 /Rpokm legendario 20
        if ((pokemonEnemigo.numero in 1..9) || (pokemonEnemigo.numero in 152..160) || (pokemonEnemigo.numero in 252..260) || (pokemonEnemigo.numero in 387..395) ||  (pokemonEnemigo.numero in 495..503) || pokemonEnemigo.numero == 144.toShort() || pokemonEnemigo.numero == 145.toShort() || pokemonEnemigo.numero == 146.toShort() || pokemonEnemigo.numero == 150.toShort() || pokemonEnemigo.numero == 151.toShort() || pokemonEnemigo.numero == 243.toShort() || pokemonEnemigo.numero == 244.toShort() || pokemonEnemigo.numero == 245.toShort() || pokemonEnemigo.numero == 249.toShort() || pokemonEnemigo.numero == 250.toShort() || pokemonEnemigo.numero == 251.toShort() || (pokemonEnemigo.numero in 377..386) || (pokemonEnemigo.numero in 480..494) || (pokemonEnemigo.numero in 638..649)) {
            ratioCaptura = (((3*vidaMaxEnemigo - 2*vidaActualEnemigo) * 55 * ratioPokeball)/(3*vidaMaxEnemigo)) + (Math.random()*70)
        } else {
            ratioCaptura = (((3*vidaMaxEnemigo - 2*vidaActualEnemigo) * 90 * ratioPokeball)/(3*vidaMaxEnemigo)) + (Math.random()*70+20)
        }

        Log.d("ratio", ratioCaptura.toString())
        if (ratioCaptura >= 100) {
            textoCombate.text = "¡" + pokemonEnemigo.nombre + " ha sido capturado!"
            Glide.with(requireActivity())
                .load(pokeballUsada)
                .into(imagenPokemonEnemigo)
            val mediaPlayer: MediaPlayer = MediaPlayer.create(context, R.raw.sonido_captura)
            mediaPlayer.start()



            if (ActivityContenedor.pokedexActual[pokemonEnemigo.numero-1].nombre.equals(pokemonEnemigo.nombre)) {
                pokemonCapturado = true

            }
            ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual[pokemonEnemigo.numero-1]), ActivityContenedor.pokedexTotal[pokemonEnemigo.numero-1])

            textoCombate.setOnClickListener{
                ActivityContenedor.pokemonUsado.amistad = (ActivityContenedor.pokemonUsado.amistad + 2).toShort()
                if (ActivityContenedor.pokemonUsado.amistad > 255.toShort()) {
                    ActivityContenedor.pokemonUsado.amistad = 255
                }

                var expRecibida = ActivityContenedor.pokemonUsado.nivel*(14*ActivityContenedor.pokemonUsado.nivel/3)
                if (pokemonCapturado) {
                    expRecibida = (ActivityContenedor.pokemonUsado.nivel*(14*ActivityContenedor.pokemonUsado.nivel/3))*2
                    textoCombate.text = "¡Has recibido 200 monedas y " + expRecibida +" puntos de experiencia!"
                    ActivityContenedor.dinero += 200
                    barraExp.progress = ActivityContenedor.pokemonUsado.siguienteNv

                } else {
                    textoCombate.text = "¡Has recibido 100 monedas y " + expRecibida +" puntos de experiencia!"
                    ActivityContenedor.dinero += 100
                    barraExp.progress = ActivityContenedor.pokemonUsado.siguienteNv
                }

                if (ActivityContenedor.pokemonUsado.nivel < 100.toByte()) {
                    if (ActivityContenedor.pokemonUsado.siguienteNv - expRecibida >=0) {
                        ActivityContenedor.pokemonUsado.siguienteNv -= expRecibida
                    } else {
                        val expRestante = expRecibida - ActivityContenedor.pokemonUsado.siguienteNv
                        ActivityContenedor.pokemonUsado.nivel++
                        ActivityContenedor.pokemonUsado.siguienteNv = ActivityContenedor.pokemonUsado.nivel.toDouble()
                            .pow(3.0).toInt()
                        ActivityContenedor.pokemonUsado.siguienteNv -= expRestante
                        Toast.makeText(getActivity(), ActivityContenedor.pokemonUsado.nombre + " ha subido al nivel " + ActivityContenedor.pokemonUsado.nivel, Toast.LENGTH_SHORT).show()
                    }
                }


                ActivityContenedor.pokemonUsado.vida = vidaMaxAliado
                ActivityContenedor.pokedexTotal[pokemonEnemigo.numero-1].vida = vidaMaxEnemigo


                //comprobarEvolucion
                val comprobarEvolucion = ComprobarEvolucion()
                if (comprobarEvolucion.comprobarNivel(ActivityContenedor.pokemonUsado)) {
                    Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                } else if (comprobarEvolucion.comprobarMovimiento(ActivityContenedor.pokemonUsado)) {
                    Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                } else if (comprobarEvolucion.comprobarAmistad(ActivityContenedor.pokemonUsado)) {
                    Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                } else if (comprobarEvolucion.comprobarBioma(ActivityContenedor.pokemonUsado)) {
                    Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                }

                textoCombate.setOnClickListener{
                    val fragmentbase =
                        FragmentPaseo()
                    val transaction = requireActivity().supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.contenedor, fragmentbase, "ficha")
                    transaction.addToBackStack(null)
                    transaction.commit()            }
            }
        } else {
            textoCombate.text = "¡" + pokemonEnemigo.nombre + " se ha liberado de la pokéball!"
            botonAtacar.isEnabled = true
            botonEsquivar.isEnabled = true
            botonCapturar.isEnabled = true
            botonHuir.isEnabled = true

        }

    }


}


