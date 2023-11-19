/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project02startingfiles;
import java.util.*;
/**
 *
 * @author 
 */
public class Project02StartingFiles extends Player{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to JavaQuest!");
        System.out.println("Stay alive and increase your score!");
        
        System.out.println("Choose your character...");
        System.out.println("{k}Knight || {h}Healer || {w}Wizard || {t}Theif");
        String character = input.nextLine();
        
        if (character.equals("k")){
        System.out.println("Welcome, Knight!");
    }
        else if (character.equals("w")){
            System.out.println("Welcome, Wizard!");
        }
        else if (character.equals("h")){
            System.out.println("Welcome, Healer!");
        }
        else if (character.equals("t")){
            System.out.println("Welcome, Theif!");
        }
        else{
            System.out.println("No option was selected please try again.");
        }
//        
//       While (health > 0){
//            System.out.println("What would you like to do?");
//       }
    }
}
