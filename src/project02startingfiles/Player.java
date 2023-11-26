/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project02startingfiles;

/**
 *
 * @author s566210
 */
// extends Wizard, Healer, Theif, Knight
public abstract class Player {

    private int health;
    private int score;

    public Player(int health, int score) {
        this.health = health;
        this.score = score;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public abstract String getSpecialMove();

    public abstract void useSpecialMove();

    public void increasedScore(int points) {
        this.score += points;
    }

    public void decreaseHealth(int health) {
        this.health -= health;
    }

    @Override
    public abstract String toString();

}
