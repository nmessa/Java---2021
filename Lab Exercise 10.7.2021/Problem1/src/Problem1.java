/**
 * @(#)Problem1.java
 *
 * Problem1 application
 *
 * @Author:  
 * @version 1.00 2021/10/7
 */
import java.util.*;

public class Problem1 {
    
    public static void main(String[] args) {
    	
    	//Create a Scanner object
    	//Add code here
    	
    	//Declare variables
        String vowels = "AEIOU";
        int count[] = {0,0,0,0,0};
        int numVowels = 0;
        String str, sentence;
        
        //Get sentence from user
        //Add code here
        
        //Convert sentence to upper case
        //Add code here
        
        //Parse the sentence character by character
        for (int i = 0; i < sentence.length(); i++)
        {
        	//Convert character to string
        	//Add code here
        	
        	//Check to see if a vowel and which one
        	//update counters
        	//Add code here
        }
        
        //Print out the counts
        //Add code here
        
        
    }
}

//Output
//Enter a sentence: 
//Mary had a little lamb whose fleece was a white as snow
//7     A
//6     E
//2     I
//2     O
//0     U