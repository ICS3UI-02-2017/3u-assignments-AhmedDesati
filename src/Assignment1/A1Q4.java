/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author Desaa3902
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//make a new city
        City kw = new City();
        
// add two new robots
        
        RobotSE robo1 = new RobotSE(kw, 0, 0, Direction.SOUTH);
        RobotSE robo2 = new RobotSE(kw, 0, 1, Direction.SOUTH);
//add walls in kw
        
        new Wall(kw, 0, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.SOUTH);
        
//tell the robots to meet each other 
        
        robo1.move(2);
        robo2.move();
        robo1.turnLeft();
        robo2.turnLeft();
        robo2.move();
        robo2.turnRight();
        robo2.move();
        robo1.move();
        robo2.turnRight();
        robo2.move();
        
        
        
     
        
        
        
        
    }
}
