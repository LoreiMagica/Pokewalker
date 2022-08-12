package com.lorei.pokwalker

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.synnapps.carouselview.CarouselView
import com.synnapps.carouselview.ImageListener

class FragmentBioma : Fragment() {

    lateinit var fondoBioma: CarouselView
    lateinit var botonSiguiente : ImageView
    lateinit var botonAnterior : ImageView
    lateinit var botonAceptar : ImageView
    lateinit var textoBioma : TextView
    val imagenBiomas = mutableListOf<Int>()



    val listaBiomas = arrayOf<Bioma>(
        Bioma(R.drawable.bioma_bosque, "Bosque Verde", false ),
        Bioma(R.drawable.bioma_pradera, "Ruta 1 de Kanto" , false),
        Bioma(R.drawable.bioma_campo, "Ruta 3 de Kanto" , false),
        Bioma(R.drawable.bioma_montana, "Monte Moon", false),
        Bioma(R.drawable.bioma_ciudad, "Ciudad Celeste", false ),
        Bioma(R.drawable.bioma_agua_dulce, "Ruta 10 de Kanto", false ),
        Bioma(R.drawable.bioma_cueva, "Túnel Roca", false ),
        Bioma(R.drawable.bioma_torre, "Torre Pokémon de Kanto", false ),
        Bioma(R.drawable.bioma_ciudad, "Ciudad Azulona", false ),
        Bioma(R.drawable.bioma_pradera, "Ruta 16 de Kanto", false ),
        Bioma(R.drawable.bioma_agua_salada, "Ruta 20 de Kanto", false ),
        Bioma(R.drawable.bioma_pradera, "Ruta 24 de Kanto", false ),
        Bioma(R.drawable.bioma_cueva, "Islas Espuma", true ),
        Bioma(R.drawable.bioma_mansion, "Mansión Pokémon de Kanto", false ),
        Bioma(R.drawable.bioma_cueva, "Calle Victoria de Kanto", false ),
        Bioma(R.drawable.bioma_bosque, "Bosque Baya", true ),
        Bioma(R.drawable.bioma_volcan, "Monte Ascuas", true ),
        Bioma(R.drawable.bioma_central_electrica, "Central eléctrica de Kanto", true ),
        Bioma(R.drawable.bioma_cueva, "Cueva Celeste", true ),

        //Johto
        Bioma(R.drawable.bioma_pradera, "Ruta 29 de Johto", false ),
        Bioma(R.drawable.bioma_cueva, "Ruinas Alfa", false ),
        Bioma(R.drawable.bioma_pradera, "Ruta 32 de Johto", false ),
        Bioma(R.drawable.bioma_cueva, "Pozo Slowpoke", false ),
        Bioma(R.drawable.bioma_bosque, "Encinar", true ),
        Bioma(R.drawable.bioma_ciudad, "Ciudad Trigal", false ),
        Bioma(R.drawable.bioma_pradera, "Ruta 32 de Johto", false ),
        Bioma(R.drawable.bioma_pradera, "Parque Nacional", false ),
        Bioma(R.drawable.bioma_torre, "Torre Quemada", true ),
        Bioma(R.drawable.bioma_torre, "Torre Campana", true ),
        Bioma(R.drawable.bioma_pradera, "Ruta 39 de Johto", false ),
        Bioma(R.drawable.bioma_agua_salada, "Ruta 41 de Johto", false ),
        Bioma(R.drawable.bioma_agua_salada, "Islas Remolino", true ),
        Bioma(R.drawable.bioma_cueva, "Monte Mortero", false ),
        Bioma(R.drawable.bioma_pradera, "Ruta 44 de Johto", false ),
        Bioma(R.drawable.bioma_cueva, "Ruta Helada", false ),
        Bioma(R.drawable.bioma_cueva, "Guarida Dragón", false ),
        Bioma(R.drawable.bioma_pradera, "Ruta 45 de Johto", false ),
        Bioma(R.drawable.bioma_montana, "Monte Plateado", false ),

        //Hoenn
        Bioma(R.drawable.bioma_pradera, "Ruta 101", false ),
        Bioma(R.drawable.bioma_bosque, "Bosque Petalia", false ),
        Bioma(R.drawable.bioma_pradera, "Ruta 116", false ),
        Bioma(R.drawable.bioma_cueva, "Cueva Granito", false ),
        Bioma(R.drawable.bioma_pradera, "Ruta 110", false ),
        Bioma(R.drawable.bioma_central_electrica, "Malvalanova", false ),
        Bioma(R.drawable.bioma_campo, "Ruinas del Desierto", true ),
        Bioma(R.drawable.bioma_volcan, "Senda Ígnea", false ),
        Bioma(R.drawable.bioma_montana, "Desfiladero", false ),
        Bioma(R.drawable.bioma_agua_dulce, "Ruta 114", false ),
        Bioma(R.drawable.bioma_cueva, "Cascada Meteoro", false ),
        Bioma(R.drawable.bioma_pradera, "Ruta 119", false ),
        Bioma(R.drawable.bioma_montana, "Monte Pírico", false ),
        Bioma(R.drawable.bioma_agua_salada, "Ruta 127", false ),
        Bioma(R.drawable.bioma_agua_salada, "Fondo del mar de Hoenn", false ),
        Bioma(R.drawable.bioma_cueva, "Cueva cardumen", false ),
        Bioma(R.drawable.bioma_cueva, "Cueva Ancestral", true ),
        Bioma(R.drawable.bioma_cueva, "Calle Victoria de Hoenn", false ),
        Bioma(R.drawable.bioma_torre, "Pilar Celeste", true ),
        Bioma(R.drawable.bioma_agua_dulce, "Isla del Sur", true ),

        //Sinnoh
        Bioma(R.drawable.bioma_pradera, "Ruta 201", false ),
        Bioma(R.drawable.bioma_ciudad, "Ciudad Jubileo", false ),
        Bioma(R.drawable.bioma_agua_dulce, "Ruta 205", false ),
        Bioma(R.drawable.bioma_bosque, "Bosque Vetusto", false ),
        Bioma(R.drawable.bioma_mansion, "Vieja Mansión", false ),
        Bioma(R.drawable.bioma_pradera, "Ruta 209", false ),
        Bioma(R.drawable.bioma_agua_dulce, "Ruta 212", false ),
        Bioma(R.drawable.bioma_agua_dulce, "Ruta 213", false ),
        Bioma(R.drawable.bioma_cueva, "Cueva Retorno", true ),
        Bioma(R.drawable.bioma_montana, "Monte Corona", false ),
        Bioma(R.drawable.bioma_pradera, "Ruta 216", false ),
        Bioma(R.drawable.bioma_pradera, "Ruta 222", false ),
        Bioma(R.drawable.bioma_agua_salada, "Ruta 223", false ),
        Bioma(R.drawable.bioma_campo, "Ruta 228", false ),
        Bioma(R.drawable.bioma_cueva, "Isla Hierro", false ),
        Bioma(R.drawable.bioma_cueva, "Subsuelo de Sinnoh", false ),
        Bioma(R.drawable.bioma_volcan, "Montaña Dura", true ),
        Bioma(R.drawable.bioma_montana, "Columnas Lanza", true ),
        Bioma(R.drawable.bioma_pradera, "Paraíso Floral", true ),
        Bioma(R.drawable.bioma_agua_dulce, "Isla Sueño", true ),
        Bioma(R.drawable.bioma_agua_dulce, "Lagos de Sinnoh", true ),
        Bioma(R.drawable.bioma_agua_salada, "Fondo del mar de Sinnoh", true),

        //Teselia
        Bioma(R.drawable.bioma_mansion, "Solar de los Sueños", false ),
        Bioma(R.drawable.bioma_bosque, "Bosque Azulejo", false ),
        Bioma(R.drawable.bioma_ciudad, "Ciudad Porcelana", false ),
        Bioma(R.drawable.bioma_torre, "Torre Victoria", true ),
        Bioma(R.drawable.bioma_campo, "Ruta 4 de Teselia", false ),
        Bioma(R.drawable.bioma_torre, "Castillo Ancestral", false ),
        Bioma(R.drawable.bioma_cueva, "Túnel Yakón", false ),
        Bioma(R.drawable.bioma_montana, "Monte Tuerca", false ),
        Bioma(R.drawable.bioma_ciudad, "Ciudad Mayólica", false ),
        Bioma(R.drawable.bioma_pradera, "Ruta 6 de Teselia", false ),
        Bioma(R.drawable.bioma_cueva, "Cueva Electrorroca", false ),
        Bioma(R.drawable.bioma_agua_dulce, "Pantano Teja", false ),
        Bioma(R.drawable.bioma_campo, "Ruta 10 de Teselia", false ),
        Bioma(R.drawable.bioma_agua_salada, "Ruta 21 de Teselia", false ),
        Bioma(R.drawable.bioma_torre, "Torre Duodraco", true ),
        Bioma(R.drawable.bioma_cueva, "Boquete Gigante", true ),
        Bioma(R.drawable.bioma_cueva, "Cueva Loza", true ),
        Bioma(R.drawable.bioma_pradera, "Santuario Abundancia", true ),
        Bioma(R.drawable.bioma_bosque, "Arboleda Promesa", true ),
        Bioma(R.drawable.bioma_mansion, "Laboratorio de P+P", true ),






















        Bioma(R.drawable.bioma_ultraespacio, "Ultraespacio", false )

    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_biomas, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        botonSiguiente = requireView().findViewById<ImageView>(R.id.boton_siguiente)
        botonAnterior = requireView().findViewById<ImageView>(R.id.boton_atras_mochila)
        botonAceptar = requireView().findViewById<ImageView>(R.id.boton_aceptar)
        textoBioma = requireView().findViewById<TextView>(R.id.nombreBioma)

        textoBioma.text = listaBiomas[0].nombre




        for (i in listaBiomas) {
            imagenBiomas.add(i.icono)
        }

        fondoBioma = requireView().findViewById(R.id.fondo_bioma)
        val imageListener = ImageListener { position, imageView -> imageView.setImageResource(imagenBiomas.get(position)) }
        fondoBioma.setImageListener(imageListener)
        fondoBioma.setPageCount(listaBiomas.size)


        siguienteEdificio()
        anteriorEdificio()
        botonAceptar()

    }

