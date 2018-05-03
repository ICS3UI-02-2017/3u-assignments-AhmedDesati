/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

/**
 *
 * @author Desaa3902
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static String examGrade(double marks ) {
        // if the mark is bigger than 80 they get an A
        if (marks > 80) {
       
            System.out.println("you got an A");
        } else if (marks <= 79 || marks >= 70) {
        
            // if the mark is a 79-70 they get a B
            System.out.println("you got a B");
           
        } 
       // if the mark 60-69 they get a C
        else if (marks <= 60 || marks >=   69) {
         System.out.println("you got a C");
            
        } 
        // if the mark is 50-59 they get a D
        else if (marks <= 50 || marks >= 59) {
       System.out.println("you got a D");
            
        }
        // if the mark is less than 50 they get a F
        else if (marks < 50) {
       
            System.out.println(" you got a F, you failed");
            
        
        }
        return "";
        
    }

    public static void main(String[] args) {
        
        // put in a random number
        examGrade(81);
        
        
    }
}
