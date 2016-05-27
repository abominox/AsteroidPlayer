package asteroidgame;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class AsteroidGame {
    
    public static void main(String[] args) 
    {
        AsteroidFrame frame = new AsteroidFrame();
        frame.setSize(640, 480);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }  
}