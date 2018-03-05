/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author Desaa3902
 */
public class A3Q3 {
    private static int numberOfMoves;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City kw = new City();
        
        
        // make a robot with 20 things in its backpack
        
         RobotSE ahmed = new RobotSE(kw, 1, 1, Direction.EAST, 20);
         
         
         numberOfMoves = 0;
         
         
         for (int count = 0; count < 5; count++) {
            ahmed.putThing();
            ahmed.move();
            
              
            
                    
                       
         }
         ahmed.turnRight();
         ahmed.move();
         ahmed.turnRight();
         ahmed.move();
         
         
         
         numberOfMoves = 0;
         
         
         for (int count = 0; count < 5; count++) {
            ahmed.putThing();
            ahmed.move();
         
         }
         
         ahmed.turnLeft();
         ahmed.move();
         ahmed.turnLeft();
         ahmed.move();
         
         numberOfMoves = 0;
         
         
         for (int count = 0; count < 5; count++) {
            ahmed.putThing();
            ahmed.move();
            
         }
         ahmed.turnRight();
         ahmed.move();
         ahmed.turnRight();
         ahmed.move();
        
         for (int count = 0; count < 5; count++) {
            ahmed.putThing();
            ahmed.move();
            
         
    }
         ahmed.turnLeft();
         ahmed.move();
         ahmed.turnLeft();
         ahmed.move();
         
         
}
}