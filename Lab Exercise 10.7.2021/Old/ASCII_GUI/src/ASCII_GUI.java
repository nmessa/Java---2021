/**
 * @(#)ASCII_GUI.java
 *
 * ASCII_GUI application
 *
 * @nmessa 
 * @version 1.00 2016/10/11
 */
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ASCII_GUI extends JFrame implements ActionListener
{
	JTextArea textarea = new JTextArea(1,3);
	JTextField inputField = new JTextField("", 1);
	JButton button1 = new JButton("Convert to ASCII");
	
	//Constructor
  	public ASCII_GUI()
	{
		super("ASCII Converter");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		Container content = getContentPane();
		FlowLayout layout = new FlowLayout();
		content.setLayout(layout);

		button1.addActionListener(this);	
		
		content.add(inputField);
		content.add(button1);
		content.add(textarea);
		
		setContentPane(content);
	}
	
	//Overridden ActionListener abstract method
	public void actionPerformed(ActionEvent event)
	{
		String inputString = inputField.getText();
		char ch = inputString.charAt(0);
		int number = (int)ch;
    	textarea.setText(Integer.toString(number));
	}
	
	public static void main(String[] args) {
        ASCII_GUI eg = new ASCII_GUI();
    }
}
