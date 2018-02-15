/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author Desaa3902
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
// make a new city        
        City kw= new City();
         
//make a new robot
        RobotSE robot = new RobotSE(kw, 3, 0, Direction.EAST);
        
// add walls
        
        new Wall(kw, 3, 2, Direction.WEST);
        new Wall(kw, 3, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.WEST);
        new Wall(kw, 2, 3, Direction.WEST);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.EAST);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);
        
// add a thing 
        
        new Thing(kw,3 ,1);
// tell robo to pick it up
        
        robot.move();
        robot.pickThing();
        robot.turnLeft();
        
// tell robot to leave the thing in the top of the walls
        
        robot.move();
        robot.turnRight();
        robot.move();
        robot.turnLeft();
        robot.move(2);
        robot.turnRight();
        robot.move(1);
        robot.putThing();
// tell the robot to finish the trip
        robot.move();
        robot.turnRight();
        robot.move();
        robot.turnLeft();
        robot.move();
        robot.turnRight();
        robot.move();
        robot.move();
        robot.turnLeft();
        
        
        
        
        
       
        
        
        
        
                
        
        
        
        
    }
}
