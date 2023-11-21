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
public class Project02StartingFiles{

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
        if (character.equals("k")){
            //adds new character to array list so we can reference certain variables easily
            stats.add(new Knight(10, 0, "Slash with Sword!"));
            System.out.println("Welcome, Knight!");
            
            //this is the game play loop and you'll code the game in each one. If you can find a more compact way that would be nice but not necassary so just email it to me.
            while (stats.get(0).getHealth() > 0){
                System.out.println("What would you like to do?");
                //add menu of actions around here
                String action = input.nextLine();
            }
        }
        else if (character.equals("w")){
            stats.add(new Wizard(10, 0, "Cast a Spell!"));
            System.out.println("Welcome, Wizard!");
            
            while (stats.get(0).getHealth() > 0){
                System.out.println("What would you like to do?");
                String action = input.nextLine();
            }
        }
        else if (character.equals("h")){
            stats.add(new Healer(10, 0, "Use Sleeping Powder!"));
            System.out.println("Welcome, Healer!");
            
            while (stats.get(0).getHealth() > 0){
                System.out.println("What would you like to do?");
                String action = input.nextLine();
            }
        }
        else if (character.equals("t")){
            stats.add(new Theif(10, 0, "Sneak By!"));
            System.out.println("Welcome, Theif!");
            
            while (stats.get(0).getHealth() > 0){
                System.out.println("What would you like to do?");
                String action = input.nextLine();
            }
        }
        else{
            System.out.println("No option was selected please try again.");
        }
        


    }


     
}
