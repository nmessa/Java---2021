/**
 * @(#)HelloSA2.java
 *
 * HelloSA2 application
 *
 * @Author: 
 * @version 1.00 2021/9/16
 */
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class HelloSA2 extends Applet{
	//define static class variable
	//This must be static because it is referenced by main
    private static String str;

	//define a paint method
	//all applets have paint method
	//this overloads the built in paint method that paints a blank screen
	public void paint(Graphics screen)
	{
		//Add code here
    	
	}

    public static void main(String[] args)
    {
    	//Construct Scanner object
    	//Add code here
    	
    	
    	//Get phrase from user and store in str
    	//Add code here
    	
    	
    	//Construct a Frame to put the Applet in
        //Add code here
    	
        
        //Set frame size to 400 x 300
        //Add code here
    	
        
        //Construct an Applet and add to Frame
        //Add code here
    	
        
        //Make visible
        //Add code here
    	

		//define a WindowListener method
        myFrame.addWindowListener(new WindowAdapter()
        {
        	public void windowClosing(WindowEvent e)
        	{
        		System.exit(0);
        	}
        });
    }//end of main
}//end of class
