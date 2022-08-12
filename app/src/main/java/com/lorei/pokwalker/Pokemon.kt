package com.lorei.pokwalker

data class Pokemon(var numero : Short, var icono: Int, var nombre: String, var nivel: Byte, var siguienteNv : Int, var vida: Byte, var amistad: Short, var sonido: Int) : java.io.Serializable {

}