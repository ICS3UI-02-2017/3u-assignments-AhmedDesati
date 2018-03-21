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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                        
                
        System.out.print(" Please enter your name :");
        System.out.println("");
                       
        // make a scanner to collect info from the user 
                
        Scanner Input = new Scanner(System.in);
                
        // ask the user what is thier name
        
        String name = Input.nextLine();
        
        // ask the user what the first test was out of 
        
             
        System.out.print(" What was the first test out of: ");
        float Test1 = Input.nextFloat();
        
        System.out.print(" What mark did you get: ");
        float Mark1 = Input.nextFloat();
        
        // ask the user about the second test
        System.out.println("");
        System.out.print(" What was the Second test out of: ");
        float Test2 = Input.nextFloat();
       
        System.out.print(" What mark did you get: ");
        float Mark2 = Input.nextFloat();
        
        
        // ask the user about the third test 
        System.out.println("");
        System.out.print(" What was the Third test out of :");
        float Test3 = Input.nextFloat();
       
        System.out.print(" What mark did you get :");
        float Mark3 = Input.nextFloat();
        
        
        // ask the user about the fourth test 
        System.out.println("");
        System.out.print(" What was the Fourth test out of: ");
        float Test4 = Input.nextFloat();
      
        System.out.print(" What mark did you get: ");
        float Mark4 = Input.nextFloat();
        
        
        // ask the user about the fifth test 
        System.out.println("");
        System.out.print(" What was the Fourth test out of: ");
        float Test5 = Input.nextFloat();
       
        System.out.print(" What mark did you get: ");
        float Mark5 = Input.nextFloat();
        
       
        
        //tell the user what was thier percentages for thier tests 
        
        System.out.println(" Test Scores for " + name);
        System.out.println("");
        
        float percent1 = Mark1 / Test1;
        float percent2 = Mark2 / Test2;
        float percent3 = Mark3 / Test3;
        float percent4 = Mark4 / Test4;
        float percent5 = Mark5 / Test5;
        
        
        
        System.out.println(" Test1: " + percent1 );
        System.out.println(" Test2: " + percent2 );
        System.out.println(" Test3: " + percent3 );
        System.out.println(" Test4: " + percent4 );
        System.out.println(" Test5: " + percent5 );
        
        // tell the user thier avarages 
        System.out.println("");
        System.out.println(" Avarage: " +((percent1 + percent2 + percent3 + percent4 + percent5) / 5));
        
        
        
    }
}
