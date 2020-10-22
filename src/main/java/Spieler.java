

import java.util.ArrayList;
import java.util.Iterator;


public class Spieler {

    ArrayList<Pokemon> meinTeam = new ArrayList<Pokemon>();

    public void addPokemon(Pokemon pokemon) {
        if (meinTeam.size() < 6) {
            meinTeam.add(pokemon);
        } else {
            System.out.println("Dein Team ist bereits voll");
        }
    }

    public void removePokemon(String name) {

        Pokemon pokemon;
        Iterator<Pokemon> pokemonIterator = meinTeam.iterator();

        while (pokemonIterator.hasNext()) {
            pokemon = pokemonIterator.next();

            if (pokemon.getName().equals(name)) {
                pokemonIterator.remove();
            }
        }

    }

    public void showTeam() {

        for (Pokemon pokemon : meinTeam) {

            System.out.println(meinTeam.indexOf(pokemon) + "  " + pokemon.toString());

        }

    }

    public ArrayList<Pokemon> givemeinTeam() {
        return meinTeam;
    }

    public ArrayList<Pokemon> getMeinTeam() {
        return meinTeam;
    }
}
