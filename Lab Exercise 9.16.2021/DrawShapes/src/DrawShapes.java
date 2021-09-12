/**
 * @(#)DrawShapes.java
 *
 * DrawShapes application
 *
 * @Author: 
 * @version 1.00 2021/9/16 Problem 3
 */
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class DrawShapes extends Applet{
	
	//define a paint method
	//all applets have paint method
	//this overloads the built in paint method that paints a blank screen
    public void paint(Graphics screen)
	{
		//Draw rectangle in applet window
		//Add code here
    	
		
		//Draw rectangle in applet window
		//Add code here
    	
	}

    public static void main(String[] args)
    {
    	//Construct a Frame to hold the Applete
        //Add code here
        
        
        //Set frame size to 400 x 300
        //Add code here
    	
        
        //Construct the Applet
        //Add code here
    	
        
        //Add the applet to the frame
        //Add code here
    	
        
        //Make frame visible
       //Add code here
    	

		//Define a WindowListener
        myFrame.addWindowListener(new WindowAdapter()
        {
        	public void windowClosing(WindowEvent e)
        	{
        		System.exit(0);
        	}
        });
    }//end of main
}//end of class
