/**
 * @(#)FoodSamplings.java
 *
 *
 * @Author:  
 * @version 1.00 2021/11/9
 */
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class FoodSamplings extends JFrame implements ListSelectionListener{
	//Create a Container, JList, and JLabel
	//Add code here
        
        	

	//Create and array of country names
 	//Add code here
        
        	
 		
 	//Create an array of ImageIcon objects
 	//Add code here
        
        	

    public FoodSamplings() {
    	super( "Food samplings of various countries" );
    	
    	//Get a content pane
  		//Add code here
        
        	
  		
  		//Set the flow layout
  		//Add code here
        
        	
  		
  		// instantiate the components (JList and JLabel)
  		//Add code here
        
        	
  		
  		// allow single selections only
  		//Add code here
        
        	
  		
  		// add components to the content pane
  		//Add code here
        
        	
  		
  		//Add a ListSelectionListener to the JList
  		//Add code here
        
        	
  		
  		//Set theframe size
  		//Add code here
        
        	
  		
  		//Make frame visible
  		//Add code here
        
        	
    }
    
    public void valueChanged( ListSelectionEvent lse )
  	{
   		//Add code here
        
        	
  	}

 	public static void main( String [] args )
 	{
  		FoodSamplings fs = new FoodSamplings( );
  		fs.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
 	}

    
}