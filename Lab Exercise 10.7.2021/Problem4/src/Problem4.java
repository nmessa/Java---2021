/**
 * @(#)Problem4.java
 *
 * Problem4 application
 *
 * @Author:  
 * @version 1.00 2021/10/7
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Problem4 extends JFrame implements ActionListener{
	//Create objects
    JTextArea textarea = new JTextArea(1,3);
	JTextField inputField = new JTextField("", 1);
	JButton button1 = new JButton("Convert to ASCII");
	
	//Constructor
  	public Problem4()
	{
		super("ASCII Converter");
		
		//Set window size
		//Add code here
		
		//Set default close operation
		//Add code here
		
		//Make frame visible
		//Add code here
		
		//Create container
		//Add code here
		
		//Set flow layout and apply to container
		//Add code here

		//Add actionlister to button1
		//Add code here	
		
		//Add components to container
		//Add code here
		
		//Implement content pane
		//Add code here
	}
	
	//Overridden ActionListener abstract method
	public void actionPerformed(ActionEvent event)
	{
		//Add code here
		
		
	}
	
    public static void main(String[] args) {
    	
    	Problem4 eg = new Problem4();
    }
}
