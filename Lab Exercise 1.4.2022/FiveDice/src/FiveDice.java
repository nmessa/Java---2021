/**
 * @(#)FiveDice.java
 *
 * FiveDice application
 *
 * @Author:  
 * @version 1.00 2022/1/4
 */
import java.util.*;

public class FiveDice {
    
    public static void main(String[] args) {
    	//Declare Variables
    	boolean keep_going = true;
    	int count=0;
    	int score = 0;
    	int three = 0;
    	int four = 0;
    	int five = 0;
    	int[] dice = new int[5];
    	Random rnd = new Random();
    	
    	//Start Game Loop
    	while (keep_going)
    	{
    		//Increment count
    		//Add code here
	
    		
    		//Roll the five dice	
    		//Add code here
	
    		
    		//Print the results of roll
    		//Add code here
	
    		
    		//Sort the dice
    		//Add code here
	
    		
    		//Check for Yahtzee
    		//Add code here
	
    		
    		//Check for four of a kind
    		//Add code here
	
    		
    		//Check for three of a kind
    		//Add code here
	
    		
    		//If score gets to 1000, end game loop
    		//Add code here
		
    	}
    	
    	//Print the results of the game
    	System.out.println("It took " + count + " rolls to get to 1000 points");
    	System.out.println("Threes: " + three);
    	System.out.println("Fours: " + four);
    	System.out.println("Fives: " + five);
    }
}

