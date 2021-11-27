/**
 * @(#)PalindromeChallenge.java
 *
 * PalindromeChallenge application
 *
 * @Author: 
 * @version 1.00 2021/12/2
 */
import java.util.*;
import java.io.*;

public class PalindromeChallenge {
    
    public static void main(String[] args) throws IOException{ 
    	//Create an ArrayList to hold the Palindromes
    	//Add code here
    	
    	
    	//Declare variables
    	String word;
    	int wordCount = 0;
    	int maxPalindromeSize = 0;
    	
    	//Create a File Scanner to read from words.txt
    	//Add code here
    	
    	
    	//Read all of the words
    	while (reader.hasNext())
    	{
    		//Increment word counter
    		//Add code here
    		
    		
    		//Read a word
    		//Add code here
    		
    		
    		
    		//If the word is a palindrome add it to the ArrayList
    		//Add code here
    		
    	}
    	
    	//Search the ArrayList for the longest palindrome
    	for (int i = 0; i < pals.size(); i++)
    	{
    		//Add code here
    		
    		
    	}
    	
    	//Print out the results
    	System.out.println("There are " + wordCount + " words");
    	System.out.println("There are " + pals.size() + " palindromes");
    	System.out.println("The longest palindrome is " + maxPalindromeSize + " characters");
    	System.out.println("Here are the longest palindromes");
    	for (int i = 0; i < pals.size(); i++)
    	{
    		int palSize = pals.get(i).length();
    		if ( palSize == maxPalindromeSize)
    			System.out.println(pals.get(i));
    	}
    	
    }
    
    //This function is passed a word and returns true if it is a palindgome
    //and false if it is not
    public static boolean isPalindrome(String w)
    {
    	//Add code here
    
    
    }
}

//Output
//There are 83667 words
//There are 107 palindromes
//The longest palindrome is 7 characters
//Here are the longest palindromes
//DEIFIED
//HALALAH
//REIFIER
//REPAPER
//REVIVER
//ROTATOR
//SEMEMES
