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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
//create a new city 
        
        City kw = new City();
        
// add a new robot in the city
        
        RobotSE arnold = new RobotSE(kw, 1, 2, Direction.SOUTH);
        
// create walls in the city 
        
        new Wall (kw, 1, 2, Direction.EAST);
        new Wall (kw, 1, 1, Direction.NORTH);
        new Wall (kw, 1, 2, Direction.NORTH);
        new Wall (kw, 1, 1, Direction.WEST);
        new Wall (kw, 1, 2, Direction.SOUTH);        
        new Wall (kw, 2, 1, Direction.WEST);
        new Wall (kw, 2, 1, Direction.SOUTH);
   
        
// make a new thing
        
        new Thing(kw,2 ,2);
        
// tell arnold to move there
        
        arnold.turnRight();
        arnold.move();
        arnold.turnLeft();
        arnold.move();
        arnold.turnLeft();
        arnold.move();
        arnold.pickThing();
        
// tell arnold to go back to starting zone
        arnold.turnAround();
        arnold.move();
        arnold.turnRight();
        arnold.move();
        arnold.turnRight();
        arnold.move();
        arnold.turnRight();
       
    
    
    }
}
