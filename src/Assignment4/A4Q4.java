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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        
        // make a scanner to collect user information
        
        Scanner cost = new Scanner(System.in);
        
        // ask the user what are the expenses for the prom
        
        System.out.println(" How much does the food for prom cost? please type cost below ");

        Float price = cost.nextFloat();
        
        System.out.println(" How much does the DJ cost? ");

        Float price2 = cost.nextFloat();
        
        System.out.println(" How much does it cost to rent the hall? ");

        Float price3 = cost.nextFloat();
        
        System.out.println(" How much does decorations cost? ");
        
        Float price4 = cost.nextFloat();
        
        System.out.println(" How much does it cost for staff? ");
        
        Float price5 = cost.nextFloat();
        
        System.out.println(" How much for miscellaneous costs? ");
        
        Float price6 = cost.nextFloat();
        
        
        
        // find out the total amount of expenses
        
        System.out.println(" Your total cost is " +(price + price2 + price3 + price4 + price5 + price6));
        
        
        
        // find out how many tickets you would need to break even if one ticket is 35$
        
        System.out.println();
        System.out.println(" You would need to sell "+( (price + price2 + price3 + price4 + price5 + price6) / 35 )+ " Tickets To Break even " );
         
        
        
       
        

        
        
        
        
        
        
        
    }
}
