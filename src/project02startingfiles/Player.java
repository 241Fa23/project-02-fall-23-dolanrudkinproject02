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
public abstract class Player{
    private int health = 10;
    private int score = 0;
    
    public Player(int health, int score){
        this.health = health;
        this.score = score;
    }
    
    public void setHealth(int health){
        this.health = health;
    }
    public int getHealth(){
        return health;
    }
    
    
}
