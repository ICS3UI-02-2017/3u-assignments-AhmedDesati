/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author Desaa3902
 */
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        // make a scanner     
        Scanner input = new Scanner(System.in);
        // ask the user how many peoples hieghts does the computer need to collect
        System.out.println(" How many people ?");

        // get the number that the user typed in and the change the array spaces

        int People = input.nextInt();


        // ask the user to type in their friends hieghts now 
        System.out.println(" how tall are your friends");
        // make an array that has an equal amount of spaces to what the user typed in
        double[] heights = new double[People];

        // get information into the array

        for (int i = 0; i < heights.length; i++) {

            heights[i] = input.nextDouble();


        }
        // make a int set to 0 so you can add stuff to it 
        double total = 0;
        // make a for loop to keep going through the numbers 
        for (int i = 0; i < heights.length; i++) {

            total = (total + heights[i]);

        }
        // divide the total by three

        total = total / 3;

        // show the user what the hieght average is  

        System.out.println(" The average hieghts of your friends are " + total + " feet ");
        System.out.println("");

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] <= 5.10);
            double tallest = heights[i];

            System.out.println(" Your friend who is " + tallest + " feet tall and is above 5.10 is above average ");

        }
    }
}
