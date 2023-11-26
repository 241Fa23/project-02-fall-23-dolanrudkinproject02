/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project02startingfiles;

/**
 *
 * @author s566210
 */
public class Knight extends Player {

    private String specialMove;

    public Knight(int health, int score, String specialMove) {
        super(health, score);
        this.specialMove = specialMove;
    }

    @Override
    public String getSpecialMove() {
        return "Slash with Sword!";
    }

    @Override
    public void useSpecialMove() {
        System.out.println("The Knight slashes with their sword!");
    }

    @Override
    public String toString() {
        return "Knight Status: Health: " + getHealth() + " Score: " + getScore() + "\nThe Knight's special move is '" + getSpecialMove() + "'";
    }
}
