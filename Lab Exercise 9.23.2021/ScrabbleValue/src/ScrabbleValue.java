/**
 * @(#)ScrabbleValue.java
 *
 * ScrabbleValue application
 *
 * @Author:  
 * @version 1.00 2021/9/23
 */
import java.util.*;
 
public class ScrabbleValue {
    
    public static void main(String[] args) {
    	//Declare and initialize variables
    	int[] values = {1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,
    	10,1,1,1,1,4,4,8,4,10};
        int total = 0;
        String word, wordUC;
        
        //Create a Scanner object
        //Add code here
    	
        
        //Get word from user
        //Add code here
    	
        
        //Convert word to upper case preserving the original word
        //Add code here
    	 
        
        //Parse the word and "lookup" each value in the values array
        for (int i = 0; i < wordUC.length(); i++)
        	//Use the ASCII value to index into the value array
        	//A has a value of 65 which corresponds to element 0 of values array
        	//Add code here
    	
        	
        System.out.println(word + " has an Scrabble value of " 
        	+ total);
    }
}

// Output
// Enter a word: zoology
// ZOOLOGY has an Scrabble value of 20