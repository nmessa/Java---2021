/**
 * @(#)MixingColors.java
 *
 *
 * @Author:  
 * @version 1.00 2021/11/9
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MixingColors extends JFrame implements ItemListener {
	//Create a Container, JCheckBox, JLabel and 3 integers
	//Add code here
        
        	

    public MixingColors() {
    	super( "Selecting a color" );
    	
    	//Get content pane
  		//Add code here
        
        	
  		
  		//Set the flow layout
  		//Add code here
        
        	
		
		//Instantiate 3 JCheckBox objects
  		//Add code here
        
        	

		//Instantiate a JLabel object
  		//Add code here
        
        	

		//Add 3 JCheckBox objects and JLabel to contents
  		//Add code here
        
        	

		//Add ItemListeners to JCheckBox objects
  		//Add code here
        
        	

		//Set the size of frame
  		//Add code here
        
        	
  		
  		//make frame visible
  		//Add code here
        
        	
    }
    
    public void itemStateChanged( ItemEvent ie )
  	{
   		//Add code here
        
        	
  	}

 	public static void main( String [] args )
 	{
  		MixingColors mc = new MixingColors( );
  		mc.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
 	}

}