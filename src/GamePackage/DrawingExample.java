package GamePackage;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
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
public class DrawingExample extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 1000;
    static final int HEIGHT = 800;

    //Title of the window
    String title = "MINECRAFT";

    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;

    // YOUR GAME VARIABLES WOULD GO HERE
    
    // make a custom color
    Color lblue = new Color(4, 168, 249);

    
    
    
    int pacmanX = 100;
    int pacmanY = 400;
    int pacmanAngle = 45;
    
    int pacmanRotate =270;
    
    boolean pacmanClose = true;
    
  
    int mouseX = 0;
    int mouseY = 0;
    
    int pacmanDY = 0;
    int gravity = 1;
    
    
    
    boolean moveUP = false;
    boolean moveDown= false;
    
    // GAME VARIABLES END HERE    

    
    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public DrawingExample(){
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
        
        gameTimer = new Timer(desiredTime,this);
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
        
        g.setColor(lblue);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        
        // set the colour
        g.setColor(Color.GREEN);
        
       // draw a filled in rectangle 
       //(x,y, width, hight)
        g.fillRect(900, 700, 100, 100);
	
        // draw anything that is an "oval"
        //(x,y, width,height)
              
        g.setColor(Color.yellow);
        
        g.fillOval(100, 75, 100, 100);
        g.fillOval(100, 175, 100, 100);
        
        g.setColor(Color.BLACK);
        g.drawRect(100, 75, 100, 100);
        // x,y width height radiuswidth radiusHieght
        g.fillRoundRect(300, 75, 50, 50, 10, 20);
        
        
        int[] triangleX ={mouseX,600,450};
        int[] triangleY ={mouseY,500,500};
        // array of x points array of y points, # of points
       
        g.fillPolygon(triangleX, triangleY, 3);
        
        g.setColor(Color.yellow);
        //x,y width,hight, start angle, amount to rotate
       
        
        
        
        g.fillArc(pacmanX, pacmanY, 100, 100, pacmanAngle, pacmanRotate);
        // GAME DRAWING ENDS HERE
       
        
        
        
        
        
        
        g.setColor(Color.RED);
        //xy, xy
        g.drawLine(250, 150, 500, 400);
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here

    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {
       
        // move pacmanX position by 3 
        pacmanX = pacmanX + 3;
        // when pacman leaves the screen
        
        if(pacmanX > WIDTH){
            pacmanX = -100;    
        }
        
        if(pacmanAngle <= 0){
             pacmanClose = false;
        }
        if(pacmanAngle >= 45){
           pacmanClose = true; 
        }
         if(pacmanClose){
          pacmanAngle = pacmanAngle -3;
            pacmanRotate = pacmanRotate +6;
             }else{
              pacmanAngle = pacmanAngle +3;
             pacmanRotate = pacmanRotate -6;
   
         }
   
     pacmanDY = pacmanDY + 1  ;
     
         
         // move the player 
    if(moveUP){
        pacmanDY = -10;
        
    }
    
    pacmanY = pacmanY + pacmanDY;
    
   
    
    } 

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {

        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e) {
               if(e.getButton() == MouseEvent.BUTTON1){
                   //set the mouse coordinates 
            mouseX = e.getX();
            mouseY = e.getY();
               }
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
            // get the ley code// which key is being pressed 

            
            int keyCode = e.getKeyCode();
        
            if(keyCode == KeyEvent.VK_W){
                moveUP = true;
                
            }
        
        
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {

               int keyCode = e.getKeyCode();
        
            if(keyCode == KeyEvent.VK_W){
                moveUP = false;
                
            }
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
        DrawingExample game = new DrawingExample();
    }
}

