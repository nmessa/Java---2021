/**
 * @(#)MyColor.java
 *
 *
 * @Author:  
 * @version 1.00 2021/12/13
 */


public class MyColor {
	private int red;
	private int green;
	private int blue;

	//Constructor
    public MyColor(int r, int g, int b) {
    	//Add code here
    	
    }
    
    //Returns the Euclidean distance to another color
    public double distanceTo(MyColor c)
    {
    	//Add code here
    	
    }
    
    //Returns the color (r, g, b) value
    public String toString()
    {
    	String str = "(" + Integer.toString(red) + ", " + Integer.toString(green) + 
    		", " + Integer.toString(blue) + ")";
    	return str;
    }
    
    
}