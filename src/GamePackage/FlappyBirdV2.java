package GamePackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.Timer;

/**
 *
 * @author Desaa3902
 */
public class FlappyBirdV2 extends JComponent implements ActionListener {

    // Height and Width of our game
    // make the game look like a phone screen
    static final int WIDTH = 400;
    static final int HEIGHT = 600;
    //Title of the window
    String title = "Flappy Bird";
    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;
    // YOUR GAME VARIABLES WOULD GO HERE
    // make the color brown 
    Color brown = new Color(79, 49, 11);
    Color dGreen = new Color(0, 141, 40);
    // bird demensions in variables so i can change them
    int birdW = 30;
    int birdH = 30;
    int birdX = 90;
    int birdY = 300;
    int birdDY = 0;
    // make the demensions of the red bird
    int birdSkinX = 150;
    int birdSkinY = 300;
    int birdSkinH = 30;
    int birdSkinW = 30;
    // make the demensions for the blue bird
    int birdSkin2X = 210;
    int birdSkin2Y = 300;
    int birdSkin2H = 30;
    int birdSkin2W = 30;
    // make a jump boolean 
    boolean jump = false;
    // make a gameover boolean
    boolean gameover = false;
    // make gamestart boolean
    boolean gamestart = false;
    // make a boolean for changing the color of your bird
    boolean colorChange = false;
    // make a boolean so you can change your bird to the color blue 
    boolean colorChange2 = false;
    // make one color change boolean for the yellow bird
    boolean colorChange3 = false;
    // make a mouse pressed booelean
    boolean click = false;
    // make a boolean for the jump key
    boolean released = true;
    // make a boolean for a quick msg that will appear on the screen
    boolean quickMsg = false;
    // all the pipe dimensions in variables so it is easy to make them move 
    // first bottom pipe
    int pipe1X = 640;
    int pipe1Y = 370;
    int pipe1H = 190;
    int pipe1W = 70;
    // first top pipe
    int pipe10X = 640;
    int pipe10Y = 0;
    int pipe10W = 70;
    int pipe10H = 220;
    // second bottom pipe  
    int pipe2X = 910;
    int pipe2Y = 440;
    int pipe2W = 70;
    int pipe2H = 120;
    // second top pipe
    int pipe20X = 910;
    int pipe20Y = 0;
    int pipe20W = 70;
    int pipe20H = 290;
    // thrid bottom pipe 
    int pipe3X = 1160;
    int pipe3Y = 250;
    int pipe3W = 70;
    int pipe3H = 310;
    // third top pipe
    int pipe30X = 1160;
    int pipe30Y = 0;
    int pipe30W = 70;
    int pipe30H = 110;
    // make 4 different types of fonts 
    Font fontL = new Font("Arial", Font.BOLD, 50);
    Font fontS = new Font("Comic Sans", Font.PLAIN, 20);
    Font fontM = new Font("Comic Sans", Font.PLAIN, 30);
    Font fontXS = new Font("Comic Sans", Font.PLAIN, 14);
    // set the score to 0  
    int highScore = 0;
    int currentScore = 0;
    // make a variables for the mouse coridinates
    int mouseX = 0;
    int mouseY = 0;
    // create 3 different speed variables for each of the birds that appear on the screen
    int move = +1;
    int move2 = +1;
    int move3 = +1;
    // make a delay integer
    int delay = 800;
    // make two numbers that are the cordinates of the background starting point 
    int backX = 0;
    int backY = -150;
    // store the current time 
    long lastTime = System.currentTimeMillis();
    BufferedImage background = loadImage("flappyBackGround.png");
    BufferedImage bird = loadImage("redBird.png");
    // GAME VARIABLES END HERE    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)

    public FlappyBirdV2() {
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

    public BufferedImage loadImage(String name) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(name));
        } catch (Exception e) {
            System.out.println("Error loading picture");
            e.printStackTrace();
        }
        return img;
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE


        // make the background and make it look like its moving
        g.drawImage(background, backX, backY, null);

        backX = backX - 1;

        if (backX < -550) {
            backX = 0;
        }
        //if the background image doesnt work draw the regualar background

        // uncomment these if the background doesnt work!!!

