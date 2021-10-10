/**
 * @(#)MersennePrimes.java
 *
 * MersennePrimes application
 *
 * @Author: 
 * @version 1.00 2021/10/15
 */
import java.util.*;

public class MersennePrimes {
    
    public static void main(String[] args) {
    	int numbers[] = new int[8];
    	int mercennes[] = new int[8];
    	int count = 0;
    	for (int number = 2; number < 100;number++)
    	{
    		//Add code here
		
		
		
    	}
    	System.out.println("N" + "        " + "2^N-1");
    	for (int i = 0; i < numbers.length; i++)
    	{
    		System.out.println(numbers[i] + "         " + mercennes[i]);
    	}
		
    }
    
    //This method returns true if the number is prime
    public static boolean isPrime(int n){
    	//Add code here
		
		
    }
    
    //This method returns true if the number is a Mersenne Prime
    public static boolean isMercenne(int n)
    {
    //Add code here
		
		
			
    }
}

//Output
//N        2^N-1
//2         3
//3         7
//5         31
//7         127
//13         8191
//17         131071
//19         524287
//31         2147483647