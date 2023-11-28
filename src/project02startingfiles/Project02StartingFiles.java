/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project02startingfiles;

import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author
 */
public class Project02StartingFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //area for variables and things like that
        Scanner input = new Scanner(System.in);
        ArrayList<Player> stats = new ArrayList<>();

        //Welcome to the game
        System.out.println("Welcome to JavaQuest!");
        System.out.println("Stay alive and increase your score!");

        //Character selection
        System.out.println("Choose your character...");
        System.out.println("{k}Knight || {h}Healer || {w}Wizard || {t}Theif");
        System.out.print(">>");
        String character = input.nextLine();

        //Character selection results
        if (character.equals("k")) {
            //adds new character to array list so we can reference certain variables easily
            stats.add(new Knight(10, 0, "Slash with Sword!"));
            System.out.println();
            System.out.println("Welcome, Knight!");
            System.out.println();

            //this is the game play loop and you'll code the game in each one. If you can find a more compact way that would be nice but not necassary so just email it to me.
            do {
                System.out.println("What would you like to do?");
                displayMenu();
                menuActions(stats);
            } while (stats.get(0).getHealth() > 0);
        } else if (character.equals("w")) {
            stats.add(new Wizard(10, 0, "Cast a Spell!"));
            System.out.println();
            System.out.println("Welcome, Wizard!");
            System.out.println();

            do {
                System.out.println("What would you like to do?");
                displayMenu();
                menuActions(stats);
            } while (stats.get(0).getHealth() > 0);
        } else if (character.equals("h")) {
            stats.add(new Healer(10, 0, "Use Sleeping Powder!"));
            System.out.println();
            System.out.println("Welcome, Healer!");
            System.out.println();

            do {
                System.out.println("What would you like to do?");
                displayMenu();
                menuActions(stats);
            } while (stats.get(0).getHealth() > 0);
        } else if (character.equals("t")) {
            stats.add(new Theif(10, 0, "Sneak By!"));
            System.out.println();
            System.out.println("Welcome, Theif!");
            System.out.println();

            do {
                System.out.println("What would you like to do?");
                displayMenu();
                menuActions(stats);
            } while (stats.get(0).getHealth() > 0);

        } else {
            System.out.println("No option was selected please try again.");
        }

    }

    private static void displayMenu() {

        System.out.println();
        System.out.println("{r} Status Report || {n}{s}{e}{w} Move one space North, South, East,or  West || {q} Quit");
        System.out.print(">> ");

    }

    private static void menuActions(ArrayList<Player> stats) {
        Scanner input = new Scanner(System.in);
        String action = input.nextLine();

        if (action.equals("r")) {
            for (Object e : stats) {
                System.out.println();
                System.out.println(e);
            }
            System.out.println();
        } else if (action.equals("n") || action.equals("s") || action.equals("e") || action.equals("w")) {
            handleMove(stats.get(0), action);
        } else if (action.equals("q")) {
            System.out.println();
            endGame(stats);
        } else {
            System.out.println("Wrong input try, agian");
        }
    }

    private static void handleMove(Player player, String direction) {
        Random random = new Random();

        //80% chance of a benign scene, 20% chance of a attack
        if (random.nextDouble() < 0.8) {
            handleBenignScene(player);
        } else {
            handleAttack(player);
        }
    }

    private static void handleBenignScene(Player stats) {
        Random random = new Random();
        //Possible benign scenes
        String[] scenes = {"Nothing here...", "Nice trees around here", "Interesting cottage there...", "Crossing a stream", "Cute Animals..."};
        int index = random.nextInt(scenes.length);

        System.out.println("*******************");
        System.out.println(scenes[index]);
        System.out.println("*******************");

        stats.increasedScore(1);
        System.out.println(stats.toString());
        System.out.println();

    }

    private static void handleAttack(Player player) {
        Random random = new Random();

        //Possible foes
        String[] foes = {"Zombie", "Bandit", "Wild Animal"};
        int index = random.nextInt(foes.length);
        String foe = foes[index];

        System.out.println("Oh no! You are being attack by a " + foe + "!");

        System.out.println("How would you like to handle this?");
        System.out.println("(s) Special Move");
        System.out.println("(r) Run anway");
        System.out.print(">> ");

        char choice = new Scanner(System.in).next().charAt(0);

        if (choice == 'r' && random.nextDouble() < 0.5) {
            System.out.println("You successfuly run away! Score increased by 1.");
        } else {
            System.out.println("Prepare for battle! \nPress any letter then ENTER to continure...");
            new Scanner(System.in).next(); //Wait for user input
            System.out.println("*******************************");

            //Simulate battle outcome
            if (random.nextDouble() < 0.6) {
                //Something like this to get class?
                System.out.println();
                player.useSpecialMove();
                System.out.println("Player wins! Score increased by 2");
                player.increasedScore(2);
            } else {
                System.out.println("You lose the battle! Health decreased by 1.");
                player.decreaseHealth(1);
            }
        }
        System.out.println();
        System.out.println(player.toString());

    }

    public static void endGame(ArrayList stats) {

        System.out.println("*******************************");
        System.out.println("*******************************");
        System.out.println("The game has come to an end! Your final stats:");
        for (Object e : stats) {
            System.out.println(e);
        }
        System.out.println("Thanks for playing!");
    }

}
