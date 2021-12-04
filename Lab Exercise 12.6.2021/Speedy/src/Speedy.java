/**
 * @(#)Speedy.java
 *
 * Speedy application
 *
 * @Author: nmessa 
 * @version 1.00 2021/12/6
 */
import java.util.*;

public class Speedy {
    
    public static void main(String[] args) {
    	
    	int p = 386, q = 581, n=0;
		//Start timing first loop when “Hello” is printed
		long start = System.nanoTime();
		for(int j = 0; j < 2000000000; j++)
		{
			n = ((p * 2) + q) / 2;
		}
		long end = System.nanoTime();
		System.out.println(n); //When this line prints, stop timing the first loop
		System.out.println("Execution time: " + (end-start) 
			+ " nanoseconds");
			
		//begin timing the second loop.
		start = System.nanoTime();
		for(int j = 0; j < 2000000000; j++)
		{
			n = p + (q >> 1);
		}
		end = System.nanoTime();
		System.out.println(n);
		System.out.println("Execution time: " + (end-start) 
			+ " nanoseconds");
    }
}

//Output
//676
//Execution time: 8354427 nanoseconds
//676
//Execution time: 5663035 nanoseconds