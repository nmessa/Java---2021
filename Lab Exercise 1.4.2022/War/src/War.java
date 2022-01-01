/**
 * @(#)War.java
 *
 * War application
 *
 * @Author:  
 * @version 1.00 2022/1/4
 */
import java.util.*;

public class War {
    
    public static void main(String[] args) {
    	Random rnd = new Random();
    	//define suits
    	String[] suits = {"clubs", "diamonds", "hearts", "spades"};
    	
    	//define face values
    	String[] faces = {"two", "three", "four", "five", "six", "seven", "eight", 
    		"nine", "ten", "jack", "queen", "king", "ace"};
    	
    	//Create an array to hold 52 cards
    	String[] cards = new String[52];
    	
    	
    	int count = 0;
    	
    	//Build deck of cards
    	//Add code here
	
    	
    	//Print the deck for testing
//    	for (int i = 0; i < cards.length; i++)
//    		System.out.println(cards[i]);
    	
    	//Shuffle the deck
    	//Add code here
	
    	
//    	System.out.println();
//    	System.out.println();
//    	System.out.println();
//    	System.out.println();
//    	
//    	//Print the deck for testing
//    	for (int i = 0; i < cards.length; i++)
//    		System.out.println(cards[i]);

		//Create and initialize variables
		boolean keepGoing = true;
		int hands = 0;
		int ties = 0;
		int myScore = 0;
		int yourScore = 0;
		int cardCount = 0;
		int myIndex, yourIndex;
		String myCard, yourCard;
		
		//Start game loop
		while(keepGoing && hands<26)
		{
			//Increment hands
			//Add code here
	
			
			//Deal card to each player incrementing cardCount with each card dealt
			//Add code here
	
			
			//Print the results of a hand
			System.out.println("I have the " + myCard);
			System.out.println("You have the " + yourCard);
			
			
			//Get the face value 
			//Add code here
	
			
			//Determine who wins
			if (myIndex > yourIndex)
			{
				//Add code here
	
			}
			else if (myIndex < yourIndex)
			{
				//Add code here
	
			}
			else
			{
				//Add code here
	
			}
			
			//Print result of the hand
			System.out.println("Current Score:");
			System.out.println("Computer " + myScore);
			System.out.println("You " + yourScore);
			System.out.println();	
		}
		
		//Output the results of the game
		System.out.println();
		System.out.println("Game over");
		if(myScore > yourScore)
			System.out.println("I win!!!");
		else if(myScore < yourScore)
			System.out.println("You win!!!");
		else
			System.out.println("It's a tie!!!");
			
		
    }//end of main
    
    //This function will shuffle the deck of cards
    public static void shuffle(String[] c)
    {
    	Random rnd = new Random();
    	String temp;
    	int rNum;
    	rNum = rnd.nextInt(52);
    	for (int i = 0; i < c.length; i++)
    	{
    		rNum = rnd.nextInt(52);
    		temp = c[i];
    		c[i] = c[rNum];
    		c[rNum] = temp;
    	}
    }
    
    //This function will determine the numberical value of the face value
    //of a card. This values will be 0 to 12 (the index of the faces array).
    //"two" will equate to 0 and "ace" will correspond to 12.
    public static int findFaceValue(String[] f, String c)
    {
    	for(int i = 0; i < f.length; i++)
    	{
    		if (f[i].equals(c))
    			return i;
    	}
    	return 0;
    }
}

//Sample Output
//I have the jack of clubs
//You have the eight of diamonds
//I win!
//Current Score:
//Computer 1
//You 0
//
//I have the five of clubs
//You have the ten of diamonds
//You win!
//Current Score:
//Computer 1
//You 1
//
//I have the three of diamonds
//You have the queen of clubs
//You win!
//Current Score:
//Computer 1
//You 2
//
//I have the nine of spades
//You have the seven of clubs
//I win!
//Current Score:
//Computer 2
//You 2
//
//I have the four of hearts
//You have the ten of clubs
//You win!
//Current Score:
//Computer 2
//You 3
//
//I have the two of hearts
//You have the six of spades
//You win!
//Current Score:
//Computer 2
//You 4
//
//I have the ace of clubs
//You have the six of hearts
//I win!
//Current Score:
//Computer 3
//You 4
//
//I have the five of diamonds
//You have the two of diamonds
//I win!
//Current Score:
//Computer 4
//You 4
//
//I have the seven of spades
//You have the seven of diamonds
//It's a tie!
//Current Score:
//Computer 4
//You 4
//
//I have the king of diamonds
//You have the king of clubs
//It's a tie!
//Current Score:
//Computer 4
//
//You 4
//
//I have the seven of hearts
//You have the five of hearts
//I win!
//Current Score:
//Computer 7
//You 4
//
//I have the jack of spades
//You have the six of diamonds
//I win!
//Current Score:
//Computer 8
//You 4
//
//I have the ace of hearts
//You have the two of spades
//I win!
//Current Score:
//Computer 9
//You 4
//
//I have the king of spades
//You have the nine of diamonds
//I win!
//Current Score:
//Computer 10
//You 4
//
//I have the ace of diamonds
//You have the queen of spades
//I win!
//Current Score:
//Computer 11
//You 4
//
//I have the nine of clubs
//You have the ten of spades
//You win!
//Current Score:
//Computer 11
//You 5
//
//I have the five of spades
//You have the eight of clubs
//You win!
//Current Score:
//Computer 11
//You 6
//
//I have the ten of hearts
//You have the four of spades
//I win!
//Current Score:
//Computer 12
//You 6
//
//I have the queen of diamonds
//You have the eight of spades
//I win!
//Current Score:
//Computer 13
//You 6
//
//I have the ace of spades
//You have the king of hearts
//I win!
//Current Score:
//Computer 14
//You 6
//
//I have the jack of diamonds
//You have the jack of hearts
//It's a tie!
//Current Score:
//Computer 14
//You 6
//
//I have the six of clubs
//You have the four of diamonds
//I win!
//Current Score:
//Computer 16
//You 6
//
//I have the nine of hearts
//You have the four of clubs
//I win!
//Current Score:
//Computer 17
//You 6
//
//I have the three of hearts
//You have the eight of hearts
//You win!
//Current Score:
//Computer 17
//You 7
//
//I have the queen of hearts
//You have the three of spades
//I win!
//Current Score:
//Computer 18
//You 7
//
//I have the two of clubs
//You have the three of clubs
//You win!
//Current Score:
//Computer 18
//You 8
//
//
//Game over
//I win!!!
