package at.fhj.itm;

/** Description of class Point 2d
 * @author Max Schopfer
 * @version 30.06.2016
 */

class Point2d {
	private boolean debug;
	private double x; //NEU
	private double y; //NEU
	/**
	 * 
	 * @param px PointX coordinate
	 * @param py PointY coordinate
	 */
	public Point2d (double px, double py)
	{ 
		x=px;
		y=py;
	}

	public Point2d () 
	{		
		// just create a point of 0/0
	}

	public Point2d (Point2d pt) 
	{	
	}
	/**Description of point2dArgs (String[]args)
	 * 
	 * @param args declare points in commandline
	 */
	public void point2dArgs (String[] args){
		x =  Double.parseDouble(args[1]);
		y =  Double.parseDouble(args[2]);
	}
	
	/**Description of dprint (String s)
	 * 
	 * @param s debugmessage
	 */
	public void dprint (String s) {
		if (debug)
			System.out.println("Debug: " + s);
	}
	/**
	 * 
	 * @param b set debug mode on true/false
	 */
	public void setDebug (boolean b) {
		debug=b;
	}
	
	public void setX(double px) {
		dprint ("setX(): Changing value of X from " + x + " to " + px );
		this.x=px;
	}

	public double getX() {
		return x;
	}

	public void setY(double py)  {
		dprint ("setY(): Changing value of Y from " + y + " to " + py );
		this.y=py;
	}

	public double getY() {
		return y;
	}

	public void setXY(double px, double py) {
		this.x=px;
		this.y=py;
	}

	public double distanceFrom (Point2d pt) {
		double result= Math.sqrt (Math.pow(pt.x-x,2)+Math.pow(pt.y-y,2));
		return result;
	}

	public double distanceFromOrigin () {
		double distance;
		if (Math.abs(x)<Math.abs(y)){
			distance=y;
		}
		else distance=x;
		
		return distance;
	}

	public String toString() {
		String toString = Double.toString(x) + "," + Double.toString(y);
		return toString;
	}
}

