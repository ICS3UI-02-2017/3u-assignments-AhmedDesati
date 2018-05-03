/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

/**
 *
 * @author Desaa3902
 */
public class A7Q3 {

    public static void factors(int factor) {
        // set the number to 10
        

        // look through all the numbers
        for (int n = 1; n <= factor; n++) {
          // find which numbers dont have a remainder
          
            if (factor % n == 0) {
                int ff = n;
                
                
                System.out.println("The factors of 10 are " + ff +",");
            } 
            

        }
        
        


    }

    public static void main(String[] args) {
        factors(10);
      
        
    }
}
