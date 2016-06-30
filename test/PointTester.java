package at.fhj.itm;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import at.fhj.itm.*;

public class PointTester
{
	public Point2d p1;
    public Point2d p2;
    
    @Before
    public void setup() throws Exception
    {
    	Point2d p1 = new Point2d();
        Point2d p2 = new Point2d(); // keep size of 5 !!
    }
    
    @Test
    public void testDistanceFrom() throws Exception
    {
    	 p1 = new Point2d(0,0);
    	 p2 = new Point2d(4.0,3.0);
   		 assertEquals( Math.sqrt (Math.pow(p1.getX()-p2.getX(),2)+Math.pow(p1.getY()-p2.getY(),2)), p1.distanceFrom(p2), 0.00001);
    }
    
    @Test
    public void testDistanceFromOrigin() throws Exception
    {
    
    	 p2 = new Point2d(4.0,3.0);
    	
   		 assertEquals( 4.0 , p2.distanceFromOrigin(), 0.00001);
    }
    
    @Test
    public void testGetY() throws Exception
    {
    	 p2 = new Point2d(4.0,3.0);
    	 
   		 assertEquals( 3.0 , p2.getY(), 0.00001);
    }
    @Test
    public void testGetX() throws Exception
    {
    	 p2 = new Point2d(4.0,3.0);
    	 
   		 assertEquals( 4.0 , p2.getX(), 0.00001);
    }
  
}