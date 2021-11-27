/**
 * @(#)Tester.java
 *
 *
 * @Author: 
 * @version 1.00 2021/11/29
 */
import java.io.*;
import java.util.*;
import java.text.*;

public class Tester {
  
    public static void main(String[] args) {
    	//Setup a NumberFormat object for 2 digits
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMinimumFractionDigits(2);
        formatter.setMaximumFractionDigits(2);
        
        //Declare variable
        String name;
        
        //Create a keyboard Scanner
        //Add code here
        
        
        //Create an ArrayList of BankAccount objects
        //Add code here
        
        
        //Allow use to enter names and account balances (Exit to abort)
        do
        {
        	//Get name from user
        	//Add code here
        
        	
        	
        	if (!name.equalsIgnoreCase("EXIT"))
        	{
        		//Get amount of deposit
        		//Add code here
        
        		
        		//Construct a BankAccount object 
        		//Add code here
        
        		
        		
        		//Add BankAccount to ArrayList
        		//Add code here
        
        	}
        }while(!name.equalsIgnoreCase("EXIT"));
        
        //Find and report the largest account holder and their balance
        //Add code here
        
        
        System.out.println("The largest balance of " + maxBalance + 
        	" belongs to " + maxName);
    }
}
