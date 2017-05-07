/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doubledice;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author kendrabooker
 */
public class DoubleDice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        
        int roll1, roll2;
        roll1 = 1 + r.nextInt(6);
        roll2 = 1 + r.nextInt(6);
        
        do{
            System.out.println("Here comes the dice\n" + "Roll 1: " + roll1 + "\n" + "Roll 2: " + roll2 + "\n" + "the total is " + (roll1 + roll2));
            roll1 = 1 + r.nextInt(6);
            roll2 = 1 + r.nextInt(6);
            if(roll1 == roll2){
            
            System.out.println("Doubles!\n" + "Roll 1: " + roll1 + "\n" + "Roll 2: " + roll2 + "\n" + "the total is " + (roll1 + roll2));
        }
        }while(roll1 != roll2);
        
        //if(roll1 == roll2){
            
      //      System.out.println("Doubles!\n" + "Roll 1: " + roll1 + "\n" + "Roll 2: " + roll2 + "\n" + "the total is " + (roll1 + roll2));
        //}
        
    }
    
}
