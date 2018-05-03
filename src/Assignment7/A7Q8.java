/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

/**
 *
 * @author Desaa3902
 */
public class A7Q8 {

    /**
     * @param args the command line arguments
     */
    public static boolean allDigitsOdd(int Odd) {


        
        // while the number is greater than 10 repeat the first 2 if statments
        while( Odd > 10){
        // if the last digit is even return false 
        if (Odd > 10 && Odd % 2 == 0) {

            return false;
        }


        // if the last digit is odd return true
        if (Odd > 10 && Odd % 2 > 0) {
            Odd = Odd / 10;
            
        } 
       
        }
        // if the number is smaller than odd and the remainder is 0 return false 
        if( Odd < 10 && Odd % 2 ==0){
            return false;
        }
        
        
        
        
        // if none of these if statments dont apply just return true 
        else {
            return true;
        }



    }

    public static void main(String[] args) {
        // set a number to find out if its odd or even
        int number = 8855;
        
        // show the user if the number is only odd or even 

        boolean odd = allDigitsOdd(number);
        System.out.println("" + odd);

    }
}
