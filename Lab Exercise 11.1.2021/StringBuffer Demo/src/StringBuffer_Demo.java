/**
 * @(#)StringBuffer_Demo.java
 *
 * StringBuffer_Demo application
 *
 * @author 
 * @version 1.00 2020/11/16
 */
 
public class StringBuffer_Demo {
    
    public static void main(String[] args) {
    	
    	String myXs = "";
		for(int j = 1; j <= 8; j++) //generates 8 rows XX
		{
			for(int k = 1; k <= j; k++) 
			{ 
				myXs = myXs + "X"; 
			} 
			myXs = myXs + '\n';
		}
		System.out.println(myXs);
		
		
		StringBuffer sb = new StringBuffer( );
		for(int j = 1; j <= 8; j++) //generates 8 rows
		{ 
			for(int k = 1; k <= j; k++)
			{
				sb.append("X"); 
			} 
			sb.append('\n'); 
		}
		String s = sb.toString( );
		System.out.println(s);
    }
}
