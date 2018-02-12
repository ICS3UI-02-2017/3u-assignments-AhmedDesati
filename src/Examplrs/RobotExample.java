/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examplrs;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 * learning how to use robots
 * @author Desaa3902
 */
public class RobotExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
// create a city for the robot
        City kw = new City();
   
// put a robot in kw
   RobotSE arnold = new RobotSE(kw, 2 , 3,Direction.EAST);

//put robot in kw
RobotSE jimmy = new RobotSE(kw, 3 , 3,Direction.EAST);
   
jimmy.move(10);   
   
   
   //create a wall
   new Wall(kw, 2 , 6,Direction.EAST);
   
   //move the robot forward 1 space 
   arnold.move();
   
//mopve the robot n number of spaces 
    
   arnold.move(2);

   arnold.turnLeft();
   
   arnold.move();
   
   arnold.turnLeft();
   
   arnold.move();
//put the letter of A on arnold
  arnold.setLabel("A");
  
//create a thing
        
new Thing(kw, 1, 4);

arnold.move();
//pick up the thing
   arnold.pickThing();

//change color of arnold
   arnold.setColor(Color.yellow);
                  
//put robot in kw

    }
}
