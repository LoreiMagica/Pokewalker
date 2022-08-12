package com.lorei.pokwalker

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Bioma(var icono: Int, var nombre: String, var esLegendario : Boolean) : java.io.Serializable,
    Parcelable {

}