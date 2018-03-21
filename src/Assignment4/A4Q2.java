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
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // ask the user to input the measurment they want to convert
       
        System.out.println(" Please enter the measurment in iches you wish to convert ");
        
        Scanner input = new Scanner(System.in);
        
                          
        // make a string to store the information of inches 
        Float inches = input.nextFloat() ;
        
        
        System.out.println(inches * 2.54);
        
        double num = 2.56;
        num = Math.round(num);
        
        // tell the user how much centimeters he got 
        
        System.out.println(" The number of centimeters is " + inches );
        
        
    }
}
