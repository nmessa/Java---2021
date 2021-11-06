/**
 * @(#)HistogramSA.java
 *
 * HistogramSA application
 *
 * @Author:  
 * @version 1.00 2021/11/8
 */

import javax.swing.JFrame;
import java.awt.*;
import java.util.Random;

public class HistogramSA extends Canvas{
	
	//Declare static variables 
    private static int total[] = {0,0,0,0,0,0,0,0,0,0,0,0,0};
	private static final int TRIALS = 10000;
	private static Color colors[] = {Color.RED, Color.GREEN};
	
    public static void main(String[] args) {
    	//Construct a JFrame object
    	//Add code here
        
        	
    	
    	//Construct a Canvas object from a HistogramSA
        //Add code here
        
        	
        
        //Set the size of canvas to 1000 x 800
        //Add code here
        
        	
        
        //Add the canvas to the frame
        //Add code here
        
        	
        
        //pack thee frame and make visible
        //Add code here
        
        	;  
        	
        //Call the generateHistogram method
        //Add code here
        
        	
    }
    
    
    public static void generateHistogram()
    {
    	//Initialize variables
        Random rndm = new Random();
        int die1=0, die2=0, dice;
        
        //Run simulation
        //Add code here
        
        	
    }
    
    //paint the histogram on the canvas
    public void paint(Graphics g) 
    {
		g.drawString("Dice Roll Simulation with " + TRIALS + " trials", 450, 30 );
		
		//Add code here
        
        	
	}
    
    
}
