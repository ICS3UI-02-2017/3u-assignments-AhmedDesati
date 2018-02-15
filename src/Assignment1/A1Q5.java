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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//add a new city
        City kw= new City();
// add things
        
        new Thing(kw, 0, 0);
        new Thing(kw, 1, 0);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 2);
        new Thing(kw, 2, 2);
        
// add 2 new robots
        
        RobotSE M = new RobotSE(kw, 0, 1, Direction.WEST);
        RobotSE K= new RobotSE(kw, 3, 3, Direction.EAST);
        
// set labels to the robots
        
        M.setLabel("M");
        K.setLabel("K");
// add walls
        
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 2, 3, Direction.WEST);
        new Wall(kw, 2, 3, Direction.NORTH);
        new Wall(kw, 3, 3, Direction.EAST);
        new Wall(kw, 3, 3, Direction.SOUTH);
        
       
// tell M to collect the things
        
        M.move();
        M.pickThing();
        M.turnLeft();
        M.move();
        M.pickThing();
        M.turnLeft();
        M.move();
        M.pickThing();
        M.move();
        M.pickThing();
        M.turnRight();
        M.move();
        M.pickThing();
// tell M to meet K at 1,1
        
        M.turnAround();
        M.move();
        M.turnLeft();
        M.move();
        M.turnAround();
// tell K to turn around
        
        K.turnAround();
        K.move();
        K.turnRight();
        K.move(2);
        K.turnLeft();
        
        
        
        
        
       
        
        
        
            
                
         
    }
}
