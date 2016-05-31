//import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.applet.*; 
import java.awt.*; 
import java.awt.event.*;

/* This class initializes the instances of any needed classes,
handles user input (event handling), and wraps the game 
into a Java web applet. */

public class AsteroidsGame extends Applet implements Runnable
{
    
    int x, y;
    Thread thread;
    long startTime, endTime, framePeriod;
    
    @Override
    public void init () 
    {
      resize(500,500); // make sure the applet is the right size
      x = 0; // the top left x and y coordinates of the rectangle
      y = 0; // containing the circle.
      startTime = 0;
      endTime = 0;
      framePeriod = 25; // 25 milliseconds is a good frame period thread=new Thread(this); // create the thread thread.start(); // start the thread running
    }
    
    @Override
    public void paint(Graphics gfx)
    { 
      gfx.setColor(Color.black); // clear the screen with black gfx.fillRect(0,0,500,500);
      gfx.setColor(Color.red); // draw a red circle
      gfx.fillOval(x,y,50,50);
    }
    
    @Override
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
        
// OLD CODE
//        AsteroidFrame frame = new AsteroidFrame();
//        frame.setSize(640, 480);
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }  

    //overridden Runnable interface method, "run"
    @Override
    public void run() 
    {
        for(y = 0; y < 450; y += 50) 
        {
            for (x = 0; x < 450; x += 2) 
            {
                // mark start time
                startTime=System.currentTimeMillis();
                repaint();
                // the next 6 lines pause execution for 20
                // milliseconds minus the time it took to move the // circle and repaint.
                try
                {
                    // mark end time
                    endTime=System.currentTimeMillis();
                    // don’t sleep for a negative amount of time if(framePeriod-(endTime-startTime)>0)
                    Thread.sleep(framePeriod - (endTime-startTime));
                }
                catch(InterruptedException e) 
                {
                    // do nothing here
                }
            }
        }
    }
}