/**
 * @(#)JCalculator.java
 *
 * JCalculator Windows Application
 *
 * @nmessa 
 * @version 1.00 10/1/2021
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JCalculator extends JFrame implements ActionListener 
{
	//Declare global variables
	JTextField number;
	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
	JButton bDot, bAdd, bSub, bMult, bDiv, bEquals;
	JButton bChangeSign, bClear, bPow;
	Boolean firstNumber = true;
	String str="";
	char operator = '\0';
	double first=0.0, second=0.0;

	//Constructor
	public JCalculator() {
		super("My Wonderful Error Free Calculator");
		//Construct components
		//Add code here
		
		
		
		
		
		// Add actionListeners
		//Add code here
		
		
      	
      	// Create containers and set layout to FlowLayout
		//Add code here
		
		
      	
      	// add components to containers
      	//Add code here
      	
      	
      	
      	//Set size of calculator to 220 x 300
      	//Add code here
      	
      	//set default close operation
		//Add code here
		
		//make applet visible
		//Add code here
		

	}

	//Handles all actions when a button is clicked
	public void actionPerformed(ActionEvent event){
		double answer = 0.0;
		if (firstNumber)
		{
			//Add code here
			
			
			
			
			
		} //end of first number if
		
		if (!firstNumber)
		{
			//Add code here
			
			
			
		} //end of not first number if
		
		if (event.getSource( ) == bClear)
		{
		//Add code here
		
		
		} 
	}//end of actionPerformed
}//end of JCalculator class