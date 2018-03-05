/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author Desaa3902
 */
public class A3Q2 {
    private static int numberOfMoves;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // make a new city
        
        City kw = new City();
        
        
        // create a new robot
        
        RobotSE ahmed = new RobotSE(kw, 1, 1, Direction.EAST);
        
        // add ten new things for the robot to pick up
        
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        
        
        // tell the robot to pick the things one at a time and drop them 1 space ahead
        
        numberOfMoves = 0;
        
       while (numberOfMoves < 10) {
           ahmed.pickThing();
           ahmed.move();
           ahmed.putThing();
           ahmed.turnAround();
           ahmed.move();
           ahmed.turnAround();
           numberOfMoves++;
           
           
           
           
           
           
           
        
    }
       ahmed.move();
    }
}
