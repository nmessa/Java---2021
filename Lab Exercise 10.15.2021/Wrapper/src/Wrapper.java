/**
 * @(#)Wrapper.java
 *
 * Wrapper application
 *
 * @nmessa 
 * @version 1.00 2021/10/15
 */
import java.util.*;

public class Wrapper {
    
    public static void main(String[] args) {
    	
    	Scanner kbReader = new Scanner(System.in);
    	
    	//Get input from user
		System.out.print("Enter your double here. "); 
		double n1 = kbReader.nextDouble( );
		System.out.print("Enter your next double here. "); 
		double n2 = kbReader.nextDouble( );
		
		//Construct Double objects
		Double num1 = n1; 
		Double num2 = n2; 
			
		//Calculate the sum of two Double objects
		//and store in a Double object
		Double sum = num1 + num2;
			
		//Calculate the square root of the sum
		double root = Math.sqrt(sum);
		
		//Print the result
		System.out.println("The square root is: " + root);
    }
}
