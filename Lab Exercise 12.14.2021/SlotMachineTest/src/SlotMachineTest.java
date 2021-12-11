/**
 * @(#)SlotMachineTest.java
 *
 * SlotMachineTest application
 *
 * @Author: 
 * @version 1.00 2021/12/14
 */
import java.util.*;

public class SlotMachineTest {
    
    public static void main(String[] args) {
    	//Declare variables
    	boolean playAgain = true;
    	int bet = 0;
    	double cash;
    	String choice = "";
    	
    	//Create a keyboard Scanner object
    	//Add code here
    	
    	
    	//Purchase the tokens to be stored in the machine
    	//Add code here
    	
    	
    	//Calculate the cash equivalent of tokens purchased
    	//Add code here
    	
    	
    	//Construct a slot machine object
    	//Add code here
    	
    	
    	//Game Loop
    	while (playAgain)
    	{
    		//Get wager from user
    		//Add code here
    	
    		
    		//Pull the one-armed bandit's arm
    		//Add code here
    	
    		
    		//Query user to play again (y/n) and store in choice
    		//Add code here
    	
    		
    		//Process the choice for a no response
    		if (choice.equals("n"))
    		{
    			playAgain = false;
    			double remaining;
    			
    			//Find the remaining value of your tokens
    			//Add code here
    	
    			
    			//print result (win, lose, broke even)
    			//Add code here
    	
    		}
    			
    	}
    }
}