//Sample Output
//You rolled 2 1 3 1 4 
//You rolled 1 3 2 4 4 
//You rolled 3 2 1 4 3 
//You rolled 1 4 5 2 3 
//You rolled 1 4 4 4 3 
//Three of a kind
//You rolled 2 1 5 2 5 
//You rolled 1 2 3 4 1 
//You rolled 4 4 1 3 5 
//You rolled 4 1 4 2 5 
//You rolled 2 2 2 4 4 
//Three of a kind
//You rolled 5 2 3 3 2 
//You rolled 5 3 2 3 3 
//Three of a kind
//You rolled 4 3 5 2 5 
//You rolled 5 4 4 2 3 
//You rolled 5 1 1 2 1 
//Three of a kind
//You rolled 1 3 1 1 5 
//Three of a kind
//You rolled 1 1 4 4 2 
//You rolled 2 1 2 2 2 
//Four of a kind
//You rolled 2 1 2 1 3 
//You rolled 2 2 2 1 1 
//Three of a kind
//You rolled 1 5 4 5 2 
//You rolled 5 1 1 2 1 
//Three of a kind
//You rolled 2 3 5 4 4 
//You rolled 5 4 4 5 5 
//Three of a kind
//You rolled 2 3 3 1 1 
//You rolled 2 5 4 3 5 
//You rolled 3 2 4 1 4 
//You rolled 4 1 5 1 4 
//You rolled 4 3 2 2 4 
//You rolled 5 2 1 5 1 
//You rolled 5 3 3 2 2 
//You rolled 3 1 3 2 4 
//You rolled 1 5 2 5 3 
//You rolled 3 1 5 3 5 
//You rolled 5 2 3 3 5 
//You rolled 2 2 5 3 5 
//You rolled 2 2 3 1 5 
//You rolled 4 3 2 2 2 
//Three of a kind
//You rolled 3 1 5 4 5 
//You rolled 4 2 5 4 1 
//You rolled 1 3 3 4 4 
//You rolled 1 2 4 5 3 
//You rolled 3 5 3 2 1 
//You rolled 3 3 4 5 5 
//You rolled 2 2 3 2 3 
//Three of a kind
//You rolled 4 1 4 2 1 
//You rolled 3 3 1 3 1 
//Three of a kind
//You rolled 3 1 1 4 2 
//You rolled 2 3 1 3 1 
//You rolled 3 3 5 3 3 
//Four of a kind
//You rolled 4 2 4 1 1 
//You rolled 4 5 3 2 2 
//You rolled 5 3 2 1 3 
//You rolled 3 5 3 1 2 
//You rolled 4 1 5 3 2 
//You rolled 2 3 5 5 3 
//You rolled 5 4 5 1 4 
//You rolled 3 4 4 5 1 
//You rolled 5 4 4 4 2 
//Three of a kind
//You rolled 2 2 4 5 3 
//You rolled 4 4 2 1 1 
//You rolled 4 1 2 1 2 
//You rolled 5 3 3 2 3 
//Three of a kind
//You rolled 5 3 5 2 4 
//You rolled 2 1 1 4 2 
//You rolled 4 1 2 4 2 
//You rolled 4 4 5 2 3 
//You rolled 3 4 2 1 2 
//You rolled 2 2 4 3 1 
//You rolled 4 1 2 2 4 
//You rolled 1 4 2 1 3 
//You rolled 5 3 2 1 2 
//You rolled 1 5 2 2 1 
//You rolled 1 1 1 4 4 
//Three of a kind
//You rolled 3 4 5 5 2 
//You rolled 1 2 5 4 3 
//You rolled 1 1 1 5 5 
//Three of a kind
//You rolled 1 3 5 1 1 
//Three of a kind
//You rolled 2 2 5 5 4 
//You rolled 4 1 4 1 5 
//You rolled 4 2 1 2 5 
//You rolled 3 5 1 2 3 
//You rolled 4 2 2 1 5 
//You rolled 4 2 3 1 4 
//You rolled 1 2 1 1 4 
//Three of a kind
//You rolled 4 1 3 3 3 
//Three of a kind
//You rolled 2 5 3 1 5 
//You rolled 5 2 2 4 3 
//You rolled 2 4 2 1 4 
//You rolled 4 5 5 1 3 
//You rolled 4 4 3 1 1 
//You rolled 3 2 3 3 1 
//Three of a kind
//You rolled 5 4 4 2 3 
//You rolled 2 4 3 3 1 
//You rolled 5 2 4 5 5 
//Three of a kind
//You rolled 5 3 5 4 1 
//You rolled 1 4 1 3 3 
//You rolled 5 1 3 5 1 
//You rolled 3 4 5 1 2 
//You rolled 4 3 4 2 5 
//You rolled 4 1 5 4 1 
//You rolled 3 1 4 2 3 
//You rolled 5 2 3 3 2 
//You rolled 3 1 3 4 2 
//You rolled 2 2 5 4 1 
//You rolled 2 4 4 4 3 
//Three of a kind
//You rolled 1 3 2 2 5 
//You rolled 4 5 5 3 2 
//You rolled 3 2 1 4 4 
//You rolled 2 4 4 1 3 
//You rolled 3 5 1 5 4 
//You rolled 3 5 3 3 1 
//Three of a kind
//You rolled 2 4 4 3 1 
//You rolled 5 4 3 2 3 
//You rolled 3 2 3 3 4 
//Three of a kind
//You rolled 4 2 2 3 5 
//You rolled 2 5 5 1 2 
//You rolled 4 4 4 5 3 
//Three of a kind
//You rolled 4 2 4 4 5 
//Three of a kind
//You rolled 5 2 2 2 4 
//Three of a kind
//You rolled 2 1 4 4 1 
//You rolled 4 2 5 3 5 
//You rolled 3 5 1 3 2 
//You rolled 1 5 4 5 2 
//You rolled 5 2 3 2 3 
//You rolled 2 4 1 3 2 
//You rolled 4 4 1 4 2 
//Three of a kind
//You rolled 5 4 5 2 1 
//You rolled 1 4 1 3 3 
//You rolled 4 2 5 1 3 
//You rolled 1 3 2 4 2 
//You rolled 4 2 4 5 3 
//You rolled 4 3 3 4 3 
//Three of a kind
//You rolled 2 3 2 3 1 
//You rolled 4 3 1 2 3 
//You rolled 4 3 5 1 1 
//You rolled 1 2 3 3 4 
//You rolled 2 4 2 3 2 
//Three of a kind
//You rolled 4 1 1 4 4 
//Three of a kind
//You rolled 2 2 1 1 3 
//You rolled 4 2 4 5 3 
//You rolled 3 2 5 4 4 
//You rolled 5 4 2 5 4 
//You rolled 5 4 2 3 1 
//You rolled 5 5 1 2 5 
//Three of a kind
//You rolled 4 4 5 4 4 
//Four of a kind
//You rolled 2 2 4 1 1 
//You rolled 3 4 3 1 3 
//Three of a kind
//You rolled 2 5 1 2 4 
//You rolled 4 5 5 2 1 
//You rolled 3 2 2 2 1 
//Three of a kind
//You rolled 2 1 3 5 3 
//You rolled 5 4 2 3 5 
//You rolled 5 5 5 3 1 
//Three of a kind
//You rolled 4 5 4 3 5 
//You rolled 5 1 3 1 2 
//You rolled 1 2 2 5 4 
//You rolled 3 2 5 4 5 
//You rolled 4 1 4 2 5 
//You rolled 1 2 2 2 1 
//Three of a kind
//You rolled 1 1 3 1 4 
//Three of a kind
//You rolled 5 3 4 2 1 
//You rolled 4 3 3 2 2 
//You rolled 4 2 2 3 4 
//You rolled 4 5 4 2 4 
//Three of a kind
//You rolled 3 1 4 3 1 
//You rolled 4 2 3 1 2 
//You rolled 5 4 4 5 2 
//You rolled 1 2 5 2 2 
//Three of a kind
//You rolled 5 4 3 2 1 
//You rolled 2 2 1 2 4 
//Three of a kind
//You rolled 2 5 2 5 3 
//You rolled 1 4 3 2 4 
//You rolled 3 2 4 4 3 
//You rolled 5 1 4 4 5 
//You rolled 3 3 5 2 5 
//You rolled 1 4 2 2 2 
//Three of a kind
//You rolled 5 3 1 5 1 
//You rolled 5 1 5 4 1 
//You rolled 2 4 1 2 5 
//You rolled 3 1 1 4 1 
//Three of a kind
//You rolled 5 3 5 3 3 
//Three of a kind
//You rolled 1 4 2 1 3 
//You rolled 3 5 1 1 2 
//You rolled 2 5 3 3 5 
//You rolled 4 3 5 5 2 
//You rolled 4 5 5 2 4 
//You rolled 1 2 2 4 3 
//You rolled 5 1 5 1 1 
//Three of a kind
//You rolled 4 1 1 2 2 
//You rolled 1 5 4 3 2 
//You rolled 4 5 5 2 5 
//Three of a kind
//You rolled 3 5 3 4 4 
//You rolled 5 5 1 1 2 
//You rolled 2 2 4 3 4 
//You rolled 4 4 5 4 5 
//Three of a kind
//You rolled 3 5 1 4 2 
//You rolled 4 5 5 5 4 
//Three of a kind
//You rolled 3 1 5 2 3 
//You rolled 4 3 3 1 5 
//You rolled 5 5 1 2 1 
//You rolled 5 2 3 5 3 
//You rolled 2 1 4 3 5 
//You rolled 3 3 5 3 4 
//Three of a kind
//You rolled 3 2 4 4 4 
//Three of a kind
//You rolled 5 3 1 4 3 
//You rolled 5 2 1 1 4 
//You rolled 2 2 3 4 1 
//You rolled 3 4 4 2 4 
//Three of a kind
//You rolled 3 4 3 5 2 
//You rolled 5 4 1 4 3 
//You rolled 4 1 2 3 2 
//You rolled 4 3 1 5 4 
//You rolled 3 3 4 4 1 
//You rolled 2 1 4 3 4 
//You rolled 2 5 1 3 5 
//You rolled 3 1 4 5 5 
//You rolled 1 3 1 5 3 
//You rolled 5 3 1 5 2 
//You rolled 1 2 1 2 3 
//You rolled 5 1 3 1 5 
//You rolled 3 1 3 2 1 
//You rolled 3 2 2 2 2 
//Four of a kind
//You rolled 3 3 3 5 2 
//Three of a kind
//You rolled 2 1 4 4 2 
//You rolled 2 5 3 2 4 
//You rolled 1 5 3 5 4 
//You rolled 4 5 5 3 5 
//Three of a kind
//You rolled 4 2 2 1 1 
//You rolled 1 1 5 5 1 
//Three of a kind
//You rolled 4 5 3 3 3 
//Three of a kind
//You rolled 3 5 4 1 1 
//You rolled 1 2 1 3 4 
//You rolled 2 2 2 2 2 
//Yahtzee!
//You rolled 5 3 3 4 5 
//You rolled 2 5 1 4 4 
//You rolled 2 5 3 2 1 
//You rolled 3 5 5 1 2 
//You rolled 2 2 1 3 3 
//You rolled 5 2 4 3 1 
//You rolled 4 5 2 4 1 
//You rolled 4 4 4 3 3 
//Three of a kind
//You rolled 5 1 2 3 5 
//You rolled 1 2 5 2 3 
//You rolled 2 1 3 3 5 
//You rolled 1 4 4 1 5 
//You rolled 3 5 4 5 5 
//Three of a kind
//You rolled 5 5 5 2 5 
//Four of a kind
//You rolled 4 5 3 4 3 
//You rolled 1 1 1 2 3 
//Three of a kind
//You rolled 5 3 1 3 4 
//You rolled 1 3 2 2 5 
//You rolled 5 5 2 5 2 
//Three of a kind
//You rolled 1 2 1 1 1 
//Four of a kind
//You rolled 4 4 2 1 2 
//You rolled 4 1 2 2 1 
//You rolled 1 4 5 1 1 
//Three of a kind
//You rolled 5 5 4 5 1 
//Three of a kind
//You rolled 1 3 1 2 1 
//Three of a kind
//You rolled 5 5 1 5 3 
//Three of a kind
//You rolled 4 5 1 2 5 
//You rolled 2 2 2 3 4 
//Three of a kind
//You rolled 1 4 4 3 4 
//Three of a kind
//You rolled 3 3 5 4 1 
//You rolled 3 5 4 4 4 
//Three of a kind
//You rolled 3 2 5 4 1 
//You rolled 3 5 4 3 4 
//You rolled 1 5 4 1 2 
//You rolled 5 4 5 5 5 
//Four of a kind
//You rolled 1 4 2 4 1 
//You rolled 4 2 5 4 3 
//You rolled 1 5 2 3 5 
//You rolled 5 5 4 5 2 
//Three of a kind
//You rolled 3 2 2 4 2 
//Three of a kind
//You rolled 2 5 5 5 4 
//Three of a kind
//You rolled 3 4 2 3 2 
//You rolled 5 4 1 1 4 
//You rolled 1 5 1 4 5 
//You rolled 4 2 5 3 3 
//You rolled 1 1 4 3 4 
//You rolled 2 5 5 3 2 
//You rolled 4 4 1 2 3 
//You rolled 3 1 4 3 2 
//You rolled 4 4 3 4 2 
//Three of a kind
//You rolled 3 2 4 3 4 
//You rolled 2 3 1 3 4 
//You rolled 3 1 4 3 2 
//You rolled 3 4 4 4 3 
//Three of a kind
//You rolled 5 4 4 1 3 
//You rolled 2 1 2 1 3 
//You rolled 3 4 3 1 4 
//You rolled 1 5 3 5 5 
//Three of a kind
//You rolled 1 3 2 4 2 
//You rolled 3 2 3 5 5 
//You rolled 5 5 4 3 5 
//Three of a kind
//You rolled 5 5 4 5 3 
//Three of a kind
//You rolled 4 4 1 2 1 
//You rolled 5 1 5 5 3 
//Three of a kind
//You rolled 2 5 5 3 2 
//You rolled 1 4 5 4 4 
//Three of a kind
//You rolled 2 4 3 1 3 
//You rolled 3 3 5 5 4 
//You rolled 1 3 1 2 5 
//You rolled 2 1 5 5 4 
//You rolled 3 3 2 2 4 
//You rolled 5 3 1 5 2 
//You rolled 5 2 1 4 5 
//You rolled 5 1 1 3 3 
//You rolled 3 4 4 1 3 
//You rolled 1 3 1 3 4 
//You rolled 5 1 1 3 5 
//You rolled 5 3 1 2 2 
//You rolled 1 4 3 2 1 
//You rolled 5 2 2 5 1 
//You rolled 5 1 3 3 3 
//Three of a kind
//You rolled 2 4 3 5 2 
//You rolled 5 1 1 3 4 
//You rolled 3 3 2 1 4 
//You rolled 4 5 4 1 1 
//You rolled 5 1 5 3 5 
//Three of a kind
//You rolled 2 4 4 3 3 
//You rolled 5 2 5 4 4 
//You rolled 1 2 2 1 3 
//You rolled 1 2 4 2 3 
//You rolled 1 5 5 2 5 
//Three of a kind
//You rolled 5 2 3 3 2 
//You rolled 2 3 4 5 2 
//You rolled 3 4 1 5 4 
//You rolled 1 5 1 5 2 
//You rolled 2 4 2 4 3 
//You rolled 2 2 1 4 1 
//You rolled 5 1 2 5 3 
//You rolled 3 5 1 5 5 
//Three of a kind
//It took 333 rolls to get to 1000 points
//Threes: 78
//Fours: 7
//Fives: 1