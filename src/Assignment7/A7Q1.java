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
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static double circleArea(double r) {
        
        // make the circle area equation
        double area = (Math.PI * (r * r));

        return area;

    }
   
    public static void main(String[] args) {
        // TODO code application logic here
       
        // make a scanner to get the radius from the user 
        Scanner input = new Scanner(System.in);
        
        double radius = 0;
        // ask the user for the radius 
        System.out.println(" Please enter a radius");
        
        radius = input.nextDouble();
        // show them the area of the circle by getting the math from the circle area method 
        double area = circleArea(radius);
        
        System.out.println(" The area of the circle is " + area);
        
    }
}
