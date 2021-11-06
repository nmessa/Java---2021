/**
 * @(#)Login.java
 *
 *
 * @Author:  
 * @version 1.00 2021/11/9
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Login extends JFrame implements ActionListener{
	//Create a Container, JLabel, JTextField, JPasswordField, JTextArea
	//Add code here
        
        	

    public Login() {
    	super("Login Screen");
    	//Get contgent pane
  		//Add code here
        
        	
  		
  		//Set the flow layout
  		//Add code here
        
        	

		//Create a JLabel and JTextField
  		//Add code here
        
        	

		//Create a JLabel and JPasswordField and set the echo character to ?
  		//Add code here
        
        	

		//Create a JLabel
  		//Add code here
        
        	

  		// instantiate JTextArea with legal warning that is not editable
  		//Add code here
        
        	

  		// add all components to the window
  		//Add code here
        
        	
  		
  		// add event handler as listener for ID and password fields
  		//Add code here
        
        	

		//Set size of frame
  		//Add code here
        
        	
  		
  		//Make the frame visible
  		//Add code here
        
        	
    }
    
    public void actionPerformed(ActionEvent e)
  	{
   		//Add code here
        
        	
  	}

 	public static void main(String [] args)
 	{
  		Login login = new Login();
  		login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	}
}