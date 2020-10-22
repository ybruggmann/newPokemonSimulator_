

import java.util.ArrayList;

public class PokemonProvider {

    private ArrayList<Pokemon> pokemonArrayList;

    public PokemonProvider() {


        pokemonArrayList = new ArrayList<>();

        Attacken wasserpumpe = new Attacken("Wasser", "Wasserpumpe", 30, true);
        Attacken feuerstrum = new Attacken("Feuer", "Feuersturm", 30, false);
        Attacken blättertanz = new Attacken("Pflanze", "Blättertanz", 30, true);

        Pokemon pokemon = new Pokemon("Plups", "Wasser", 100, 1, 30, 40, 40, 30, wasserpumpe);
        Pokemon pokemon2 = new Pokemon("Chubbs", "Feuer", 90, 1, 50, 30, 40, 30, feuerstrum);
        Pokemon pokemon3 = new Pokemon("Sive", "Pflanze", 110, 1, 20, 80, 40, 30, blättertanz);
        Pokemon pokemon4 = new Pokemon("Skurr", "Wasser", 100, 1, 25, 75, 40, 30, wasserpumpe);
        Pokemon pokemon5 = new Pokemon("Piper", "Feuer", 100, 1, 60, 20, 40, 30, feuerstrum);
        Pokemon pokemon6 = new Pokemon("Surge", "Pflanze", 105, 1, 40, 40, 40, 30, blättertanz);

        pokemonArrayList.add(pokemon);
        pokemonArrayList.add(pokemon2);
        pokemonArrayList.add(pokemon3);
        pokemonArrayList.add(pokemon4);
        pokemonArrayList.add(pokemon5);
        pokemonArrayList.add(pokemon6);


    }

    public ArrayList<Pokemon> givePokemonList() {
        return pokemonArrayList;
    }

    public int returnPokemonNumbers() {
        return pokemonArrayList.size();
    }

}
