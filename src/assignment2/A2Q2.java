/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author Desaa3902
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


//new city
        City kw = new City();


// add a new robot

        RobotSE robo = new RobotSE(kw, 3, 1, Direction.EAST);

// add walls under the robot

        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 5, Direction.SOUTH);
        new Wall(kw, 3, 6, Direction.SOUTH);
        new Wall(kw, 3, 7, Direction.SOUTH);
        new Wall(kw, 3, 8, Direction.SOUTH);
        new Wall(kw, 3, 9, Direction.SOUTH);

// add walls blocking the robots path

        new Wall(kw, 3, 2, Direction.WEST);
        new Wall(kw, 3, 3, Direction.WEST);
        new Wall(kw, 3, 5, Direction.WEST);
        new Wall(kw, 3, 8, Direction.WEST);
// add a thing for the robot to get to

        new Thing(kw, 3, 9);

// jump if the front is not clear

        do {
            if (robo.frontIsClear()) {
                robo.move();
            } else {
                robo.turnLeft();
                robo.move();
                robo.turnRight();
                robo.move();
                robo.turnRight();
                robo.move();
                robo.turnLeft();
            }






        } while (!robo.canPickThing());

























    }
}
