/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author lamon
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        
//create a new city for the robot
        City kw = new City();

//Put a new robot in kw   

        RobotSE arnold = new RobotSE(kw, 0, 2, Direction.WEST);

//put a new set walls in the city kw

        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.EAST);
        new Wall(kw, 1, 2, Direction.EAST);

// tell the robot to go around the box of walls  
    
        arnold.move(2);
        arnold.turnLeft();
        arnold.move(3);
        arnold.turnLeft();
        arnold.move(3);
        arnold.turnLeft();
        arnold.move(3);
        arnold.turnLeft();
        arnold.move();
    
    
    
    }
    
}
