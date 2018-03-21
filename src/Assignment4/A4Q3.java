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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        // ask the user to type in 4 lines of numbers 
        
        System.out.println(" Please enter in 4 numbers on separate lines ");
        
        // make a scanner to read what the user tell us 
        
        Scanner number = new Scanner(System.in);
        
        // make a group of strings to store 4 lines of numbers the user tells us 
        
        
        String num1 = number.nextLine();
        String num2 = number.nextLine();
        String num3 = number.nextLine();
        String num4 = number.nextLine();
         
        
       // use the system to tell what numbers the user typed in 
       System.out.println(" Your numbers were " + num1 + "," + num2 + "," + num3 + " and " + num4 );
       
       System.out.println(" Have a nice Day :) ");
         
        
        
        
        
        
               
    }
    
    
    
}