//        g.setColor(Color.CYAN);
//        g.fillRect(0, 0, 900, 600);
//        g.setColor(brown);
//        g.fillRect(0, 550, 900, 200);
//        g.setColor(Color.GREEN);
//        g.fillRect(0, 550, 600, 10);


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

        // set the text to white 

        g.setColor(Color.WHITE);

        // set the font to medium    

        g.setFont(fontM);

        // show the user their highscore when the game is over        

        if (gameover == true) {
            g.drawString("HighScore: " + highScore, 100, 50);
        }

        // show the user their current score while they are playing 

        g.setFont(fontL);
        if (gameover == false) {
            g.drawString("" + currentScore, 190, 50);

        }
           // make a half a second timer that does something every... half second
            if (System.currentTimeMillis() > lastTime + delay) {
       
       
                lastTime = System.currentTimeMillis();

                if (quickMsg == true) {
                   quickMsg = false;
               } else {
                   quickMsg = true;
               }
        
            }
            // tell the user its game over when he loses 
            if ( quickMsg == true && gameover == true) {

                    g.setColor(Color.RED);
                    g.drawString("Game Over", 60, 180);

                    g.setColor(Color.WHITE);
                    g.setFont(fontS);
                    g.drawString("(Press Space)", 130, 200);
                    
            
            }
                       
        // tell the user to press space to start the game 


        if (gamestart == false && quickMsg == true) {
            g.setFont(fontS);
            g.drawString("(Press Space)", 130, 200);
        }



        // when you get 5 highscore you get a new bird
        if (gameover == true) {
            if (highScore >= 5) {
                g.setColor(Color.RED);
                g.fillOval(birdSkinX, birdSkinY, birdSkinW, birdSkinH);


            }
          
            //if you get a new bird you get a message for it 
            if (gameover == true && highScore >= 5 && colorChange == false && colorChange2 == false && colorChange3 == false) {

                g.setColor(Color.WHITE);
                g.setFont(fontS);
                g.drawString("You can pick a new bird!", 85, 240);

            }

            if (gameover == true && highScore >= 10 && colorChange2 == false && colorChange == false) {

                g.setColor(Color.WHITE);
                g.setFont(fontS);
                g.drawString("You can pick a new bird!", 85, 240);

            }



        }
        // when you get a highscore of 10 unlock the blue bird in the gameover screen
        if (gameover == true) {
            if (highScore >= 10) {
                g.setColor(Color.BLUE);
                g.fillOval(birdSkin2X, birdSkin2Y, birdSkin2W, birdSkin2H);

            }
        }


        // if you click on the red bird your bird turns red and the other birds dont do anything 
        if (gameover == true && highScore >= 5) {
            if (mouseX > 150 && mouseY > 270 && mouseX < 180 && mouseY < 330 && click == true) {
                colorChange = true;
                colorChange2 = false;
                colorChange3 = false;

                g.setColor(Color.RED);
                g.setFont(fontXS);

                g.drawString("You have changed your bird!", 80, 350);

            }
        }


        // if you click on the blue bird it turns blue and the other birds do nothing 
        if (gameover == true && highScore >= 10) {
            if (mouseX > 210 && mouseY > 270 && mouseX < 240 && mouseY < 370 && click == true) {
                colorChange2 = true;
                colorChange = false;
                colorChange3 = false;

                g.setColor(Color.BLUE);
                g.setFont(fontXS);
                g.drawString("You have changed your bird!", 80, 350);

            }
        }

        // if you click on the yellow bird all the other birds do nothing 
        if (gameover == true && highScore >= 5) {
            if (mouseX > 90 && mouseY > 270 && mouseX < 120 && mouseY < 330 && click == true) {
                colorChange2 = false;
                colorChange = false;
                colorChange3 = true;
                // you can only change your bird to the defualt if you have changed your skin already  

                g.setColor(Color.YELLOW);
                g.setFont(fontXS);
                g.drawString("You have changed your bird!", 80, 350);

            }

        }
        // make the birds look like they are moving 

        if (gameover == true && highScore >= 5) {
            birdSkinY = birdSkinY + move2;

            if (birdSkinY > 310) {
                move2 = - 1;
            }
            if (birdSkinY < 280) {
                move2 = +1;
            }
        }


        if (gameover == true && highScore >= 10) {
            birdSkin2Y = birdSkin2Y + move3;

            if (birdSkin2Y > 310) {
                move3 = - 1;
            }
            if (birdSkin2Y < 285) {
                move3 = +1;
            }
        }



        // draw the default yellow bird 


        g.setColor(Color.YELLOW);
        g.fillOval(birdX, birdY, birdW, birdH);

        // if the red bird is picked the purple bird isnt picked 


        // the default color is yellow 
        g.setColor(Color.YELLOW);
        if (colorChange == true) {
            g.setColor(Color.RED);

            if (gameover == false) {
                g.fillOval(birdX, birdY, birdW, birdH);

            }

        }
        // turn the blue bird blue when its clicked on
        if (colorChange2 == true) {
            g.setColor(Color.BLUE);

        }

        if (gameover == false) {
            g.fillOval(birdX, birdY, birdW, birdH);

        }

        // if the yellow bird is picked over the other birds you get to pick him again
        if (colorChange3 == true) {
            g.setColor(Color.YELLOW);
        }

        if (gameover == false) {
            g.fillOval(birdX, birdY, birdW, birdH);
        }



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



       


        // add 1 to the score everytime you pass a pipe
        if (birdX == pipe1X) {
            currentScore = currentScore + 1;

        }

        if (birdX == pipe2X) {
            currentScore = currentScore + 1;

        }
        if (birdX == pipe3X) {
            currentScore = currentScore + 1;

        }

        // when you lose your current score is 0

        if (gameover == true) {
            currentScore = 0;
        }

        // make the highest number in the current score equal to the highscore 

        if (currentScore > highScore) {
            highScore = currentScore;
        }

        // when you press space the game starts to run
        if (jump == true) {
            gamestart = true;
        }


        // before the player starts the bird will look like he is flying by himself up and down

        if (gamestart == false || gameover == true) {
            birdY = birdY + move;
            if (birdY > 300) {
                move = - 1;
            }
            if (birdY < 280) {
                move = +1;
            }


        }

        // if the game has started run all of this code below 
        if (gamestart == true) {

            // when the game starts run the pipemove, gamereset, birdMove, and pipecollision methods

            pipemove();

            gameReset();

            birdMove();

            pipeCollision();


        }
    }

    private void pipemove() {

        if (gameover == false) {
            // move the first set of pipes to the left  
            pipe1X = pipe1X - 5;
            pipe10X = pipe10X - 5;

            // once the pipes pass the left side of the screen come back on the other side 
            if (pipe1X < -70) {
                pipe1X = 830;
            }
            if (pipe10X < -70) {
                pipe10X = 830;
            }

            // move the second set of pipes to the left 

            pipe2X = pipe2X - 5;
            pipe20X = pipe20X - 5;

            // once the pipes pass the left side of the screen come back on the other side 
            if (pipe2X < -70) {
                pipe2X = 830;
            }
            if (pipe20X < -70) {
                pipe20X = 830;
            }

            // move the third set of pipes to the left 
            pipe3X = pipe3X - 5;
            pipe30X = pipe30X - 5;

            // once the pipes pass the left side of the screen come back on the other side 
            if (pipe3X < -70) {
                pipe3X = 830;
            }
            if (pipe30X < -70) {
                pipe30X = 830;
            }
        }


    }

    private void gameReset() {



        // if you fly to high you lose 
        if (birdY < -30) {
            gameover = true;
        }

        // if you fly to low you lose 
        if (birdY > 510) {
            gameover = true;

        }



        // if you lose reset the game and all the pipes 
        if (gameover == true) {

            gamestart = false;
            birdX = 90;
            birdY = 300;
            birdDY = 0;

            pipe1X = 640;
            pipe1Y = 370;
            pipe1H = 190;
            pipe1W = 70;
            pipe10X = 640;
            pipe10Y = 0;
            pipe10W = 70;
            pipe10H = 220;
            pipe2X = 910;
            pipe2Y = 440;
            pipe2W = 70;
            pipe2H = 120;
            pipe20X = 910;
            pipe20Y = 0;
            pipe20W = 70;
            pipe20H = 290;
            pipe3X = 1160;
            pipe3Y = 250;
            pipe3W = 70;
            pipe3H = 310;
            pipe30X = 1160;
            pipe30Y = 0;
            pipe30W = 70;
            pipe30H = 110;




        }
    }

    private void birdMove() {

        if (gameover == false) {
            // keep falling  

            birdDY = birdDY + 1;

            // make sure the bird is falling 

            birdY = birdY + birdDY;

        }

        // jump by 10 when space has been pressed 

        if (jump == true) {
            birdDY = -10;


        }
    }

    private void pipeCollision() {
        // add collision for the top pipe

        if (!(birdX + birdW < pipe10X || birdX > pipe10X + pipe10W
                || birdY + birdH < pipe10Y || birdY > pipe10Y + pipe10H)) {

            gameover = true;
        }

        // add collision for the bottom pipe

        if (!(birdX + birdW < pipe1X || birdX > pipe1X + pipe1W
                || birdY + birdH < pipe1Y || birdY > pipe1Y + pipe1H)) {

            gameover = true;


        }

        // add collision detection for the second top pipe

        if (!(birdX + birdW < pipe20X || birdX > pipe20X + pipe20W
                || birdY + birdH < pipe20Y || birdY > pipe20Y + pipe20H)) {

            gameover = true;


            // add collision detection for the second bottom pipe 
        }
        if (!(birdX + birdW < pipe2X || birdX > pipe2X + pipe2W
                || birdY + birdH < pipe2Y || birdY > pipe1Y + pipe2H)) {

            gameover = true;


        }
        // add collision detection for the third top pipe

        if (!(birdX + birdW < pipe30X || birdX > pipe30X + pipe30W
                || birdY + birdH < pipe30Y || birdY > pipe30Y + pipe30H)) {

            gameover = true;


        }
        // add collision dettection for the third bottom pipe 

        if (!(birdX + birdW < pipe3X || birdX > pipe3X + pipe3W
                || birdY + birdH < pipe3Y || birdY > pipe3Y + pipe3H)) {

            gameover = true;


        }
    }

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {

        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e) {
            if (e.getButton() == MouseEvent.BUTTON1) {

                click = true;
            }
        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {
            if (e.getButton() == MouseEvent.BUTTON1) {

                click = false;
            }
        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {
            mouseX = e.getX();
            mouseY = e.getY();

        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {

        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();

            if (keyCode == KeyEvent.VK_SPACE) {
              // when you press space you jump
                   
                jump = true;
                gameover = false;
                
                }
            }

        

        // if a key has been released   
        @Override
        public void keyReleased(KeyEvent e) {
            int keyCode = e.getKeyCode();

            if (keyCode == KeyEvent.VK_SPACE) {
               
                    // when you release space you dont jump 
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
        FlappyBirdV2 game = new FlappyBirdV2();
    }
}
