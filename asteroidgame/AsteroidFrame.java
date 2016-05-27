package asteroidgame;

import javax.swing.*;
import java.awt.*;
class AsteroidFrame extends JFrame
{
    public AsteroidFrame()
    {
    setTitle("Asteroids");
    setSize(640,480);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);

    setLayout(new BorderLayout());
    setContentPane(new JLabel(new ImageIcon("/Users/christophermarquart/Downloads/star.jpg")));
    setLayout(new FlowLayout());
    setSize(640, 480);
    }
}
