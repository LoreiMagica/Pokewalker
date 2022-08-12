package com.lorei.pokwalker

import android.app.AlertDialog
import android.content.DialogInterface
import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.math.sign

class FragmentTienda : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_tienda, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val botonSalirTienda:ImageView = requireActivity().findViewById(R.id.boton_salir)
        val listaObjetos:RecyclerView = requireActivity().findViewById(R.id.lista_productos)
        val cantidadDinero:TextView = requireActivity().findViewById(R.id.cantidadDinero)

        val listaProductos = mutableListOf<Objeto>()
        listaProductos.add(Objeto(R.drawable.evolucion_piedra_agua, "Piedra Agua",500, 1, true))
        listaProductos.add(Objeto(R.drawable.evolucion_piedra_fuego, "Piedra Fuego",500, 1, true))
        listaProductos.add(Objeto(R.drawable.evolucion_piedra_trueno, "Piedra Trueno",500, 1, true))
        listaProductos.add(Objeto(R.drawable.evolucion_piedra_hoja, "Piedra Hoja",500, 1, true))
        listaProductos.add(Objeto(R.drawable.evolucion_piedra_lunar, "Piedra Lunar",500, 1, true))
        listaProductos.add(Objeto(R.drawable.evolucion_piedra_solar, "Piedra Solar",700, 1, true))
        listaProductos.add(Objeto(R.drawable.evolucion_piedra_alba, "Piedra Alba",700, 1, true))
        listaProductos.add(Objeto(R.drawable.evolucion_piedra_dia, "Piedra Día",700, 1, true))
        listaProductos.add(Objeto(R.drawable.evolucion_piedra_noche, "Piedra Noche",700, 1, true))
        listaProductos.add(Objeto(R.drawable.evolucion_escama_dragon, "Escama dragón",800, 1, true))
        listaProductos.add(Objeto(R.drawable.evolucion_revestimiento_metalico, "Revestimiento metálico",800, 1, true))
        listaProductos.add(Objeto(R.drawable.evolucion_roca_del_rey, "Roca del rey",800, 1, true))
        listaProductos.add(Objeto(R.drawable.evolucion_mejora, "Mejora",800, 1, true))
        listaProductos.add(Objeto(R.drawable.evolucion_disco_extrano, "Disco extraño",800, 1, true))
        listaProductos.add(Objeto(R.drawable.evolucion_diente_marino, "Diente marino",800, 1, true))
        listaProductos.add(Objeto(R.drawable.evolucion_escama_marina, "Escama marina",800, 1, true))
        listaProductos.add(Objeto(R.drawable.evolucion_piedra_oval, "Piedra Oval",800, 1, true))
        listaProductos.add(Objeto(R.drawable.evolucion_escama_bella, "Escama bella",800, 1, true))
        listaProductos.add(Objeto(R.drawable.evolucion_electrizador, "Electrizador",1000, 1, true))
        listaProductos.add(Objeto(R.drawable.evolucion_magmatizador, "Magmatizador",1000, 1, true))
        listaProductos.add(Objeto(R.drawable.evolucion_tela_terrible, "Tela terrible",1000, 1, true))
        listaProductos.add(Objeto(R.drawable.evolucion_colmillo_agudo, "Colmillo agudo",800, 1, true))
        listaProductos.add(Objeto(R.drawable.evolucion_garra_afilada, "Garra afilada",800, 1, true))
        listaProductos.add(Objeto(R.drawable.evolucion_cable_link, "Cable link",500, 1, true))
        listaProductos.add(Objeto(R.drawable.pokeball_poke_ball, "Pokéball",200, 1, false))
        listaProductos.add(Objeto(R.drawable.pokeball_super_ball, "Superball",600, 1, false))
        listaProductos.add(Objeto(R.drawable.pokeball_ultra_ball, "Ultraball",1200, 1, false))






        cantidadDinero.setText(ActivityContenedor.dinero.toString())

        val llm = LinearLayoutManager(context)

        val adapter = AdapterlistaTienda(
            listaProductos
        )
        listaObjetos.adapter = adapter

        listaObjetos.layoutManager = llm
            adapter.onItemClick = {
            objeto ->
                if(ActivityContenedor.dinero >= objeto.precio) {

                    val builder = AlertDialog.Builder(context)
                    builder.setTitle("Comprar")
                    builder.setMessage("¿Deseas compar " + objeto.nombre + " por "+ objeto.precio +" pokédolares?")
                    builder.setPositiveButton(
                        "Comprar",
                        DialogInterface.OnClickListener{ dialog, which ->
                            if (ActivityContenedor.listaInventario.stream().map(Objeto::nombre).filter(objeto.nombre::equals).findFirst().isPresent) {

                                for (i in 0 until ActivityContenedor.listaInventario.size) {

                                    if (ActivityContenedor.listaInventario.get(i).nombre.equals(objeto.nombre)) {
                                        val ob = Objeto(objeto.icono, objeto.nombre, objeto.precio, (ActivityContenedor.listaInventario.get(i).cantidad+1), objeto.esEvolutivo)
                                        ActivityContenedor.listaInventario.set(ActivityContenedor.listaInventario.indexOf(ActivityContenedor.listaInventario.get(i)), ob)
                                    }
                                }
                            } else {
                                ActivityContenedor.listaInventario.add(Objeto(objeto.icono, objeto.nombre, objeto.precio, objeto.cantidad, objeto.esEvolutivo))
                            }
                            Log.d("compra", ActivityContenedor.listaInventario.toString())


                            ActivityContenedor.dinero -= objeto.precio
                            cantidadDinero.setText(ActivityContenedor.dinero.toString())
                            Toast.makeText(context, "Has comprado un "+ objeto.nombre, Toast.LENGTH_SHORT).show()
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



        botonSalirTienda.setOnClickListener { view ->
            val player= MediaPlayer.create(requireContext(), R.raw.sonido_atras)
            player.start()
            val fragmentTienda =
                FragmentBase()
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.contenedor, fragmentTienda, "ficha")
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }

}


