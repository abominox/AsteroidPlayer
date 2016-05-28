import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.applet.*; 
import java.awt.*; 
import java.awt.event.*;

/* This class initializes the instances of any needed classes,
handles user input (event handling), and wraps the game 
into a Java web applet. */

public class AsteroidGame extends Applet {
    
    @Override
    public void init () 
    {
      resize(500,500); // make sure the applet is the right size
    }
    
    @Override
    public void paint(Graphics gfx)
    { 
      gfx.setColor(Color.red);
      gfx.fillOval(0,0,50,50); // draw a red circle
    }
    
    public void update(Graphics gfx)
    {
      paint(gfx); // call paint without clearing the screen
    }
    
    public static void main(String[] args) 
    {
        //attributes
        Ship myShip;
        Asteroid [] asteroids;
        Shot [] bullets;
        
//OLD CODE
//        AsteroidFrame frame = new AsteroidFrame();
//        frame.setSize(640, 480);
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }  
}