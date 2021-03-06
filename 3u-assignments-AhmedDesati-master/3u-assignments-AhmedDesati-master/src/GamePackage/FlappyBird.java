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
public class FlappyBird extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    //Title of the window
    String title = "Flappy bird knock off";

    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;

    // YOUR GAME VARIABLES WOULD GO HERE
   
       
    // make the color brown and dark green
   
    Color brown = new Color(79, 49, 11);
    
    // bird demensions 
    
    int birdW = 50;
    
    int birdH = 50;
    
    int birdX = 10;

    int birdY = 400;

    int birdDY =0;
    
    // make 2 booleans 
    boolean jump = false;
    
    boolean gameover = false;
    
    // first bottom pipe
    int pipe1X = 170;
    int pipe1Y = 400;
    
    int pipe1H = 150;
    int pipe1W = 70;
    
    // first top pipe
    
    int pipe10X = 170;
    int pipe10Y = 0;
    
    int pipe10W = 70;
    int pipe10H = 140;
    
    
          
    // second bottom pipe       
            
     int pipe2X = 410;
     int pipe2Y = 430;
     
     int pipe2W = 70;
     int pipe2H = 120;
            
    // second top pipe
            
     int pipe20X = 410;
     int pipe20Y = 0;
      
     int pipe20W =70;
     int pipe20H = 230;
           
  
     // thrid bottom pipe 
     
    int pipe3X = 660;
    int pipe3Y = 300;
    
    int pipe3W = 70;
    int pipe3H = 250;
                           
    
     // third top pipe
     
    int pipe30X = 660;
    int pipe30Y = 0;
    
    int pipe30W = 70;
    int pipe30H = 100;
    
                             
   
    
    
    
    
    // GAME VARIABLES END HERE    

    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public FlappyBird(){
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
        
        
        // make the sky 
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, 900, 600);
        // make a floor
        g.setColor(brown);
        g.fillRect(0, 550, 900, 200);
        
        
        // make the first set of green pillars
        g.setColor(Color.GREEN);
        g.fillRect(pipe1X, pipe1Y, pipe1W, pipe1H);
        g.fillRect(pipe10X, pipe10Y, pipe10W, pipe10H);
	
        // make the second set of green pillars 
	g.fillRect(pipe20X, pipe20Y, pipe20W, pipe20H);
        g.fillRect(pipe2X, pipe2Y, pipe2W, pipe2H);
        
        // make the third set of green pilars   
        g.fillRect(pipe30X, pipe30Y, pipe30W, pipe30H);
        g.fillRect(pipe3X, pipe3Y, pipe3W, pipe3H);
        
        
        
        
        // make a small yellow flappy boy
        
        g.setColor(Color.YELLOW);
        g.fillOval(birdX, birdY, birdW, birdH);
        
        
        
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
      
       
       
       
       
        if(gameover == false ){
        // move the first set of pipes to the left  
        pipe1X = pipe1X -2;
        pipe10X = pipe10X -2;
        
        if(pipe1X < 0){
            pipe1X =830;
        }
        if(pipe10X <0){
            pipe10X =830;
        }
        
        // move the second set of pipes to the left 
        
        pipe2X = pipe2X -2;
        pipe20X = pipe20X -2;
        
        if(pipe2X <0){
            pipe2X =830;
        }
        if(pipe20X < 0){
            pipe20X =830;
        }
        
        // move the third set of pipes to the left 
        pipe3X = pipe3X -2;
        pipe30X = pipe30X -2;
        
        if(pipe3X <0){
            pipe3X =830;
        }
        if(pipe30X <0){
            pipe30X = 830;
        }
        }
        
        

        // if you go to far start at the begining 
       
        if(birdX > WIDTH){
           birdX = -50;
        }
       
        if(birdY  < -10){
            gameover =true;
        }
        // if you fall to low start at the begining 
       
        if(gameover == true){
            birdX =0;
            birdY =200;
            birdDY =0;
           
     pipe1X = 170;
     pipe1Y = 400;
     pipe1H = 150;
     pipe1W = 70;
     pipe10X = 170;
     pipe10Y = 0;
     pipe10W = 70;
     pipe10H = 140;  
     pipe2X = 410;
     pipe2Y = 430; 
     pipe2W = 70;
     pipe2H = 120;
     pipe20X = 410;
     pipe20Y = 0;
     pipe20W =70;
     pipe20H = 230;
     pipe3X = 660;
     pipe3Y = 300;
     pipe3W = 70;
     pipe3H = 250;
     pipe30X = 660;
     pipe30Y = 0;
     pipe30W = 70;
     pipe30H = 100;
  
            // System.out.println(" You Lost, Press E to continue ");
        }
        
        if(birdY > 500){
           gameover = true;
  
 
       }
     
       if(gameover == false){
        // keep falling  
       
        birdX = birdX +3 ;
        birdDY = birdDY + 1;
        // make sure the bird is falling 
        birdY = birdY + birdDY;
        
        // when the space bar is pressed jump by 10 
       }
        
        if(jump == true){
        birdDY = -10;
        
        }
  
           
        
        // add collision for the top pipie
       
        if(!( birdX + birdW < pipe10X|| birdX > pipe10X + pipe10W || 
            birdY + birdH < pipe10Y || birdY > pipe10Y+ pipe10H )){
           
              gameover = true;
        }
      
       
       // add collision for the bottom pipe
  
        if(!( birdX + birdW < pipe1X || birdX > pipe1X + pipe1W || 
                birdY + birdH  < pipe1Y || birdY > pipe1Y + pipe1H )){
          
            gameover = true;
            
            
        }
        // add collision detection for the second top pipe
         if(!( birdX + birdW < pipe20X || birdX > pipe20X + pipe20W || 
                birdY + birdH  < pipe20Y || birdY > pipe20Y + pipe20H )){
          
            gameover = true;
            
           // add collision detection for the second bottom pipe 
        }
         if(!( birdX + birdW < pipe2X || birdX > pipe2X + pipe2W || 
                birdY + birdH  < pipe2Y || birdY > pipe1Y + pipe2H )){
          
            gameover = true;
            
            
        }
         // add collision detection for the third top pipe
          if(!( birdX + birdW < pipe30X || birdX > pipe30X + pipe30W || 
                birdY + birdH  < pipe30Y || birdY > pipe30Y + pipe30H )){
          
            gameover = true;
            
            
        }
          // add collision dettection for the third bottom pipe 
         if(!( birdX + birdW < pipe3X || birdX > pipe3X + pipe3W || 
                birdY + birdH  < pipe3Y || birdY > pipe3Y + pipe3H )){
          
            gameover = true;
            
            
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
           int keyCode = e.getKeyCode();
           int keyCode2 = e.getKeyCode();
             
           if(keyCode == KeyEvent.VK_SPACE){
               jump = true;
          
            
                   gameover = false;
              
           
           }
         
        }

        // if a key has been released   
        @Override
        public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
           
           if(keyCode == KeyEvent.VK_SPACE){
               jump = false;
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
        FlappyBird game = new FlappyBird();
    }
}

