/*Scoresheet class definition
 *Holds scoresheet for a single player
 *Author: 
 *Date: 12.9.2021
 */

import java.util.*;
import java.io.*;

class Scoresheet  {
	//class members
	private Frame scores[];
	
	//Constructor function
	public Scoresheet()
	{
		//Declare an array of 12 frames
		//Add code here
		
		//Construct Frames
		//Add code here
		
	}
	
	//Load data into frames
	public void loadScores()throws IOException
	{
		//Declare variables
		int r = 0, f = 0;
		
		//Create a Scanner to read scores.txt
		Scanner reader = new Scanner(new File("scores.txt"));
		
		while(reader.hasNext())
		{
			//Read roll score
			//Add code here
		
			
			//Process roll
			//Add code here
		
			
			//If frame is closed, increment frame
			//Add code here
		
		}
		//Close the file
		//Add code here
		
	}
	
	//Print the contents of each frame
	public void printFrames()
	{
		//Add code here
		
	}
	
	//Calculates all of the frame scores and total score
	public void calcScore()
	{
	
		//process frames
		for (int f = 0; f < 10; f++)
		{
			//Add code here
		
		
		
		}
		
		//Add up the frame scores
		//Add code here
		
		

	}
	
	//Prints the scoresheet
	public void printScoresheet()
	{
		System.out.println("\t\t\t\tFrame");
		for (int f = 0; f < 10; f++)
		{
			System.out.print((f+1) + "    ");
		}
		
		System.out.println();
		for (int f = 0; f < 10; f++)
		{
			System.out.print(scores[f].frameScore + "\t");
		}	
	}
}
