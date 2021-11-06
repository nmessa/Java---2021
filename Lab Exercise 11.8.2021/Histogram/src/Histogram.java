/**
 * @(#)Histogram.java
 *
 * Histogram Applet application
 *
 * @Author:  
 * @version 1.00 2021/11/8
 */
 
import java.awt.*;
import java.applet.*;
import java.util.Random;

public class Histogram extends Applet {
	private static int total[] = {0,0,0,0,0,0,0,0,0,0,0,0,0};
	private static final int TRIALS = 2000;
	private static Color colors[] = {Color.RED, Color.GREEN};

	
	public void init(){
		//Initialize variables
        Random rndm = new Random();
        int die1=0, die2=0, dice;
        
        //Run simulation
        //Add code here
        
        	
	}

	public void paint(Graphics g) {
		
		g.drawString("Dice Roll Simulation with " 
			+ TRIALS + " trials", 300, 30 );
		//Add code here
        
        	
		
	}
}