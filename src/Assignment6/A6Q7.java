/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

/**
 *
 * @author Desaa3902
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make an array with 999 spaces
        int nums[] = new int[999];


        // make a for loop to assign numbers into the array spots starting from 2
        for (int i = 2; i < 999; i++) {
            nums[i] = i;
        }
        // make two for loops with two different variables
        for (int j = 2; j < 999; j++) {
            for (int k = 2; k < 999; k++) {
                // make an variable that multiplies the numbers in the array with themselves to find what numbers can only be divided by themselves
                int even = k * j;
                // filter out all of the even numbers in the array
                if (even < 999) {
                    nums[even] = -1;
                }
            }
        }
        // make a for loop to print out all the numbers that are not -1
        for (int r = 0; r < 999; r++) {
            if (nums[r] != -1) {
                System.out.println(nums[r]);
            }
        }

    }
}