    fun siguienteEdificio() {
        botonSiguiente.setOnClickListener {
            var mediaPlayer: MediaPlayer? = MediaPlayer.create(context, R.raw.sonido_click)
            mediaPlayer?.start()
            var posicionAcual = fondoBioma.currentItem + 1
            if (posicionAcual >= imagenBiomas.size ){
                posicionAcual = 0
            }
            textoBioma.text = listaBiomas[posicionAcual].nombre
            fondoBioma.setCurrentItem(posicionAcual)
        }
    }

    fun anteriorEdificio() {
        botonAnterior.setOnClickListener {
            var mediaPlayer: MediaPlayer? = MediaPlayer.create(context, R.raw.sonido_click)
            mediaPlayer?.start()
            var posicionAcual = fondoBioma.currentItem - 1
            if (posicionAcual < 0 ){
                posicionAcual = imagenBiomas.size - 1
            }
            textoBioma.text = listaBiomas[posicionAcual].nombre
            fondoBioma.setCurrentItem(posicionAcual)
        }
    }

    fun botonAceptar() {
        botonAceptar.setOnClickListener { view ->
            var mediaPlayer: MediaPlayer? = MediaPlayer.create(context, R.raw.sonido_click)
            mediaPlayer?.start()
            ActivityContenedor.biomaUsado = listaBiomas[fondoBioma.currentItem]

                val fragmentPaseo =
                    FragmentPaseo()
                val transaction = requireActivity().supportFragmentManager.beginTransaction()
                transaction.replace(R.id.contenedor, fragmentPaseo, "ficha")
                transaction.addToBackStack(null)
                transaction.commit()
            }
        }
}