/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project02startingfiles;

/**
 *
 * @author s566210
 */
public class Theif extends Player {

    private String specialMove;

    public Theif(int health, int score, String specialMove) {
        super(health, score);
        this.specialMove = specialMove;
    }

    @Override
    public String getSpecialMove() {
        return "Sneak By!";
    }

    @Override
    public void useSpecialMove() {
        System.out.println("The Thief sneaks right past them");
    }

    @Override
    public String toString() {
        return "Thief Status: Health: " + getHealth() + "\nScore: " + getScore() + "\nThe Thief's special move is '" + getSpecialMove() + "'";
    }
}
