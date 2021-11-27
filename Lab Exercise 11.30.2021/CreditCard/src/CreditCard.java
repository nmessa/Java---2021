/**
 * @(#)CreditCard.java
 *
 * CreditCard application
 *
 * @Author:  
 * @version 1.00 2021/11/30
 */
 
public class CreditCard {
	
	public static int eff(int d)
	{
		//Add code here
        
	}
    
    public static void main(String[] args) {
    	
    	String number = "1234567891";
    	System.out.println(f(number));
    }
    
    public static String f(String n)
    {
    	//Declare variables
    	String cardNumber;
    	int checkSum = 0;
    	int checkDigit;
    	
    	//Parse numbers
    	for (int i = 0;i < n.length(); i++)
    	{
    		//Digit is even
    		if (i%2 == 0)
    		{
    			//convert digit to integer, subtract 48 and add to checksum
    			//Add code here
        
    		}
    		else //digit is odd
    		{
    			//convert digit to integer, subtract 48 and add to checksum
    			//Add code here
        
    		}
    	}
    	
    	//Find the checkdigit
    	//Add code here
        
    	
    	//Generate card number
    	//Add code here
    	
        
    	return cardNumber;
    }
}

//Output
//12345678911