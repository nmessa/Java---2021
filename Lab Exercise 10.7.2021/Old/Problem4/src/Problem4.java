/**
 * @(#)Problem4.java
 *
 * Problem4 application
 *
 * @nmessa 
 * @version 1.00 2019/10/7
 */
import java.util.*;

public class Problem4 {
    
    public static void main(String[] args) {
    	//Create a Scanner object
    	Scanner reader = new Scanner(System.in);
    	
    	//Get sentence from user
        System.out.println("Enter a sentence: ");
        String sentence = reader.nextLine();
        
        //Parse sentence character by character backwards and print
        //the characters as you go
        for (int i = sentence.length()-1; i >= 0; i--)
        	System.out.print(sentence.charAt(i));
    }
}

//Output
//Enter a sentence: 
//This is a test
//tset a si sihT