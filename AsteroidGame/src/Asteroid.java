import java.awt.geom.Rectangle2D;

public class Asteroid extends Rectangle2D
{
    //attributes
    private int size;
    private int x;
    private int y;
    
    private int width;
    private int height;
    
    
    public Asteroid ()
    {
        x = (int) Math.ceil(Math.random() * 50);
        y = (int) Math.ceil(Math.random() * 50);
        
        //width = 
    }

    @Override
    public void setRect(double x, double y, double w, double h) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getX() 
    {
        return x;
    }

    @Override
    public double getY() 
    {
        return y;
    }

    @Override
    public double getWidth() 
    {
        return x * y;
    }

    @Override
    public double getHeight() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Rectangle2D createUnion(Rectangle2D r) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Rectangle2D createIntersection(Rectangle2D r) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int outcode(double x, double y) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}