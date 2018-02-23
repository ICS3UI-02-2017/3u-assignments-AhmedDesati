/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizes;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author Desaa3902
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // add a new city and robot 
        
        City kw = new City();
        
        RobotSE ahmed = new RobotSE(kw, 4, 0, Direction.EAST);
        
        // build a set of stairs for the robot to climb over
        
        new Wall(kw, 4, 2, Direction.WEST);
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 3, 3, Direction.NORTH);
        new Wall(kw, 3, 3, Direction.WEST);
        new Wall(kw, 2, 4, Direction.WEST);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 3, 6, Direction.NORTH);
        new Wall(kw, 3, 6, Direction.EAST);
        new Wall(kw, 4, 7, Direction.NORTH);
        new Wall(kw, 4, 7, Direction.EAST);
        
        // create new things over the set of stairs for the robot to pick up
        
        new Thing(kw, 3, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 4, 1);
        new Thing(kw, 1, 4);
        
        // tell the robot to climb the stairs and pick up the things 
        
        ahmed.move();
        ahmed.pickThing();
        ahmed.turnLeft();
        ahmed.move();
        ahmed.turnRight();
        ahmed.move();
        ahmed.pickThing();
        ahmed.turnLeft();
        ahmed.move();
        ahmed.turnRight();
        ahmed.move();
        ahmed.pickThing();
        ahmed.turnLeft();
        ahmed.move();
        ahmed.turnRight();
        ahmed.move();
        ahmed.pickThing();
        ahmed.move();
        
        // tell the robot to go down the stairs and leave the things in his path
        
        ahmed.putThing();
        ahmed.move();
        ahmed.turnRight();
        ahmed.move();
        ahmed.putThing();
        ahmed.turnLeft();
        ahmed.move();
        ahmed.turnRight();
        ahmed.move();
        ahmed.putThing();
        ahmed.turnLeft();
        ahmed.move();
        ahmed.turnRight();
        ahmed.move();
        ahmed.putThing();
        ahmed.turnLeft();
        ahmed.move();
       
        
                
        
       
        
        
        
        
        
       
        
        
        
        
        
        
        
        
        
    }
}
