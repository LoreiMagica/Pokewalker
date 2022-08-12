package com.lorei.pokwalker

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Objeto(var icono: Int, var nombre: String, var precio: Short, var cantidad : Int, var esEvolutivo : Boolean) : java.io.Serializable,
    Parcelable {

}