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
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // tell the user to tell there name
        System.out.println(" Please Enter Your Name Below ");
        
        
        Scanner input = new Scanner(System.in);
        
        String name = input.nextLine();
        // tell the system to say hello to the user 
        System.out.println(" Hello " + name );
        
    }
}
