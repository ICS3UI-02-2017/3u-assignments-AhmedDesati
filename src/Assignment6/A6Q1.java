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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner to read info from the user
        
        Scanner input = new Scanner(System.in);
        
        
        // create an array to store the mark the user types in
        int[] marks = new int[3];
        // ask how many students are in the class
        System.out.println(" Type in the marks of 3 students in the class to find the average of them");
       
        
      
      // keep looking through the array
        for (int i = 0; i < marks.length; i++) {
          
     
          marks[i] = input.nextInt();
             
       // add the 3 marks together and divide them by 3
    }
        for (int i = 0; i < marks.length; i++) {
            
        }
        
        int average =( marks[0] + marks[1] + marks[2]) /3;
        // show the user thier average 
    
    System.out.println(" Your avarage is class average is  " + average);
       
        
      
        
    }
}
