/**
 * @(#)Problem2.java
 *
 * Problem2 application
 *
 * @nmessa 
 * @version 1.00 2019/10/7
 */
import java.util.*;
 
public class Problem2 {
    
    public static void main(String[] args) {
    	//Create a Scanner object
    	Scanner reader = new Scanner(System.in);
    	
    	//Declare variables
        String vowels = "AEIOU";
        int count[] = {0,0,0,0,0};
        int numVowels = 0;
        String str;
        
        //Get sentence from user
        System.out.println("Enter a sentence: ");
        String sentence = reader.nextLine();
        
        //Convert sentence to upper case
        sentence = sentence.toUpperCase();
        
        //Parse the sentence character by character
        for (int i = 0; i < sentence.length(); i++)
        {
        	//Convert character to string
        	str = Character.toString(sentence.charAt(i));
        	
        	//Check to see if a vowel and which one
        	//update counters
        	if (vowels.contains(str))
        	{
        		numVowels += 1;
        		int location = vowels.indexOf(sentence.charAt(i));
        		count[location] += 1;
        	}
        }
        
        //Print out the counts
        for(int i = 0; i < 5; i++)
        {
        	System.out.println(count[i] + "     " + 
        		vowels.charAt(i));
        }
    }
}

//Output
//Enter a sentence: 
//Mary had a little lamb whose fleece is white as snow
//5     A
//6     E
//3     I
//2     O
//0     U