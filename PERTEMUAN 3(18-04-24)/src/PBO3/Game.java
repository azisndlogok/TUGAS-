/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO3;

/**
 *
 * @author HP
 */
public class Game {
     public static void main(String[] args) {
        player petani = new player();
        
        petani.name = "RIKA SEPTIANA";
        petani.speed = 45;
        petani.healthPoin = 0;
        
        petani.run();
        
        if(petani.isDead())
        {
            System.out.println("Game Over!");
        }
    }
}

