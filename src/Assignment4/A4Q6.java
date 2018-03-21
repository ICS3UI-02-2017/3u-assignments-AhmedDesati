/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author Desaa3902
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
// ask tge user what is the speed limit
        System.out.println(" Enter the speed limit : ");
        float limit = Input.nextFloat();
// ask the user how fast were they going
        System.out.println(" Enter the recorded speed of the car: ");
        float speed = Input.nextFloat();
// subract the limit from the speed
        float difference = speed - limit;

        
        
        //if they are not speeding tell the user
        if (difference <= 0) {

            System.out.println("Congratulations, you are within the speed limit!");
        } // if the user is going 20 above the limit give them a 100$ fine
        else if (difference >= 1 && difference <= 20) {
            System.out.println(" You are speeding and your fine is 100$.");


// if the user is going 21 - 30 above the limit give them a 270 dollar fine
        } else if (difference >= 21 && difference <= 30) {
            System.out.println(" You are speeding and your fine is 270$.");
        }
// if the user is going 31 and above the speed limit give them a 500$ fine

        else if (difference >= 31) {
       System.out.println("You are speeding and your fine is 500$.");

            System.out.println(difference);

        }
    }
}
