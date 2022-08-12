package com.lorei.pokwalker

import kotlin.random.Random

class ObtenerEnemigo {
    fun obtenerEnemigoPorBioma(pasosDados : Int) : Pokemon {
        var pokemonElegido = Pokemon(0, R.drawable.p_desconocido, "???", 1, 1, 2, 0, 0)
        when (ActivityContenedor.biomaUsado.nombre) {
            "Bosque Verde" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Caterpie / Weedle / Kakuna / Metapod / Pikachu / Bulbasaur
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[9]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[12]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[10]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[13]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[24]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[0] }
            }
            "Ruta 1 de Kanto" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Pidgey / Rattata / NidoranH / NidoranM / Mankey / Tangela
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[15]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[18]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[28]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[31]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[55]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[113] }
            }

            "Ruta 3 de Kanto" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Sandsrewsh / Spearow / Pidgey / Ekans / Mankey / Jigglypuff
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[26]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[20]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[15]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[22]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[55]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[38] }
            }

            "Monte Moon" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {

                    // Sandsrewsh / Geodude / Clefairy / Onix / Zubat / Paras
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[26]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[73]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[34]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[94]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[40]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[45]
                }
            }

            "Ciudad Celeste" -> {
            val numeroElegido = (Math.random() * 100).toInt()
            when {
                // Meowth / Mr. Mime / Eevee / Hitmonchan / Jynx / Chansey
                (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[51]
                (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[121]
                (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[132]
                (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[106]
                (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[123]
                (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[112]
            }
        }

            "Ruta 10 de Kanto" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Goldeen / Magikarp / Poliwag / Psyduck / Slowpoke / Dratini
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[117]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[128]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[59]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[53]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[78]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[146]
                }
            }

            "Túnel Roca" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Machop / Onix / Zubat / Geodude / Rhyhorn / Kangaskhan
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[65]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[94]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[41]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[73]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[110]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[114]
                }
            }

            "Torre Pokémon de Kanto" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Gastly / Zubat / Cubone / Golbat / Haunter / Gastly
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[91]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[40]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[103]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[41]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[92]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[91]
                }
            }

            "Ciudad Azulona" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Grimer / Koffing / Eevee / Hitmonlee / Porygon / Growlite
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[87]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[108]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[132]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[105]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[136]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[57]
                }
            }

            "Ruta 16 de Kanto" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Venonat / Doduo / Farfetch / Tauros / Scyther / Snorlax
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[47]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[83]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[82]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[127]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[122]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[142]
                }
            }

            "Ruta 20 de Kanto" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Shellder / Tentacool / Krabby / Horsea / Staryu / Magikarp
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[89]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[71]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[97]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[115]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[119]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[128]
                }
            }
            "Ruta 24 de Kanto" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Oddish / Bellsprout / Horsea / Drowzee / Poliwhirl / abra
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[42]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[68]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[36]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[95]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[60]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[62]
                }
            }

            "Islas Espuma" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                if (pasosDados >= 3000) {
                    when {
                        // Seel / Shellder / Jynx / Lapras / Squirtle / Articuno
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[85]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[89]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[123]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[130]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[60]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[143]
                    }
                } else {
                    when {
                        // Seel / shellder / Jynx / Lapras / Squirtle /  Remoraid
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[85]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[89]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[123]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[130]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[6]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[222]
                    }
                }
            }

            "Mansión Pokémon de Kanto" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Grimer / Growlithe / Vulpix / Magmar / Ditto / Chansey
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[87]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[36]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[57]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[125]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[131]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[112]
                }
            }

            "Calle Victoria de Kanto" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Machoke / Graveler / Golbat / Rhydon / Diglett / Primeape
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[66]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[74]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[41]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[111]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[49]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[56]
                }
            }

            "Bosque Baya" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                if (pasosDados >= 3000) {
                    when {
                        // Oddish / Venonat / Exeggcute / Pinsir / Drowzee / Mew
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[42]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[47]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[101]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[126]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[95]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[150]
                    }
                } else {
                    when {
                        // Oddish / Venonat / Exeggcute / Pinsir / Drowzee /  Ledyba
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[42]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[47]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[101]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[126]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[95]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[164]
                    }
                }
            }

            "Monte Ascuas" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                if (pasosDados >= 3000) {
                    when {
                    // Ponyta / Growlithe / Vulpix / Magmar / Charmander / Moltres
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[76]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[57]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[36]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[125]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[3]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[145]
                }
            } else {
            when {
                // Ponyta / Growlithe / Vulpix / Magmar / Gloom /  Magby
                (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[76]
                (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[57]
                (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[36]
                (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[125]
                (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[3]
                (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[239]
            }
        }
            }

            "Central eléctrica de Kanto" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                if (pasosDados >= 3000) {
                    when {
                        // Voltorb / Pikachu / Magnemite / Electabuzz / Porygon / Elekid
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[99]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[24]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[80]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[124]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[136]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[144]
                    }
                } else {
                    when {
                        // Voltorb / Pikachu / Magnemite / Electabuzz / Porygon /  Elekid
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[99]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[24]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[80]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[124]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[136]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[238]
                    }
                }
            }

            "Cueva Celeste" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                if (pasosDados >= 3000) {
                    when {
                        // Paras / Omanyte / Kabuto / Aerodactyl / Lickitung / Mewtwo
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[45]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[137]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[139]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[141]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[107]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[149]
                    }
                } else {
                    when {
                        // Paras / Omanyte / Kabuto / Aerodactyl / Lickytung /  Cleffa
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[45]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[137]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[139]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[141]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[107]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[172]
                    }
                }
            }

            "Ruta 29 de Johto" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Sentret / Rattata / Hoppip / Pidgey / Pineco / Hoothoot
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[160]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[18]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[186]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[15]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[203]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[162]
                }
            }
            "Ruinas Alfa" -> {
                //Unown
                pokemonElegido = ActivityContenedor.pokedexTotal[200]
            }
            "Ruta 32 de Johto" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Mareep / Ekans / Natu / Wooper / Sunkern / Heracross
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[178]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[22]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[176]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[193]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[190]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[213]
                }
            }
            "Pozo Slowpoke" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Slowpoke / Zubat / Magikarp / Goldeen / Slowbro / Marill
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[78]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[40]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[128]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[117]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[79]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[182]
                }
            }
            "Encinar" -> {
                val numeroElegido = (Math.random() * 100).toInt()

                if (pasosDados > 3000) {
                    when {
                        // Spinarak / Ledyba / Oddish / Pichu / Chikorita / Celebi
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[166]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[164]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[42]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[151]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[171]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[250]
                    }
                } else {
                    when {
                        // Spinarak / Ledyba / Oddish / Pichu / Chikorita / Slakorth
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[166]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[164]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[42]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[151]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[171]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[286]
                    }
                }

            }

            "Ciudad Trigal" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Snubbull / Tyrogue / Smoochum / Smeargle / Elekid / Eevee
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[208]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[235]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[237]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[234]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[238]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[132]
                }
            }
            "Ruta 35 de Johto" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Yanma / Pineco / Aipom / NidoranH / NidoranM / Abra
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[192]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[203]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[189]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[28]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[31]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[62]
                }
            }
            "Parque Nacional" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Caterpie / Weedle / Ledyba / Spinarak / Scyther / Pinsir
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[9]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[12]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[164]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[166]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[122]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[126]
                }
            }

            "Torre Quemada" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                if (pasosDados > 3000) {
                    when {
                        // Murkrow / Houndoum / Magby / Cyndaquil / Misdreavus / Raikou, Entei, Suicune
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[197]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[227]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[239]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[154]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[199]
                        (numeroElegido in 91..101) -> {
                            val legendarioElegido = (Math.random() * 10).toInt()
                            when {
                                (legendarioElegido in 1..3) -> pokemonElegido = ActivityContenedor.pokedexTotal[242]
                                (legendarioElegido in 4..6) -> pokemonElegido = ActivityContenedor.pokedexTotal[243]
                                (legendarioElegido in 7..10) -> pokemonElegido = ActivityContenedor.pokedexTotal[244]
                            }
                        }
                    }
                } else {
                    when {
                        // Murkrow / Houndoum / Magby / Cyndaquil / Misdreavus / Shuppet
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[197]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[227]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[239]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[154]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[199]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[352]
                    }
                }

            }
            "Torre Campana" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                if (pasosDados > 3000) {
                    when {
                        // Murkrow / rattata / Houndoum / Slugma / Gastly / Ho-oh
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[197]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[18]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[227]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[217]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[91]
                        (numeroElegido in 56..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[249]

                    }
                } else {
                    when {
                        // Murkrow / Rattata / Houndoum / Slugma / Gastly / Numel
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[197]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[18]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[227]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[217]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[91]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[321]
                    }
                }
            }

            "Ruta 39 de Johto" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Snubbull / Stantler / Tauros / Miltank / Sudowoodoo / Heracross
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[208]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[233]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[127]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[240]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[184]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[213]
                }
            }
            "Ruta 41 de Johto" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Remoraid / Corsola / Qwillfish / Chinchou / Mantine / Magikarp
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[222]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[221]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[210]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[169]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[225]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[128]
                }
                }
            "Islas Remolino" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                if (pasosDados > 3000) {
                    when {
                        // Krabby / Tentacool / Seel / Zubat / Totodile / Lugia
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[97]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[71]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[85]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[40]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[157]
                        (numeroElegido in 56..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[248]

                    }
                } else {
                    when {
                        // Krabby / Tentacool / Seel / Zubat / Totodile / Wailmer
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[97]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[71]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[85]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[40]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[157]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[319]
                    }
                }
            }
            "Monte Mortero" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Golbat / Graveler / Tyrogue / Igglypuff / Marill / Cleffa
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[41]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[74]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[235]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[173]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[182]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[172]
                }
            }

            "Ruta 44 de Johto" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Tangela / Aipom / Lickitung / Girafarig / Weepinbell / Shuckle
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[113]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[189]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[202]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[69]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[107]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[212]
                }
            }
            "Ruta Helada" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Zubat / Smoochum / Delibird / Jynx / Swinub / Sneasel
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[40]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[237]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[224]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[123]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[219]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[214]
                }
            }
            "Guarida Dragón" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Magikarp / Horsea / Dratini / Magikarp / Horsea / Dragonair
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[128]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[116]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[146]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[128]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[116]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[147]
                }
            }
            "Ruta 45 de Johto" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Teddiursa / Phanpy / Gligar / Poliwag / Skarmory / Togepi
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[215]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[230]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[206]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[59]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[226]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[174]
                }
            }
            "Cueva Oscura" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Geodude / Zubat / Teddiursa / Dunsparce / Wobbufet / Shuckle
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[73]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[40]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[215]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[205]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[201]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[212]
                }
            }
            "Monte Plateado" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Misdreavus / Poliwhirl / Teddiursa / Phanpy / Sneasel / Larvitar
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[199]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[60]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[215]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[230]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[214]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[245]
                }
            }

            "Ruta 101" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Zigzagoon / Poochyena / Seedot / Lotad / Surskit / Marill
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[262]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[260]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[272]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[269]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[282]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[182]
                }
            }
            "Bosque Petalia" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    //  Wurmple / Shroomish / Silcoon / Cascoon / Slakoth /Treecko
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[264]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[284]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[265]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[267]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[285]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[251]
                }
            }
            "Ruta 116" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Nincada / Skitty / Taillow / Whismur / Swablu / Wingull
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[289]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[299]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[275]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[292]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[332]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[277]
                }
            }
            "Ruta 117" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Gloom / Roselia / Ilumise / Volbeat / Surskit / Azurill
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[43]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[314]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[312]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[313]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[282]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[297]
                }
            }
            "Cueva Granito" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Makuhita / Geodude / Aron / Nosepass / Mawile / Sableye
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[295]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[73]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[303]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[298]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[302]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[301]
                }
            }
            "Ruta 110" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Electrike / Gulpin / Wingull / Plusle / Minun / Zigzagoon
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[308]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[315]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[277]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[311]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[310]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[262]
                }
            }
            "Malvalanova" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Electrike / Magnemite / Voltorb / Plusle / Minun / Magneton
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[308]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[80]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[99]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[311]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[310]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[81]
                }
            }
            "Ruinas del Desierto" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                if (pasosDados > 3000) {
                    when {
                        // Sandshew / Cacnea / Baltoy / Diglett / Trapinch / Regis
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[26]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[330]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[342]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[49]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[327]
                        (numeroElegido in 91..101) -> {
                            val legendarioElegido = (Math.random() * 10).toInt()
                            when {
                                (legendarioElegido in 1..3) -> pokemonElegido = ActivityContenedor.pokedexTotal[376]
                                (legendarioElegido in 4..6) -> pokemonElegido = ActivityContenedor.pokedexTotal[377]
                                (legendarioElegido in 7..10) -> pokemonElegido = ActivityContenedor.pokedexTotal[378]
                            }
                        }
                    }
                } else {
                    when {
                        // Sandshew / Cacnea / Baltoy / Diglett / Trapinch / Gible
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[26]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[330]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[342]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[49]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[327]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[442]
                    }
                }

            }
            "Senda Ígnea" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Numel / Torkoal / Ponyta / Slugma / Koffing / Torchic
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[321]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[323]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[76]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[217]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[108]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[254]
                }
            }
            "Desfiladero" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Numel / Machop / Spoink / Mankey / Wynaut / Togepi
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[321]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[65]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[324]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[55]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[359]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[174]
                }
            }
            "Ruta 114" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Corphish / Surskit / Nuzleaf / Lombre / Azurill / Mudkip
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[340]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[282]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[273]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[271]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[297]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[257]
                }
            }
            "Cascada Meteoro" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Zubat / Barboach / Clefairy / Bagon / Solrock / Lunatone
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[40]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[338]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[34]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[370]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[337]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[336]
                }
            }
            "Ruta 119" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Gloom / Zigzagoon / Tropius / Kecleon / Carvanha / Feebas
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[43]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[262]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[356]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[351]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[317]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[348]
                }
            }
            "Monte Pírico" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Shuppet / Duskull / Meditite / Chimecho / Chimecho / Absol
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[352]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[354]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[306]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[357]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[357]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[358]
                }
            }

            "Ruta 127" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Tentacool / Magikarp / Wailmer / Pelipper / Shapedo / Luvdisc
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[71]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[128]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[319]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[378]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[318]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[369]
                }
            }
            "Fondo del mar de Hoenn" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Clamperl / Chinchou / Lileep / Anorith / Relicath / Lanturn
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[365]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[169]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[344]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[346]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[368]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[170]
                }
            }
            "Cueva Cardumen" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Spheal / Snorunt / Wailmer / Dewgong / Delibird / Golbat
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[362]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[360]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[319]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[86]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[224]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[41]
                }
            }
            "Cueva Ancestral" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                if (pasosDados > 3000){
                    when {
                        // Sableye / Mawile / Castform / Castform / Groudon / Kyogre
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[301]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[302]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[350]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[350]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[382]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[381]
                    }
                } else {
                    when {
                        // Sableye / Mawile / Castform / Castform / Bronzor / Bronzor
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[301]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[302]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[350]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[350]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[435]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[435]
                    }
                }
            }
            "Calle Victoria de Hoenn" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Loudred / Lairon / Hariyama / Medicham / Ralts / Beldum
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[293]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[304]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[296]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[307]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[279]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[373]
                }
            }
            "Pilar Celeste" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                if (pasosDados > 3000) {
                when {
                    // Swablu / Ariados / Claydol / Banette / Dusclops / Raykuaza, Deoxys, Jirachi
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[332]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[167]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[343]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[353]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[355]
                    (numeroElegido in 91..101) -> {
                        val legendarioElegido = (Math.random() * 10).toInt()
                        when {
                            (legendarioElegido in 1..3) -> pokemonElegido = ActivityContenedor.pokedexTotal[383]
                            (legendarioElegido in 4..6) -> pokemonElegido = ActivityContenedor.pokedexTotal[385]
                            (legendarioElegido in 7..10) -> pokemonElegido = ActivityContenedor.pokedexTotal[384]
                        }
                    }
                }
            } else {
            when {
                // Swablu / Ariados / Claydol / Banette / Dusclops / Gible
                (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[332]
                (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[167]
                (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[343]
                (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[353]
                (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[355]
                (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[424]
            }
        }
            }
            "Isla del Sur" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                if (pasosDados >= 3000) {
                    when {
                        // Spinda / Zangoose / Seviper / Bagon / Latios / Latias
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[326]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[334]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[335]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[370]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[380]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[379]
                    }
                } else {
                    when {
                        // Spinda / Zangoose / Seviper / Bagom / Budew /  Shinx
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[326]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[334]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[335]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[370]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[405]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[403]
                    }
                }
            }
            "Ruta 201" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Bidoof / Starly / Kriketot / Shinx / Budew / Abra
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[398]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[395]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[402]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[400]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[405]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[62]
                }
            }
            "Ciudad Jubileo" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Glameow / Mime Jr. / Ralts / Happiny / Eevee / Porygon
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[430]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[438]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[279]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[439]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[132]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[136]
                }
            }
            "Ruta 205" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Pachirisu / Buizel / Burmy / Cherubi / Combee / Aipom
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[416]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[417]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[419]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[411]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[414]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[189]
                }
            }
            "Bosque Vetusto" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Bidoof /  Buneary / Silcoon / Cascoon / Budew / Turwig
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[398]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[426]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[265]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[267]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[405]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[386]
                }
            }
            "Vieja Mansión" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Gastly / Misdreavus / Murkrow / Drifloon / Haunter / Rotom
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[91]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[199]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[197]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[424]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[92]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[478]
                }
            }
            "Ruta 209" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Staravia / Bibarel / Bonsly / Roselia / Gligar / Spiritomb
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[396]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[399]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[437]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[314]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[206]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[441]
                }
            }
            "Ruta 212" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Shellos / Skorupi / Carnivine / Croagunk / Stunky / Quagsire
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[421]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[450]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[454]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[452]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[433]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[194]
                }
            }
            "Ruta 213" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Gastrodon / Floatzel / Octillery / Sharpedo / Pelipper / Chatot
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[422]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[418]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[223]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[318]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[278]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[440]
                }
            }
            "Cueva Retorno" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                if (pasosDados > 3000) {
                    when {
                        // Bronzor / Dusclops / Chingling / Chimecho / Bronzorg / Giratina
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[435]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[355]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[432]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[357]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[436]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[486]
                    }
                }else {
                    when {
                        // Bronzor / Dusclops / Chingling / Chimecho / Bronzorg / Litwik
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[435]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[355]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[432]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[357]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[436]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[606]
                    }
                }

            }
            "Monte Corona" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Chingling / Clefairy / Bronzor / Medicham / Nosepass / Gible
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[432]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[34]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[435]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[307]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[298]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[442]
                }
            }
            "Ruta 216" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Sneasel / Snover / Meditite / Snorunt / piloswine / Ursaring
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[214]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[458]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[306]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[360]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[220]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[216]
                }
            }
            "Ruta 222" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Luxio / Flaffy / Magneton / Electabuzz / Chatot / Lickytung
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[403]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[179]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[81]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[124]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[440]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[107]
                }
            }
            "Ruta 223" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Finneon / Gyarados / Octillery / Mantyke / Wailord / Staryu
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[455]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[129]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[223]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[457]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[320]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[119]
                }
            }
            "Ruta 228" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Dugtrio / Sandlash / Rhydon / Cacturne / Hippodown / Vibrava
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[50]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[27]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[111]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[331]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[449]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[328]
                }
            }
            "Isla Hierro" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Skarmory / Steelix / Bronzorg / Lairon / Metang / Riolu
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[226]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[207]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[436]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[304]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[374]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[446]
                }
            }
            "Subsuelo de Sinnoh" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Hipopotas / Nosepass / Spiritomb / Shieldon / Cranidos / Gible /
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[448]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[298]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[441]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[409]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[407]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[442]
                }
            }
            "Templo Puntaneva" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                if (pasosDados > 3000) {
                    when {
                        // Sneasel / Jynx / Onix /  Smoochum / Steelix / Regigigas
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[214]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[123]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[94]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[237]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[207]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[485]
                    }
                }else {
                    when {
                        // Sneasel / Jynx / Onix /  Smoochum / Steelix / Cryogonal
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[214]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[123]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[94]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[237]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[207]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[614]
                    }
                }
            }
            "Montaña Dura" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                if (pasosDados > 3000) {
                    when {
                        // Camerupt / Torkoal / Magcargo /  Magmar / Chimchar/ Heatran
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[322]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[323]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[218]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[125]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[389]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[484]
                    }
                }else {
                    when {
                        // Camerupt / Torkoal / Magcargo / Magby / Bronzorg / Darumaka
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[322]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[323]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[218]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[239]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[125]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[553]
                    }
                }
            }
            "Columnas Lanza" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                if (pasosDados > 3000) {
                    when {
                        // Abomasnow / Medicham / Gabite / Lickitung / Munchlax / Dialga Palkia Arceus
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[459]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[307]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[443]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[107]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[445]
                        (numeroElegido in 91..101) -> {
                            if(ActivityContenedor.pokedexActual[482].nombre.equals("Dialga") && ActivityContenedor.pokedexActual[483].nombre.equals("Dialga")) {
                                    pokemonElegido = ActivityContenedor.pokedexTotal[492]
                            } else {
                                val legendarioElegido = (Math.random() * 10).toInt()
                                when {
                                    (legendarioElegido in 1..5) -> pokemonElegido = ActivityContenedor.pokedexTotal[482]
                                    (legendarioElegido in 6..10) -> pokemonElegido = ActivityContenedor.pokedexTotal[483]
                                }
                            }

                        }
                    }
                }else {
                    when {
                        // Abomasnow / Medicham / Gabite / Lickitung / Munchlax / Druddigon
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[459]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[307]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[443]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[107]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[488]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[620]
                    }
                }
            }
            "Paraíso Floral" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                if (pasosDados > 3000) {
                    when {
                        // Roselia / Gloom / Budew / Cherubi / Weepinbell / Shaymin
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[314]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[43]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[405]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[419]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[69]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[491]
                    }
                }else {
                    when {
                        // Roselia / Gloom / Budew / Cherubi / Weepinbell / Darumaka
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[314]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[43]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[405]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[419]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[69]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[584]
                    }
                }

            }
            "Isla Sueño" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                if (pasosDados > 3000) {
                    when {
                        // Jigglypuff / Hypno / Xatu / Dusclops / Hypno / Darkrai o Cresselia
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[38]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[96]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[177]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[355]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[96]
                        (numeroElegido in 91..101) -> {
                            val legendarioElegido = (Math.random() * 10).toInt()
                            when {
                                (legendarioElegido in 1..5) -> pokemonElegido = ActivityContenedor.pokedexTotal[487]
                                (legendarioElegido in 6..10) -> pokemonElegido = ActivityContenedor.pokedexTotal[490]
                            }
                        }                    }
                }else {
                    when {
                        // Jigglypuff / Hypno / Xatu / Dusclops / Hypno / Munna
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[38]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[96]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[177]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[355]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[96]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[516]
                    }
                }
            }
            "Lagos de Sinnoh" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                if (pasosDados > 3000) {
                    when {
                        // Bidoof / Burmy / Buneary / Bonsly / Munchlax / Uxie Azel Mesprint
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[398]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[411]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[426]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[437]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[445]
                        (numeroElegido in 91..101) -> {
                            val legendarioElegido = (Math.random() * 10).toInt()
                            when {
                                (legendarioElegido in 1..3) -> pokemonElegido = ActivityContenedor.pokedexTotal[479]
                                (legendarioElegido in 4..6) -> pokemonElegido = ActivityContenedor.pokedexTotal[480]
                                (legendarioElegido in 7..10) -> pokemonElegido = ActivityContenedor.pokedexTotal[481]
                            }
                        }
                    }
                }else {
                    when {
                        // Bidoof / Burmy / Buneary / Bonsly / Munchlax / Elgyem
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[457]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[456]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[368]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[320]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[488]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[604]
                    }
                }
            }
            "Fondo del mar de Sinnoh" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                if (pasosDados > 3000) {
                    when {
                        // Mantyke / Lumineon / Relicanth / Wailord / Phione / Manaphy
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[457]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[456]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[368]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[320]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[488]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[489]
                    }
                }else {
                    when {
                        // Mantyke / Lumineon / Relicanth / Wailord / Phione / Alomomola
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[457]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[456]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[368]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[320]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[488]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[593]
                    }
                }
            }

            "Solar de los Sueños" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Watchog / Liepard / Munna / Audino / Audino / Monos
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[504]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[509]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[517]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[530]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[530]
                    (numeroElegido in 91..101) -> {
                        val legendarioElegido = (Math.random() * 10).toInt()
                        when {
                            (legendarioElegido in 1..3) -> pokemonElegido = ActivityContenedor.pokedexTotal[510]
                            (legendarioElegido in 4..6) -> pokemonElegido = ActivityContenedor.pokedexTotal[512]
                            (legendarioElegido in 7..10) -> pokemonElegido = ActivityContenedor.pokedexTotal[514]

                        }
                    }
                }
            }
            "Bosque Azulejo" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Sewaddle / Petilil / Cottonee / Venipede / Pidove / Snivy
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[539]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[547]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[545]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[542]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[518]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[494]
                }
            }
            "Ciudad Porcelana" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Timburr / Trubbish / Lillipup / Minccino / Sawk / Zorua
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[531]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[567]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[505]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[571]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[538]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[569]
                }
            }
            "Torre Victoria" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                if(pasosDados > 3000) {
                    when {
                        // Yamask / Litwik / Elgyem / Litwik / Golett / Victiny
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[561]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[606]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[604]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[606]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[621]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[493]
                    }
                } else {
                    when {
                        // Yamask / Litwik / Elgyem / Litwik / Golett / Beheeyem
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[561]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[606]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[604]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[606]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[621]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[605]
                    }
                }
            }

            "Ruta 4 de Teselia" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Sandile / Darumaka / Scraggy / Vullaby / Rufflet / Tepig
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[550]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[553]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[558]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[628]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[626]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[497]
                }
            }
            "Castillo Ancestral" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Yamask / Dweeble / Maractus / Krokorock / Sigilyph / Larvesta
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[561]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[556]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[555]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[551]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[560]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[635]
                }
            }
            "Túnel Yakón" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Roggenrola / Woobat / Gurdurr / Drilburr / Durant / Heatmor
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[523]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[526]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[532]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[528]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[631]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[630]
                }
            }
            "Monte Tuerca" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Boldore / Woobat / Gurdurr / Vanillite / Cubchoo / Cryogonal
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[524]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[526]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[532]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[581]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[612]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[614]
                }
            }
            "Ciudad Mayólica" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Pidove / Ducklett / Purrloin / throh / Gothita / Audino
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[518]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[508]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[579]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[537]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[573]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[530]
                }
            }
            "Ruta 6 de Teselia" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Deerling / Patrat / Ducklett / Tranquill / Emolga / Swadloon
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[584]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[503]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[579]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[519]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[586]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[540]
                }
            }
            "Cueva Electrorroca" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    //
                    // Joltik / Klink / Ferroseed / Boldore / Tynamo / Blitzle
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[594]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[598]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[596]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[524]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[601]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[521]
                }
            }
            "Pantano Teja" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Tympole / Basculin / Foongus / Stunkfish / Karrablast / Shelmet
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[534]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[549]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[589]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[617]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[615]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[587]
                }
            }
            "Ruta 10 de Teselia" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Solosis / Herdier / Pawniard / Rufflet / Vullaby / Bouffalant
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[576]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[506]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[623]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[626]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[628]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[625]
                }
            }
            "Ruta 21 de Teselia" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                when {
                    // Frillish / Alomomola / Frillish / Jellicent / Osshawott / Alomomola
                    (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[591]
                    (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[593]
                    (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[591]
                    (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[592]
                    (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[500]
                    (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[593]
                }
            }
            "Torre Duodraco" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                if(pasosDados > 3000) {
                    when {
                        // Vanillish / mienfoo / Deino / Axew / Druddigon / Dragones
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[582]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[618]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[632]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[609]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[620]
                        (numeroElegido in 91..101) -> {
                            val legendarioElegido = (Math.random() * 10).toInt()
                            when {
                                (legendarioElegido in 1..5) -> pokemonElegido = ActivityContenedor.pokedexTotal[642]
                                (legendarioElegido in 6..10) -> pokemonElegido = ActivityContenedor.pokedexTotal[643]
                            }
                        }
                    }
                } else {
                    when {
                        // Vanillish / mienfoo / Deino / Axew / Druddigon / Druddigon
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[582]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[618]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[632]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[609]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[620]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[620]
                    }
                }
            }
            "Boquete Gigante" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                if(pasosDados > 3000) {
                    when {
                        // Vanillish / Excadrill / Beartic / Golurk / Druddigon / Kyurem
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[582]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[529]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[613]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[622]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[620]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[645]
                    }
                } else {
                    when {
                        // Vanillish / Excadrill / Beartic / Golurk / Druddigon / Druddigon
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[582]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[529]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[613]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[622]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[620]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[620]
                    }
                }
            }
            "Cueva Loza" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                if(pasosDados > 3000) {
                    when {
                        // Woobat / Tirtouga / Archen / Fraxure / Zweilous / Mosqueteros
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[526]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[563]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[565]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[610]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[633]
                        (numeroElegido in 91..101) -> {
                            val legendarioElegido = (Math.random() * 10).toInt()
                            when {
                                (legendarioElegido in 1..3) -> pokemonElegido = ActivityContenedor.pokedexTotal[637]
                                (legendarioElegido in 4..6) -> pokemonElegido = ActivityContenedor.pokedexTotal[638]
                                (legendarioElegido in 7..10) -> pokemonElegido = ActivityContenedor.pokedexTotal[639]

                            }
                        }
                    }
                } else {
                    when {
                        // Woobat / Tirtouga / Archen / Fraxure / Zweilous / Zweilous
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[526]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[563]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[565]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[610]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[633]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[633]
                    }
                }
            }
            "Santuario Abundancia" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                if(pasosDados > 3000) {
                    when {
                        // Petilil / Cotonee / Swadloon / Crustle / Whirlipede / Keldeo o Meloetta
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[615]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[587]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[540]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[557]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[543]
                        (numeroElegido in 91..101) -> {
                            val legendarioElegido = (Math.random() * 10).toInt()
                            when {
                                (legendarioElegido in 1..5) -> pokemonElegido = ActivityContenedor.pokedexTotal[646]
                                (legendarioElegido in 5..10) -> pokemonElegido = ActivityContenedor.pokedexTotal[647]
                            }
                        }
                    }
                } else {
                    when {
                        // Gothorita / Duosion / Swadloon / Crustle / Whirlipede / Whirlipede
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[574]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[577]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[540]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[557]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[543]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[543]
                    }
                }
            }
            "Arboleda Promesa" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                if(pasosDados > 3000) {
                    when {
                        // Gothorita / Duosion / Swadloon / Sawburk / Basculin / Trio de cielo
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[574]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[577]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[586]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[585]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[549]
                        (numeroElegido in 91..101) -> {
                            val legendarioElegido = (Math.random() * 10).toInt()
                            when {
                                (legendarioElegido in 1..3) -> pokemonElegido = ActivityContenedor.pokedexTotal[640]
                                (legendarioElegido in 4..6) -> pokemonElegido = ActivityContenedor.pokedexTotal[641]
                                (legendarioElegido in 7..10) -> pokemonElegido = ActivityContenedor.pokedexTotal[644]

                            }
                        }
                    }
                } else {
                    when {
                        // Petilil / Cotonee / Emolga / Sawburk / Basculin / sawburk
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[547]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[545]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[586]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[585]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[549]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[585]
                    }
                }
            }
            "Laboratorio de P+P" -> {
                val numeroElegido = (Math.random() * 100).toInt()
                if(pasosDados > 3000) {
                    when {
                        // Eelektrik / Scrafty / Galvantula / Klank / Garbodor / Genesect
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[602]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[559]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[595]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[599]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[568]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[648]
                    }
                } else {
                    when {
                        // Eelektrik / Scrafty / Galvantula / Klank / Garbodor / Klank
                        (numeroElegido in 1..20) -> pokemonElegido = ActivityContenedor.pokedexTotal[602]
                        (numeroElegido in 21..40) -> pokemonElegido = ActivityContenedor.pokedexTotal[559]
                        (numeroElegido in 41..55) -> pokemonElegido = ActivityContenedor.pokedexTotal[595]
                        (numeroElegido in 56..75) -> pokemonElegido = ActivityContenedor.pokedexTotal[599]
                        (numeroElegido in 76..90) -> pokemonElegido = ActivityContenedor.pokedexTotal[568]
                        (numeroElegido in 91..101) -> pokemonElegido = ActivityContenedor.pokedexTotal[599]
                    }
                }
            }
            "Ultraespacio" -> {
                pokemonElegido = ActivityContenedor.pokedexTotal[Random.nextInt(ActivityContenedor.pokedexTotal.size)]
            }
            else -> {}
        }
    return pokemonElegido}

} //    gothorita duosion