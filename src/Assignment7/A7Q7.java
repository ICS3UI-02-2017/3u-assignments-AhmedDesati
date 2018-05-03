/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

/**
 *
 * @author Desaa3902
 */
public class A7Q7 {

    /**
     * @param args the command line arguments
     */
    public static int FirstDigit(int First) {

        // while the first is bigger than 10 and less than -10 
       while (First>10||First<-10){
          First = First /10;  
       }
           
       
        

        return First;

    }

    public static void main(String[] args) {
        // make the int be equal to 3572
        int First = -3572;
        // make another int equal to the method 
        int ff = FirstDigit(First);
        // show the first digit 
        System.out.println(" The first digit is " + ff);
    }
}
