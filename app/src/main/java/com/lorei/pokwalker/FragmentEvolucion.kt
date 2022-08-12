package com.lorei.pokwalker

import android.graphics.drawable.TransitionDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide


class FragmentEvolucion : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_evolucion, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var imagenPokemon = requireView().findViewById<ImageView>(R.id.icono_pokemon_previo)
        var imagenPokemonEvolucionado = requireView().findViewById<ImageView>(R.id.icono_pokemon_evolucionado)

        Glide.with(requireActivity())
            .load(ActivityContenedor.pokemonUsado.icono)
            .into(imagenPokemon)

        //Glide.with(requireActivity())
          //  .load(ActivityContenedor.pokemonEvolucionado.icono)
            //.into(imagenPokemonEvolucionado)

        val listaPokemon = arrayOf(resources.getDrawable(ActivityContenedor.pokemonUsado.icono), resources.getDrawable(ActivityContenedor.pokemonUsado.icono))
        val crossfader = TransitionDrawable(listaPokemon)

        imagenPokemon.setImageDrawable(crossfader)

        crossfader.setCrossFadeEnabled(true);

        crossfader.startTransition(3000); //The animation starts slow
        crossfader.reverseTransition(3000);
        crossfader.startTransition(2000);//It gets faster slow
        crossfader.reverseTransition(2000);
        crossfader.startTransition(1000); //And faster
        crossfader.reverseTransition(1000);

    }

}


