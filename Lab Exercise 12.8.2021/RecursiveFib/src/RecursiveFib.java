/**
 * @(#)RecursiveFib.java
 *
 * RecursiveFib application
 *
 * @Author:  
 * @version 1.00 2021/12/8
 */
import java.util.*;

public class RecursiveFib {
    
    public static void main(String[] args) {
    	
    	Scanner in = new Scanner(System.in);
      	System.out.print("Enter n: ");
      	int n = in.nextInt();

      	for (int i = 1; i <= n; i++)
      	{
         	long f = fib(i);
         	System.out.println("fib(" + i + ") = " + f);
      	}
    }
    
   	public static long fib(int n)
   	{  
      	//Add code here
		
   }
}
