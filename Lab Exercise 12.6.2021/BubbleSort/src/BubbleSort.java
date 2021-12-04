/**
 * @(#)BubbleSort.java
 *
 * BubbleSort application
 *
 * @Author:  
 * @version 1.00 2021/12/6
 */
import java.util.*;

public class BubbleSort {
    
    public static void main(String args[])
	{
		int theArray[] = new int[10000];
		fillArray(theArray);
		
		long start = System.currentTimeMillis();
		//long start = System.nanoTime();
		sort(theArray);
		long end = System.currentTimeMillis();
		//long end = System.nanoTime();
		
		/*for(int j = 0; j < theArray.length; j++)
		{
			System.out.print(theArray[j] + " ");
		}
		System.out.println(" ");*/
		
		System.out.println("Execution time: " + (end-start) 
			+ " milliseconds");
		//System.out.println("Execution time: " + (end-start) 
		//	+ " nanoseconds");
	}
	
	public static void fillArray(int a[])
	{
		//Add code here
		
		
	}
	public static void sort(int a[]) //Bubble Sort
	{
			//Add code here
		
		
	}
}

//Output
//Execution time: 526 milliseconds