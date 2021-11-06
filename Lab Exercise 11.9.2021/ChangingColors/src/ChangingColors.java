/**
 * @(#)ChangingColors.java
 *
 *
 * @Author: nmessa 
 * @version 1.00 2021/11/9
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ChangingColors extends JFrame implements ItemListener{
	private Container contents;
 	private JRadioButton red, green, blue;
 	private ButtonGroup colorGroup;
 	private JLabel label;
 	private Color selectedColor = Color.RED;

    public ChangingColors() {
    	super( "Selecting a color" );
    	
    	//Create a content pane
  		//Add code here
        
        	
  		
  		//Set the flow layout
  		//Add code here
        
        	

		//Create 3 JRadioButtons
  		//Add code here
        
        	

		//Create a JLabel
  		//Add code here
        
        	
		
		//Add buttons and label to content pane
  		//Add code here
        
        	

  		// create button group
  		//Add code here
        
        	

		//Create ItemListeners for the buttons
  		//Add code here
        
        	

		//Set frame size
  		//Add code here
        
        	
  		
  		//Make frame visible
  		//Add code here
        
        	
    }
    
    public void itemStateChanged( ItemEvent ie )
  	{
  		//Add code here
        
        	
  	}

 	public static void main( String [] args )
 	{
  		ChangingColors cc = new ChangingColors( );
  		cc.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
 	}
}