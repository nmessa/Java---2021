// Rectangle.java
// Lab Exercise 12.16.2021
// Author: nmessa

class MyRectangle {
	private int top, bottom, left, right;
	
	//Constructor using 4 parameters
	public MyRectangle(int l, int r, int t, int b)
	{
		//Add code here
    	
    	
	}
	
	//Constructor from another rectangle
	public MyRectangle(MyRectangle other)
	{
		//Add code here
		
	}
	
	//Check for empty rectangle
	public boolean isEmpty()
	{
		//Add code here
		
	}
	
	//Check to see if a circle is inside a rectangle
	public boolean isInside(int x, int y, int r)
	{
		//Add code here
		
	}
	
	//Check to see if a point is inside a rectangle
	public boolean isInside(int x, int y)
	{
		//Add code here
		
	}
	
	public String toString()
	{
		String s = "";
		s += "Left = " + Integer.toString(left) + "\n";
		s += "Right = " + Integer.toString(right) + "\n";
		s += "Top = " + Integer.toString(top) + "\n";
		s += "Bottom = " + Integer.toString(bottom) + "\n";
		return s;
	}		
}
