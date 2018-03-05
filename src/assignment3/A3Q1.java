/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author Desaa3902
 */
public class A3Q1 {
    private static int numberOfMoves;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // make a city
        
        City kw = new City();
        
        // make a box of walls in the city
        
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.EAST);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 1, 2, Direction.NORTH);
        
        // create a new robot
        
        RobotSE ahmed = new RobotSE(kw, 0, 2, Direction.WEST);
        
        // use a for loop to tell the robot to patrol the parimeter 2 times
        //327
        
        numberOfMoves = 0;
         
        while (numberOfMoves < 8) {
            
            ahmed.move(2);
            ahmed.turnLeft();
         
            
            numberOfMoves = numberOfMoves + 1;
            
            for (int count = 0; count < 1; count++) {
            ahmed.move();
            
            
            
        
        
       
       
        
            }
        
        
        }
        
    }
}
