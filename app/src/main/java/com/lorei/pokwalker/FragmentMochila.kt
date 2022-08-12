package com.lorei.pokwalker


import android.app.AlertDialog
import android.content.DialogInterface
import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*
import kotlin.Comparator
import kotlin.collections.ArrayList

class FragmentMochila : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_mochila, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val botonSalirMochila: ImageView = requireActivity().findViewById(R.id.boton_salir_mochila)
        val listaInventario: RecyclerView = requireActivity().findViewById(R.id.lista_inventario)

        val llm = LinearLayoutManager(context)
        listaInventario.layoutManager = llm
        val adapter = AdapterlistaMochila(
            ActivityContenedor.listaInventario
        )
        listaInventario.adapter = adapter
       adapter.onItemClick = { objeto ->
                if (objeto.esEvolutivo) {
                    if (objeto.cantidad > 0) {
                        val builder = AlertDialog.Builder(context)
                        //builder.setTitle(objeto.nombre)
                        builder.setTitle("¿Deseas evolucionar un pokémon usando " + objeto.nombre + "?")

                        var pokemonAEvolucionar = ArrayList<CharSequence>()

                        when (objeto.nombre) {
                            "Piedra Fuego" ->{
                                if (ActivityContenedor.pokedexActual.get(36).nombre.equals("Vulpix")) {
                                    if (!ActivityContenedor.pokedexActual.get(37).nombre.equals("Ninetales")) {
                                        pokemonAEvolucionar.add("Vulpix")
                                    }
                                }
                                if (ActivityContenedor.pokedexActual.get(57).nombre.equals("Growlithe")) {
                                    if (!ActivityContenedor.pokedexActual.get(58).nombre.equals("Arcanine")) {
                                        pokemonAEvolucionar.add("Growlithe")
                                    }
                                }
                                if (ActivityContenedor.pokedexActual.get(132).nombre.equals("Eevee")) {
                                    if (!ActivityContenedor.pokedexActual.get(135).nombre.equals("Flareon")) {
                                        pokemonAEvolucionar.add("Eevee")
                                    }                            }
                                if (ActivityContenedor.pokedexActual.get(512).nombre.equals("Pansear")) {
                                    if (!ActivityContenedor.pokedexActual.get(513).nombre.equals("Simisear")) {
                                        pokemonAEvolucionar.add("Pansear")
                                    }                            }
                            }

                            "Piedra Agua" ->{
                                if (ActivityContenedor.pokedexActual.get(60).nombre.equals("Poliwhirl")) {
                                    if (!ActivityContenedor.pokedexActual.get(61).nombre.equals("Poliwrath")) {
                                        pokemonAEvolucionar.add("Poliwhirl")
                                    }                            }
                                if (ActivityContenedor.pokedexActual.get(89).nombre.equals("Shellder")) {
                                    if (!ActivityContenedor.pokedexActual.get(90).nombre.equals("Cloyster")) {
                                        pokemonAEvolucionar.add("Shellder")
                                    }
                                }
                                if (ActivityContenedor.pokedexActual.get(119).nombre.equals("Staryu")) {
                                    if (!ActivityContenedor.pokedexActual.get(120).nombre.equals("Starmie")) {
                                        pokemonAEvolucionar.add("Staryu")
                                    }                            }
                                if (ActivityContenedor.pokedexActual.get(132).nombre.equals("Eevee")) {
                                    if (!ActivityContenedor.pokedexActual.get(133).nombre.equals("Vaporeon")) {
                                        pokemonAEvolucionar.add("Eevee")
                                    }                              }
                                if (ActivityContenedor.pokedexActual.get(270).nombre.equals("Lombre")) {
                                    if (!ActivityContenedor.pokedexActual.get(271).nombre.equals("Ludicolo")) {
                                        pokemonAEvolucionar.add("Lombre")
                                    }                              }
                                if (ActivityContenedor.pokedexActual.get(514).nombre.equals("Panpour")) {
                                    if (!ActivityContenedor.pokedexActual.get(515).nombre.equals("Simipour")) {
                                        pokemonAEvolucionar.add("Panpour")
                                    }                              }
                            }

                            "Piedra Trueno" ->{
                                if (ActivityContenedor.pokedexActual.get(24).nombre.equals("Pikachu")) {
                                    if (!ActivityContenedor.pokedexActual.get(25).nombre.equals("Raichu")) {
                                        pokemonAEvolucionar.add("Pikachu")
                                    }                            }
                                if (ActivityContenedor.pokedexActual.get(132).nombre.equals("Eevee")) {
                                    if (!ActivityContenedor.pokedexActual.get(134).nombre.equals("Jolteon")) {
                                        pokemonAEvolucionar.add("Eevee")
                                    }                            }
                                if (ActivityContenedor.pokedexActual.get(602).nombre.equals("Eelektrik")) {
                                    if (!ActivityContenedor.pokedexActual.get(603).nombre.equals("Eelectross")) {
                                        pokemonAEvolucionar.add("Eelektrik")
                                    }                            }
                            }

                            "Piedra Hoja" ->{
                                if (ActivityContenedor.pokedexActual.get(43).nombre.equals("Gloom")) {
                                    if (!ActivityContenedor.pokedexActual.get(44).nombre.equals("Bellossom")) {
                                        pokemonAEvolucionar.add("Gloom")
                                    }                            }
                                if (ActivityContenedor.pokedexActual.get(69).nombre.equals("Weepinbell")) {
                                    if (!ActivityContenedor.pokedexActual.get(70).nombre.equals("Victribell")) {
                                        pokemonAEvolucionar.add("Weepinbell")
                                    }                            }
                                if (ActivityContenedor.pokedexActual.get(101).nombre.equals("Exeggcute")) {
                                    if (!ActivityContenedor.pokedexActual.get(102).nombre.equals("Exeggcutor")) {
                                        pokemonAEvolucionar.add("Exeggcute")
                                    }                            }
                                if (ActivityContenedor.pokedexActual.get(273).nombre.equals("Nuzleaf")) {
                                    if (!ActivityContenedor.pokedexActual.get(274).nombre.equals("Shiftry")) {
                                        pokemonAEvolucionar.add("Nuzleaf")
                                    }                             }
                                if (ActivityContenedor.pokedexActual.get(510).nombre.equals("Pansage")) {
                                    if (!ActivityContenedor.pokedexActual.get(511).nombre.equals("Simisage")) {
                                        pokemonAEvolucionar.add("Pansage")
                                    }                             }
                            }

                            "Piedra Lunar" ->{
                                if (ActivityContenedor.pokedexActual.get(29).nombre.equals("Nidorina")) {
                                    if (!ActivityContenedor.pokedexActual.get(30).nombre.equals("Nidoqueen")) {
                                        pokemonAEvolucionar.add("Nidorina")
                                    }                             }
                                if (ActivityContenedor.pokedexActual.get(32).nombre.equals("Nidorino")) {
                                    if (!ActivityContenedor.pokedexActual.get(33).nombre.equals("Nidoking")) {
                                        pokemonAEvolucionar.add("Nidorino")
                                    }                             }
                                if (ActivityContenedor.pokedexActual.get(34).nombre.equals("Clefairy")) {
                                    if (!ActivityContenedor.pokedexActual.get(35).nombre.equals("Clefable")) {
                                        pokemonAEvolucionar.add("Clefairy")
                                    }                             }
                                if (ActivityContenedor.pokedexActual.get(38).nombre.equals("Jigglypuff")) {
                                    if (!ActivityContenedor.pokedexActual.get(39).nombre.equals("Wigglytuff")) {
                                        pokemonAEvolucionar.add("Jigglypuff")
                                    }                            }
                                if (ActivityContenedor.pokedexActual.get(299).nombre.equals("Skitty")) {
                                    if (!ActivityContenedor.pokedexActual.get(300).nombre.equals("Delcatty")) {
                                        pokemonAEvolucionar.add("Skitty")
                                    }
                                }
                                if (ActivityContenedor.pokedexActual.get(516).nombre.equals("Munna")) {
                                    if (!ActivityContenedor.pokedexActual.get(517).nombre.equals("Musharna")) {
                                        pokemonAEvolucionar.add("Munna")
                                    }
                                }
                            }

                            "Piedra Solar" ->{
                                if (ActivityContenedor.pokedexActual.get(43).nombre.equals("Gloom")) {
                                    if (!ActivityContenedor.pokedexActual.get(191).nombre.equals("Bellossom")) {
                                        pokemonAEvolucionar.add("Gloom")
                                    }                            }
                                if (ActivityContenedor.pokedexActual.get(190).nombre.equals("Sunkern")) {
                                    if (!ActivityContenedor.pokedexActual.get(191).nombre.equals("Sunflora")) {
                                        pokemonAEvolucionar.add("Sunkern")
                                    }                            }
                                if (ActivityContenedor.pokedexActual.get(545).nombre.equals("Cottonee")) {
                                    if (!ActivityContenedor.pokedexActual.get(546).nombre.equals("Whimsicott")) {
                                        pokemonAEvolucionar.add("Cottonee")
                                    }                            }
                                if (ActivityContenedor.pokedexActual.get(547).nombre.equals("Petilil")) {
                                    if (!ActivityContenedor.pokedexActual.get(548).nombre.equals("Lilligant")) {
                                        pokemonAEvolucionar.add("Petilil")
                                    }                            }
                            }

                            "Piedra Alba" ->{
                                if (ActivityContenedor.pokedexActual.get(280).nombre.equals("Kirlia")) {
                                    if (!ActivityContenedor.pokedexActual.get(474).nombre.equals("Gallade")) {
                                        pokemonAEvolucionar.add("Kirlia")
                                    }                        }
                                if (ActivityContenedor.pokedexActual.get(360).nombre.equals("Snorunt")) {
                                    if (!ActivityContenedor.pokedexActual.get(477).nombre.equals("Froslass")) {
                                        pokemonAEvolucionar.add("Snorunt")
                                    }                        }
                            }

                            "Piedra Día" ->{
                                if (ActivityContenedor.pokedexActual.get(314).nombre.equals("Roselia")) {
                                    if (!ActivityContenedor.pokedexActual.get(465).nombre.equals("Roserade")) {
                                        pokemonAEvolucionar.add("Roselia")
                                    }                        }
                                if (ActivityContenedor.pokedexActual.get(175).nombre.equals("Togetic")) {
                                    if (!ActivityContenedor.pokedexActual.get(467).nombre.equals("Togekiss")) {
                                        pokemonAEvolucionar.add("Togetic")
                                    }                        }
                                if (ActivityContenedor.pokedexActual.get(571).nombre.equals("Minccino")) {
                                    if (!ActivityContenedor.pokedexActual.get(472).nombre.equals("Cinccino")) {
                                        pokemonAEvolucionar.add("Minccino")
                                    }                        }
                            }

                            "Piedra Noche" ->{
                                if (ActivityContenedor.pokedexActual.get(197).nombre.equals("Murkrow")) {
                                    if (!ActivityContenedor.pokedexActual.get(429).nombre.equals("Honchkrow")) {
                                        pokemonAEvolucionar.add("Murkrow")
                                    }                        }
                                if (ActivityContenedor.pokedexActual.get(199).nombre.equals("Misdreavus")) {
                                    if (!ActivityContenedor.pokedexActual.get(428).nombre.equals("Mismagius")) {
                                        pokemonAEvolucionar.add("Misdreavus")
                                    }                        }
                                if (ActivityContenedor.pokedexActual.get(607).nombre.equals("Lampent")) {
                                    if (!ActivityContenedor.pokedexActual.get(608).nombre.equals("Chandelure")) {
                                        pokemonAEvolucionar.add("Lampent")
                                    }                        }
                            }

                            "Cable link" ->{
                                if (ActivityContenedor.pokedexActual.get(63).nombre.equals("Kadabra")) {
                                    if (!ActivityContenedor.pokedexActual.get(64).nombre.equals("Alakazam")) {
                                        pokemonAEvolucionar.add("Kadabra")
                                    }                            }
                                if (ActivityContenedor.pokedexActual.get(66).nombre.equals("Machoke")) {
                                    if (!ActivityContenedor.pokedexActual.get(67).nombre.equals("Machamp")) {
                                        pokemonAEvolucionar.add("Machoke")
                                    }                            }
                                if (ActivityContenedor.pokedexActual.get(74).nombre.equals("Graveler")) {
                                    if (!ActivityContenedor.pokedexActual.get(75).nombre.equals("Golem")) {
                                        pokemonAEvolucionar.add("Graveler")
                                    }                            }
                                if (ActivityContenedor.pokedexActual.get(92).nombre.equals("Haunter")) {
                                    if (!ActivityContenedor.pokedexActual.get(93).nombre.equals("Gengar")) {
                                        pokemonAEvolucionar.add("Haunter")
                                    }                            }
                                if (ActivityContenedor.pokedexActual.get(524).nombre.equals("Boldore")) {
                                    if (!ActivityContenedor.pokedexActual.get(525).nombre.equals("Gigalith")) {
                                        pokemonAEvolucionar.add("Boldore")
                                    }                            }
                                if (ActivityContenedor.pokedexActual.get(532).nombre.equals("Gurdurr")) {
                                    if (!ActivityContenedor.pokedexActual.get(533).nombre.equals("Conkeldurr")) {
                                        pokemonAEvolucionar.add("Gurdurr")
                                    }                            }
                                if (ActivityContenedor.pokedexActual.get(587).nombre.equals("Karrablast")) {
                                    if (!ActivityContenedor.pokedexActual.get(588).nombre.equals("Escavalier")) {
                                        pokemonAEvolucionar.add("Karrablast")
                                    }                             }
                                if (ActivityContenedor.pokedexActual.get(615).nombre.equals("Shelmet")) {
                                    if (!ActivityContenedor.pokedexActual.get(616).nombre.equals("Accelgor")) {
                                        pokemonAEvolucionar.add("Shelmet")
                                    }                             }
                            }

                            "Revestimiento metálico" -> {
                                if (ActivityContenedor.pokedexActual.get(94).nombre.equals("Onix")) {
                                    if (!ActivityContenedor.pokedexActual.get(207).nombre.equals("Steelix")) {
                                        pokemonAEvolucionar.add("Onix")
                                    }                            }
                                if (ActivityContenedor.pokedexActual.get(122).nombre.equals("Scyther")) {
                                    if (!ActivityContenedor.pokedexActual.get(211).nombre.equals("Scizor")) {
                                        pokemonAEvolucionar.add("Scyther")
                                    }                            }
                            }

                            "Escama dragón" -> {
                                if (ActivityContenedor.pokedexActual.get(116).nombre.equals("Seadra")) {
                                    if (!ActivityContenedor.pokedexActual.get(229).nombre.equals("Kingdra")) {
                                        pokemonAEvolucionar.add("Seadra")
                                    }                            }
                            }
                            "Roca del rey" -> {
                                if (ActivityContenedor.pokedexActual.get(60).nombre.equals("Poliwhirl")) {
                                    if (!ActivityContenedor.pokedexActual.get(185).nombre.equals("Politoed")) {
                                        pokemonAEvolucionar.add("Poliwhirl")
                                    }                            }
                                if (ActivityContenedor.pokedexActual.get(78).nombre.equals("Slowpoke")) {
                                    if (!ActivityContenedor.pokedexActual.get(198).nombre.equals("Slowking")) {
                                        pokemonAEvolucionar.add("Slowpoke")
                                    }                            }
                            }

                            "Mejora" -> {
                                if (ActivityContenedor.pokedexActual.get(136).nombre.equals("Porygon")) {
                                    if (!ActivityContenedor.pokedexActual.get(232).nombre.equals("Porygon2")) {
                                        pokemonAEvolucionar.add("Porygon")
                                    }                            }
                            }

                            "Escama marina" -> {
                                if (ActivityContenedor.pokedexActual.get(365).nombre.equals("Clamperl")) {
                                    if (!ActivityContenedor.pokedexActual.get(367).nombre.equals("Gorebyss")) {
                                        pokemonAEvolucionar.add("Clamperl")
                                    }                            }
                            }

                            "Diente marino" -> {
                                if (ActivityContenedor.pokedexActual.get(365).nombre.equals("Clamperl")) {
                                    if (!ActivityContenedor.pokedexActual.get(366).nombre.equals("Huntail")) {
                                        pokemonAEvolucionar.add("Clamperl")
                                    }                            }
                            }

                            "Protector" -> {
                                if (ActivityContenedor.pokedexActual.get(111).nombre.equals("Rhydon")) {
                                    if (!ActivityContenedor.pokedexActual.get(463).nombre.equals("Rhyperior")) {
                                        pokemonAEvolucionar.add("Rhydon")
                                    }                            }
                            }

                            "Disco extraño" -> {
                                if (ActivityContenedor.pokedexActual.get(232).nombre.equals("Porygon2")) {
                                    if (!ActivityContenedor.pokedexActual.get(473).nombre.equals("Porygon-Z")) {
                                        pokemonAEvolucionar.add("Porygon2")
                                    }                            }
                            }

                            "Tela terrible" -> {
                                if (ActivityContenedor.pokedexActual.get(355).nombre.equals("Dusclops")) {
                                    if (!ActivityContenedor.pokedexActual.get(476).nombre.equals("Dusknoir")) {
                                        pokemonAEvolucionar.add("Dusclops")
                                    }                            }
                            }

                            "Magmatizador" -> {
                                if (ActivityContenedor.pokedexActual.get(125).nombre.equals("Magmar")) {
                                    if (!ActivityContenedor.pokedexActual.get(466).nombre.equals("Magmortar")) {
                                        pokemonAEvolucionar.add("Magmar")
                                    }                            }
                            }

                            "Electrizador" -> {
                                if (ActivityContenedor.pokedexActual.get(124).nombre.equals("Electabuzz")) {
                                    if (!ActivityContenedor.pokedexActual.get(465).nombre.equals("Electrivire")) {
                                        pokemonAEvolucionar.add("Electabuzz")
                                    }                            }
                            }

                            "Escama bella" -> {
                                if (ActivityContenedor.pokedexActual.get(348).nombre.equals("Feebas")) {
                                    if (!ActivityContenedor.pokedexActual.get(349).nombre.equals("Milotic")) {
                                        pokemonAEvolucionar.add("Feebas")
                                    }                            }
                            }

                            "Garra afilada" -> {
                                if (ActivityContenedor.pokedexActual.get(214).nombre.equals("Sneasel")) {
                                    if (!ActivityContenedor.pokedexActual.get(460).nombre.equals("Weavile")) {
                                        pokemonAEvolucionar.add("Sneasel")
                                    }                            }
                            }

                            "Colmillo agudo" -> {
                                if (ActivityContenedor.pokedexActual.get(206).nombre.equals("Gligar")) {
                                    if (!ActivityContenedor.pokedexActual.get(471).nombre.equals("Gliscor")) {
                                        pokemonAEvolucionar.add("Gligar")
                                    }                            }
                            }
                            "Piedra Oval" -> {
                                if (ActivityContenedor.pokedexActual.get(439).nombre.equals("Happiny")) {
                                    if (!ActivityContenedor.pokedexActual.get(112).nombre.equals("Chansey")) {
                                        pokemonAEvolucionar.add("Happiny")
                                    }                            }
                            }
                        }
                        //Retocar a partir de aquí

                        builder.setItems(pokemonAEvolucionar.toTypedArray()) { dialog : DialogInterface, which : Int ->
                            when (which) {
                                0 -> {
                                    when (objeto.nombre) {
                                        "Piedra Fuego" -> { //Vulpix
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionPiedraFuego(pokemonAEvolucionar[0] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Piedra Agua" -> { //poliwhirl
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionPiedraAgua(pokemonAEvolucionar[0] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Piedra Trueno" -> { //Pikachu
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionPiedraTrueno(pokemonAEvolucionar[0] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Piedra Hoja" -> { //Gloom
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionPiedraHoja(pokemonAEvolucionar[0] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Piedra Lunar" -> { //Nidorina
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionRestoPiedras(pokemonAEvolucionar[0] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Piedra Solar" -> { //Gloom
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionRestoPiedras(pokemonAEvolucionar[0] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Piedra Alba" -> { //Kirlia
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionRestoPiedras(pokemonAEvolucionar[0] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Piedra Día" -> { //Roselia
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionRestoPiedras(pokemonAEvolucionar[0] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Piedra Noche" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionRestoPiedras(pokemonAEvolucionar[0] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Cable link" -> { //Kadabra
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionIntercambio(pokemonAEvolucionar[0] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Revestimiento metálico" -> { //Onix
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionIntercambio(pokemonAEvolucionar[0] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Escama dragón" -> { //Seadra
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionIntercambio(pokemonAEvolucionar[0] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }
                                        "Roca del rey" -> { //Poliwhirl
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionIntercambio(pokemonAEvolucionar[0] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Mejora" -> { //Porygon
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionIntercambio(pokemonAEvolucionar[0] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Escama marina" -> { //Clamperl
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.putoClamperl(objeto.nombre)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Diente marino" -> { //Clamperl
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.putoClamperl(objeto.nombre)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Protector" -> { //Rhydon
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionIntercambio(pokemonAEvolucionar[0] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Disco extraño" -> { //Porygon2
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionIntercambio(pokemonAEvolucionar[0] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Tela terrible" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionIntercambio(pokemonAEvolucionar[0] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Magmatizador" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionIntercambio(pokemonAEvolucionar[0] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Electrizador" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionIntercambio(pokemonAEvolucionar[0] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Escama bella" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionIntercambio(pokemonAEvolucionar[0] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Garra afilada" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionIntercambio(pokemonAEvolucionar[0] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Colmillo agudo" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionIntercambio(pokemonAEvolucionar[0] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }
                                        "Piedra Oval" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionRestoPiedras(pokemonAEvolucionar[0] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }
                                    }
                                }
                                1 -> {
                                    when (objeto.nombre) {
                                        "Piedra Fuego" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionPiedraFuego(pokemonAEvolucionar[1] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Piedra Agua" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionPiedraAgua(pokemonAEvolucionar[1] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Piedra Trueno" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionPiedraTrueno(pokemonAEvolucionar[1] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Piedra Hoja" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionPiedraHoja(pokemonAEvolucionar[1] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Piedra Lunar" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionRestoPiedras(pokemonAEvolucionar[1] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Piedra Solar" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionRestoPiedras(pokemonAEvolucionar[1] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Piedra Alba" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionRestoPiedras(pokemonAEvolucionar[1] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Piedra Día" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionRestoPiedras(pokemonAEvolucionar[1] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Piedra Noche" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionRestoPiedras(pokemonAEvolucionar[1] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Cable link" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionIntercambio(pokemonAEvolucionar[1] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Revestimiento metálico" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionIntercambio(pokemonAEvolucionar[1] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }
                                        "Roca del rey" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionIntercambio(pokemonAEvolucionar[1] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }
                                    }
                                }
                                2 -> {
                                    when (objeto.nombre) {
                                        "Piedra Fuego" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionPiedraFuego(pokemonAEvolucionar[2] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Piedra Agua" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionPiedraAgua(pokemonAEvolucionar[2] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Piedra Trueno" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionPiedraTrueno(pokemonAEvolucionar[2] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Piedra Hoja" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionPiedraHoja(pokemonAEvolucionar[2] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Piedra Lunar" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionRestoPiedras(pokemonAEvolucionar[2] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Piedra Solar" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionRestoPiedras(pokemonAEvolucionar[2] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Piedra Día" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionRestoPiedras(pokemonAEvolucionar[2] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Piedra Noche" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionRestoPiedras(pokemonAEvolucionar[2] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Cable link" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionIntercambio(pokemonAEvolucionar[2] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }
                                    }
                                }
                                3 -> {
                                    when (objeto.nombre) {
                                        "Piedra Fuego" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionPiedraFuego(pokemonAEvolucionar[3] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Piedra Agua" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionPiedraAgua(pokemonAEvolucionar[3] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Piedra Hoja" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionPiedraHoja(pokemonAEvolucionar[3] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Piedra Lunar" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionRestoPiedras(pokemonAEvolucionar[3] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Piedra Solar" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionRestoPiedras(pokemonAEvolucionar[3] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Cable link" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionIntercambio(pokemonAEvolucionar[3] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }
                                    }
                                }
                                4 -> {
                                    when (objeto.nombre) {
                                        "Piedra Agua" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionPiedraAgua(pokemonAEvolucionar[4] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Piedra Hoja" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionPiedraHoja(pokemonAEvolucionar[4] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Piedra Lunar" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionRestoPiedras(pokemonAEvolucionar[4] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Cable link" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionIntercambio(pokemonAEvolucionar[5] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }
                                    }
                                }
                                5 -> {
                                    when (objeto.nombre) {
                                        "Piedra Agua" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionPiedraAgua(pokemonAEvolucionar[5] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Piedra Lunar" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionRestoPiedras(pokemonAEvolucionar[5] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }

                                        "Cable link" -> {
                                            val comprobarEvolucion = ComprobarEvolucion()
                                            if (comprobarEvolucion.evolucionIntercambio(pokemonAEvolucionar[5] as String)) {
                                                Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                            }
                                        }
                                    }
                                }
                                6 -> {
                                    val comprobarEvolucion = ComprobarEvolucion()
                                    if (comprobarEvolucion.evolucionIntercambio(pokemonAEvolucionar[6] as String)) {
                                        Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                    }
                                }
                                7 -> {
                                    val comprobarEvolucion = ComprobarEvolucion()
                                    if (comprobarEvolucion.evolucionIntercambio(pokemonAEvolucionar[7] as String)) {
                                        Toast.makeText(getActivity(), ActivityContenedor.pokemonAnterior + " ha evolucionado a "+ ActivityContenedor.pokemonUsado.nombre, Toast.LENGTH_SHORT).show()
                                    }
                                }
                            }
                            objeto.cantidad --
                        }
                        if (pokemonAEvolucionar.size < 1) {
                            builder.setMessage("No tienes ningún pokémon para usar " + objeto.nombre)
                        }
                        builder.create().show();
                    } else {
                        Toast.makeText(getActivity(), "No tienes más " + objeto.nombre, Toast.LENGTH_SHORT).show()
                    }

                } else {
                    Toast.makeText(getActivity(), "Es una " + objeto.nombre, Toast.LENGTH_SHORT).show()
                }

        }



        botonSalirMochila.setOnClickListener {
            val player= MediaPlayer.create(requireContext(), R.raw.sonido_atras)
            player.start()
            val fragmentbase =
                FragmentBase()
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.contenedor, fragmentbase, "ficha")
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }
}