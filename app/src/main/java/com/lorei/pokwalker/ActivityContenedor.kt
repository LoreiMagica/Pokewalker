package com.lorei.pokwalker

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class ActivityContenedor : AppCompatActivity() {
    companion object {
        var dinero = 1000
        var pokemonUsado : Pokemon = Pokemon(1, R.drawable.p1, "???", 1, 1, 2, 0, 0)
        var pokemonAnterior : String = "a"
        var pokedexActual = mutableListOf<Pokemon>()
        var pokedexTotal = mutableListOf<Pokemon>()
        var listaInventario = mutableListOf<Objeto>()
        var biomaUsado : Bioma = Bioma(R.drawable.bioma_bosque, "Bosque Verde", false)
        var mensajeLegendario = false

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contenedor)

        //actualizarBD()
        rellenarPokedex()
        cargarDatos()

        if (pokemonUsado.nombre.equals("???")) {
            val fragmentBase = FragmentInicial()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.contenedor, fragmentBase, "ficha")
        transaction.addToBackStack(null)
        transaction.commit()
    } else {
        val fragmentBase = FragmentBase()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.contenedor, fragmentBase, "ficha")
        transaction.addToBackStack(null)
        transaction.commit()
    }


    }

    private fun rellenarPokedex() {
        val listaNombres = listOf(
            "0",
            "Bulbasaur",
            "Ivysaur",
            "Venusaur",
            "Charmander",
            "Charmeleon",
            "Charizard",
            "Squirtle",
            "Wartortle",
            "Blastoise",
            "Caterpie",
            "Metapod",
            "Butterfree",
            "Weedle",
            "Kakuna",
            "Beedrill",
            "Pidgey",
            "Pidgeotto",
            "Pidgeot",
            "Rattata",
            "Raticate",
            "Spearow",
            "Fearow",
            "Ekans",
            "Arbok",
            "Pikachu",
            "Raichu",
            "Sandshrew",
            "Sandslash",
            "Nidoran♀",
            "Nidorina",
            "Nidoqueen",
            "Nidoran♂",
            "Nidorino",
            "Nidoking",
            "Clefairy",
            "Clefable",
            "Vulpix",
            "Ninetales",
            "Jigglypuff",
            "Wigglytuff",
            "Zubat",
            "Golbat",
            "Oddish",
            "Gloom",
            "Vileplume",
            "Paras",
            "Parasect",
            "Venonat",
            "Venomoth",
            "Diglett",
            "Dugtrio",
            "Meowth",
            "Persian",
            "Psyduck",
            "Golduck",
            "Mankey",
            "Primeape",
            "Growlithe",
            "Arcanine",
            "Poliwag",
            "Poliwhirl",
            "Poliwrath",
            "Abra",
            "Kadabra",
            "Alakazam",
            "Machop",
            "Machoke",
            "Machamp",
            "Bellsprout",
            "Weepinbell",
            "Victreebel",
            "Tentacool",
            "Tentacruel",
            "Geodude",
            "Graveler",
            "Golem",
            "Ponyta",
            "Rapidash",
            "Slowpoke",
            "Slowbro",
            "Magnemite",
            "Magneton",
            "Farfetch’d",
            "Doduo",
            "Dodrio",
            "Seel",
            "Dewgong",
            "Grimer",
            "Muk",
            "Shellder",
            "Cloyster",
            "Gastly",
            "Haunter",
            "Gengar",
            "Onix",
            "Drowzee",
            "Hypno",
            "Krabby",
            "Kingler",
            "Voltorb",
            "Electrode",
            "Exeggcute",
            "Exeggutor",
            "Cubone",
            "Marowak",
            "Hitmonlee",
            "Hitmonchan",
            "Lickitung",
            "Koffing",
            "Weezing",
            "Rhyhorn",
            "Rhydon",
            "Chansey",
            "Tangela",
            "Kangaskhan",
            "Horsea",
            "Seadra",
            "Goldeen",
            "Seaking",
            "Staryu",
            "Starmie",
            "Mr. Mime",
            "Scyther",
            "Jynx",
            "Electabuzz",
            "Magmar",
            "Pinsir",
            "Tauros",
            "Magikarp",
            "Gyarados",
            "Lapras",
            "Ditto",
            "Eevee",
            "Vaporeon",
            "Jolteon",
            "Flareon",
            "Porygon",
            "Omanyte",
            "Omastar",
            "Kabuto",
            "Kabutops",
            "Aerodactyl",
            "Snorlax",
            "Articuno",
            "Zapdos",
            "Moltres",
            "Dratini",
            "Dragonair",
            "Dragonite",
            "Mewtwo",
            "Mew",
            "Chikorita",
            "Bayleef",
            "Meganium",
            "Cyndaquil",
            "Quilava",
            "Typhlosion",
            "Totodile",
            "Croconaw",
            "Feraligatr",
            "Sentret",
            "Furret",
            "Hoothoot",
            "Noctowl",
            "Ledyba",
            "Ledian",
            "Spinarak",
            "Ariados",
            "Crobat",
            "Chinchou",
            "Lanturn",
            "Pichu",
            "Cleffa",
            "Igglybuff",
            "Togepi",
            "Togetic",
            "Natu",
            "Xatu",
            "Mareep",
            "Flaaffy",
            "Ampharos",
            "Bellossom",
            "Marill",
            "Azumarill",
            "Sudowoodo",
            "Politoed",
            "Hoppip",
            "Skiploom",
            "Jumpluff",
            "Aipom",
            "Sunkern",
            "Sunflora",
            "Yanma",
            "Wooper",
            "Quagsire",
            "Espeon",
            "Umbreon",
            "Murkrow",
            "Slowking",
            "Misdreavus",
            "Unown",
            "Wobbuffet",
            "Girafarig",
            "Pineco",
            "Forretress",
            "Dunsparce",
            "Gligar",
            "Steelix",
            "Snubbull",
            "Granbull",
            "Qwilfish",
            "Scizor",
            "Shuckle",
            "Heracross",
            "Sneasel",
            "Teddiursa",
            "Ursaring",
            "Slugma",
            "Magcargo",
            "Swinub",
            "Piloswine",
            "Corsola",
            "Remoraid",
            "Octillery",
            "Delibird",
            "Mantine",
            "Skarmory",
            "Houndour",
            "Houndoom",
            "Kingdra",
            "Phanpy",
            "Donphan",
            "Porygon2",
            "Stantler",
            "Smeargle",
            "Tyrogue",
            "Hitmontop",
            "Smoochum",
            "Elekid",
            "Magby",
            "Miltank",
            "Blissey",
            "Raikou",
            "Entei",
            "Suicune",
            "Larvitar",
            "Pupitar",
            "Tyranitar",
            "Lugia",
            "Ho-Oh",
            "Celebi",
            "Treecko",
            "Grovyle",
            "Sceptile",
            "Torchic",
            "Combusken",
            "Blaziken",
            "Mudkip",
            "Marshtomp",
            "Swampert",
            "Poochyena",
            "Mightyena",
            "Zigzagoon",
            "Linoone",
            "Wurmple",
            "Silcoon",
            "Beautifly",
            "Cascoon",
            "Dustox",
            "Lotad",
            "Lombre",
            "Ludicolo",
            "Seedot",
            "Nuzleaf",
            "Shiftry",
            "Taillow",
            "Swellow",
            "Wingull",
            "Pelipper",
            "Ralts",
            "Kirlia",
            "Gardevoir",
            "Surskit",
            "Masquerain",
            "Shroomish",
            "Breloom",
            "Slakoth",
            "Vigoroth",
            "Slaking",
            "Nincada",
            "Ninjask",
            "Shedinja",
            "Whismur",
            "Loudred",
            "Exploud",
            "Makuhita",
            "Hariyama",
            "Azurill",
            "Nosepass",
            "Skitty",
            "Delcatty",
            "Sableye",
            "Mawile",
            "Aron",
            "Lairon",
            "Aggron",
            "Meditite",
            "Medicham",
            "Electrike",
            "Manectric",
            "Plusle",
            "Minun",
            "Volbeat",
            "Illumise",
            "Roselia",
            "Gulpin",
            "Swalot",
            "Carvanha",
            "Sharpedo",
            "Wailmer",
            "Wailord",
            "Numel",
            "Camerupt",
            "Torkoal",
            "Spoink",
            "Grumpig",
            "Spinda",
            "Trapinch",
            "Vibrava",
            "Flygon",
            "Cacnea",
            "Cacturne",
            "Swablu",
            "Altaria",
            "Zangoose",
            "Seviper",
            "Lunatone",
            "Solrock",
            "Barboach",
            "Whiscash",
            "Corphish",
            "Crawdaunt",
            "Baltoy",
            "Claydol",
            "Lileep",
            "Cradily",
            "Anorith",
            "Armaldo",
            "Feebas",
            "Milotic",
            "Castform",
            "Kecleon",
            "Shuppet",
            "Banette",
            "Duskull",
            "Dusclops",
            "Tropius",
            "Chimecho",
            "Absol",
            "Wynaut",
            "Snorunt",
            "Glalie",
            "Spheal",
            "Sealeo",
            "Walrein",
            "Clamperl",
            "Huntail",
            "Gorebyss",
            "Relicanth",
            "Luvdisc",
            "Bagon",
            "Shelgon",
            "Salamence",
            "Beldum",
            "Metang",
            "Metagross",
            "Regirock",
            "Regice",
            "Registeel",
            "Latias",
            "Latios",
            "Kyogre",
            "Groudon",
            "Rayquaza",
            "Jirachi",
            "Deoxys",
            "Turtwig",
            "Grotle",
            "Torterra",
            "Chimchar",
            "Monferno",
            "Infernape",
            "Piplup",
            "Prinplup",
            "Empoleon",
            "Starly",
            "Staravia",
            "Staraptor",
            "Bidoof",
            "Bibarel",
            "Kricketot",
            "Kricketune",
            "Shinx",
            "Luxio",
            "Luxray",
            "Budew",
            "Roserade",
            "Cranidos",
            "Rampardos",
            "Shieldon",
            "Bastiodon",
            "Burmy",
            "Wormadam",
            "Mothim",
            "Combee",
            "Vespiquen",
            "Pachirisu",
            "Buizel",
            "Floatzel",
            "Cherubi",
            "Cherrim",
            "Shellos",
            "Gastrodon",
            "Ambipom",
            "Drifloon",
            "Drifblim",
            "Buneary",
            "Lopunny",
            "Mismagius",
            "Honchkrow",
            "Glameow",
            "Purugly",
            "Chingling",
            "Stunky",
            "Skuntank",
            "Bronzor",
            "Bronzong",
            "Bonsly",
            "Mime Jr.",
            "Happiny",
            "Chatot",
            "Spiritomb",
            "Gible",
            "Gabite",
            "Garchomp",
            "Munchlax",
            "Riolu",
            "Lucario",
            "Hippopotas",
            "Hippowdon",
            "Skorupi",
            "Drapion",
            "Croagunk",
            "Toxicroak",
            "Carnivine",
            "Finneon",
            "Lumineon",
            "Mantyke",
            "Snover",
            "Abomasnow",
            "Weavile",
            "Magnezone",
            "Lickilicky",
            "Rhyperior",
            "Tangrowth",
            "Electivire",
            "Magmortar",
            "Togekiss",
            "Yanmega",
            "Leafeon",
            "Glaceon",
            "Gliscor",
            "Mamoswine",
            "Porygon-Z",
            "Gallade",
            "Probopass",
            "Dusknoir",
            "Froslass",
            "Rotom",
            "Uxie",
            "Mesprit",
            "Azelf",
            "Dialga",
            "Palkia",
            "Heatran",
            "Regigigas",
            "Giratina",
            "Cresselia",
            "Phione",
            "Manaphy",
            "Darkrai",
            "Shaymin",
            "Arceus",
            "Victini",
            "Snivy",
            "Servine",
            "Serperior",
            "Tepig",
            "Pignite",
            "Emboar",
            "Oshawott",
            "Dewott",
            "Samurott",
            "Patrat",
            "Watchog",
            "Lillipup",
            "Herdier",
            "Stoutland",
            "Purrloin",
            "Liepard",
            "Pansage",
            "Simisage",
            "Pansear",
            "Simisear",
            "Panpour",
            "Simipour",
            "Munna",
            "Musharna",
            "Pidove",
            "Tranquill",
            "Unfezant",
            "Blitzle",
            "Zebstrika",
            "Roggenrola",
            "Boldore",
            "Gigalith",
            "Woobat",
            "Swoobat",
            "Drilbur",
            "Excadrill",
            "Audino",
            "Timburr",
            "Gurdurr",
            "Conkeldurr",
            "Tympole",
            "Palpitoad",
            "Seismitoad",
            "Throh",
            "Sawk",
            "Sewaddle",
            "Swadloon",
            "Leavanny",
            "Venipede",
            "Whirlipede",
            "Scolipede",
            "Cottonee",
            "Whimsicott",
            "Petilil",
            "Lilligant",
            "Basculin",
            "Sandile",
            "Krokorok",
            "Krookodile",
            "Darumaka",
            "Darmanitan",
            "Maractus",
            "Dwebble",
            "Crustle",
            "Scraggy",
            "Scrafty",
            "Sigilyph",
            "Yamask",
            "Cofagrigus",
            "Tirtouga",
            "Carracosta",
            "Archen",
            "Archeops",
            "Trubbish",
            "Garbodor",
            "Zorua",
            "Zoroark",
            "Minccino",
            "Cinccino",
            "Gothita",
            "Gothorita",
            "Gothitelle",
            "Solosis",
            "Duosion",
            "Reuniclus",
            "Ducklett",
            "Swanna",
            "Vanillite",
            "Vanillish",
            "Vanilluxe",
            "Deerling",
            "Sawsbuck",
            "Emolga",
            "Karrablast",
            "Escavalier",
            "Foongus",
            "Amoonguss",
            "Frillish",
            "Jellicent",
            "Alomomola",
            "Joltik",
            "Galvantula",
            "Ferroseed",
            "Ferrothorn",
            "Klink",
            "Klang",
            "Klinklang",
            "Tynamo",
            "Eelektrik",
            "Eelektross",
            "Elgyem",
            "Beheeyem",
            "Litwick",
            "Lampent",
            "Chandelure",
            "Axew",
            "Fraxure",
            "Haxorus",
            "Cubchoo",
            "Beartic",
            "Cryogonal",
            "Shelmet",
            "Accelgor",
            "Stunfisk",
            "Mienfoo",
            "Mienshao",
            "Druddigon",
            "Golett",
            "Golurk",
            "Pawniard",
            "Bisharp",
            "Bouffalant",
            "Rufflet",
            "Braviary",
            "Vullaby",
            "Mandibuzz",
            "Heatmor",
            "Durant",
            "Deino",
            "Zweilous",
            "Hydreigon",
            "Larvesta",
            "Volcarona",
            "Cobalion",
            "Terrakion",
            "Virizion",
            "Tornadus",
            "Thundurus",
            "Reshiram",
            "Zekrom",
            "Landorus",
            "Kyurem",
            "Keldeo",
            "Meloetta",
            "Genesect"
        )
        for (i in 1..(listaNombres.size -1) ) {
            var pokemon = Pokemon(1,0, "a", 1, 2, 1, 0, 0)
            pokemon = if (  i == 144 || i == 145 || i == 146 || i == 150 || i == 151 || i == 243 || i == 244 || i == 245|| i == 249 || i == 250 || i == 251 || (i in 377..386) || (i in 480..494) || (i in 638..649)) {
                Pokemon(
                    i.toShort(),
                    getResources().getIdentifier("p" + i, "drawable", packageName),
                    listaNombres.get(i),
                    1, 2,
                    7, 0,
                    getResources().getIdentifier("sp" + i, "raw", getPackageName())
                )
            } else {
                Pokemon (i.toShort(), getResources().getIdentifier("p" + i, "drawable", getPackageName() ), listaNombres.get(i), 1, 2,4, 0, getResources().getIdentifier("sp" + i, "raw", getPackageName()) )
            }

            pokedexTotal.add(pokemon)
            Log.d("pokemonPokedex",pokemon.toString())
            pokedexActual.add(Pokemon(i.toShort(), R.drawable.p_desconocido, "???", 1, 1, 2, 0, getResources().getIdentifier("sp" + i, "drawable", getPackageName())))


        }
        /*ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(0)), ActivityContenedor.pokedexTotal.get(0))
        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(4)), ActivityContenedor.pokedexTotal.get(4))
        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(36)), ActivityContenedor.pokedexTotal.get(36))
        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(57)), ActivityContenedor.pokedexTotal.get(57))
        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(63)), ActivityContenedor.pokedexTotal.get(63))
        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(94)), ActivityContenedor.pokedexTotal.get(94))
        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(199)), ActivityContenedor.pokedexTotal.get(199))
        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(571)), ActivityContenedor.pokedexTotal.get(571))
        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(360)), ActivityContenedor.pokedexTotal.get(360))
        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(ActivityContenedor.pokedexActual.get(547)), pokedexTotal.get(547))
        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(pokedexActual.get(43)), pokedexTotal.get(43))
        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(pokedexActual.get(38)), pokedexTotal.get(38))
        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(pokedexActual.get(101)), pokedexTotal.get(101))
        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(pokedexActual.get(132)), pokedexTotal.get(132))
        ActivityContenedor.pokedexActual.set(ActivityContenedor.pokedexActual.indexOf(pokedexActual.get(365)), pokedexTotal.get(365))

         */










        Collections.sort(
            pokedexActual,
             { lhs, rhs -> lhs.numero.compareTo(rhs.numero) })


    }

    fun guardarDatos(db : SQLiteDatabase, contexto : Context) {
        val baseGuardado = db


        baseGuardado.execSQL("DROP TABLE IF EXISTS pokedexActual")
        baseGuardado.execSQL("CREATE TABLE pokedexActual (numero INT primary key, imagen INT, nombre VARCHAR(200), nivel tinyint, siguienteNv INT, vida tinyint, amistad tinyint, sonido INT)")

        for (i in pokedexActual) {
            val registro = ContentValues()
            registro.put("numero", i.numero)
            registro.put("imagen", i.icono)
            registro.put("nombre", i.nombre)
            registro.put("nivel", i.nivel)
            registro.put("siguienteNv", i.siguienteNv)
            registro.put("vida", i.vida)
            registro.put("amistad", i.amistad)
            registro.put("sonido", i.sonido)


            baseGuardado.insert("pokedexActual", null, registro)
        }

        baseGuardado.execSQL("DROP TABLE IF EXISTS mochila")
        baseGuardado.execSQL("CREATE TABLE mochila (icono INT primary key, nombre VARCHAR(200), precio tinyint, cantidad int, esEvolutivo Boolean)")
        for (i in listaInventario) {
            val registro = ContentValues()
            registro.put("icono", i.icono)
            registro.put("nombre", i.nombre)
            registro.put("precio", i.precio)
            registro.put("cantidad", i.cantidad)
            registro.put("esEvolutivo", i.esEvolutivo)

            baseGuardado.insert("mochila", null, registro)
        }

        baseGuardado.execSQL("DROP TABLE IF EXISTS pokemonUsado")
        baseGuardado.execSQL("CREATE TABLE pokemonUsado (numero INT primary key, imagen INT, nombre VARCHAR(200), nivel tinyint, siguienteNv INT, vida tinyint, amistad tinyint, sonido INT)")

        val registroPokemonUsado = ContentValues()
        registroPokemonUsado.put("numero", pokemonUsado.numero)
        registroPokemonUsado.put("imagen", pokemonUsado.icono)
        registroPokemonUsado.put("nombre", pokemonUsado.nombre)
        registroPokemonUsado.put("nivel", pokemonUsado.nivel)
        registroPokemonUsado.put("siguienteNv", pokemonUsado.siguienteNv)
        registroPokemonUsado.put("vida", pokemonUsado.vida)
        registroPokemonUsado.put("amistad", pokemonUsado.amistad)
        registroPokemonUsado.put("sonido", pokemonUsado.sonido)



        baseGuardado.insert("pokemonUsado", null, registroPokemonUsado)
        baseGuardado.close()

        val sharedPreferences = contexto.getSharedPreferences("dinero", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putInt("dinero", dinero)
        editor.apply()

    }

    fun cargarDatos() {
        val baseGuardado = this.openOrCreateDatabase("baseGuardado.db", MODE_PRIVATE, null)

        val cursor: Cursor = baseGuardado.rawQuery("Select name from sqlite_master where type = 'table' and name like 'pokedexActual' ", null)

        if (cursor.count > 0) {
            val cursorPokedex: Cursor = baseGuardado.rawQuery("select numero, imagen, nombre, nivel, siguienteNv, vida, amistad, sonido from pokedexActual", null)

            while (cursorPokedex.moveToNext()) {
                val pokemon = Pokemon(cursorPokedex.getShort(0), cursorPokedex.getInt(1), cursorPokedex.getString(2), cursorPokedex.getShort(3).toByte(), cursorPokedex.getInt(4), cursorPokedex.getShort(5).toByte(), cursorPokedex.getShort(6), cursorPokedex.getInt(7))
                pokedexActual[cursorPokedex.position] = pokemon
            }

            val cursorMochila: Cursor = baseGuardado.rawQuery("select icono, nombre, precio, cantidad, esEvolutivo from mochila", null)

            while (cursorMochila.moveToNext()) {
                val objeto = Objeto(cursorMochila.getInt(0), cursorMochila.getString(1), cursorMochila.getShort(2), cursorMochila.getInt(3), cursorMochila.getInt(4) == 1)
                listaInventario.add(objeto)
            }
            val cursorPokemonUsado: Cursor = baseGuardado.rawQuery("select numero, imagen, nombre, nivel, siguienteNv, vida, amistad, sonido from pokemonUsado", null)

            while (cursorPokemonUsado.moveToNext()) {
                pokemonUsado = Pokemon(cursorPokemonUsado.getShort(0), cursorPokemonUsado.getInt(1), cursorPokemonUsado.getString(2), cursorPokemonUsado.getShort(3).toByte(), cursorPokemonUsado.getInt(4), cursorPokemonUsado.getShort(5).toByte(), cursorPokemonUsado.getShort(6), cursorPokemonUsado.getInt(7))
            }


            val sharedPreferences = baseContext.getSharedPreferences("dinero", Context.MODE_PRIVATE)
            val savedNumber = sharedPreferences.getInt("dinero", 0)


            dinero = savedNumber
        }



        baseGuardado.close()

    }

    fun actualizarBD() {
        val baseGuardado = this.openOrCreateDatabase("baseGuardado.db", MODE_PRIVATE, null)


        baseGuardado.execSQL("ALTER TABLE pokedexActual ADD sonido INT")

        for (i in pokedexActual) {
            val registro = ContentValues()
            registro.put("sonido", i.sonido)

            baseGuardado.insert("pokedexActual", null, registro)
        }

        baseGuardado.execSQL("ALTER TABLE pokemonUsado ADD sonido INT")

        val registroPokemonUsado = ContentValues()
        registroPokemonUsado.put("sonido", pokemonUsado.sonido)

        baseGuardado.insert("pokemonUsado", null, registroPokemonUsado)
        baseGuardado.close()

    }


    override fun onBackPressed() {
    }



}