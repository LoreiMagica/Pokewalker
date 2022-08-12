package com.lorei.pokwalker


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.lorei.pokwalker.databinding.ActivityContenedorBinding


class AdapterlistaTienda(private val listaTienda: List<Objeto>) :
    RecyclerView.Adapter<AdapterlistaTienda.MyViewHolder>() {

    var onItemClick: ((Objeto) -> Unit)? = null


    inner class MyViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        private var view: View = v
        private var objeto: Objeto? = null
        internal var imagenObjeto: ImageView = view.findViewById(R.id.imagenObjeto)
        internal var precioNumero: TextView = view.findViewById(R.id.precioNumero)
        internal var nombreObjeto: TextView = view.findViewById(R.id.nombreObjeto)


        init {
            view.setOnClickListener {
                onItemClick?.invoke(listaTienda[adapterPosition])
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // create a new view
        val inflatedView = parent.inflate(R.layout.adaptador_pokemon_tienda, false)
        return MyViewHolder(
            inflatedView
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val objeto = listaTienda[position]
        Glide.with(holder.itemView).load(objeto.icono).into(holder.imagenObjeto)
        holder.nombreObjeto.text = objeto.nombre
        holder.precioNumero.text = objeto.precio.toString()
    }


    override fun getItemCount() = listaTienda.size
    interface OnClickListener {
        fun onClick(objeto: Objeto) {

        }
    }

    fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
        return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
    }
}


