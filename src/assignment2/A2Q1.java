/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author Desaa3902
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
// new city
        City kw = new City();

// new robot

        RobotSE robo = new RobotSE(kw, 1, 1, Direction.EAST);

// add 10 new things

        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 1, 6);
        new Thing(kw, 1, 7);
        new Thing(kw, 1, 8);
        new Thing(kw, 1, 9);
        new Thing(kw, 1, 10);
        new Thing(kw, 1, 11);

// tell the robot to only pick 7 of the things

        while (robo.frontIsClear()) {
            robo.move();

            if (robo.canPickThing()) {
                robo.pickThing();
            }

             if (robo.countThingsInBackpack() == 7) {
                robo.move(4);
                robo.wait();
            }







        }







    }
}
