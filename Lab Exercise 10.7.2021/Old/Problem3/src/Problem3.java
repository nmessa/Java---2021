/**
 * @(#)Problem3.java
 *
 * Problem3 application
 *
 * @nmessa 
 * @version 1.00 2019/10/7
 */
import java.util.*;
 
public class Problem3 {
    
    public static void main(String[] args) {
    	//Create a Scanner object
    	Scanner reader = new Scanner(System.in);
    	
    	//Get sentence from user
        System.out.println("Enter a sentence: ");
        String sentence = reader.nextLine();
        
        //Declare variables
        String newSentence = "";
        
        //Parse the sentence character by character and swap case
        for (int i = 0; i < sentence.length(); i++)
        {
        	if (Character.isLowerCase(sentence.charAt(i)))
        		newSentence += Character.toUpperCase(sentence.charAt(i));
        	else if (Character.isUpperCase(sentence.charAt(i)))
        		newSentence += Character.toLowerCase(sentence.charAt(i));
        	else
        		newSentence += sentence.charAt(i);
        }
        System.out.println(newSentence);
    }
}

//Output
//Enter a sentence: 
//My name is Joe
//mY NAME IS jOE