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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // make a scanner to read input from the user 
        Scanner input = new Scanner(System.in);


        double[] marks = new double[10];

        // ask the user to type in their makrs
        System.out.println(" Type in your marks now ");

        // fill in the array with marks by getting the marks from the user 
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextDouble();


        }

        // make an empty double
        double num = 0;
        // make a for loop to look through the marks
        for (int i = 0; i < 100; i++) {
            // lo
            for (int j = 1; j < (marks.length - i); j++) {
                // swap the makrs at position j if position j is bigger than the next number
                if (marks[j - 1] > marks[j]) {
                    num = marks[j - 1];
                    marks[j - 1] = marks[j];
                    marks[j] = num;

                }

            }
        }
        // show the user their marks in order from lowest to highest
        System.out.println(" Your marks in order from lowest to highest is: ");
        // make a for loop to output to the user the changed positions of marks in order 
        for (int s = 0; s < 10; s++) {
            System.out.print(marks[s] + ", ");
        }

    }
}
