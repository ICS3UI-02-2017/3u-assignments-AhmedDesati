/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

/**
 *
 * @author Desaa3902
 */
public class A7Q6 {

    /**
     * @param args the command line arguments
     */
    public static int Lastdigit(int last) {

        // divide the number by 10
        last = last % 10;
       

        // return the last digit that has no remainder
        return last;




    }

    public static void main(String[] args) {
        // give the method a number
        int a = -957;
        // call the method to run
        int p = Lastdigit(a);
        // show the user the last digit
        System.out.println("The last digit is " + p);


    }
}
