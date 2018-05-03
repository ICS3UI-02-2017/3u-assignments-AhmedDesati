/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

/**
 *
 * @author Desaa3902
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void chaotic(int lines) {


        for (int i = 0; i < lines; i++) {
            // print out five spaces
            System.out.println("");
            // on every space print out a random number of * from 1-5
            int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;
            for (int j = 0; j < randNum; j++) {

             System.out.print("*");

            }

        }

    }

    public static void main(String[] args) {
        chaotic(5);


    }
}
