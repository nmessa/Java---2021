/**
 * @(#)Problem_1.java
 *
 * Problem_1 application
 *
 * @Author:  
 * @version 1.00 2021/9/24
 */
import java.util.*;

public class Problem_1 {
    
    public static void main(String[] args) {
    	
    	//declare variables
    	double value, average, range, total=0, smallest, largest;
    	int count = 0;
    	
    	//initialize smallest and largest values (hint: use Double.MAX_VALUE)
    	//Add code here
    	
    	
    	//create Scanner object
    	//Add code here
    	
    	
    	//Keep looping until 0 is entered
    	do
    	{
    		//get floating point value from user
    		//Add code here
    	
    		
    		if (value != 0) //only execute code if value not 0
    		{
    			//add one to count
    			//Add code here
    	
    			
    			//add to total
    			//Add code here
    	
    		
    			//check if smallest
    			//Add code here
    	
    		
    			//check if largest
    			//Add code here
    	
    		}
    		
    	}while(value != 0);  //use 0 flag to end loop
    	
    	//calculate average
    	//Add code here
    	
    	
    	//calculate range
    	//Add code here
    	
    	
    	//Output results
    	System.out.println("Average = " + average);
    	System.out.println("Largest value = " + largest);
    	System.out.println("Smallest value = " + smallest);
    	System.out.println("Range = " + range);
    }
}

// Output
// Enter a floating point value(0 to quit): 34.9
// Enter a floating point value(0 to quit): 23.7
// Enter a floating point value(0 to quit): 12.6
// Enter a floating point value(0 to quit): -3.5
// Enter a floating point value(0 to quit): 0.1
// Enter a floating point value(0 to quit): 0
// Average = 13.559999999999997
// Largest value = 34.9
// Smallest value = -3.5
// Range = 38.4

