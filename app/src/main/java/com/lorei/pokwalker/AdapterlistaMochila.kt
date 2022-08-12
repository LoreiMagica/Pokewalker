package com.lorei.pokwalker



import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide



class AdapterlistaMochila(private val listaInventario: List<Objeto>) :
    RecyclerView.Adapter<AdapterlistaMochila.MyViewHolder>() {
    var onItemClick: ((Objeto) -> Unit)? = null


    inner class MyViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        private var view: View = v
        private var objeto: Objeto? = null
        internal var imagenObjeto :ImageView = view.findViewById<View>(R.id.imagenObjeto) as ImageView
        internal var textoNv  = view.findViewById<View>(R.id.textoCantidad) as TextView
        internal var nombreObjeto = view.findViewById<View>(R.id.nombreObjeto) as TextView
        internal var numeroNivel = view.findViewById<View>(R.id.numeroCantidad)as TextView


        init {
                view.setOnClickListener {
                    onItemClick?.invoke(listaInventario[adapterPosition])
                }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // create a new view
        val inflatedView = parent.inflate(R.layout.adaptador_mochila_lista, false)
        return MyViewHolder(
            inflatedView
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val objeto = listaInventario[position]
        Glide.with(holder.itemView).load(objeto.icono).into(holder.imagenObjeto)
        holder.textoNv.text = "Cantidad: "
        holder.nombreObjeto.text = objeto.nombre
        holder.numeroNivel.text = objeto.cantidad.toString()
    }

    override fun getItemCount() = listaInventario.size
    interface OnClickListener {
        fun onClick(objeto: Objeto)
    }

    fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
        return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
    }



}


