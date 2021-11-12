/**
 * @(#)MonteHall.java
 *
 * MonteHall application
 *
 * @Author:  
 * @version 1.00 2021/11/19
 */
import java.util.*;

public class MonteHall {
	//Define constant NUM_TRIALS
    final static int NUM_TRIALS = 1000000;
    
    public static void main(String[] args) {
    	//Declare variables
    	int prizeDoor, playerDoor, switchDoor, wins = 0, rNumber;
    	
    	//Create a Random object
    	Random rnd = new Random();
    	
    	//Simulate without switch
    	//Pick a random player door and a random prize door
    	//if the player door is the same as the prize door
    	//the player wins
    	for (int i = 0; i < NUM_TRIALS; i++)
    	{
    		//Add code here
    			
    			
    	}
    	
    	//Print the result
    	System.out.println("Probability of winning without switch = " + 
    		(double)wins/NUM_TRIALS);
    		
    		
    	//reset the win counter	
    	wins = 0;	//reset the win counter
    	
    	//Simulate with switch
    	//Pick a random player door and a random prize door
    	//
    	//if the player door is the same as the prize door
    	//the player wins
    	for (int i = 0; i < NUM_TRIALS; i++)
    	{
    		//Assign prizeDoor and playerDoor
    		//Add code here
    			
			
			//loop until you get a door to switch to that is not
			//the players door and not the prize door
			//Add code here
    			
			
			//assign switchDoor to playerDoor
			//Add code here
    			
			
			//Test for win
    		//Add code here
    			
    			
    	}
    	
    	//Print the result
    	System.out.println("Probability of winning with switch  = " + 
    		(double)wins/NUM_TRIALS);
    }
}

//Output
//Probability of winning without switch = 0.333534
//Probability of winning with switch  = 0.667374