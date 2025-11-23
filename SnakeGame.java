import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class SnakeGame extends JPanel implements ActionListener, KeyListener {
    private static final long serialVersionUID = 1L;

    //Size of the game window
    public static final int WIDTH = 600, HEIGHT = 600;

    //Timing variables for the game
    public static final int GAME_SPEED = 20; //20ms delay between updates
    private Timer gameTimer;

    //Variables for the snake
    private int[] xPos = new int[100];
    private int[] yPos = new int[100];
    private int snakeLength;

    //Variable for the food
    private int foodX, foodY;

    //Variable for the game state
    private boolean inGame;

    public SnakeGame() {
        //Set the size of the game window
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        //Add the key listener to the game
        addKeyListener(this);

        //Start the game
        startGame();
    }

    //Method to start the game
    public void startGame() {
        //Initialize the snake
        snakeLength = 3;
        xPos[0] = WIDTH / 2;
        yPos[0] = HEIGHT / 2;
        xPos[1] = WIDTH / 2 - 25;
        yPos[1] = HEIGHT / 2;
        xPos[2] = WIDTH / 2 - 50;
        yPos[2] = HEIGHT / 2;

        //Initialize the food
        foodX = (int)(Math.random() * (WIDTH - 25));
        foodY = (int)(Math.random() * (HEIGHT - 25));

        //Set the game state to in game
        inGame = true;

        //Start the game timer
        gameTimer = new Timer(GAME_SPEED, this);
        gameTimer.start();
    }

    //Method to update the game
    public void update() 
    {
        //Move the snake
        for (int i = snakeLength; i > 0; i--) {
            xPos[i] = xPos[i - 1];
            yPos[i] = yPos[i - 1];
        }

        //Check for collision with food
        if (xPos[0] == foodX && yPos[0] == foodY) {
            snakeLength++;
            foodX = (int)(Math.random() * (WIDTH - 25));
            foodY = (int)(Math.random() * (HEIGHT - 25));
        }

        //Check for collision with the walls
       // if (xPos[0] < 0 || xPos[0] > WIDTH || yPos[0] < 0 || y
    


    @Override
    public void keyTyped(KeyEvent e) {
        
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
    