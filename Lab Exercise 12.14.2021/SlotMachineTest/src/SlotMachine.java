//SlotMachine class
//Author: 
//Date: 12/14/2021

import java.util.*;

public class SlotMachine {
	//declare variables
	private String slot1;
	private String slot2;
	private String slot3;
	private int M;
	private String slots[]= {"BELL", "GRAPE", "CHERRY"};
	
	//Create a random number generator object
	//Add code here
    	
	
	//Constructor
	public SlotMachine(int m)
	{
		//Add code here
    	
	}
	
	public void pullHandle(int b)
	{
		//declare variables
		int amount = 0;
		
		//check to see if you have enough tokens to play
		if (b > M)
		{
			System.out.println("Insufficient Funds");
		}	
		else
		{
			//Subtract wager from token balance
			//Add code here
    	
			
			//Generate 3 slot values
			//Add code here
    	
			
			//Show result
			//Add code here
    	
			
			//Calculate tokens won
			//Add code here
    	
			
			//print result
			//Add code here
    	
			
			//add tokens won to token balance (M)
			//Add code here
    	
		}
		
		System.out.println("You now have " + M + " tokens");
	}
	
	public void display()
	{
		//Display the 3 slot values
		//Add code here
    	
	}
	
	public int payOut()
	{
		//Create the slot values string
		//Add code here
    	
		
		//Determine payout
		//Add code here
    	
	}
	
	private int countCherries()
	{
		//Count the number of cherries
		//Add code here
    	
	}
	
	public double cashin()
	{
		//Calculate Chuck-E-Cheese store script amount
		//Add code here
    	
	}
		
		
}
