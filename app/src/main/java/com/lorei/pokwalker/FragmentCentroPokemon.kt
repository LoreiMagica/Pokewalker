package com.lorei.pokwalker

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*


class FragmentCentroPokemon : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_centro_pokemon, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val barraBuscarPokemon: EditText = requireActivity().findViewById(R.id.barraBuscarPokemon)
        val listaPokemon: RecyclerView = requireActivity().findViewById(R.id.lista_inventario)


        val llm = LinearLayoutManager(context)
        val adapter = AdapterlistaPokemon(
            ActivityContenedor.pokedexActual
        )
        barraBuscarPokemon.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable) {
                filter(s.toString(), adapter)
            }
        })

        listaPokemon.layoutManager = llm
        adapter.onItemClick = { pokemon ->
                if (pokemon.nombre == "???") {
                    Toast.makeText(getActivity(), "Aún no tienes a ese pokémon", Toast.LENGTH_SHORT).show()
                } else {
                    ActivityContenedor.pokemonUsado = pokemon
                    Toast.makeText(getActivity(), "Ahora sales de paseo con " + pokemon.nombre, Toast.LENGTH_SHORT).show()

                    val fragmentbase =
                        FragmentBase()
                    val transaction = requireActivity().supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.contenedor, fragmentbase, "ficha")
                    transaction.addToBackStack(null)
                    transaction.commit()
                }
        }



    listaPokemon.adapter = adapter


    }
    private fun filter(text: String, adapter: AdapterlistaPokemon) {
        val filteredList: ArrayList<Pokemon> = ArrayList()
        for (item in ActivityContenedor.pokedexActual) {
            if (item.nombre.lowercase().contains(text.lowercase(Locale.getDefault()))) {
                filteredList.add(item)
            }
        }
        adapter.filterList(filteredList)
    }
}