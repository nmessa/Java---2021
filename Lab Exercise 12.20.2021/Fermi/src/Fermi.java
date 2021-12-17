/**
 * @(#)Fermi.java
 *
 * Fermi application
 *
 * @Author:  
 * @version 1.00 2021/12/20
 *
 * The goal of the game is for the player to guess the digits in
 * the three positions in the least number of tries.  For each guess,
 * the player provides three digits for position 1, 2, and 3.
 * The program replies with a hint consisting of Fermi, Pico, and Nano.
 * If the digit guess for a given position is correct, then the reply is Fermi.
 * If the digit guessed for a given position is in a different position, then
 * the reply is Pico.  If the digit guessed for a given position does not match
 *any of the three digits, then the reply is Nano. 
 */
 
import java.util.*;

public class Fermi {
    
    public static void main(String[] args) {
    	//Declare variables
    	String secret, guess, hint;
    	boolean again = true;
    	int count;
    	char answer;
    	
    	//Create a keyboard Scanner object
    	//Add code here
    	
    	
    	while (again)
    	{
    		//Generate secret string by calling generateSecret function and initializing count to 0
    		//Add code here
    	
    	
    		//Get user guess and increment count
    		//Add code here
    	
    	
    		//Call giveHint and print out the hint
    		//Add code here
    	
    		
    		//Play the game
    		while (!hint.equals("fermi fermi fermi"))
    		{
    			//Get user guess
    			//Add code here
    	
    			
    			//Get hint and print
    			//Add code here
    	
    			
    			//Increment count
    			//Add code here
    	
    		}
    		
    		//Print out game result
    		System.out.println("You guessed the number in " + count + " guesses");
    		System.out.print("Play again(y/n)? ");
    		answer = reader.next().charAt(0);
    		if (answer == 'n')
    			again = false;
    	}
    	
    	
    }
    
    public static String generateSecret()
    {
    	//Create a random number generator
    	//Add code here
    	
    	
    	//Declare variables
    	String numbers = "123456789";
    	String temp = "";
    	int rNum;
    	char ch;
    	
    	//Generate 3 digit secret number with unique digits
    	while (temp.length() < 3)
    	{
    		//Add code here
    	
    	
    	}
    	return temp;
    		
    }
    
    public static String giveHint(String g, String s)
    {
    	//Declare variables
    	char one, two, three;
    	int first, second, third;
    	String result = "";  //Used to hold the hint phrase
    	
    	
    	//extract individual characters from the guess
    	//Add code here
    	
    	
    	//Determine the status of first digit
    	first = s.indexOf(one);
    	//Add code here
    	
    		
    	//Determine the status of second digit
    	//Add code here
    	
    	
    	//Determine the status of third digit
    	//Add code here
    	
    	
    	return result;
    }
}
