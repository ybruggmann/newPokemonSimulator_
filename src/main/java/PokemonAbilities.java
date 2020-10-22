
import java.util.ArrayList;

public class PokemonAbilities {

    Spieler spieler;
    private int damage = 0;
    int healPotion = 20;
    int pokeBall = 20;
    Pokemon gewähltesPokemon;
    int meinPKMNmaxHealth = 0;
    Pokemon gegnerPkmn;

    public PokemonAbilities(Spieler spieler) {

        this.spieler = spieler;

    }

    public void attack() {

        System.out.println(gewähltesPokemon.getName() + ", use " + gewähltesPokemon.getAttacke().getName());
        System.out.println(gegnerPkmn.getName() + ", use " + gegnerPkmn.getAttacke().getName());

        if (gewähltesPokemon.getAttacke().isPhysisch() == true) {

            damage = gegnerPkmn.getHP() - (gewähltesPokemon.getAtk() * gewähltesPokemon.getAttacke().getStärke() / gegnerPkmn.getDef() / 8);
            gegnerPkmn.setHP(damage);

        } else {

            damage = gegnerPkmn.getHP() - (gewähltesPokemon.getSpatk() * gewähltesPokemon.getAttacke().getStärke() / gegnerPkmn.getSpdef() / 8);
            gegnerPkmn.setHP(damage);

        }

        if (gegnerPkmn.getAttacke().isPhysisch() == true) {

            damage = gewähltesPokemon.getHP() - (gegnerPkmn.getAtk() * gegnerPkmn.getAttacke().getStärke() / gewähltesPokemon.getDef() / 8);
            gewähltesPokemon.setHP(damage);

        } else {

            damage = gewähltesPokemon.getHP() - (gegnerPkmn.getSpatk() * gegnerPkmn.getAttacke().getStärke() / gegnerPkmn.getSpdef() / 8);
            gewähltesPokemon.setHP(damage);

        }

    }

    public void catchPokemon() {

        if (pokeBall > 0) {
            System.out.println("*throws PokeBall*");
            spieler.getMeinTeam().add(gegnerPkmn);
            System.out.println("Congrats you captured " + gegnerPkmn.getName());
            pokeBall--;
        }
    }

    public void healPokemon() {

        if (healPotion > 0) {
            gewähltesPokemon.setHP(meinPKMNmaxHealth);
            System.out.println("HP is wieder auf MAX");
            healPotion--;
        }
    }

    public void showStats() {

        System.out.println("__________________________________________");
        System.out.println("|These are " + gewähltesPokemon.getName() + "'s (Allied Pokemon) Stats: ");
        System.out.println("|_________________________________________");
        System.out.println("|HP: " + gewähltesPokemon.getHP());
        System.out.println("|Attack: " + gewähltesPokemon.getAtk());
        System.out.println("|Special Attack: " + gewähltesPokemon.getSpatk());
        System.out.println("|Defense: " + gewähltesPokemon.getDef());
        System.out.println("|Special Defense: " + gewähltesPokemon.getSpdef());
        System.out.println("|Level: " + gewähltesPokemon.getLevel());
        System.out.println("|Primary attack strength: " + gewähltesPokemon.getAttacke().getStärke());
        System.out.println("|Primary attack type: " + gewähltesPokemon.getAttacke().getTyp());
        System.out.println("|_________________________________________");
        System.out.println("|These are " + gegnerPkmn.getName() + "'s (Enemy Pokemon) Stats: ");
        System.out.println("|_________________________________________");
        System.out.println("|HP: " + gegnerPkmn.getHP());
        System.out.println("|Attack: " + gegnerPkmn.getAtk());
        System.out.println("|Special Attack: " + gegnerPkmn.getSpatk());
        System.out.println("|Defense: " + gegnerPkmn.getDef());
        System.out.println("|Special Defense: " + gegnerPkmn.getSpdef());
        System.out.println("|Level: " + gegnerPkmn.getLevel());
        System.out.println("|Primary attack strength: " + gegnerPkmn.getAttacke().getStärke());
        System.out.println("|Primary attack type: " + gegnerPkmn.getAttacke().getTyp());

    }


    public void buyBalls() {
        pokeBall = +5;
    }

    public void buyPotions() {
        healPotion = +5;
    }


    public void setGewähltesPokemon(Pokemon gewähltesPokemon) {
        this.gewähltesPokemon = gewähltesPokemon;
        this.meinPKMNmaxHealth = gewähltesPokemon.getHP();
    }

    public void setGegnerPkmn(Pokemon gegnerPkmn) {
        this.gegnerPkmn = gegnerPkmn;
    }


}
