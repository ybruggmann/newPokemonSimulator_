
import java.util.Random;

public class GegnerErsteller {

    private Random randomGenerator;
    private PokemonProvider pokemonProvider;


    public GegnerErsteller() {
        this.pokemonProvider = new PokemonProvider();
        randomGenerator = new Random();
    }

    public Pokemon erstelleGegner() {
        int randomInt = randomGenerator.nextInt(pokemonProvider.returnPokemonNumbers() - 1);
        return pokemonProvider.givePokemonList().get(randomInt);
    }

}
