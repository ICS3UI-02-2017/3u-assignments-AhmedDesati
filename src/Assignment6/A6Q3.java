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
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int num1 = 0;

        // make an array with two spots
        int[] array = new int[2];

        // ask the user for two numbers
        System.out.print(" Enter your two nubmers:");
       

        array[0] = input.nextInt();
        array[1] = input.nextInt();
        
        
            if (array[0] > array[1]) {

                num1 = array[0];
                
                array[0] = array[1];
                
              array[1] = num1;
              




            }
            System.out.println(" Your numbers in asending order are " + array[0] + "," + array[1]);



        }






    }

