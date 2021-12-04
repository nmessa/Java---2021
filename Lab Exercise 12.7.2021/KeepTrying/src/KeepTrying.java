/**
 * @(#)KeepTrying.java
 *
 * KeepTrying application
 *
 * @Author: 
 * @version 1.00 2021/12/7
 */
import java.io.*; //needed for IOException
import java.util.*; //Needed for Scanner
public class KeepTrying
{
	public static void main(String args[])
	{
		//Create a keyboard Scanner object
		Scanner kbReader = new Scanner(System.in);
		
		//Declare variables
		String fileName;
		boolean fileReadOK;
		
		
		do
		{
			//Read fileName from the keyboard
			//Add code here
		
			
			//set fileReadOK flag to false
			//Add code here
		
			
			//If fileName is EXIT leave the loop
			//Add code here
		
			
			//Attempt to read the file.
			try
			{
				//Add code here
		
			}
			//Catch the IOException
			catch(IOException e)
			{
				//Add code here
		
			}
		}while(!fileReadOK);
		
		//Print the result of file access by checking the fileReadOK flag
		//Add code here
		
	} //end of main
} //end of class

//Output
//Enter the file name (Enter the word exit to abort): test.text
//Try a different file name
//
//Enter the file name (Enter the word exit to abort): test.txt
//Jack be nimble
//Jack be quick
//Jack jumped over the candle stick
//and caught fire
//It worked