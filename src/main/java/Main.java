

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean gewähltesPokemonx = false;
        Pokemon gewähltesPokemon = null;


        Spieler spieler = new Spieler();
        PokemonAbilities pokemonAbilities = new PokemonAbilities(spieler);
        PokemonProvider pokemonProvider = new PokemonProvider();
        GegnerErsteller gegnerErsteller = new GegnerErsteller();


        spieler.addPokemon(pokemonProvider.givePokemonList().get(0));
        Pokemon gegnerPokemon = gegnerErsteller.erstelleGegner();
        pokemonAbilities.setGegnerPkmn(gegnerPokemon);


        int choice = 0;

        do {

            System.out.println("____________________________");
            System.out.println("|What would you like to do?|");
            System.out.println("|__________________________|");
            System.out.println("|                          |");
            System.out.println("|   Fight          [1]     |");
            System.out.println("|__________________________|");
            System.out.println("|                          |");
            System.out.println("|   Shop           [2]     |");
            System.out.println("|__________________________|");
            System.out.println("|                          |");
            System.out.println("|   Quit           [3]     |");
            System.out.println("|__________________________|");

            choice = scan.nextInt();
            switch (choice) {
                case 1:

                    System.out.println("~Welcome To The Arena Trainer~");

                    do {
                        System.out.println("____________________________");
                        System.out.println("|What would you like to do?|");
                        System.out.println("|__________________________|");
                        System.out.println("|                          |");
                        System.out.println("|   Attack         [1]     |");
                        System.out.println("|__________________________|");
                        System.out.println("|                          |");
                        System.out.println("|   Select Pokemon [2]     |");
                        System.out.println("|__________________________|");
                        System.out.println("|                          |");
                        System.out.println("|   Heal Pokemon   [3]     |");
                        System.out.println("|__________________________|");
                        System.out.println("|                          |");
                        System.out.println("|   Catch Pokemon  [4]     |");
                        System.out.println("|__________________________|");
                        System.out.println("|                          |");
                        System.out.println("|   View Stats     [5]     |");
                        System.out.println("|__________________________|");
                        System.out.println("|                          |");
                        System.out.println("|   Quit Fight     [6]     |");
                        System.out.println("|__________________________|");

                        choice = scan.nextInt();
                        switch (choice) {

                            case 1:
                                if (gewähltesPokemon == null) {
                                    System.out.println("You haven't selected a Pokemon yet.");
                                    System.out.println("Please select one.");
                                    spieler.showTeam();
                                    choice = scan.nextInt();

                                    for (int i = 0; i < 6; i++) {
                                        if (choice == i) {
                                            gewähltesPokemon = spieler.getMeinTeam().get(i);
                                            pokemonAbilities.setGewähltesPokemon(gewähltesPokemon);
                                            gewähltesPokemonx = true;
                                        }
                                    }
                                    if (!gewähltesPokemonx) {
                                        System.out.println("Falscher Input");
                                    }
                                } else {
                                    pokemonAbilities.attack();
                                }
                                break;

                            case 2:
                                spieler.showTeam();
                                choice = scan.nextInt();

                                for (int i = 0; i < 6; i++) {
                                    if (choice == i) {
                                        gewähltesPokemon = spieler.getMeinTeam().get(i);
                                        pokemonAbilities.setGewähltesPokemon(gewähltesPokemon);
                                        gewähltesPokemonx = true;
                                    }
                                }
                                if (!gewähltesPokemonx) {
                                    System.out.println("Falscher Input");
                                }

                                break;

                            case 3:

                                pokemonAbilities.healPokemon();
                                break;
                            case 4:

                                pokemonAbilities.catchPokemon();
                                pokemonAbilities.setGegnerPkmn(gegnerErsteller.erstelleGegner());
                                break;

                            case 5:

                                pokemonAbilities.showStats();
                                break;

                            case 6:
                                System.out.println("Du hast den Kampf verlassen");
                                break;

                            default:
                                System.out.println("Invalid Input, please try again");
                                break;
                        }
                    } while (choice != 6);
                    break;

                case 2:
                    int choice2 = 0;
                    do {
                        System.out.println("What do you want to buy");
                        System.out.println("____________________________");
                        System.out.println("|                          |");
                        System.out.println("|   PokeBalls      [1]     |");
                        System.out.println("|__________________________|");
                        System.out.println("|                          |");
                        System.out.println("|   HealPotions    [2]     |");
                        System.out.println("|__________________________|");
                        System.out.println("|                          |");
                        System.out.println("|   Quit Shop      [3]     |");
                        System.out.println("|__________________________|");


                        choice2 = scan.nextInt();
                        switch (choice2) {
                            case 1:
                                pokemonAbilities.buyBalls();
                                break;

                            case 2:
                                pokemonAbilities.buyPotions();
                                break;

                            case 3:
                                break;

                        }

                    } while (choice2 != 3);
                    continue;
            }

        } while (choice != 3);


    }

}

