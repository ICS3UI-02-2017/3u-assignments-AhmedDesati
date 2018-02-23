/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author Desaa3902
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // add a new city
        City kw = new City();

        // create a new robot in a random spot in the city

        RobotSE ahmed = new RobotSE(kw, 3, 3, Direction.NORTH);

        //tell the robot to go to 0,0  



        if (ahmed.isFacingNorth()) {


            ahmed.move(3);
            ahmed.turnLeft();

            if (ahmed.isFacingWest()) {
                ahmed.move(3);


                



            }

        }

    }
}
