package GamePackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.Timer;

/**
 *
 * @author Desaa3902
 */
public class FACE extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    //Title of the window
    String title = "laser eyes emoji";
    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;
    // YOUR GAME VARIABLES WOULD GO HERE
    Color Skin = new Color(255, 235, 59);
    Color teeth = new Color(173, 162, 162);
   
    Color Red = new Color(255, 0, 0);
    
    int rightlaserY = 400;
    int rightlaserUP = +20;
    int leftlaserY = 400;
    int leftlaserUP = +20;
    
    
  
    // GAME VARIABLES END HERE    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public FACE() {
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();
        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);

        gameTimer = new Timer(desiredTime, this);
        gameTimer.setRepeats(true);
        gameTimer.start();
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 800, 600);

        // make the face
        g.setColor(Skin);
        g.fillOval(50, 50, 500, 500);
        g.setColor(Color.ORANGE);
        g.drawOval(50, 50, 500, 500);

        // make the eyes

        g.setColor(Color.WHITE);
        g.fillOval(150, 200, 100, 100);
        g.fillOval(370, 200, 100, 100);



        
        g.setColor(Color.BLACK);
        g.drawOval(150, 200, 100, 100);
        g.drawOval(370, 200, 100, 100);

        g.fillOval(160, 230, 60, 60);
        g.fillOval(380, 230, 60, 60);
        
        g.setColor(Red);
        g.drawOval(160, 230, 60, 60);
        g.drawOval(380, 230, 60, 60);
        // give him red pupils
        
        g.fillOval(175, 255, 20, 20);
        g.fillOval(405, 255, 20, 20);
        // make him shoot lasers out of his eyes 

       
        
        // left laser
        g.drawLine(180, 265, 0, leftlaserY);

        // right laser 
        g.drawLine(410, 265, 800, rightlaserY);



        // make the mouth
        g.setColor(Color.WHITE);
        g.fillRoundRect(170, 370, 270, 80, 70, 60);


        g.setColor(Color.BLACK);
        g.drawRoundRect(170, 370, 270, 80, 70, 60);
        g.setColor(Color.DARK_GRAY);
        g.drawLine(170, 410, 440, 410);
        g.setColor(teeth);
        g.drawLine(200, 370, 200, 450);
        g.drawLine(250, 370, 250, 450);
        g.drawLine(300, 370, 300, 450);
        g.drawLine(350, 370, 350, 450);
        g.drawLine(400, 370, 400, 450);



        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {


        
        
        
        // add 1 to the y position of the right laser
        rightlaserY = rightlaserY + rightlaserUP;
        // if the laser gets smaller than 100 go up by 20
        if (rightlaserY < 100) {
            rightlaserUP = +20;
        }
        // if the laser pass 500 go 20 lower each time 
        if (rightlaserY > 500) {
            rightlaserUP = -20;
        }
        // add 1 to the y position of the left laser
        leftlaserY = leftlaserY + leftlaserUP;

        // if the laser gets smaller than 100 go up by 20
        if (leftlaserY < 100) {
            leftlaserUP = +20;
        }
        // if the laser pass 500 go 20 lower each time 
        if (leftlaserY > 500) {
            leftlaserUP = -20;
        
        }

        
       // if the laser pass y 300 turn red
        if(leftlaserY > 300){
            Red = (Color.GREEN);
        }
        // if the laser gets lower than y 300 turn green 
        if(leftlaserY < 300) {
            Red = Color.red;
        }
        

        
        
    }
       
    
    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {

        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e) {
        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {
        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {
        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {

        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e) {
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        preSetup();
        gameLoop();
        repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        FACE game = new FACE();
    }
}

