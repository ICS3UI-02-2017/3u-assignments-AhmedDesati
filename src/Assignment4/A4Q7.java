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
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // make a scanner to collect info from the user 

        Scanner Input = new Scanner(System.in);


        // add a player and a dice

        int player = 0;
        

        // add a loop for the rolling of the dice
        while (true) {
            System.out.println(" enter the sum of the dice  ");


            // add a loop to make sure the player enters the right number 
            int dice = Input.nextInt();
            if (dice < 0 || dice > 12 || dice == 1) {

                System.out.println(" Please enter the Right value from 2 to 12");
            } // if the player types in 0 they quit the game
            else if (dice == 0) {

                System.out.println(" You Quit ");
            }
            // add a dice that ranges from 2 - 12
            if (dice <= 12 && dice >= 2) {
                player = player + dice;

                System.out.println(" You are now on square " + player);

            } // add three snakes that send the player back if they land on them
            else if (player == 54) {
                player = 54 - 38;
                System.out.println(" You landed on a snake you are now on square 19 :( ");

            } else if (player == 90) {
                player = 90 - 42;
                System.out.println(" You landed on a snake you are now on square 48 :( ");
            } else if (player == 99) {
                player = 99 - 13;
                System.out.println(" You landed on a snake you are now on square 77 :( ");
                // add three ladders that increases the players position if they land on them   
                if (player == 9) {
                    player = 9 + 25;
                    System.out.println(" You climbed up a ladder you are now on square 34 :) ");

                } else if (player == 40) {
                    player = 40 + 24;
                    System.out.println(" You climbed up a ladder you are now on square 64 :) ");

                } else if (player == 67) {
                    player = 67 + 19;
                    System.out.println(" You climbed up a ladder you are now on square 86 :) ");

                    
                }

            }// if the player lands on square 100 they win the game
if (player >= 100){
            System.out.println(" youve finished the game 100 YOU WIN!");
        }
          

            


        }

    }
}
