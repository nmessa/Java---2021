/**
 * @(#)Monogram.java
 *
 * Monogram application
 *
 * @Author:  
 * @version 1.00 2021/11/18
 */
import java.util.*;

public class Monogram {
    
      public static void main(String[] args) {
      	//Create a Scanner object input
        Scanner input = new Scanner(System.in);
        
        //Declare variables
        String first, middle, last;
        
        
        System.out.print("Enter first name: ");
        first = input.next();
        System.out.print("Enter middle name: ");
        middle = input.next();
        System.out.print("Enter last name: ");
        last = input.next();
        
        //Call monogram and print the returned string
        System.out.println(monogram(first, middle, last));
    }
    
    public static String monogram(String first, String middle, String last)
    {
    	char f, m, l;
    	//Add coded here
    	
    	
    	
    	return Character.toString(f) + Character.toString(l) 
    		+ Character.toString(m);
    }
}
