/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project02startingfiles;

/**
 *
 * @author s566210
 */
public class Healer extends Player {

    private String specialMove;

    public Healer(int health, int score, String specialMove) {
        super(health, score);
        this.specialMove = specialMove;
    }

    @Override
    public String getSpecialMove() {
        return "Use Sleeping Powder!";
    }

    @Override
    public void useSpecialMove() {
        System.out.println("The Healer uses sleeping powder to pacify the surroundings.");
    }

    @Override
    public String toString() {
        return "Healer Status: \nHealth: " + getHealth() + "\nScore: " + getScore() + "\nThe Healers special move is '" + getSpecialMove() + "'";
    }
}
