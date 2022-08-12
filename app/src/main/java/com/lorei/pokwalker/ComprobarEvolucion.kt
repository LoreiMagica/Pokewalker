package com.lorei.pokwalker

import android.util.Log
import java.util.*

class ComprobarEvolucion {
    fun comprobarNivel(pokemon : Pokemon) : Boolean {
        when {
            pokemon.numero < 150 -> {
                if (pokemon.nombre.equals("Bulbasaur") && pokemon.nivel >= 16) {
                    if (!ActivityContenedor.pokedexActual.get(1).nombre.equals("Ivisaur")){
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(1)), ActivityContenedor.pokedexTotal.get(1))
                        ActivityContenedor.pokedexActual.get(1).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(0).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(0)), Pokemon(1, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(1)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        Log.d("evo", ActivityContenedor.pokedexActual.get(1).toString())
                        return true
                    }
                } else if (pokemon.nombre.equals("Ivysaur") && pokemon.nivel >= 32){
                    if (!ActivityContenedor.pokedexActual.get(2).nombre.equals("Venusaur")){
                        Log.d("evo2", ActivityContenedor.pokedexActual.get(2).toString())
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(2)), ActivityContenedor.pokedexTotal.get(2))
                        ActivityContenedor.pokedexActual.get(2).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(1).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(1)), Pokemon(2, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(2)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        Log.d("evo2", ActivityContenedor.pokedexActual.toString())

                        return true
                    }
                } else if (pokemon.nombre.equals("Charmander") && pokemon.nivel >= 16){
                    if (!ActivityContenedor.pokedexActual.get(4).nombre.equals("Charmeleon")){
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(4)), ActivityContenedor.pokedexTotal.get(4))
                        ActivityContenedor.pokedexActual.get(4).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(3).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(3)), Pokemon(4, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(4)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true
                    }
                } else if (pokemon.nombre.equals("Charmeleon") && pokemon.nivel >= 36){
                    if (!ActivityContenedor.pokedexActual.get(5).nombre.equals("Charizard")){
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(5)), ActivityContenedor.pokedexTotal.get(5))
                        ActivityContenedor.pokedexActual.get(5).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(4).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(4)), Pokemon(5, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(5)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true               }
                } else if (pokemon.nombre.equals("Squirtle") && pokemon.nivel >= 16){
                    if (!ActivityContenedor.pokedexActual.get(7).nombre.equals("Wartortle")){
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(7)), ActivityContenedor.pokedexTotal.get(7))
                        ActivityContenedor.pokedexActual.get(7).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(6).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(6)), Pokemon(7, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(7)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })

                        return true               }
                } else if (pokemon.nombre.equals("Wartortle") && pokemon.nivel >= 36){
                    if (!ActivityContenedor.pokedexActual.get(8).nombre.equals("Blastoise")){
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(8)), ActivityContenedor.pokedexTotal.get(8))
                        ActivityContenedor.pokedexActual.get(8).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(7).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(7)), Pokemon(8, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(8)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })

                        return true               }
                } else if (pokemon.nombre.equals("Caterpie") && pokemon.nivel >= 7){
                    if (!ActivityContenedor.pokedexActual.get(10).nombre.equals("Metapod")){
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(10)), ActivityContenedor.pokedexTotal.get(10))
						ActivityContenedor.pokedexActual.get(10).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(9).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(9)), Pokemon(10, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(10)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })

                        return true
                    }
                } else if (pokemon.nombre.equals("Metapod") && pokemon.nivel >= 10){
                    if (!ActivityContenedor.pokedexActual.get(11).nombre.equals("Butterfree")){
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(11)), ActivityContenedor.pokedexTotal.get(11))
						ActivityContenedor.pokedexActual.get(11).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(10).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(10)), Pokemon(11, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(11)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })

                        return true               }
                } else if (pokemon.nombre.equals("Weedle") && pokemon.nivel >= 7){
                    if (!ActivityContenedor.pokedexActual.get(13).nombre.equals("Kakuna")){
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(13)), ActivityContenedor.pokedexTotal.get(13))
						ActivityContenedor.pokedexActual.get(13).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(12).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(12)), Pokemon(13, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(13)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })

                        return true               }
                } else if (pokemon.nombre.equals("Kakuna") && pokemon.nivel >= 10){
                    if (!ActivityContenedor.pokedexActual.get(14).nombre.equals("Beedrill")){
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(14)), ActivityContenedor.pokedexTotal.get(14))
						ActivityContenedor.pokedexActual.get(14).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(13).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(13)), Pokemon(14,R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(14)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })

                        return true               }
                } else if (pokemon.nombre.equals("Pidgey") && pokemon.nivel >= 18){
                    if (!ActivityContenedor.pokedexActual.get(16).nombre.equals("Pidgeotto")){
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(16)), ActivityContenedor.pokedexTotal.get(16))
						ActivityContenedor.pokedexActual.get(16).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(15).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(15)), Pokemon(16, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(16)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })

                        return true             }
                } else if (pokemon.nombre.equals("Pidgeotto") && pokemon.nivel >= 36){
                    if (!ActivityContenedor.pokedexActual.get(17).nombre.equals("Pidgeot")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(17)), ActivityContenedor.pokedexTotal.get(17))
						ActivityContenedor.pokedexActual.get(17).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(16).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(16)), Pokemon(17, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(17)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })

                        return true             }
                } else if (pokemon.nombre.equals("Rattata") && pokemon.nivel >= 20){
                    if (!ActivityContenedor.pokedexActual.get(19).nombre.equals("Raticate")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(19)), ActivityContenedor.pokedexTotal.get(19))
						ActivityContenedor.pokedexActual.get(19).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(18).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(18)), Pokemon(19, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(19)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })

                        return true             }
                } else if (pokemon.nombre.equals("Spearow") && pokemon.nivel >= 20){
                    if (!ActivityContenedor.pokedexActual.get(21).nombre.equals("Fearow")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(21)), ActivityContenedor.pokedexTotal.get(21))
						ActivityContenedor.pokedexActual.get(21).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(20).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(20)), Pokemon(21, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(21)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        Log.d("evo", ActivityContenedor.pokedexActual.get(1).toString())
                        return true             }
                } else if (pokemon.nombre.equals("Ekans") && pokemon.nivel >= 22){
                    if (!ActivityContenedor.pokedexActual.get(23).nombre.equals("Arbok")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(23)), ActivityContenedor.pokedexTotal.get(23))
						ActivityContenedor.pokedexActual.get(23).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(22).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(22)), Pokemon(23, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(23)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })

                        return true             }
                } else if (pokemon.nombre.equals("Sandshrew") && pokemon.nivel >= 22){
                    if (!ActivityContenedor.pokedexActual.get(27).nombre.equals("Sandslash")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(27)), ActivityContenedor.pokedexTotal.get(27))
						ActivityContenedor.pokedexActual.get(27).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(26).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(26)), Pokemon(27, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(27)
                        return true             }
                } else if (pokemon.nombre.equals("Nidoran♀") && pokemon.nivel >= 16){
                    if (!ActivityContenedor.pokedexActual.get(29).nombre.equals("Nidorina")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(29)), ActivityContenedor.pokedexTotal.get(29))
						ActivityContenedor.pokedexActual.get(29).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(28).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(28)), Pokemon(29, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(29)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })

                        return true             }
                } else if (pokemon.nombre.equals("Nidoran♂") && pokemon.nivel >= 16){
                    if (!ActivityContenedor.pokedexActual.get(32).nombre.equals("Nidorino")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(32)), ActivityContenedor.pokedexTotal.get(32))
						ActivityContenedor.pokedexActual.get(32).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(31).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(31)), Pokemon(32, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(32)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true             }
                } else if (pokemon.nombre.equals("Zubat") && pokemon.nivel >= 22){
                    if (!ActivityContenedor.pokedexActual.get(41).nombre.equals("Golbat")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(41)), ActivityContenedor.pokedexTotal.get(41))
						ActivityContenedor.pokedexActual.get(41).amistad =ActivityContenedor.pokemonUsado.amistad
						ActivityContenedor.pokedexActual.get(41).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(40).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(40)), Pokemon(41, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(41)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true             }
                } else if (pokemon.nombre.equals("Oddish") && pokemon.nivel >= 21){
                    if (!ActivityContenedor.pokedexActual.get(43).nombre.equals("Gloom")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(43)), ActivityContenedor.pokedexTotal.get(43))
						ActivityContenedor.pokedexActual.get(43).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(42).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(42)), Pokemon(43, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(43)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true             }
                } else if (pokemon.nombre.equals("Paras") && pokemon.nivel >= 24){
                    if (!ActivityContenedor.pokedexActual.get(46).nombre.equals("Parasect")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(46)), ActivityContenedor.pokedexTotal.get(46))
						ActivityContenedor.pokedexActual.get(46).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(45).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(45)), Pokemon(46, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(46)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true             }
                } else if (pokemon.nombre.equals("Venonat") && pokemon.nivel >= 31){
                    if (!ActivityContenedor.pokedexActual.get(48).nombre.equals("Venomoth")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(48)), ActivityContenedor.pokedexTotal.get(48))
						ActivityContenedor.pokedexActual.get(48).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(47).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(47)), Pokemon(48, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(48)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true             }
                } else if (pokemon.nombre.equals("Diglett") && pokemon.nivel >= 26){
                    if (!ActivityContenedor.pokedexActual.get(50).nombre.equals("Dugtrio")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(50)), ActivityContenedor.pokedexTotal.get(50))
						ActivityContenedor.pokedexActual.get(50).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(49).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(49)), Pokemon(50, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(50)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true             }
                } else if (pokemon.nombre.equals("Meowth") && pokemon.nivel >= 28){
                    if (!ActivityContenedor.pokedexActual.get(52).nombre.equals("Persian")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(52)), ActivityContenedor.pokedexTotal.get(52))
						ActivityContenedor.pokedexActual.get(52).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(51).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(51)), Pokemon(52, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(52)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true             }
                } else if (pokemon.nombre.equals("Psyduck") && pokemon.nivel >= 33){
                    if (!ActivityContenedor.pokedexActual.get(54).nombre.equals("Golduck")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(54)), ActivityContenedor.pokedexTotal.get(54))
						ActivityContenedor.pokedexActual.get(54).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(53).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(53)), Pokemon(54, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(54)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true               }
                } else if (pokemon.nombre.equals("Mankey") && pokemon.nivel >= 28){
                    if (!ActivityContenedor.pokedexActual.get(56).nombre.equals("Primeape")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(56)), ActivityContenedor.pokedexTotal.get(56))
						ActivityContenedor.pokedexActual.get(56).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(55).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(55)), Pokemon(56, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(56)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true               }
                } else if (pokemon.nombre.equals("Poliwag") && pokemon.nivel >= 25){
                    if (!ActivityContenedor.pokedexActual.get(60).nombre.equals("Poliwhirl")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(60)), ActivityContenedor.pokedexTotal.get(60))
						ActivityContenedor.pokedexActual.get(60).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(59).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(59)), Pokemon(60, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(60)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true               }
                } else if (pokemon.nombre.equals("Abra") && pokemon.nivel >= 16){
                    if (!ActivityContenedor.pokedexActual.get(63).nombre.equals("Kadabra")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(63)), ActivityContenedor.pokedexTotal.get(63))
						ActivityContenedor.pokedexActual.get(63).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(62).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(62)), Pokemon(63, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(63)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true
                    }
                } else if (pokemon.nombre.equals("Machop") && pokemon.nivel >= 28){
                    if (!ActivityContenedor.pokedexActual.get(66).nombre.equals("Machoke")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(66)), ActivityContenedor.pokedexTotal.get(66))
						ActivityContenedor.pokedexActual.get(66).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(65).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(65)), Pokemon(66, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(66)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true                   }
                } else if (pokemon.nombre.equals("Bellsprout") && pokemon.nivel >= 21){
                    if (!ActivityContenedor.pokedexActual.get(69).nombre.equals("Weepinbell")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(69)), ActivityContenedor.pokedexTotal.get(69))
						ActivityContenedor.pokedexActual.get(69).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(68).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(68)), Pokemon(69, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(69)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Tentacool") && pokemon.nivel >= 30){
                    if (!ActivityContenedor.pokedexActual.get(72).nombre.equals("Tentacruel")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(72)), ActivityContenedor.pokedexTotal.get(72))
						ActivityContenedor.pokedexActual.get(72).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(71).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(71)), Pokemon(72, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(72)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Geodude") && pokemon.nivel >= 25){
                    if (!ActivityContenedor.pokedexActual.get(74).nombre.equals("Graveler")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(74)), ActivityContenedor.pokedexTotal.get(74))
						ActivityContenedor.pokedexActual.get(74).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(73).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(73)), Pokemon(74, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(74)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Ponyta") && pokemon.nivel >= 40){
                    if (!ActivityContenedor.pokedexActual.get(77).nombre.equals("Rapidash")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(77)), ActivityContenedor.pokedexTotal.get(77))
						ActivityContenedor.pokedexActual.get(77).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(76).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(76)), Pokemon(77, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(77)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Slowpoke") && pokemon.nivel >= 37){
                    if (!ActivityContenedor.pokedexActual.get(79).nombre.equals("Slowbro")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(79)), ActivityContenedor.pokedexTotal.get(79))
						ActivityContenedor.pokedexActual.get(79).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(78).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(78)), Pokemon(79, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(79)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Magnemite") && pokemon.nivel >= 30){
                    if (!ActivityContenedor.pokedexActual.get(81).nombre.equals("Magneton")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(81)), ActivityContenedor.pokedexTotal.get(81))
						ActivityContenedor.pokedexActual.get(81).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(80).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(80)), Pokemon(81, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(81)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true                        }
                } else if (pokemon.nombre.equals("Doduo") && pokemon.nivel >= 31){
                    if (!ActivityContenedor.pokedexActual.get(84).nombre.equals("Dotrio")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(84)), ActivityContenedor.pokedexTotal.get(84))
						ActivityContenedor.pokedexActual.get(84).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(83).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(83)), Pokemon(84, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(84)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })

                        return true                        }
                } else if (pokemon.nombre.equals("Seel") && pokemon.nivel >= 34){
                    if (!ActivityContenedor.pokedexActual.get(86).nombre.equals("Dewgong")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(86)), ActivityContenedor.pokedexTotal.get(86))
						ActivityContenedor.pokedexActual.get(86).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(85).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(85)), Pokemon(86, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(86)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true                        }
                } else if (pokemon.nombre.equals("Grimer") && pokemon.nivel >= 38) {
                    if (!ActivityContenedor.pokedexActual.get(88).nombre.equals("Muk")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(88)), ActivityContenedor.pokedexTotal.get(88))
						ActivityContenedor.pokedexActual.get(88).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(87).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(87)), Pokemon(88, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(88)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true                        }
                } else if (pokemon.nombre.equals("Gastly") && pokemon.nivel >= 25){
                    if (!ActivityContenedor.pokedexActual.get(92).nombre.equals("Haunter")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(92)), ActivityContenedor.pokedexTotal.get(92))
						ActivityContenedor.pokedexActual.get(92).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(91).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(91)), Pokemon(92, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(92)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true                        }
                } else if (pokemon.nombre.equals("Drowzee") && pokemon.nivel >= 26){
                    if (!ActivityContenedor.pokedexActual.get(96).nombre.equals("Hypno")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(96)), ActivityContenedor.pokedexTotal.get(96))
						ActivityContenedor.pokedexActual.get(96).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(95).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(95)), Pokemon(96, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(96)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true                        }
                } else if (pokemon.nombre.equals("Krabby") && pokemon.nivel >= 28){
                    if (!ActivityContenedor.pokedexActual.get(98).nombre.equals("Kingler")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(98)), ActivityContenedor.pokedexTotal.get(98))
						ActivityContenedor.pokedexActual.get(98).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(97).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(97)), Pokemon(98, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(98)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true                        }
                } else if (pokemon.nombre.equals("Voltorb") && pokemon.nivel >= 30){
                    if (!ActivityContenedor.pokedexActual.get(100).nombre.equals("Electrode")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(100)), ActivityContenedor.pokedexTotal.get(100))
						ActivityContenedor.pokedexActual.get(100).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(99).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(99)), Pokemon(100, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(100)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true                        }
                } else if (pokemon.nombre.equals("Cubone") && pokemon.nivel >= 28){
                    if (!ActivityContenedor.pokedexActual.get(104).nombre.equals("Marowak")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(104)), ActivityContenedor.pokedexTotal.get(104))
						ActivityContenedor.pokedexActual.get(104).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(103).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(103)), Pokemon(104, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(104)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true                        }
                } else if (pokemon.nombre.equals("Koffing") && pokemon.nivel >= 35){
                    if (!ActivityContenedor.pokedexActual.get(109).nombre.equals("Weezing")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(109)), ActivityContenedor.pokedexTotal.get(109))
						ActivityContenedor.pokedexActual.get(109).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(108).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(108)), Pokemon(109, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(109)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true                        }
                } else if (pokemon.nombre.equals("Rhyhorn") && pokemon.nivel >= 42){
                    if (!ActivityContenedor.pokedexActual.get(111).nombre.equals("Rhydon")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(111)), ActivityContenedor.pokedexTotal.get(111))
						ActivityContenedor.pokedexActual.get(111).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(110).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(110)), Pokemon(111, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(111)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true                        }
                } else if (pokemon.nombre.equals("Horsea") && pokemon.nivel >= 32){
                    if (!ActivityContenedor.pokedexActual.get(116).nombre.equals("Seadra")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(116)), ActivityContenedor.pokedexTotal.get(116))
						ActivityContenedor.pokedexActual.get(116).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(115).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(115)), Pokemon(116, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(116)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true                        }
                } else if (pokemon.nombre.equals("Goldeen") && pokemon.nivel >= 33){
                    if (!ActivityContenedor.pokedexActual.get(118).nombre.equals("Seaking")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(118)), ActivityContenedor.pokedexTotal.get(118))
						ActivityContenedor.pokedexActual.get(118).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(117).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(117)), Pokemon(118, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(118)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true                        }
                } else if (pokemon.nombre.equals("Magikarp") && pokemon.nivel >= 20){
                    if (!ActivityContenedor.pokedexActual.get(129).nombre.equals("Gyarados")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(129)), ActivityContenedor.pokedexTotal.get(129))
						ActivityContenedor.pokedexActual.get(129).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(128).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(128)), Pokemon(129, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(129)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true                        }
                } else if (pokemon.nombre.equals("Omanyte") && pokemon.nivel >= 40){
                    if (!ActivityContenedor.pokedexActual.get(138).nombre.equals("Omastar")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(138)), ActivityContenedor.pokedexTotal.get(138))
						ActivityContenedor.pokedexActual.get(138).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(137).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(137)), Pokemon(138, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(138)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true                        }
                } else if (pokemon.nombre.equals("Kabuto") && pokemon.nivel >= 40){
                    if (!ActivityContenedor.pokedexActual.get(140).nombre.equals("Kabutops")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(140)), ActivityContenedor.pokedexTotal.get(140))
						ActivityContenedor.pokedexActual.get(140).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(139).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(139)), Pokemon(140, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(140)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true                        }
                } else if (pokemon.nombre.equals("Dratini") && pokemon.nivel >= 30){
                    if (!ActivityContenedor.pokedexActual.get(147).nombre.equals("Dragonair")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(147)), ActivityContenedor.pokedexTotal.get(147))
						ActivityContenedor.pokedexActual.get(147).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(146).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(146)), Pokemon(147, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(147)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true                        }
                } else if (pokemon.nombre.equals("Dragonair") && pokemon.nivel >= 55){
                    if (!ActivityContenedor.pokedexActual.get(148).nombre.equals("Dragonite")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(148)), ActivityContenedor.pokedexTotal.get(148))
						ActivityContenedor.pokedexActual.get(148).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(147).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(147)), Pokemon(148, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(148)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true                        }
                }
            }
            (pokemon.numero in 151..250) -> {
                if (pokemon.nombre.equals("Chikorita") && pokemon.nivel >= 16){
                    if (!ActivityContenedor.pokedexActual.get(152).nombre.equals("Bayleef")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(152)), ActivityContenedor.pokedexTotal.get(152))
						ActivityContenedor.pokedexActual.get(152).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(151).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(151)), Pokemon(152, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(152)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true                        }
                } else if (pokemon.nombre.equals("Bayleef") && pokemon.nivel >= 32){
                    if (!ActivityContenedor.pokedexActual.get(153).nombre.equals("Meganium")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(153)), ActivityContenedor.pokedexTotal.get(153))
						ActivityContenedor.pokedexActual.get(153).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(152).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(152)), Pokemon(153, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(153)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true                        }
                } else if (pokemon.nombre.equals("Cyndaquil") && pokemon.nivel >= 14){
                    if (!ActivityContenedor.pokedexActual.get(155).nombre.equals("Quilava")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(155)), ActivityContenedor.pokedexTotal.get(155))
						ActivityContenedor.pokedexActual.get(155).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(154).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(154)), Pokemon(155, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(155)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true                        }
                } else if (pokemon.nombre.equals("Quilava") && pokemon.nivel >= 36){
                    if (!ActivityContenedor.pokedexActual.get(156).nombre.equals("Typhlosion")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(156)), ActivityContenedor.pokedexTotal.get(156))
						ActivityContenedor.pokedexActual.get(156).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(155).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(155)), Pokemon(156, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(156)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true                        }
                } else if (pokemon.nombre.equals("Totodile") && pokemon.nivel >= 18){
                    if (!ActivityContenedor.pokedexActual.get(158).nombre.equals("Croconaw")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(158)), ActivityContenedor.pokedexTotal.get(158))
						ActivityContenedor.pokedexActual.get(158).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(157).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(157)), Pokemon(158, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(158)
                        return true                        }
                } else if (pokemon.nombre.equals("Croconaw") && pokemon.nivel >= 30){
                    if (!ActivityContenedor.pokedexActual.get(159).nombre.equals("Feraligatr")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(159)), ActivityContenedor.pokedexTotal.get(159))
						ActivityContenedor.pokedexActual.get(159).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(158).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(158)), Pokemon(159, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(159)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true                        }
                } else if (pokemon.nombre.equals("Sentret") && pokemon.nivel >= 15){
                    if (!ActivityContenedor.pokedexActual.get(161).nombre.equals("Furret")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(161)), ActivityContenedor.pokedexTotal.get(161))
						ActivityContenedor.pokedexActual.get(161).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(160).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(160)), Pokemon(161, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(161)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true                        }
                } else if (pokemon.nombre.equals("Hoothoot") && pokemon.nivel >= 20){
                    if (!ActivityContenedor.pokedexActual.get(163).nombre.equals("Noctowl")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(163)), ActivityContenedor.pokedexTotal.get(163))
						ActivityContenedor.pokedexActual.get(163).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(162).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(162)), Pokemon(163, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(163)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true                        }
                } else if (pokemon.nombre.equals("Ledyba") && pokemon.nivel >= 18){
                    if (!ActivityContenedor.pokedexActual.get(165).nombre.equals("Ledian")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(165)), ActivityContenedor.pokedexTotal.get(165))
						ActivityContenedor.pokedexActual.get(164).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(164).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(164)), Pokemon(165, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(165)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Spinarak") && pokemon.nivel >= 22){
                    if (!ActivityContenedor.pokedexActual.get(167).nombre.equals("Ariados")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(167)), ActivityContenedor.pokedexTotal.get(167))
						ActivityContenedor.pokedexActual.get(167).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(166).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(166)), Pokemon(166, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(167)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Chinchou") && pokemon.nivel >= 27){
                    if (!ActivityContenedor.pokedexActual.get(170).nombre.equals("Lanturn")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(170)), ActivityContenedor.pokedexTotal.get(170))
						ActivityContenedor.pokedexActual.get(170).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(169).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(169)), Pokemon(170, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(170)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Natu") && pokemon.nivel >= 25){
                    if (!ActivityContenedor.pokedexActual.get(177).nombre.equals("Xatu")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(177)), ActivityContenedor.pokedexTotal.get(177))
						ActivityContenedor.pokedexActual.get(177).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(176).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(176)), Pokemon(177, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(177)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Mareep") && pokemon.nivel >= 15){
                    if (!ActivityContenedor.pokedexActual.get(179).nombre.equals("Flaaffy")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(179)), ActivityContenedor.pokedexTotal.get(179))
						ActivityContenedor.pokedexActual.get(179).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(178).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(178)), Pokemon(179, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(179)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Flaaffy") && pokemon.nivel >= 30){
                    if (!ActivityContenedor.pokedexActual.get(180).nombre.equals("Ampharos")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(180)), ActivityContenedor.pokedexTotal.get(180))
						ActivityContenedor.pokedexActual.get(180).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(179).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(179)), Pokemon(180, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(180)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Marill") && pokemon.nivel >= 18){
                    if (!ActivityContenedor.pokedexActual.get(183).nombre.equals("Azumarill")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(183)), ActivityContenedor.pokedexTotal.get(183))
						ActivityContenedor.pokedexActual.get(183).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(182).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(182)), Pokemon(183, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(183)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Hoppip") && pokemon.nivel >= 18){
                    if (!ActivityContenedor.pokedexActual.get(187).nombre.equals("Skiploom")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(187)), ActivityContenedor.pokedexTotal.get(187))
						ActivityContenedor.pokedexActual.get(187).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(186).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(186)), Pokemon(187, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(187)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Skiploom") && pokemon.nivel >= 27){
                    if (!ActivityContenedor.pokedexActual.get(188).nombre.equals("Jumpluff")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(188)), ActivityContenedor.pokedexTotal.get(188))
						ActivityContenedor.pokedexActual.get(188).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(187).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(187)), Pokemon(188, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(188)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Wooper") && pokemon.nivel >= 20){
                    if (!ActivityContenedor.pokedexActual.get(194).nombre.equals("Quagsire")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(194)), ActivityContenedor.pokedexTotal.get(194))
						ActivityContenedor.pokedexActual.get(194).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(193).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(193)), Pokemon(194, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(194)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Pineco") && pokemon.nivel >= 31){
                    if (!ActivityContenedor.pokedexActual.get(204).nombre.equals("Forretress")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(204)), ActivityContenedor.pokedexTotal.get(204))
						ActivityContenedor.pokedexActual.get(204).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(203).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(203)), Pokemon(204, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(204)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Snubbull") && pokemon.nivel >= 23){
                    if (!ActivityContenedor.pokedexActual.get(209).nombre.equals("Granbull")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(209)), ActivityContenedor.pokedexTotal.get(209))
						ActivityContenedor.pokedexActual.get(209).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(208).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(208)), Pokemon(209, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(209)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Teddiursa") && pokemon.nivel >= 30){
                    if (!ActivityContenedor.pokedexActual.get(216).nombre.equals("Ursaring")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(216)), ActivityContenedor.pokedexTotal.get(216))
						ActivityContenedor.pokedexActual.get(216).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(215).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(215)), Pokemon(216, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(216)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                             { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Slugma") && pokemon.nivel >= 38){
                    if (!ActivityContenedor.pokedexActual.get(218).nombre.equals("Magcargo")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(218)), ActivityContenedor.pokedexTotal.get(218))
						ActivityContenedor.pokedexActual.get(218).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(217).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(217)), Pokemon(218, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(218)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                             { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Swinub") && pokemon.nivel >= 33){
                    if (!ActivityContenedor.pokedexActual.get(220).nombre.equals("Piloswine")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(220)), ActivityContenedor.pokedexTotal.get(220))
						ActivityContenedor.pokedexActual.get(220).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(219).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(219)), Pokemon(220, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(220)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                             { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Remoraid") && pokemon.nivel >= 25){
                    if (!ActivityContenedor.pokedexActual.get(223).nombre.equals("Octillery")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(223)), ActivityContenedor.pokedexTotal.get(223))
						ActivityContenedor.pokedexActual.get(223).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(222).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(222)), Pokemon(223, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(223)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                             { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Houndour") && pokemon.nivel >= 24){
                    if (!ActivityContenedor.pokedexActual.get(228).nombre.equals("Houndoom")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(228)), ActivityContenedor.pokedexTotal.get(228))
						ActivityContenedor.pokedexActual.get(228).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(227).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(227)), Pokemon(228, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(228)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                             { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Phanpy") && pokemon.nivel >= 25){
                    if (!ActivityContenedor.pokedexActual.get(231).nombre.equals("Donphan")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(231)), ActivityContenedor.pokedexTotal.get(231))
						ActivityContenedor.pokedexActual.get(231).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(230).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(230)), Pokemon(231, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(231)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                            { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Tyrogue") && pokemon.nivel >= 20){
                    if (!ActivityContenedor.pokedexActual.get(105).nombre.equals("Hitmonlee")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(105)), ActivityContenedor.pokedexTotal.get(105))
						ActivityContenedor.pokedexActual.get(105).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(235).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(235)), Pokemon(236, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(105)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                            { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            } else if (!ActivityContenedor.pokedexActual.get(106).nombre.equals("Hitmonchan")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(106)), ActivityContenedor.pokedexTotal.get(106))
						ActivityContenedor.pokedexActual.get(106).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(235).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(235)), Pokemon(236, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(106)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                             { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            } else if (!ActivityContenedor.pokedexActual.get(236).nombre.equals("Hitmontop")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(236)), ActivityContenedor.pokedexTotal.get(236))
						ActivityContenedor.pokedexActual.get(236).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(235).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(235)), Pokemon(236, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(236)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                             { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }

                } else if (pokemon.nombre.equals("Smoochum") && pokemon.nivel >= 30){
                    if (!ActivityContenedor.pokedexActual.get(123).nombre.equals("Jynx")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(123)), ActivityContenedor.pokedexTotal.get(123))
						ActivityContenedor.pokedexActual.get(123).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(237).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(237)), Pokemon(238, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(123)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                             { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Elekid") && pokemon.nivel >= 30){
                    if (!ActivityContenedor.pokedexActual.get(124).nombre.equals("Electabuzz")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(124)), ActivityContenedor.pokedexTotal.get(124))
						ActivityContenedor.pokedexActual.get(124).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(238).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(238)), Pokemon(239, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(124)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                             { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Magby") && pokemon.nivel >= 30){
                    if (!ActivityContenedor.pokedexActual.get(125).nombre.equals("Magmar")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(125)), ActivityContenedor.pokedexTotal.get(125))
						ActivityContenedor.pokedexActual.get(125).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(239).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(239)), Pokemon(240, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(125)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                             { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Larvitar") && pokemon.nivel >= 30){
                    if (!ActivityContenedor.pokedexActual.get(246).nombre.equals("Pupitar")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(246)), ActivityContenedor.pokedexTotal.get(246))
						ActivityContenedor.pokedexActual.get(246).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(245).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(245)), Pokemon(246, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(246)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                            { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Pupitar") && pokemon.nivel >= 55){
                    if (!ActivityContenedor.pokedexActual.get(247).nombre.equals("Tyranitar")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(247)), ActivityContenedor.pokedexTotal.get(247))
						ActivityContenedor.pokedexActual.get(247).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(246).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(246)), Pokemon(247, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(247)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                             { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                }
            }
            pokemon.numero in 251..385 -> {
                if (pokemon.nombre.equals("Treecko") && pokemon.nivel >= 16){
                    if (!ActivityContenedor.pokedexActual.get(252).nombre.equals("Grovyle")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(252)), ActivityContenedor.pokedexTotal.get(252))
						ActivityContenedor.pokedexActual.get(252).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(251).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(251)), Pokemon(252, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(252)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Grovyle") && pokemon.nivel >= 36){
                    if (!ActivityContenedor.pokedexActual.get(253).nombre.equals("Sceptile")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(253)), ActivityContenedor.pokedexTotal.get(253))
						ActivityContenedor.pokedexActual.get(253).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(252).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(252)), Pokemon(253, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(253)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Torchic") && pokemon.nivel >= 16){
                    if (!ActivityContenedor.pokedexActual.get(255).nombre.equals("Combusken")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(255)), ActivityContenedor.pokedexTotal.get(255))
						ActivityContenedor.pokedexActual.get(255).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(254).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(254)), Pokemon(255, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(255)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Combusken") && pokemon.nivel >= 36) {
                    if (!ActivityContenedor.pokedexActual.get(256).nombre.equals("Blaziken")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(256)), ActivityContenedor.pokedexTotal.get(256))
						ActivityContenedor.pokedexActual.get(256).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(255).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(255)), Pokemon(256, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(256)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Mudkip") && pokemon.nivel >= 16){
                    if (!ActivityContenedor.pokedexActual.get(258).nombre.equals("Marshtomp")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(258)), ActivityContenedor.pokedexTotal.get(258))
						ActivityContenedor.pokedexActual.get(258).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(257).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(257)), Pokemon(258, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(258)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Marshtomp") && pokemon.nivel >= 36){
                    if (!ActivityContenedor.pokedexActual.get(259).nombre.equals("Swampert")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(259)), ActivityContenedor.pokedexTotal.get(259))
						ActivityContenedor.pokedexActual.get(259).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(258).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(258)), Pokemon(259, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(259)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Poochyena") && pokemon.nivel >= 18){
                    if (!ActivityContenedor.pokedexActual.get(261).nombre.equals("Mightyena")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(261)), ActivityContenedor.pokedexTotal.get(261))
						ActivityContenedor.pokedexActual.get(261).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(260).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(260)), Pokemon(261, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(261)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Zigzagoon") && pokemon.nivel >= 20){
                    if (!ActivityContenedor.pokedexActual.get(263).nombre.equals("Linoone")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(263)), ActivityContenedor.pokedexTotal.get(263))
						ActivityContenedor.pokedexActual.get(263).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(262).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(262)), Pokemon(263, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(263)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Wurmple") && pokemon.nivel >= 7){
                    if (!ActivityContenedor.pokedexActual.get(265).nombre.equals("Silcoon")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(265)), ActivityContenedor.pokedexTotal.get(265))
						ActivityContenedor.pokedexActual.get(265).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(264).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(264)), Pokemon(265, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(265)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            } else if (!ActivityContenedor.pokedexActual.get(267).nombre.equals("Cascoon")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(267)), ActivityContenedor.pokedexTotal.get(267))
						ActivityContenedor.pokedexActual.get(267).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(264).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(264)), Pokemon(265, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(267)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Silcoon") && pokemon.nivel >= 10){
                    if (!ActivityContenedor.pokedexActual.get(266).nombre.equals("Beautifly")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(266)), ActivityContenedor.pokedexTotal.get(266))
						ActivityContenedor.pokedexActual.get(266).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(265).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(265)), Pokemon(266, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(266)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Cascoon") && pokemon.nivel >= 10){
                    if (!ActivityContenedor.pokedexActual.get(268).nombre.equals("Dustox")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(268)), ActivityContenedor.pokedexTotal.get(268))
						ActivityContenedor.pokedexActual.get(268).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(267).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(267)), Pokemon(268, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(268)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Lotad") && pokemon.nivel >= 14){
                    if (!ActivityContenedor.pokedexActual.get(270).nombre.equals("Lombre")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(270)), ActivityContenedor.pokedexTotal.get(270))
						ActivityContenedor.pokedexActual.get(270).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(269).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(269)), Pokemon(270, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(270)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Seedot") && pokemon.nivel >= 14){
                    if (!ActivityContenedor.pokedexActual.get(273).nombre.equals("Nuzleaf")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(273)), ActivityContenedor.pokedexTotal.get(273))
						ActivityContenedor.pokedexActual.get(273).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(272).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(272)), Pokemon(273, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(273)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Taillow") && pokemon.nivel >= 22){
                    if (!ActivityContenedor.pokedexActual.get(276).nombre.equals("Swellow")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(276)), ActivityContenedor.pokedexTotal.get(276))
						ActivityContenedor.pokedexActual.get(276).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(275).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(275)), Pokemon(276, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(276)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Wingull") && pokemon.nivel >= 25){
                    if (!ActivityContenedor.pokedexActual.get(278).nombre.equals("Pelipper")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(278)), ActivityContenedor.pokedexTotal.get(278))
						ActivityContenedor.pokedexActual.get(278).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(277).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(277)), Pokemon(278, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(278)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Ralts") && pokemon.nivel >= 20){
                    if (!ActivityContenedor.pokedexActual.get(280).nombre.equals("Kirlia")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(280)), ActivityContenedor.pokedexTotal.get(280))
						ActivityContenedor.pokedexActual.get(280).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(279).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(279)), Pokemon(280, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(280)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Kirlia") && pokemon.nivel >= 30){
                    if (!ActivityContenedor.pokedexActual.get(281).nombre.equals("Gardevoir")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(281)), ActivityContenedor.pokedexTotal.get(281))
						ActivityContenedor.pokedexActual.get(281).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(280).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(280)), Pokemon(281, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(281)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Surskit") && pokemon.nivel >= 22){
                    if (!ActivityContenedor.pokedexActual.get(283).nombre.equals("Masquerain")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(283)), ActivityContenedor.pokedexTotal.get(283))
						ActivityContenedor.pokedexActual.get(283).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(282).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(282)), Pokemon(283, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(283)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Shroomish") && pokemon.nivel >= 23){
                    if (!ActivityContenedor.pokedexActual.get(285).nombre.equals("Breloom")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(285)), ActivityContenedor.pokedexTotal.get(285))
						ActivityContenedor.pokedexActual.get(285).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(284).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(284)), Pokemon(285, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(285)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Slakoth") && pokemon.nivel >= 18){
                    if (!ActivityContenedor.pokedexActual.get(287).nombre.equals("Vigoroth")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(287)), ActivityContenedor.pokedexTotal.get(287))
						ActivityContenedor.pokedexActual.get(287).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(286).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(286)), Pokemon(287, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(287)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Vigoroth") && pokemon.nivel >= 36){
                    if (!ActivityContenedor.pokedexActual.get(288).nombre.equals("Slaking")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(288)), ActivityContenedor.pokedexTotal.get(288))
						ActivityContenedor.pokedexActual.get(288).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(287).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(287)), Pokemon(288, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(288)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Nincada") && pokemon.nivel >= 20){
                    if (!ActivityContenedor.pokedexActual.get(290).nombre.equals("Ninjask")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(290)), ActivityContenedor.pokedexTotal.get(290))
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(291)), ActivityContenedor.pokedexTotal.get(291))
						ActivityContenedor.pokedexActual.get(290).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(289).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(289)), Pokemon(290, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(290)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Whismur") && pokemon.nivel >= 20){
                    if (!ActivityContenedor.pokedexActual.get(293).nombre.equals("Loudred")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(293)), ActivityContenedor.pokedexTotal.get(293))
						ActivityContenedor.pokedexActual.get(293).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(292).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(292)), Pokemon(293, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(292)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Loudred") && pokemon.nivel >= 40){
                    if (!ActivityContenedor.pokedexActual.get(294).nombre.equals("Exploud")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(294)), ActivityContenedor.pokedexTotal.get(294))
						ActivityContenedor.pokedexActual.get(294).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(293).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(293)), Pokemon(294, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(294)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Makuhita") && pokemon.nivel >= 24){
                    if (!ActivityContenedor.pokedexActual.get(296).nombre.equals("Hariyama")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(296)), ActivityContenedor.pokedexTotal.get(296))
						ActivityContenedor.pokedexActual.get(296).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(295).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(295)), Pokemon(296, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(296)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Aron") && pokemon.nivel >= 32){
                    if (!ActivityContenedor.pokedexActual.get(304).nombre.equals("Lairon")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(304)), ActivityContenedor.pokedexTotal.get(304))
						ActivityContenedor.pokedexActual.get(304).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(303).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(303)), Pokemon(304, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(304)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Lairon") && pokemon.nivel >= 42){
                    if (!ActivityContenedor.pokedexActual.get(305).nombre.equals("Aggron")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(305)), ActivityContenedor.pokedexTotal.get(305))
						ActivityContenedor.pokedexActual.get(350).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(304).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(304)), Pokemon(305, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(305)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Meditite") && pokemon.nivel >= 37){
                    if (!ActivityContenedor.pokedexActual.get(307).nombre.equals("Medicham")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(307)), ActivityContenedor.pokedexTotal.get(307))
						ActivityContenedor.pokedexActual.get(307).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(306).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(306)), Pokemon(307, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(307)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Electrike") && pokemon.nivel >= 26){
                    if (!ActivityContenedor.pokedexActual.get(309).nombre.equals("Manetric")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(309)), ActivityContenedor.pokedexTotal.get(309))
						ActivityContenedor.pokedexActual.get(309).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(308).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(308)), Pokemon(309, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(309)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Gulpin") && pokemon.nivel >= 26){
                    if (!ActivityContenedor.pokedexActual.get(316).nombre.equals("Swalot")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(316)), ActivityContenedor.pokedexTotal.get(316))
						ActivityContenedor.pokedexActual.get(316).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(315).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(315)), Pokemon(316, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(316)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Carvanha") && pokemon.nivel >= 30){
                    if (!ActivityContenedor.pokedexActual.get(318).nombre.equals("Sharpedo")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(318)), ActivityContenedor.pokedexTotal.get(318))
						ActivityContenedor.pokedexActual.get(318).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(317).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(317)), Pokemon(318, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(318)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Wailmer") && pokemon.nivel >= 40){
                    if (!ActivityContenedor.pokedexActual.get(320).nombre.equals("Wailord")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(320)), ActivityContenedor.pokedexTotal.get(320))
						ActivityContenedor.pokedexActual.get(320).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(319).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(319)), Pokemon(320, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(320)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Numel") && pokemon.nivel >= 33){
                    if (!ActivityContenedor.pokedexActual.get(322).nombre.equals("Camerumpt")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(322)), ActivityContenedor.pokedexTotal.get(322))
						ActivityContenedor.pokedexActual.get(322).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(321).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(321)), Pokemon(322, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(322)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Spoink") && pokemon.nivel >= 32){
                    if (!ActivityContenedor.pokedexActual.get(325).nombre.equals("Grumpig")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(325)), ActivityContenedor.pokedexTotal.get(325))
						ActivityContenedor.pokedexActual.get(325).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(324).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(324)), Pokemon(325, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(325)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Trapinch") && pokemon.nivel >= 35){
                    if (!ActivityContenedor.pokedexActual.get(328).nombre.equals("Vibrava")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(328)), ActivityContenedor.pokedexTotal.get(328))
						ActivityContenedor.pokedexActual.get(328).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(327).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(327)), Pokemon(328, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(328)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Vibrava") && pokemon.nivel >= 45){
                    if (!ActivityContenedor.pokedexActual.get(329).nombre.equals("Flygon")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(329)), ActivityContenedor.pokedexTotal.get(329))
						ActivityContenedor.pokedexActual.get(329).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(328).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(328)), Pokemon(329, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(329)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Cacnea") && pokemon.nivel >= 32){
                    if (!ActivityContenedor.pokedexActual.get(331).nombre.equals("Cacturne")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(331)), ActivityContenedor.pokedexTotal.get(331))
						ActivityContenedor.pokedexActual.get(331).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(330).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(330)), Pokemon(331, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(331)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Swablu") && pokemon.nivel >= 35){
                    if (!ActivityContenedor.pokedexActual.get(333).nombre.equals("Altaria")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(333)), ActivityContenedor.pokedexTotal.get(333))
						ActivityContenedor.pokedexActual.get(333).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(332).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(332)), Pokemon(333, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(333)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Barboach") && pokemon.nivel >= 30){
                    if (!ActivityContenedor.pokedexActual.get(339).nombre.equals("Whiscash")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(339)), ActivityContenedor.pokedexTotal.get(339))
						ActivityContenedor.pokedexActual.get(339).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(338).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(338)), Pokemon(339, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(339)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Corphish") && pokemon.nivel >= 30){
                    if (!ActivityContenedor.pokedexActual.get(341).nombre.equals("Crawdaunt")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(341)), ActivityContenedor.pokedexTotal.get(341))
						ActivityContenedor.pokedexActual.get(341).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(340).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(340)), Pokemon(341, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(341)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Baltoy") && pokemon.nivel >= 36){
                    if (!ActivityContenedor.pokedexActual.get(343).nombre.equals("Claydol")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(343)), ActivityContenedor.pokedexTotal.get(343))
						ActivityContenedor.pokedexActual.get(343).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(342).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(342)), Pokemon(343, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(343)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Lileep") && pokemon.nivel >= 40){
                    if (!ActivityContenedor.pokedexActual.get(345).nombre.equals("Cradily")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(345)), ActivityContenedor.pokedexTotal.get(345))
						ActivityContenedor.pokedexActual.get(345).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(344).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(344)), Pokemon(345, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(345)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Anorith") && pokemon.nivel >= 40){
                    if (!ActivityContenedor.pokedexActual.get(347).nombre.equals("Armaldo")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(347)), ActivityContenedor.pokedexTotal.get(347))
						ActivityContenedor.pokedexActual.get(347).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(346).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(346)), Pokemon(347, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(347)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Shuppet") && pokemon.nivel >= 37){
                    if (!ActivityContenedor.pokedexActual.get(353).nombre.equals("Banette")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(353)), ActivityContenedor.pokedexTotal.get(353))
						ActivityContenedor.pokedexActual.get(353).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(352).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(352)), Pokemon(353, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(353)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Duskull") && pokemon.nivel >= 37){
                    if (!ActivityContenedor.pokedexActual.get(355).nombre.equals("Dusclops")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(355)), ActivityContenedor.pokedexTotal.get(355))
						ActivityContenedor.pokedexActual.get(355).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(354).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(354)), Pokemon(355, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(355)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Wynaut") && pokemon.nivel >= 15){
                    if (!ActivityContenedor.pokedexActual.get(202).nombre.equals("Wobbuffet")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(202)), ActivityContenedor.pokedexTotal.get(202))
						ActivityContenedor.pokedexActual.get(202).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(359).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(359)), Pokemon(203, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(202)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Snorunt") && pokemon.nivel >= 42){
                    if (!ActivityContenedor.pokedexActual.get(361).nombre.equals("Glalie")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(361)), ActivityContenedor.pokedexTotal.get(361))
						ActivityContenedor.pokedexActual.get(361).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(360).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(360)), Pokemon(361, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(361)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Spheal") && pokemon.nivel >= 32){
                    if (!ActivityContenedor.pokedexActual.get(363).nombre.equals("Sealeo")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(363)), ActivityContenedor.pokedexTotal.get(363))
						ActivityContenedor.pokedexActual.get(363).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(362).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(362)), Pokemon(363, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(363)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Sealeo") && pokemon.nivel >= 44){
                    if (!ActivityContenedor.pokedexActual.get(364).nombre.equals("Walrein")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(364)), ActivityContenedor.pokedexTotal.get(364))
						ActivityContenedor.pokedexActual.get(364).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(363).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(363)), Pokemon(364, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(364)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Bagon") && pokemon.nivel >= 30){
                    if (!ActivityContenedor.pokedexActual.get(371).nombre.equals("Shelgon")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(371)), ActivityContenedor.pokedexTotal.get(371))
						ActivityContenedor.pokedexActual.get(371).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(370).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(370)), Pokemon(371, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(371)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Shelgon") && pokemon.nivel >= 50){
                    if (!ActivityContenedor.pokedexActual.get(372).nombre.equals("Salamence")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(372)), ActivityContenedor.pokedexTotal.get(372))
						ActivityContenedor.pokedexActual.get(372).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(371).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(371)), Pokemon(372, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(372)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Beldum") && pokemon.nivel >= 20){
                    if (!ActivityContenedor.pokedexActual.get(374).nombre.equals("Metang")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(374)), ActivityContenedor.pokedexTotal.get(374))
						ActivityContenedor.pokedexActual.get(374).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(373).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(373)), Pokemon(374, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(374)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Metang") && pokemon.nivel >= 45){
                    if (!ActivityContenedor.pokedexActual.get(375).nombre.equals("Metagross")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(375)), ActivityContenedor.pokedexTotal.get(375))
						ActivityContenedor.pokedexActual.get(375).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(374).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(374)), Pokemon(375, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(375)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                }
            }
            pokemon.numero in 386..492 -> {
                if (pokemon.nombre.equals("Turtwig") && pokemon.nivel >= 18){
                    if (!ActivityContenedor.pokedexActual.get(387).nombre.equals("Grotle")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(387)), ActivityContenedor.pokedexTotal.get(387))
						ActivityContenedor.pokedexActual.get(387).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(386).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(386)), Pokemon(387, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(387)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Grotle") && pokemon.nivel >= 32){
                    if (!ActivityContenedor.pokedexActual.get(388).nombre.equals("Torterra")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(388)), ActivityContenedor.pokedexTotal.get(388))
						ActivityContenedor.pokedexActual.get(388).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(387).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(387)), Pokemon(388, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(388)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Chimchar") && pokemon.nivel >= 14){
                    if (!ActivityContenedor.pokedexActual.get(390).nombre.equals("Monferno")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(390)), ActivityContenedor.pokedexTotal.get(390))
						ActivityContenedor.pokedexActual.get(390).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(389).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(389)), Pokemon(390, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(390)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Monferno") && pokemon.nivel >= 36){
                    if (!ActivityContenedor.pokedexActual.get(391).nombre.equals("Infernape")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(391)), ActivityContenedor.pokedexTotal.get(391))
						ActivityContenedor.pokedexActual.get(391).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(390).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(390)), Pokemon(391, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(391)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Piplup") && pokemon.nivel >= 16){
                    if (!ActivityContenedor.pokedexActual.get(393).nombre.equals("Prinplup")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(393)), ActivityContenedor.pokedexTotal.get(393))
						ActivityContenedor.pokedexActual.get(393).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(392).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(392)), Pokemon(393, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(393)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Prinplup") && pokemon.nivel >= 36){
                    if (!ActivityContenedor.pokedexActual.get(394).nombre.equals("Empoleon")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(394)), ActivityContenedor.pokedexTotal.get(394))
						ActivityContenedor.pokedexActual.get(394).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(393).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(393)), Pokemon(394, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(394)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Starly") && pokemon.nivel >= 14){
                    if (!ActivityContenedor.pokedexActual.get(396).nombre.equals("Staravia")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(396)), ActivityContenedor.pokedexTotal.get(396))
						ActivityContenedor.pokedexActual.get(396).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(395).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(395)), Pokemon(396, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(396)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Staravia") && pokemon.nivel >= 34){
                    if (!ActivityContenedor.pokedexActual.get(397).nombre.equals("Staraptor")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(397)), ActivityContenedor.pokedexTotal.get(397))
						ActivityContenedor.pokedexActual.get(397).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(396).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(396)), Pokemon(397, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(397)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Bidoof") && pokemon.nivel >= 15){
                    if (!ActivityContenedor.pokedexActual.get(399).nombre.equals("Bibarel")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(399)), ActivityContenedor.pokedexTotal.get(399))
						ActivityContenedor.pokedexActual.get(399).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(398).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(398)), Pokemon(399, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(399)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Kriketot") && pokemon.nivel >= 10){
                    if (!ActivityContenedor.pokedexActual.get(401).nombre.equals("Kriketune")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(401)), ActivityContenedor.pokedexTotal.get(401))
						ActivityContenedor.pokedexActual.get(401).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(400).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(400)), Pokemon(401, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(401)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Shinx") && pokemon.nivel >= 15){
                    if (!ActivityContenedor.pokedexActual.get(403).nombre.equals("Luxio")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(403)), ActivityContenedor.pokedexTotal.get(403))
						ActivityContenedor.pokedexActual.get(403).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(402).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(402)), Pokemon(403, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(403)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Luxio") && pokemon.nivel >= 30){
                    if (!ActivityContenedor.pokedexActual.get(404).nombre.equals("Luxray")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(404)), ActivityContenedor.pokedexTotal.get(404))
						ActivityContenedor.pokedexActual.get(404).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(403).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(403)), Pokemon(404, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(404)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Cranidos") && pokemon.nivel >= 30){
                    if (!ActivityContenedor.pokedexActual.get(408).nombre.equals("Rampardos")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(408)), ActivityContenedor.pokedexTotal.get(408))
						ActivityContenedor.pokedexActual.get(408).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(407).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(407)), Pokemon(408, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(408)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Shieldon") && pokemon.nivel >= 30){
                    if (!ActivityContenedor.pokedexActual.get(410).nombre.equals("Bastiodon")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(410)), ActivityContenedor.pokedexTotal.get(410))
						ActivityContenedor.pokedexActual.get(410).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(409).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(409)), Pokemon(410, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(410)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Burmy") && pokemon.nivel >= 20){
                    if (!ActivityContenedor.pokedexActual.get(412).nombre.equals("Wormadan")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(412)), ActivityContenedor.pokedexTotal.get(412))
						ActivityContenedor.pokedexActual.get(412).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(411).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(411)), Pokemon(412, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(412)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              } else if (!ActivityContenedor.pokedexActual.get(413).nombre.equals("Mothim")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(413)), ActivityContenedor.pokedexTotal.get(413))
						ActivityContenedor.pokedexActual.get(413).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(411).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(411)), Pokemon(412, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(413)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Combee") && pokemon.nivel >= 21){
                    if (!ActivityContenedor.pokedexActual.get(415).nombre.equals("Vespiquen")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(415)), ActivityContenedor.pokedexTotal.get(415))
						ActivityContenedor.pokedexActual.get(415).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(414).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(414)), Pokemon(415, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(415)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Buizel") && pokemon.nivel >= 26){
                    if (!ActivityContenedor.pokedexActual.get(418).nombre.equals("Floatzel")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(418)), ActivityContenedor.pokedexTotal.get(418))
						ActivityContenedor.pokedexActual.get(418).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(417).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(417)), Pokemon(418, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(418)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Cherubi") && pokemon.nivel >= 25){
                    if (!ActivityContenedor.pokedexActual.get(420).nombre.equals("Cherrim")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(420)), ActivityContenedor.pokedexTotal.get(420))
						ActivityContenedor.pokedexActual.get(420).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(419).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(419)), Pokemon(420, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(420)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Shellos") && pokemon.nivel >= 30){
                    if (!ActivityContenedor.pokedexActual.get(422).nombre.equals("Gastrodon")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(422)), ActivityContenedor.pokedexTotal.get(422))
						ActivityContenedor.pokedexActual.get(422).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(421).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(421)), Pokemon(422, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(422)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Drifloon") && pokemon.nivel >= 28){
                    if (!ActivityContenedor.pokedexActual.get(425).nombre.equals("Drifblim")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(425)), ActivityContenedor.pokedexTotal.get(425))
						ActivityContenedor.pokedexActual.get(425).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(424).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(424)), Pokemon(425, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(425)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Glameow") && pokemon.nivel >= 38){
                    if (!ActivityContenedor.pokedexActual.get(431).nombre.equals("Purugly")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(431)), ActivityContenedor.pokedexTotal.get(431))
						ActivityContenedor.pokedexActual.get(431).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(430).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(430)), Pokemon(431, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(431)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Stunky") && pokemon.nivel >= 34){
                    if (!ActivityContenedor.pokedexActual.get(434).nombre.equals("Stuntank")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(434)), ActivityContenedor.pokedexTotal.get(434))
						ActivityContenedor.pokedexActual.get(434).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(433).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(433)), Pokemon(434, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(434)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Bronzor") && pokemon.nivel >= 33){
                    if (!ActivityContenedor.pokedexActual.get(436).nombre.equals("Bronzong")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(436)), ActivityContenedor.pokedexTotal.get(436))
						ActivityContenedor.pokedexActual.get(436).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(435).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(435)), Pokemon(436, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(436)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Gible") && pokemon.nivel >= 24){
                    if (!ActivityContenedor.pokedexActual.get(443).nombre.equals("Gabite")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(443)), ActivityContenedor.pokedexTotal.get(443))
						ActivityContenedor.pokedexActual.get(443).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(442).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(442)), Pokemon(443, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(443)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Gabite") && pokemon.nivel >= 48){
                    if (!ActivityContenedor.pokedexActual.get(444).nombre.equals("Garchomp")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(444)), ActivityContenedor.pokedexTotal.get(444))
						ActivityContenedor.pokedexActual.get(444).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(443).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(443)), Pokemon(444, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(444)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true              }
                } else if (pokemon.nombre.equals("Hippopotas") && pokemon.nivel >= 34){
                    if (!ActivityContenedor.pokedexActual.get(449).nombre.equals("Hippowdon")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(449)), ActivityContenedor.pokedexTotal.get(449))
						ActivityContenedor.pokedexActual.get(449).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(448).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(448)), Pokemon(449, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(449)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Skorupi") && pokemon.nivel >= 40){
                    if (!ActivityContenedor.pokedexActual.get(451).nombre.equals("Drapion")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(451)), ActivityContenedor.pokedexTotal.get(451))
						ActivityContenedor.pokedexActual.get(451).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(450).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(450)), Pokemon(451, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(451)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Croagunk") && pokemon.nivel >= 37){
                    if (!ActivityContenedor.pokedexActual.get(453).nombre.equals("Toxicroak")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(453)), ActivityContenedor.pokedexTotal.get(453))
						ActivityContenedor.pokedexActual.get(453).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(452).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(452)), Pokemon(453, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(453)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Finneon") && pokemon.nivel >= 31){
                    if (!ActivityContenedor.pokedexActual.get(456).nombre.equals("Lumineon")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(456)), ActivityContenedor.pokedexTotal.get(456))
						ActivityContenedor.pokedexActual.get(456).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(455).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(455)), Pokemon(456, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(456)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Snover") && pokemon.nivel >= 40){
                    if (!ActivityContenedor.pokedexActual.get(459).nombre.equals("Abomasnow")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(459)), ActivityContenedor.pokedexTotal.get(459))
						ActivityContenedor.pokedexActual.get(459).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(458).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(458)), Pokemon(459, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(459)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                }
            }
            else -> {
                if (pokemon.nombre.equals("Snivy") && pokemon.nivel >= 17){
                    if (!ActivityContenedor.pokedexActual.get(495).nombre.equals("Servine")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(495)), ActivityContenedor.pokedexTotal.get(495))
						ActivityContenedor.pokedexActual.get(495).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(94).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(494)), Pokemon(495, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(495)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Servine") && pokemon.nivel >= 36){
                    if (!ActivityContenedor.pokedexActual.get(496).nombre.equals("Serperior")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(496)), ActivityContenedor.pokedexTotal.get(496))
						ActivityContenedor.pokedexActual.get(496).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(495).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(495)), Pokemon(496, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(496)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Tepig") && pokemon.nivel >= 17){
                    if (!ActivityContenedor.pokedexActual.get(498).nombre.equals("Pignite")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(498)), ActivityContenedor.pokedexTotal.get(498))
						ActivityContenedor.pokedexActual.get(498).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(497).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(497)), Pokemon(498, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(498)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Pignite") && pokemon.nivel >= 36){
                    if (!ActivityContenedor.pokedexActual.get(499).nombre.equals("Emboar")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(499)), ActivityContenedor.pokedexTotal.get(499))
						ActivityContenedor.pokedexActual.get(499).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(498).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(498)), Pokemon(499, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(499)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Oshawott") && pokemon.nivel >= 17){
                    if (!ActivityContenedor.pokedexActual.get(501).nombre.equals("Dewott")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(501)), ActivityContenedor.pokedexTotal.get(501))
						ActivityContenedor.pokedexActual.get(501).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(500).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(500)), Pokemon(501, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(501)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Dewott") && pokemon.nivel >= 36) {
                    if (!ActivityContenedor.pokedexActual.get(502).nombre.equals("Samurott")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(502)), ActivityContenedor.pokedexTotal.get(502))
						ActivityContenedor.pokedexActual.get(502).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(501).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(501)), Pokemon(502, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(502)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Patrat") && pokemon.nivel >= 20){
                    if (!ActivityContenedor.pokedexActual.get(504).nombre.equals("Watchog")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(504)), ActivityContenedor.pokedexTotal.get(504))
						ActivityContenedor.pokedexActual.get(504).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(503).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(503)), Pokemon(504, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(504)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Lillipup") && pokemon.nivel >= 16){
                    if (!ActivityContenedor.pokedexActual.get(506).nombre.equals("Herdier")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(506)), ActivityContenedor.pokedexTotal.get(506))
						ActivityContenedor.pokedexActual.get(506).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(505).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(505)), Pokemon(506, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(506)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Herdier") && pokemon.nivel >= 32){
                    if (!ActivityContenedor.pokedexActual.get(507).nombre.equals("Stoutland")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(507)), ActivityContenedor.pokedexTotal.get(507))
						ActivityContenedor.pokedexActual.get(507).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(506).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(506)), Pokemon(507, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(507)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Purrloin") && pokemon.nivel >= 20){
                    if (!ActivityContenedor.pokedexActual.get(509).nombre.equals("Liepard")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(509)), ActivityContenedor.pokedexTotal.get(509))
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(508).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(508)), Pokemon(509, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(509)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Pidove") && pokemon.nivel >= 21){
                    if (!ActivityContenedor.pokedexActual.get(519).nombre.equals("Tranquill")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(519)), ActivityContenedor.pokedexTotal.get(519))
						ActivityContenedor.pokedexActual.get(519).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(518).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(518)), Pokemon(519, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(519)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Tranquill") && pokemon.nivel >= 32){
                    if (!ActivityContenedor.pokedexActual.get(520).nombre.equals("Unfezant")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(520)), ActivityContenedor.pokedexTotal.get(520))
						ActivityContenedor.pokedexActual.get(520).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(519).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(519)), Pokemon(520, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(520)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Blitzle") && pokemon.nivel >= 27){
                    if (!ActivityContenedor.pokedexActual.get(522).nombre.equals("Zebstrika")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(522)), ActivityContenedor.pokedexTotal.get(522))
						ActivityContenedor.pokedexActual.get(522).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(521).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(521)), Pokemon(520, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(520)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Roggenrola") && pokemon.nivel >= 25){
                    if (!ActivityContenedor.pokedexActual.get(524).nombre.equals("Boldore")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(524)), ActivityContenedor.pokedexTotal.get(524))
						ActivityContenedor.pokedexActual.get(524).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(523).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(523)), Pokemon(524, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(524)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Drilbur") && pokemon.nivel >= 31){
                    if (!ActivityContenedor.pokedexActual.get(529).nombre.equals("Excadrill")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(529)), ActivityContenedor.pokedexTotal.get(529))
						ActivityContenedor.pokedexActual.get(529).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(528).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(528)), Pokemon(529, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(529)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Timburr") && pokemon.nivel >= 25){
                    if (!ActivityContenedor.pokedexActual.get(532).nombre.equals("Gurdurr")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(532)), ActivityContenedor.pokedexTotal.get(532))
						ActivityContenedor.pokedexActual.get(532).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(531).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(531)), Pokemon(532, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(532)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Tympole") && pokemon.nivel >= 25){
                    if (!ActivityContenedor.pokedexActual.get(535).nombre.equals("Palpitoad")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(535)), ActivityContenedor.pokedexTotal.get(535))
						ActivityContenedor.pokedexActual.get(535).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(534).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(534)), Pokemon(535, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(535)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Palpitoad") && pokemon.nivel >= 36){
                    if (!ActivityContenedor.pokedexActual.get(536).nombre.equals("Seismitoad")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(536)), ActivityContenedor.pokedexTotal.get(536))
						ActivityContenedor.pokedexActual.get(536).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(535).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(535)), Pokemon(536, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(536)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Sewaddle") && pokemon.nivel >= 20){
                    if (!ActivityContenedor.pokedexActual.get(540).nombre.equals("Swadloon")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(540)), ActivityContenedor.pokedexTotal.get(540))
						ActivityContenedor.pokedexActual.get(540).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(539).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(539)), Pokemon(540, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(540)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Venipede") && pokemon.nivel >= 22){
                    if (!ActivityContenedor.pokedexActual.get(543).nombre.equals("Whirlipede")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(543)), ActivityContenedor.pokedexTotal.get(543))
						ActivityContenedor.pokedexActual.get(543).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(542).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(542)), Pokemon(543, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(543)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Whirlipede") && pokemon.nivel >= 30){
                    if (!ActivityContenedor.pokedexActual.get(544).nombre.equals("Scolipede")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(544)), ActivityContenedor.pokedexTotal.get(544))
						ActivityContenedor.pokedexActual.get(544).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(543).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(543)), Pokemon(544, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(544)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Sandile") && pokemon.nivel >= 29){
                    if (!ActivityContenedor.pokedexActual.get(551).nombre.equals("Krokorok")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(551)), ActivityContenedor.pokedexTotal.get(511))
						ActivityContenedor.pokedexActual.get(551).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(550).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(550)), Pokemon(551, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(511)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Krokorok") && pokemon.nivel >= 40){
                    if (!ActivityContenedor.pokedexActual.get(552).nombre.equals("Krookodile")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(552)), ActivityContenedor.pokedexTotal.get(522))
						ActivityContenedor.pokedexActual.get(552).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(551).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(551)), Pokemon(552, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(522)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Darumaka") && pokemon.nivel >= 35){
                    if (!ActivityContenedor.pokedexActual.get(554).nombre.equals("Darmanitan")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(554)), ActivityContenedor.pokedexTotal.get(554))
						ActivityContenedor.pokedexActual.get(554).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(553).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(553)), Pokemon(554, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(554)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Dwebble") && pokemon.nivel >= 34){
                    if (!ActivityContenedor.pokedexActual.get(557).nombre.equals("Vrustle")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(557)), ActivityContenedor.pokedexTotal.get(557))
						ActivityContenedor.pokedexActual.get(557).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(556).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(556)), Pokemon(557, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(557)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Scraggy") && pokemon.nivel >= 39){
                    if (!ActivityContenedor.pokedexActual.get(559).nombre.equals("Scrafty")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(559)), ActivityContenedor.pokedexTotal.get(559))
						ActivityContenedor.pokedexActual.get(559).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(558).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(558)), Pokemon(559, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(559)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                }  else if (pokemon.nombre.equals("Tirtouga") && pokemon.nivel >= 37){
                    if (!ActivityContenedor.pokedexActual.get(564).nombre.equals("Carracosta")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(564)), ActivityContenedor.pokedexTotal.get(564))
						ActivityContenedor.pokedexActual.get(564).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(563).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(563)), Pokemon(564, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(564)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Archen") && pokemon.nivel >= 37){
                    if (!ActivityContenedor.pokedexActual.get(566).nombre.equals("Archeops")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(566)), ActivityContenedor.pokedexTotal.get(566))
						ActivityContenedor.pokedexActual.get(566).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(565).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(565)), Pokemon(566, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(566)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Trubbish") && pokemon.nivel >= 36){
                    if (!ActivityContenedor.pokedexActual.get(568).nombre.equals("Garbodor")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(568)), ActivityContenedor.pokedexTotal.get(568))
						ActivityContenedor.pokedexActual.get(568).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(567).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(567)), Pokemon(568, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(568)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Zorua") && pokemon.nivel >= 30){
                    if (!ActivityContenedor.pokedexActual.get(570).nombre.equals("Zoroark")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(570)), ActivityContenedor.pokedexTotal.get(570))
						ActivityContenedor.pokedexActual.get(570).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(569).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(569)), Pokemon(570, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(570)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Gothita") && pokemon.nivel >= 32){
                    if (!ActivityContenedor.pokedexActual.get(574).nombre.equals("Gothorita")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(574)), ActivityContenedor.pokedexTotal.get(574))
						ActivityContenedor.pokedexActual.get(574).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(573).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(573)), Pokemon(574, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(574)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Gothorita") && pokemon.nivel >= 41){
                    if (!ActivityContenedor.pokedexActual.get(575).nombre.equals("Gothitelle")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(575)), ActivityContenedor.pokedexTotal.get(575))
						ActivityContenedor.pokedexActual.get(575).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(574).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(574)), Pokemon(575, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(575)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Solosis") && pokemon.nivel >= 32){
                    if (!ActivityContenedor.pokedexActual.get(577).nombre.equals("Duosion")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(577)), ActivityContenedor.pokedexTotal.get(577))
						ActivityContenedor.pokedexActual.get(577).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(576).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(576)), Pokemon(577, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(577)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Duosion") && pokemon.nivel >= 41){
                    if (!ActivityContenedor.pokedexActual.get(578).nombre.equals("Reuniclus")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(578)), ActivityContenedor.pokedexTotal.get(578))
						ActivityContenedor.pokedexActual.get(578).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(577).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(577)), Pokemon(578, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(578)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Ducklett") && pokemon.nivel >= 35){
                    if (!ActivityContenedor.pokedexActual.get(580).nombre.equals("Swanna")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(580)), ActivityContenedor.pokedexTotal.get(580))
						ActivityContenedor.pokedexActual.get(580).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(579).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(579)), Pokemon(580, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(580)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Vanillite") && pokemon.nivel >= 35){
                    if (!ActivityContenedor.pokedexActual.get(582).nombre.equals("Vanillish")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(582)), ActivityContenedor.pokedexTotal.get(582))
						ActivityContenedor.pokedexActual.get(582).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(281).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(581)), Pokemon(582, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(582)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Vanillish") && pokemon.nivel >= 47){
                    if (!ActivityContenedor.pokedexActual.get(583).nombre.equals("Vanilluxe")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(583)), ActivityContenedor.pokedexTotal.get(583))
						ActivityContenedor.pokedexActual.get(583).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(582).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(582)), Pokemon(583, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(583)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Deerling") && pokemon.nivel >= 34){
                    if (!ActivityContenedor.pokedexActual.get(585).nombre.equals("Sawsbuck")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(585)), ActivityContenedor.pokedexTotal.get(585))
						ActivityContenedor.pokedexActual.get(585).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(584).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(584)), Pokemon(585, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(585)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Foongus") && pokemon.nivel >= 39){
                    if (!ActivityContenedor.pokedexActual.get(590).nombre.equals("Amoonguss")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(590)), ActivityContenedor.pokedexTotal.get(590))
						ActivityContenedor.pokedexActual.get(590).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(589).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(589)), Pokemon(590, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(590)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Frillish") && pokemon.nivel >= 40){
                    if (!ActivityContenedor.pokedexActual.get(592).nombre.equals("Jellicent")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(592)), ActivityContenedor.pokedexTotal.get(592))
						ActivityContenedor.pokedexActual.get(592).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(591).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(591)), Pokemon(592, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(592)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Joltik") && pokemon.nivel >= 36){
                    if (!ActivityContenedor.pokedexActual.get(595).nombre.equals("Galvantula")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(595)), ActivityContenedor.pokedexTotal.get(595))
						ActivityContenedor.pokedexActual.get(595).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(594).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(594)), Pokemon(595, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(595)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Ferroseed") && pokemon.nivel >= 40){
                    if (!ActivityContenedor.pokedexActual.get(597).nombre.equals("Ferrothorn")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(597)), ActivityContenedor.pokedexTotal.get(597))
						ActivityContenedor.pokedexActual.get(597).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(596).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(596)), Pokemon(597, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(597)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Klink") && pokemon.nivel >= 38){
                    if (!ActivityContenedor.pokedexActual.get(599).nombre.equals("Klang")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(599)), ActivityContenedor.pokedexTotal.get(599))
						ActivityContenedor.pokedexActual.get(599).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(598).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(598)), Pokemon(459, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(599)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Klang") && pokemon.nivel >= 49){
                    if (!ActivityContenedor.pokedexActual.get(600).nombre.equals("Klinklang")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(600)), ActivityContenedor.pokedexTotal.get(600))
						ActivityContenedor.pokedexActual.get(600).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(599).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(599)), Pokemon(600, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(600)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Tynamo") && pokemon.nivel >= 39){
                    if (!ActivityContenedor.pokedexActual.get(602).nombre.equals("Eelektrik")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(602)), ActivityContenedor.pokedexTotal.get(602))
						ActivityContenedor.pokedexActual.get(602).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(601).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(601)), Pokemon(602, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(602)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Elgyem") && pokemon.nivel >= 42){
                    if (!ActivityContenedor.pokedexActual.get(605).nombre.equals("Beheeyem")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(605)), ActivityContenedor.pokedexTotal.get(605))
						ActivityContenedor.pokedexActual.get(605).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(604).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(604)), Pokemon(605, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(605)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Litwick") && pokemon.nivel >= 41){
                    if (!ActivityContenedor.pokedexActual.get(607).nombre.equals("Lampent")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(607)), ActivityContenedor.pokedexTotal.get(607))
						ActivityContenedor.pokedexActual.get(607).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(606).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(606)), Pokemon(607, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(607)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Axew") && pokemon.nivel >= 38){
                    if (!ActivityContenedor.pokedexActual.get(610).nombre.equals("Fraxure")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(610)), ActivityContenedor.pokedexTotal.get(610))
						ActivityContenedor.pokedexActual.get(610).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(609).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(609)), Pokemon(610, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(610)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Fraxure") && pokemon.nivel >= 48){
                    if (!ActivityContenedor.pokedexActual.get(611).nombre.equals("Haxorus")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(611)), ActivityContenedor.pokedexTotal.get(611))
						ActivityContenedor.pokedexActual.get(611).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(610).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(610)), Pokemon(611, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(611)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Cubchoo") && pokemon.nivel >= 37){
                    if (!ActivityContenedor.pokedexActual.get(613).nombre.equals("Beartic")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(613)), ActivityContenedor.pokedexTotal.get(613))
						ActivityContenedor.pokedexActual.get(613).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(612).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(612)), Pokemon(613, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(613)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Mienfoo") && pokemon.nivel >= 50){
                    if (!ActivityContenedor.pokedexActual.get(619).nombre.equals("Mienshao")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(619)), ActivityContenedor.pokedexTotal.get(619))
						ActivityContenedor.pokedexActual.get(619).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(618).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(618)), Pokemon(619, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(619)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Golett") && pokemon.nivel >= 43){
                    if (!ActivityContenedor.pokedexActual.get(622).nombre.equals("Golurk")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(622)), ActivityContenedor.pokedexTotal.get(622))
						ActivityContenedor.pokedexActual.get(622).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(621).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(621)), Pokemon(622, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(622)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Pawniard") && pokemon.nivel >= 52){
                    if (!ActivityContenedor.pokedexActual.get(624).nombre.equals("Bisharp")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(624)), ActivityContenedor.pokedexTotal.get(624))
						ActivityContenedor.pokedexActual.get(624).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(623).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(623)), Pokemon(624, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(624)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Rufflet") && pokemon.nivel >= 54){
                    if (!ActivityContenedor.pokedexActual.get(627).nombre.equals("Braviary")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(627)), ActivityContenedor.pokedexTotal.get(627))
						ActivityContenedor.pokedexActual.get(627).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(626).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(626)), Pokemon(627, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(627)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Vullaby") && pokemon.nivel >= 54){
                    if (!ActivityContenedor.pokedexActual.get(629).nombre.equals("Mandibuzz")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(629)), ActivityContenedor.pokedexTotal.get(629))
						ActivityContenedor.pokedexActual.get(629).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(628).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(628)), Pokemon(629, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(629)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Deino") && pokemon.nivel >= 50){
                    if (!ActivityContenedor.pokedexActual.get(633).nombre.equals("Zweilous")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(633)), ActivityContenedor.pokedexTotal.get(633))
						ActivityContenedor.pokedexActual.get(633).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(632).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(632)), Pokemon(633, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(633)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Zweilous") && pokemon.nivel >= 64) {
                    if (!ActivityContenedor.pokedexActual.get(634).nombre.equals("Hydreigon")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(634)), ActivityContenedor.pokedexTotal.get(634))
						ActivityContenedor.pokedexActual.get(634).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(633).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(633)), Pokemon(634, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(634)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else if (pokemon.nombre.equals("Larvesta") && pokemon.nivel >= 59){
                    if (!ActivityContenedor.pokedexActual.get(636).nombre.equals("Volcarona")) {
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(636)), ActivityContenedor.pokedexTotal.get(636))
						ActivityContenedor.pokedexActual.get(636).nivel =ActivityContenedor.pokemonUsado.nivel
                        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(635).nombre
                        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(635)), Pokemon(636, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(636)
                        Collections.sort(
                            ActivityContenedor.pokedexActual,
                              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                        return true            }
                } else {
                    return false
                }
            }
        }

        return false }

    //fun Piedras evolutivas
    fun evolucionPiedraFuego (nombre : String) : Boolean {
	when (nombre) {
        "Vulpix" -> { //Vulpix
        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(37)), ActivityContenedor.pokedexTotal.get(37))
		ActivityContenedor.pokedexActual.get(37).nivel =ActivityContenedor.pokedexActual.get(36).nivel
        ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(36).nombre
        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(36)), Pokemon(37, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
        ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(37)
        Collections.sort(
            ActivityContenedor.pokedexActual,
              { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
            return true
    }
        "Growlithe" -> { //Growlithe
            ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(58)), ActivityContenedor.pokedexTotal.get(58))
			ActivityContenedor.pokedexActual.get(58).nivel =ActivityContenedor.pokedexActual.get(57).nivel
            ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(57).nombre
            ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(57)), Pokemon(58, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
            ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(58)
            Collections.sort(
                ActivityContenedor.pokedexActual,
                  { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
            return true

        }
        "Eevee" -> { //Eevee
            ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(135)), ActivityContenedor.pokedexTotal.get(135))
			ActivityContenedor.pokedexActual.get(135).nivel =ActivityContenedor.pokedexActual.get(132).nivel
            ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(132).nombre
            ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(132)), Pokemon(133, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
            ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(135)
            Collections.sort(
                ActivityContenedor.pokedexActual,
                  { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
            return true

        }
        "Pansear" -> { //Pansear
            ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(513)), ActivityContenedor.pokedexTotal.get(513))
			ActivityContenedor.pokedexActual.get(513).nivel =ActivityContenedor.pokedexActual.get(512).nivel
            ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(512).nombre
            ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(512)), Pokemon(513, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
            ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(513)
            Collections.sort(
                ActivityContenedor.pokedexActual,
                  { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
            return true

        }

	}
	return false}

    fun evolucionPiedraAgua (nombre : String) : Boolean {
        when (nombre) {
            "Poliwhirl" -> { //poliwhirl
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(61)), ActivityContenedor.pokedexTotal.get(61))
				ActivityContenedor.pokedexActual.get(61).nivel =ActivityContenedor.pokedexActual.get(60).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(60).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(60)), Pokemon(61, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(61)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true
            }
            "Shellder" -> { //Shellder
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(90)), ActivityContenedor.pokedexTotal.get(90))
				ActivityContenedor.pokedexActual.get(90).nivel =ActivityContenedor.pokedexActual.get(89).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(89).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(89)), Pokemon(90, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(90)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                     { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true
            }

            "Staryu" -> { //Staryu
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(120)), ActivityContenedor.pokedexTotal.get(120))
				ActivityContenedor.pokedexActual.get(120).nivel =ActivityContenedor.pokedexActual.get(119).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(119).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(119)), Pokemon(120, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(120)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                    { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true
            }
            "Eevee" -> { //Eevee
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(133)), ActivityContenedor.pokedexTotal.get(133))
				ActivityContenedor.pokedexActual.get(133).nivel =ActivityContenedor.pokedexActual.get(132).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(132).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(132)), Pokemon(133, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(133)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                     { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true
            }

            "Lombre" -> { //Lombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(271)), ActivityContenedor.pokedexTotal.get(271))
				ActivityContenedor.pokedexActual.get(271).nivel =ActivityContenedor.pokedexActual.get(270).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(270).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(270)), Pokemon(271, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(271)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                     { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true
            }
            "Panpour" -> { //Pampour
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(515)), ActivityContenedor.pokedexTotal.get(515))
				ActivityContenedor.pokedexActual.get(515).nivel =ActivityContenedor.pokedexActual.get(514).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(514).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(514)), Pokemon(515, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(515)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                     { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true
            }

        }
    return false}

    fun evolucionPiedraTrueno (nombre : String) : Boolean {
        when (nombre) {
            "Pikachu" -> { //Pikachu
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(25)), ActivityContenedor.pokedexTotal.get(25))
                ActivityContenedor.pokedexActual.get(25).nivel =ActivityContenedor.pokedexActual.get(24).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(24).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(24)), Pokemon(25, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(25)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true
            }
            "Eevee" -> { //Eevee
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(134)), ActivityContenedor.pokedexTotal.get(134))
				ActivityContenedor.pokedexActual.get(134).nivel =ActivityContenedor.pokedexActual.get(132).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(132).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(132)), Pokemon(133, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(134)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                     { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true
            }
            "Eelectrik" -> { //Eelectrik
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(603)), ActivityContenedor.pokedexTotal.get(603))
				ActivityContenedor.pokedexActual.get(603).nivel =ActivityContenedor.pokedexActual.get(602).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(602).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(602)), Pokemon(603, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(603)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                     { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true
            }
        }
    return false}

    fun evolucionPiedraHoja(nombre : String) : Boolean {
        when (nombre) {
            "Gloom" -> { //Gloom
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(44)), ActivityContenedor.pokedexTotal.get(44))
				ActivityContenedor.pokedexActual.get(44).nivel =ActivityContenedor.pokedexActual.get(43).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(43).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(43)), Pokemon(44, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(44)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true
            }
            "Weepinbell" -> { //Weepinbell
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(70)), ActivityContenedor.pokedexTotal.get(70))
				ActivityContenedor.pokedexActual.get(70).nivel =ActivityContenedor.pokedexActual.get(69).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(69).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(69)), Pokemon(70, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(70)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                     { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true
            }

            "Exeggcute" -> { //exeggcute
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(102)), ActivityContenedor.pokedexTotal.get(102))
				ActivityContenedor.pokedexActual.get(102).nivel =ActivityContenedor.pokedexActual.get(101).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(101).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(101)), Pokemon(102, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(102)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                     { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true
            }
            "Nuzleaf" -> { //Nuzleaf
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(274)), ActivityContenedor.pokedexTotal.get(274))
				ActivityContenedor.pokedexActual.get(274).nivel =ActivityContenedor.pokedexActual.get(273).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(273).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(273)), Pokemon(274, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(274)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                     { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true
            }
            "Pansage" -> { //Pansage
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(511)), ActivityContenedor.pokedexTotal.get(511))
				ActivityContenedor.pokedexActual.get(511).nivel =ActivityContenedor.pokedexActual.get(510).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(510).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(510)), Pokemon(511, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(511)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                     { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true
            }

        }
        return false}

    fun evolucionRestoPiedras(nombre : String) : Boolean {
        when (nombre) {
            "Nidorina" -> { //Nidorina
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(30)), ActivityContenedor.pokedexTotal.get(30))
				ActivityContenedor.pokedexActual.get(30).nivel =ActivityContenedor.pokedexActual.get(29).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(29).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(29)), Pokemon(30, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(30)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true

            }
            "Nidorino" -> { //Nidorino
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(33)), ActivityContenedor.pokedexTotal.get(33))
				ActivityContenedor.pokedexActual.get(33).nivel =ActivityContenedor.pokedexActual.get(32).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(32).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(32)), Pokemon(33, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(33)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                     { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true

            }
            "Clefairy" -> { //Clefairy
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(35)), ActivityContenedor.pokedexTotal.get(35))
				ActivityContenedor.pokedexActual.get(35).nivel =ActivityContenedor.pokedexActual.get(34).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(34).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(34)), Pokemon(35, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(35)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                     { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true
            }
            "Jigglypuff" -> { //Jigglypuff
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(39)), ActivityContenedor.pokedexTotal.get(39))
				ActivityContenedor.pokedexActual.get(39).nivel =ActivityContenedor.pokedexActual.get(38).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(38).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(38)), Pokemon(39, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(39)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                     { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true
            }
            "Skitty" -> { //Skitty
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(300)), ActivityContenedor.pokedexTotal.get(300))
				ActivityContenedor.pokedexActual.get(300).nivel =ActivityContenedor.pokedexActual.get(299).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(299).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(299)), Pokemon(300, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(300)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                     { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true
            }
            "Munna" -> { //Munna
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(517)), ActivityContenedor.pokedexTotal.get(517))
				ActivityContenedor.pokedexActual.get(517).nivel =ActivityContenedor.pokedexActual.get(516).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(516).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(516)), Pokemon(517, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(517)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                    { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true
            }


            "Gloom" -> { //Gloom
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(181)), ActivityContenedor.pokedexTotal.get(181))
				ActivityContenedor.pokedexActual.get(181).nivel =ActivityContenedor.pokedexActual.get(43).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(43).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(43)), Pokemon(44, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(181)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true
            }
            "Cottonee" -> { //Cottonee
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(546)), ActivityContenedor.pokedexTotal.get(546))
				ActivityContenedor.pokedexActual.get(546).nivel =ActivityContenedor.pokedexActual.get(545).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(545).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(545)), Pokemon(546, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(545)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                     { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true
            }

            "Sunkern" -> { //Sunkern
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(191)), ActivityContenedor.pokedexTotal.get(191))
				ActivityContenedor.pokedexActual.get(191).nivel =ActivityContenedor.pokedexActual.get(190).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(190).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(190)), Pokemon(191, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(191)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                     { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true
            }
            "Petilil" -> { //Petilil
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(548)), ActivityContenedor.pokedexTotal.get(548))
				ActivityContenedor.pokedexActual.get(548).nivel =ActivityContenedor.pokedexActual.get(547).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(547).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(547)), Pokemon(548, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(548)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                   { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true
            }

            "Kirlia" -> { //Kirlia
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(474)), ActivityContenedor.pokedexTotal.get(474))
				ActivityContenedor.pokedexActual.get(474).nivel =ActivityContenedor.pokedexActual.get(280).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(280).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(280)), Pokemon(281, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(474)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true

            }
            "Snorunt" -> { //Snorunt
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(477)), ActivityContenedor.pokedexTotal.get(477))
				ActivityContenedor.pokedexActual.get(477).nivel =ActivityContenedor.pokedexActual.get(360).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(360).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(360)), Pokemon(361, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(477)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                     { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true

            }

            "Roselia" -> { //Roselia
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(406)), ActivityContenedor.pokedexTotal.get(406))
				ActivityContenedor.pokedexActual.get(406).nivel =ActivityContenedor.pokedexActual.get(314).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(314).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(314)), Pokemon(315, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(406)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true

            }
            "Togetic" -> { //Togetic
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(467)), ActivityContenedor.pokedexTotal.get(467))
				ActivityContenedor.pokedexActual.get(467).nivel =ActivityContenedor.pokedexActual.get(175).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(175).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(175)), Pokemon(176, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(467)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                     { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true

            }

            "Minccino" -> { //Minccino
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(572)), ActivityContenedor.pokedexTotal.get(572))
				ActivityContenedor.pokedexActual.get(572).nivel =ActivityContenedor.pokedexActual.get(571).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(571).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(571)), Pokemon(572, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(572)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                     { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true
            }

            "Murkrow" -> {
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(429)), ActivityContenedor.pokedexTotal.get(429))
				ActivityContenedor.pokedexActual.get(429).nivel =ActivityContenedor.pokedexActual.get(197).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(197).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(197)), Pokemon(198, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(429)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true

            }

            "Misdreavus" -> {//Misdreavus
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(428)), ActivityContenedor.pokedexTotal.get(428))
				ActivityContenedor.pokedexActual.get(428).nivel =ActivityContenedor.pokedexActual.get(199).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(199).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(199)), Pokemon(200, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(428)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                     { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true
            }
            "Lampent" -> {//Lampent
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(608)), ActivityContenedor.pokedexTotal.get(608))
				ActivityContenedor.pokedexActual.get(608).nivel =ActivityContenedor.pokedexActual.get(607).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(607).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(607)), Pokemon(608, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(608)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                    { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true
            }

            "Happiny" -> {//Lampent
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(112)), ActivityContenedor.pokedexTotal.get(112))
                ActivityContenedor.pokedexActual.get(112).nivel =ActivityContenedor.pokedexActual.get(439).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(439).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(439)), Pokemon(440, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(112)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                    { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true
            }

        }
        return false}

    fun evolucionIntercambio(nombre: String) : Boolean{
        when (nombre) {
            "Kadabra" -> { //Kadabra
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(64)), ActivityContenedor.pokedexTotal.get(64))
				ActivityContenedor.pokedexActual.get(64).amistad =ActivityContenedor.pokemonUsado.amistad
				ActivityContenedor.pokedexActual.get(64).nivel =ActivityContenedor.pokedexActual.get(63).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(63).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(63)), Pokemon(64, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(64)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true

            }

            "Machoke" -> { //Machoke
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(67)), ActivityContenedor.pokedexTotal.get(67))
				ActivityContenedor.pokedexActual.get(67).amistad =ActivityContenedor.pokemonUsado.amistad
				ActivityContenedor.pokedexActual.get(67).nivel =ActivityContenedor.pokedexActual.get(66).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(66).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(66)), Pokemon(67, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(67)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                     { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true

            }

            "Graveler" -> { //Graveler
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(75)), ActivityContenedor.pokedexTotal.get(75))
				ActivityContenedor.pokedexActual.get(75).nivel =ActivityContenedor.pokedexActual.get(74).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(74).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(74)), Pokemon(75, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(75)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                     { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true
            }
            "Haunter" -> { //Haunter
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(93)), ActivityContenedor.pokedexTotal.get(93))
				ActivityContenedor.pokedexActual.get(93).nivel =ActivityContenedor.pokedexActual.get(92).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(92).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(92)), Pokemon(93, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(93)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                     { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true
            }
            "Boldore" -> { //Boldore
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(525)), ActivityContenedor.pokedexTotal.get(525))
				ActivityContenedor.pokedexActual.get(525).nivel =ActivityContenedor.pokedexActual.get(524).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(524).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(524)), Pokemon(525, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(525)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                    { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true
            }
            "Gurdurr" -> { //Gurdurr
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(533)), ActivityContenedor.pokedexTotal.get(533))
				ActivityContenedor.pokedexActual.get(533).nivel =ActivityContenedor.pokedexActual.get(532).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(532).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(532)), Pokemon(533, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(533)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                     { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true
            }

            "Karrablast" -> {
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(588)), ActivityContenedor.pokedexTotal.get(588))
				ActivityContenedor.pokedexActual.get(588).nivel =ActivityContenedor.pokedexActual.get(587).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(587).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(587)), Pokemon(588, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(588)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                     { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true            }

            "Shelmet" -> {
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(616)), ActivityContenedor.pokedexTotal.get(616))
				ActivityContenedor.pokedexActual.get(616).nivel =ActivityContenedor.pokedexActual.get(615).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(615).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(615)), Pokemon(616, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(616)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                     { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true            }

            "Onix" -> { //Onix
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(207)), ActivityContenedor.pokedexTotal.get(207))
				ActivityContenedor.pokedexActual.get(207).nivel =ActivityContenedor.pokedexActual.get(94).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(94).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(94)), Pokemon(95, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(207)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true

            }

            "Scyther" -> { //Scyther
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(211)), ActivityContenedor.pokedexTotal.get(211))
				ActivityContenedor.pokedexActual.get(211).nivel =ActivityContenedor.pokedexActual.get(122).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(122).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(122)), Pokemon(123, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(211)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                     { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true

            }

            "Seadra" -> { //Seadra
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(229)), ActivityContenedor.pokedexTotal.get(229))
				ActivityContenedor.pokedexActual.get(229).nivel =ActivityContenedor.pokedexActual.get(166).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(116).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(116)), Pokemon(117, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(229)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true

            }
            "Poliwhirl" -> { //Poliwhirl
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(185)), ActivityContenedor.pokedexTotal.get(185))
				ActivityContenedor.pokedexActual.get(185).nivel =ActivityContenedor.pokedexActual.get(60).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(60).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(60)), Pokemon(61, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(185)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true

            }

            "Slowpoke" -> { //Slowpoke
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(198)), ActivityContenedor.pokedexTotal.get(198))
				ActivityContenedor.pokedexActual.get(198).nivel =ActivityContenedor.pokedexActual.get(78).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(78).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(78)), Pokemon(79, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(198)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                     { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true

            }

            "Porygon" -> { //Porygon
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(232)), ActivityContenedor.pokedexTotal.get(232))
				ActivityContenedor.pokedexActual.get(232).nivel =ActivityContenedor.pokedexActual.get(136).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(136).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(136)), Pokemon(137, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(232)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true

            }

            "Rhydon" -> { //Rhydon
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(463)), ActivityContenedor.pokedexTotal.get(463))
				ActivityContenedor.pokedexActual.get(463).nivel =ActivityContenedor.pokedexActual.get(111).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(111).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(111)), Pokemon(112, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(463)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true

            }

            "Porygon2" -> { //Porygon2
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(473)), ActivityContenedor.pokedexTotal.get(473))
				ActivityContenedor.pokedexActual.get(473).nivel =ActivityContenedor.pokedexActual.get(232).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(232).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(232)), Pokemon(233, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(473)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true

            }

            "Dusclops" -> {
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(476)), ActivityContenedor.pokedexTotal.get(476))
				ActivityContenedor.pokedexActual.get(476).nivel =ActivityContenedor.pokedexActual.get(355).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(355).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(355)), Pokemon(356, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(476)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true

            }

            "Magmar" -> {
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(466)), ActivityContenedor.pokedexTotal.get(466))
				ActivityContenedor.pokedexActual.get(466).nivel =ActivityContenedor.pokedexActual.get(125).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(125).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(125)), Pokemon(126, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(466)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true

            }

            "Electabuzz" -> {
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(465)), ActivityContenedor.pokedexTotal.get(465))
				ActivityContenedor.pokedexActual.get(465).nivel =ActivityContenedor.pokedexActual.get(124).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(124).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(124)), Pokemon(125, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(465)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true

            }

            "Feebas" -> {
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(349)), ActivityContenedor.pokedexTotal.get(349))
				ActivityContenedor.pokedexActual.get(349).nivel =ActivityContenedor.pokedexActual.get(348).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(348).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(348)), Pokemon(349, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(349)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true

            }

            "Sneasel" -> {
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(460)), ActivityContenedor.pokedexTotal.get(460))
				ActivityContenedor.pokedexActual.get(460).nivel =ActivityContenedor.pokedexActual.get(214).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(214).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(214)), Pokemon(215, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(460)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true

            }

            "Gligar" -> {
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(471)), ActivityContenedor.pokedexTotal.get(471))
				ActivityContenedor.pokedexActual.get(471).nivel =ActivityContenedor.pokedexActual.get(206).nivel
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(206).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(206)), Pokemon(207, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(471)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true

            }
        }
    return false}
	
	fun putoClamperl ( piedra : String) : Boolean{
		if(piedra == "Escama marina") {
            ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(367)), ActivityContenedor.pokedexTotal.get(367))
			ActivityContenedor.pokedexActual.get(367).nivel =ActivityContenedor.pokedexActual.get(365).nivel
            ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(365).nombre
            ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(365)), Pokemon(366, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
            ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(367)
            Collections.sort(
                ActivityContenedor.pokedexActual,
                  { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
            return true
		} else {
            ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(366)), ActivityContenedor.pokedexTotal.get(366))
			ActivityContenedor.pokedexActual.get(366).nivel =ActivityContenedor.pokedexActual.get(365).nivel
            ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(365).nombre
            ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(365)), Pokemon(366, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
            ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(366)
            Collections.sort(
                ActivityContenedor.pokedexActual,
                  { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
            return true
		}
                                    
	}
		
    //fun amistad + amistad umbreon y espeon
    fun comprobarAmistad(pokemon: Pokemon) : Boolean {
        if (pokemon.nombre.equals("Golbat") && pokemon.amistad >= 220) {
            if (!ActivityContenedor.pokedexActual.get(168).nombre.equals("Crobat")) {
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(168)), ActivityContenedor.pokedexTotal.get(168))
				ActivityContenedor.pokedexActual.get(168).nivel =ActivityContenedor.pokemonUsado.nivel
				ActivityContenedor.pokedexActual.get(168).amistad =ActivityContenedor.pokemonUsado.amistad
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(42).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(42)), Pokemon(42, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(168)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true            }
        } else if (pokemon.nombre.equals("Chansey") && pokemon.amistad >= 220) {
            if (!ActivityContenedor.pokedexActual.get(241).nombre.equals("Blissey")) {
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(241)), ActivityContenedor.pokedexTotal.get(241))
				ActivityContenedor.pokedexActual.get(241).nivel =ActivityContenedor.pokemonUsado.nivel
				ActivityContenedor.pokedexActual.get(241).amistad =ActivityContenedor.pokemonUsado.amistad
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(112).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(112)), Pokemon(113, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(241)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true            }
        } else if (pokemon.nombre.equals("Eevee") && pokemon.amistad >= 220) {
            if (!ActivityContenedor.pokedexActual.get(196).nombre.equals("Umbreon")) {
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(196)), ActivityContenedor.pokedexTotal.get(196))
				ActivityContenedor.pokedexActual.get(196).nivel =ActivityContenedor.pokemonUsado.nivel
				ActivityContenedor.pokedexActual.get(196).amistad =ActivityContenedor.pokemonUsado.amistad
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(132).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(132)), Pokemon(133, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(196)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true            } else if (!ActivityContenedor.pokedexActual.get(195).nombre.equals("Umbreon")){
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(195)), ActivityContenedor.pokedexTotal.get(195))
				ActivityContenedor.pokedexActual.get(195).nivel =ActivityContenedor.pokemonUsado.nivel
				ActivityContenedor.pokedexActual.get(195).amistad =ActivityContenedor.pokemonUsado.amistad
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(132).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(132)), Pokemon(133, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(195)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true
            }
        } else if (pokemon.nombre.equals("Pichu") && pokemon.amistad >= 220) {
            if (!ActivityContenedor.pokedexActual.get(24).nombre.equals("Pikachu")) {
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(24)), ActivityContenedor.pokedexTotal.get(24))
				ActivityContenedor.pokedexActual.get(24).nivel =ActivityContenedor.pokemonUsado.nivel
				ActivityContenedor.pokedexActual.get(24).amistad =ActivityContenedor.pokemonUsado.amistad
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(171).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(171)), Pokemon(172, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(24)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true            }
        } else if (pokemon.nombre.equals("Cleffa") && pokemon.amistad >= 220) {
            if (!ActivityContenedor.pokedexActual.get(34).nombre.equals("Clefairy")) {
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(34)), ActivityContenedor.pokedexTotal.get(34))
				ActivityContenedor.pokedexActual.get(34).nivel =ActivityContenedor.pokemonUsado.nivel
				ActivityContenedor.pokedexActual.get(34).amistad =ActivityContenedor.pokemonUsado.amistad
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(172).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(172)), Pokemon(173, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(34)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true            }
        } else if (pokemon.nombre.equals("Igglybuff") && pokemon.amistad >= 220) {
            if (!ActivityContenedor.pokedexActual.get(38).nombre.equals("Jigglypuff")) {
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(38)), ActivityContenedor.pokedexTotal.get(38))
				ActivityContenedor.pokedexActual.get(38).nivel =ActivityContenedor.pokemonUsado.nivel
				ActivityContenedor.pokedexActual.get(38).amistad =ActivityContenedor.pokemonUsado.amistad
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(173).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(173)), Pokemon(174, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(38)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true            }
        } else if (pokemon.nombre.equals("Togepi") && pokemon.amistad >= 220) {
            if (!ActivityContenedor.pokedexActual.get(175).nombre.equals("Togetic")) {
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(175)), ActivityContenedor.pokedexTotal.get(175))
				ActivityContenedor.pokedexActual.get(175).nivel =ActivityContenedor.pokemonUsado.nivel
				ActivityContenedor.pokedexActual.get(175).amistad =ActivityContenedor.pokemonUsado.amistad
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(174).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(174)), Pokemon(175, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(175)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true            }
        } else if (pokemon.nombre.equals("Azurill") && pokemon.amistad >= 220) {
            if (!ActivityContenedor.pokedexActual.get(182).nombre.equals("Marill")) {
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(182)), ActivityContenedor.pokedexTotal.get(182))
				ActivityContenedor.pokedexActual.get(182).nivel =ActivityContenedor.pokemonUsado.nivel
				ActivityContenedor.pokedexActual.get(182).amistad =ActivityContenedor.pokemonUsado.amistad
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(297).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(297)), Pokemon(298, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(182)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true            }
        } else if (pokemon.nombre.equals("Budew") && pokemon.amistad >= 220) {
            if (!ActivityContenedor.pokedexActual.get(314).nombre.equals("Roselia")) {
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(314)), ActivityContenedor.pokedexTotal.get(314))
				ActivityContenedor.pokedexActual.get(314).nivel =ActivityContenedor.pokemonUsado.nivel
				ActivityContenedor.pokedexActual.get(314).amistad =ActivityContenedor.pokemonUsado.amistad
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(405).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(405)), Pokemon(406, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(314)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true            }
        } else if (pokemon.nombre.equals("Buneary") && pokemon.amistad >= 220) {
            if (!ActivityContenedor.pokedexActual.get(427).nombre.equals("Lopunny")) {
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(427)), ActivityContenedor.pokedexTotal.get(427))
				ActivityContenedor.pokedexActual.get(427).nivel =ActivityContenedor.pokemonUsado.nivel
				ActivityContenedor.pokedexActual.get(427).amistad =ActivityContenedor.pokemonUsado.amistad
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(426).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(426)), Pokemon(427, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(427)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true            }
        } else if (pokemon.nombre.equals("Chingling") && pokemon.amistad >= 220) {
            if (!ActivityContenedor.pokedexActual.get(357).nombre.equals("Chimecho")) {
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(357)), ActivityContenedor.pokedexTotal.get(357))
				ActivityContenedor.pokedexActual.get(357).nivel =ActivityContenedor.pokemonUsado.nivel
				ActivityContenedor.pokedexActual.get(357).amistad =ActivityContenedor.pokemonUsado.amistad
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(432).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(432)), Pokemon(433, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(357)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true            }
        } else if (pokemon.nombre.equals("Munchlax") && pokemon.amistad >= 220) {
            if (!ActivityContenedor.pokedexActual.get(142).nombre.equals("Snorlax")) {
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(142)), ActivityContenedor.pokedexTotal.get(142))
				ActivityContenedor.pokedexActual.get(142).nivel =ActivityContenedor.pokemonUsado.nivel
				ActivityContenedor.pokedexActual.get(142).amistad =ActivityContenedor.pokemonUsado.amistad
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(445).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(445)), Pokemon(446, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(142)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true            }
        } else if (pokemon.nombre.equals("Riolu") && pokemon.amistad >= 220) {
            if (!ActivityContenedor.pokedexActual.get(447).nombre.equals("Lucario")) {
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(447)), ActivityContenedor.pokedexTotal.get(447))
				ActivityContenedor.pokedexActual.get(447).nivel =ActivityContenedor.pokemonUsado.nivel
				ActivityContenedor.pokedexActual.get(447).amistad =ActivityContenedor.pokemonUsado.amistad
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(446).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(446)), Pokemon(447, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(447)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true            }
        } else if (pokemon.nombre.equals("Woobat") && pokemon.amistad >= 220) {
            if (!ActivityContenedor.pokedexActual.get(527).nombre.equals("Swoobat")) {
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(527)), ActivityContenedor.pokedexTotal.get(527))
				ActivityContenedor.pokedexActual.get(527).nivel =ActivityContenedor.pokemonUsado.nivel
				ActivityContenedor.pokedexActual.get(527).amistad =ActivityContenedor.pokemonUsado.amistad
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(526).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(526)), Pokemon(527, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(527)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true            }
        } else if (pokemon.nombre.equals("Swadloon") && pokemon.amistad >= 220) {
            if (!ActivityContenedor.pokedexActual.get(541).nombre.equals("Leavanny")) {
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(541)), ActivityContenedor.pokedexTotal.get(541))
				ActivityContenedor.pokedexActual.get(541).nivel =ActivityContenedor.pokemonUsado.nivel
				ActivityContenedor.pokedexActual.get(541).amistad =ActivityContenedor.pokemonUsado.amistad
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(540).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(540)), Pokemon(541, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(541)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true            }
        }
        return false }

    //fun movimiento + nivel -> combate + nivel + Mantike y Remoraid
    fun comprobarMovimiento(pokemon: Pokemon) : Boolean {
        if (pokemon.nombre.equals("Tangela") && pokemon.nivel >= 33) {
            if (!ActivityContenedor.pokedexActual.get(464).nombre.equals("Tangrowth")) {
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(464)), ActivityContenedor.pokedexTotal.get(464))
				ActivityContenedor.pokedexActual.get(464).nivel =ActivityContenedor.pokemonUsado.nivel
				ActivityContenedor.pokedexActual.get(464).amistad =ActivityContenedor.pokemonUsado.amistad
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(113).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(113)), Pokemon(114, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(464)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true            }
        } else if (pokemon.nombre.equals("Piloswine") && pokemon.nivel >= 33) {
            if (!ActivityContenedor.pokedexActual.get(472).nombre.equals("Mamoswine")) {
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(472)), ActivityContenedor.pokedexTotal.get(472))
				ActivityContenedor.pokedexActual.get(472).nivel =ActivityContenedor.pokemonUsado.nivel
				ActivityContenedor.pokedexActual.get(472).amistad =ActivityContenedor.pokemonUsado.amistad
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(220).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(220)), Pokemon(221, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(472)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true            }
        } else if (pokemon.nombre.equals("Yanma") && pokemon.nivel >= 33) {
            if (!ActivityContenedor.pokedexActual.get(468).nombre.equals("Yanmega")) {
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(468)), ActivityContenedor.pokedexTotal.get(468))
				ActivityContenedor.pokedexActual.get(468).nivel =ActivityContenedor.pokemonUsado.nivel
				ActivityContenedor.pokedexActual.get(468).amistad =ActivityContenedor.pokemonUsado.amistad
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(192).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(192)), Pokemon(193, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(468)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true            }
        } else if (pokemon.nombre.equals("Aipom") && pokemon.nivel >= 32) {
            if (!ActivityContenedor.pokedexActual.get(423).nombre.equals("Ambipom")) {
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(423)), ActivityContenedor.pokedexTotal.get(423))
				ActivityContenedor.pokedexActual.get(423).nivel =ActivityContenedor.pokemonUsado.nivel
				ActivityContenedor.pokedexActual.get(423).amistad =ActivityContenedor.pokemonUsado.amistad
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(189).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(189)), Pokemon(190, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(423)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true            }
        } else if (pokemon.nombre.equals("Mime Jr.") && pokemon.nivel >= 18) {
            if (!ActivityContenedor.pokedexActual.get(121).nombre.equals("Mr. Mime")) {
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(121)), ActivityContenedor.pokedexTotal.get(121))
				ActivityContenedor.pokedexActual.get(121).nivel =ActivityContenedor.pokemonUsado.nivel
				ActivityContenedor.pokedexActual.get(121).amistad =ActivityContenedor.pokemonUsado.amistad
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(438).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(438)), Pokemon(439, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(121)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true            }
        } else if (pokemon.nombre.equals("Bonsly") && pokemon.nivel >= 17) {
            if (!ActivityContenedor.pokedexActual.get(184).nombre.equals("Sudowoodo")) {
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(184)), ActivityContenedor.pokedexTotal.get(184))
				ActivityContenedor.pokedexActual.get(184).nivel =ActivityContenedor.pokemonUsado.nivel
				ActivityContenedor.pokedexActual.get(184).amistad =ActivityContenedor.pokemonUsado.amistad
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(437).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(437)), Pokemon(438, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(184)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true            }
        } else if (pokemon.nombre.equals("Lickitung") && pokemon.nivel >= 33) {
            if (!ActivityContenedor.pokedexActual.get(462).nombre.equals("Lickilicky")) {
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(462)), ActivityContenedor.pokedexTotal.get(462))
				ActivityContenedor.pokedexActual.get(462).nivel =ActivityContenedor.pokemonUsado.nivel
				ActivityContenedor.pokedexActual.get(462).amistad =ActivityContenedor.pokemonUsado.amistad
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(107).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(107)), Pokemon(108, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(462)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true            }
        } else if (pokemon.nombre.equals("Mantyke") && pokemon.nivel >= 1) {
            if (!ActivityContenedor.pokedexActual.get(225).nombre.equals("Mantine")) {
                if (ActivityContenedor.pokedexActual.get(222).nombre.equals("Remoraid")) {
                    ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(225)), ActivityContenedor.pokedexTotal.get(225))
					ActivityContenedor.pokedexActual.get(225).nivel =ActivityContenedor.pokemonUsado.nivel
				ActivityContenedor.pokedexActual.get(225).amistad =ActivityContenedor.pokemonUsado.amistad
                    ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(457).nombre
                    ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(457)), Pokemon(458, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                    ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(225)
                    Collections.sort(
                        ActivityContenedor.pokedexActual,
                          { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                    return true                }
            }
        }
    return false }
    //fun evolución en central eléctrica/piedra musgo/piedra helada
    
    fun comprobarBioma(pokemon : Pokemon) : Boolean{
		if ((pokemon.nombre.equals("Magneton") && ActivityContenedor.biomaUsado.nombre.equals("Central eléctrica de Kanto"))|| (pokemon.nombre.equals("Eevee") && ActivityContenedor.biomaUsado.nombre.equals("Malvalanova"))|| (pokemon.nombre.equals("Magneton") && ActivityContenedor.biomaUsado.nombre.equals("Monte Corona"))|| (pokemon.nombre.equals("Magneton") && ActivityContenedor.biomaUsado.nombre.equals("Cueva Electrorroca"))) {
            if (!ActivityContenedor.pokedexActual.get(461).nombre.equals("Magnezone")) {
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(461)), ActivityContenedor.pokedexTotal.get(461))
				ActivityContenedor.pokedexActual.get(461).nivel =ActivityContenedor.pokemonUsado.nivel
				ActivityContenedor.pokedexActual.get(461).amistad =ActivityContenedor.pokemonUsado.amistad
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(81).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(81)), Pokemon(82, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(461)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true            }
        } else if ((pokemon.nombre.equals("Nosepass") && ActivityContenedor.biomaUsado.nombre.equals("Central eléctrica de Kanto"))|| (pokemon.nombre.equals("Nosepass") && ActivityContenedor.biomaUsado.nombre.equals("Malvalanova"))|| (pokemon.nombre.equals("Nosepass") && ActivityContenedor.biomaUsado.nombre.equals("Monte Corona"))|| (pokemon.nombre.equals("Nosepass") && ActivityContenedor.biomaUsado.nombre.equals("Cueva Electrorroca"))) {
            if (!ActivityContenedor.pokedexActual.get(475).nombre.equals("Probopass")) {
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(475)), ActivityContenedor.pokedexTotal.get(475))
				ActivityContenedor.pokedexActual.get(475).nivel =ActivityContenedor.pokemonUsado.nivel
				ActivityContenedor.pokedexActual.get(475).amistad =ActivityContenedor.pokemonUsado.amistad
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(298).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(298)), Pokemon(299, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(475)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true            }
        } else if ((pokemon.nombre.equals("Eevee") && ActivityContenedor.biomaUsado.nombre.equals("Bosque Verde")) || (pokemon.nombre.equals("Eevee") && ActivityContenedor.biomaUsado.nombre.equals("Encinar"))|| (pokemon.nombre.equals("Eevee") && ActivityContenedor.biomaUsado.nombre.equals("Bosque Petalia"))|| (pokemon.nombre.equals("Eevee") && ActivityContenedor.biomaUsado.nombre.equals("Bosque Vetusto"))|| (pokemon.nombre.equals("Eevee") && ActivityContenedor.biomaUsado.nombre.equals("Bosque Azulejo"))) {
            if (!ActivityContenedor.pokedexActual.get(469).nombre.equals("Leafeon")) {
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(469)), ActivityContenedor.pokedexTotal.get(469))
				ActivityContenedor.pokedexActual.get(469).nivel =ActivityContenedor.pokemonUsado.nivel
				ActivityContenedor.pokedexActual.get(469).amistad =ActivityContenedor.pokemonUsado.amistad
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(132).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(132)), Pokemon(133, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(469)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true            }
        } else if ((pokemon.nombre.equals("Eevee") && ActivityContenedor.biomaUsado.nombre.equals("Islas Espuma")) || (pokemon.nombre.equals("Eevee") && ActivityContenedor.biomaUsado.nombre.equals("Ruta Helada"))|| (pokemon.nombre.equals("Eevee") && ActivityContenedor.biomaUsado.nombre.equals("Cueva Cardumen"))|| (pokemon.nombre.equals("Eevee") && ActivityContenedor.biomaUsado.nombre.equals("Ruta 216"))|| (pokemon.nombre.equals("Eevee") && ActivityContenedor.biomaUsado.nombre.equals("Monte Tuerca"))) {
            if (!ActivityContenedor.pokedexActual.get(470).nombre.equals("Glaceon")) {
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(470)), ActivityContenedor.pokedexTotal.get(470))
				ActivityContenedor.pokedexActual.get(470).nivel =ActivityContenedor.pokemonUsado.nivel
				ActivityContenedor.pokedexActual.get(470).amistad =ActivityContenedor.pokemonUsado.amistad
                ActivityContenedor.pokemonAnterior = ActivityContenedor.pokedexActual.get(132).nombre
                ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(132)), Pokemon(133, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0))
                ActivityContenedor.pokemonUsado = ActivityContenedor.pokedexActual.get(470)
                Collections.sort(
                    ActivityContenedor.pokedexActual,
                      { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })
                return true            }
        } 
        
    return false}
}