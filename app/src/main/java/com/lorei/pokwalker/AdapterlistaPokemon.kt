package com.lorei.pokwalker


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class AdapterlistaPokemon(private var pokedexTotal: List<Pokemon>) :
    RecyclerView.Adapter<AdapterlistaPokemon.MyViewHolder>() {

    var onItemClick: ((Pokemon) -> Unit)? = null

    inner class MyViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        private var view: View = v
        private var pokemon: Pokemon? = null
        internal var imagenObjeto :ImageView = view.findViewById<View>(R.id.imagenObjeto) as ImageView
        internal var textoNv  = view.findViewById<View>(R.id.textoCantidad) as TextView
        internal var nombreObjeto = view.findViewById<View>(R.id.nombreObjeto) as TextView
        internal var numeroNivel = view.findViewById<View>(R.id.numeroCantidad)as TextView
        internal var siguienteNv = view.findViewById<View>(R.id.siguienteNv)as TextView
        internal var textoSgNv = view.findViewById<View>(R.id.textoSgNv)as TextView
        internal var iconoVida = view.findViewById<View>(R.id.iconoVida)as ImageView
        internal var puntosVida = view.findViewById<View>(R.id.puntosVida)as TextView

        init {
            view.setOnClickListener {
                onItemClick?.invoke(pokedexTotal[adapterPosition])
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // create a new view
        val inflatedView = parent.inflate(R.layout.adaptador_pokemon_lista, false)
        return MyViewHolder(
            inflatedView
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val pokemon = pokedexTotal[position]
        if (pokemon.nombre == "???") {
            Glide.with(holder.itemView).load(pokemon.icono).into(holder.imagenObjeto)
            holder.nombreObjeto.text = pokemon.nombre
            holder.siguienteNv.text = " "
            holder.textoSgNv.text = " "
            holder.iconoVida.setVisibility(ImageView.INVISIBLE)
            holder.puntosVida.text = " "

        } else {
            Glide.with(holder.itemView).load(pokemon.icono).into(holder.imagenObjeto)
            holder.nombreObjeto.text = pokemon.nombre
            holder.numeroNivel.text = pokemon.nivel.toString()
            holder.siguienteNv.text = pokemon.siguienteNv.toString()
            holder.textoSgNv.text = "Siguiente Nv: "
            holder.iconoVida.setVisibility(ImageView.VISIBLE)
            holder.puntosVida.text = pokemon.vida.toString()
        }    }

    override fun getItemCount() = pokedexTotal.size
    interface OnClickListener {
        fun onClick(pokemon: Pokemon)
    }

    fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
        return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
    }
    fun filterList(filteredList: List<Pokemon>) {
        pokedexTotal = filteredList
        notifyDataSetChanged()
    }

}


