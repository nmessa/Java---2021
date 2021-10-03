/**
 * @(#)Problem1.java
 *
 * Problem1 application
 *
 * @nmessa 
 * @version 1.00 2019/10/7
 */
import java.util.*;

public class Problem1 {
    static int numbers[] = {1,2,3,4,5,6,7,8,0,1,2,3,4,5,0,7,0,9,2,
    3,4,5,6,7,8,9};
    	
    static int multipliers[] = {8,7,6,5,4,3,2,10,0,9,8,7,6,5,4,3,2};
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	//System.out.print("Enter the VIN: ");
    	//String vin = sc.next();
    	String vin = "JHMCB7658LC056658";  //Test code should return true
    	System.out.println(isValid(vin));
    }
    
    public static boolean isValid(String v)
    {
    	//Declare variables
    	int check = 0;
    	int num;
    	int checkSum;
    	
    	//Process characters 0 to 7
    	for (int i = 0; i < 8; i++)
    	{
    		if (Character.isDigit(v.charAt(i)))
    		{
    			num = (int)(v.charAt(i))-48;
    			//System.out.println(num);
    		}	
    		else
    		{
    			num = numbers[(int)v.charAt(i)-65];
    			//System.out.println(num);
    		}	
    		check += num * multipliers[i];
    	}
    	
    	//Process characters 9 to 16
    	for (int i = 9; i < 17; i++)
    	{
    		if (Character.isDigit(v.charAt(i)))
    		{
    			num = (int)(v.charAt(i)- 48);
    			//System.out.println(num);
    		}
    		else
    		{
    			num = numbers[(int)v.charAt(i)-65];
    			//System.out.println(num);
    		}
    		check += num * multipliers[i];
    	}
    	
    	//Calculate checksum
    	checkSum = check % 11;
    	//System.out.println(check + "  " + checkSum);
    	
    	//Check for valid checksum
    	if (checkSum < 10)
    	{
    		if (checkSum == (int)(v.charAt(8)-48))
    			return true;
    	}
    	else
    	{
    		if (v.charAt(8)== 'X')
    			return true;
    	}
    	
    	return false;
    }
}
