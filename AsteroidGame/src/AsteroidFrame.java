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
    setContentPane(new JLabel(new ImageIcon("/Users/christophermarquart/NetBeansProjects/AsteroidPlayer/asteroidgame/Media/star.jpg"))); //MAC OSX
//    setContentPane(new JLabel(new ImageIcon("C:/Users/Christopher/Documents/NetBeansProjects/AsteroidPlayer/AsteroidGame/Media"))); //Windows
    setLayout(new FlowLayout());
    setSize(640, 480);
    }
}
