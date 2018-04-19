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
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // ask the user whats the size of the class

        System.out.println(" What is the size of the class");

        // get the number of the class size

        int size = input.nextInt();

        // set an array to the number of the class suze 

        double arr[] = new double[size];
        // ask the user to type in numbers 

        System.out.println(" Type in your marks ");

        // make a for loop to look through the numbers and find the smallest number

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextDouble();

        }

        double lowest = 0;
        
        double highest =0;

        double total = 0;
        // make a for loop to look through the marks
        for (int i = 0; i < arr.length; i++) {

            for (int j = 1; j < (arr.length - i); j++) {
                // swap the numbers at position j if position j is bigger than the next number
                if (arr[j - 1] > arr[j]) {
                    lowest = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = lowest;
                   lowest = arr[0];
                    highest = arr[i];
                }

               
            }
        }

        
        System.out.println(" Your lowest mark is " + lowest);
        System.out.println(" Your highest mark is " + arr[arr.length - 1]);


        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];

            
        }total = total / size;
        System.out.println(" Your average mark is " + total);




    }
}
