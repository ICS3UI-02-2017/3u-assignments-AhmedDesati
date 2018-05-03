/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author Desaa3902
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static double compoundInterest(double P, double I, int Y) {
         
        
        double B = 0;
        // make the equation 
          B= (Math.pow (I + 1, Y))*P;
        // return the answer
        return B;
    }

    public static void main(String[] args) {

        // make a scanner
        
        Scanner input = new Scanner(System.in);
    
        // ask the user for the principal amount, interest rate and the number of years 
        
        System.out.println(" Enter the principal amount");
        double P = input.nextInt();
       
        System.out.println(" Enter the Interest rate ");
        double I = input.nextDouble();
        
        System.out.println(" Enter the number of years ");
        int Y = input.nextInt();
        
        
        // get the equation from the method called compound interest 
        double ci = compoundInterest(P ,I ,Y );
        // show the user their compound interest amount
        System.out.println(" Your compound interest =" + ci );
        
    } 
}
