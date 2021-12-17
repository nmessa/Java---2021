//BingoCard class
//Author: 
//Date: 12/21/2021

import java.util.*;

public class BingoCard {
	//Class instance variables
	private ArrayList<Integer> B;
	private ArrayList<Integer> I;
	private ArrayList<Integer> N;
	private ArrayList<Integer> G;
	private ArrayList<Integer> O;
	
	//Constructor
	public BingoCard()
	{
		//Create 5 ArrayList objects to hold integers (B, I, N, G, and O)
		//Add code here
    	
    	
		
		//Create a random number generator
		//Add code here
    	
		
		//Fill the B array list with random integers from 1 to 15
		//Add code here
    	
    	
		
		//Fill the I array list with random integers from 16 to 30
		//Add code here
    	
		
		//Fill the N array list with random integers from 31 to 45
		//Special case when N.size() == 2, add 0
		//Add code here
    	
    	
		
		//Fill the G array list with random integers from 46 to 60
		//Add code here
    	
    	
		
		//Fill the O array list with random integers from 61 to 75
		//Add code here
    	
    	
	}
	
	//Print out Bingo Card
	public void printCard()
	{
		System.out.println("B\t I\t N\t G\t O");
		for (int i = 0; i < 5; i++)
		{
			System.out.println(B.get(i) + "\t" + I.get(i) + "\t" + 
				N.get(i) + "\t"  + G.get(i) + "\t" + O.get(i));
		}
		System.out.println();
	}
	
	//Update Bingo card for drawn numbers
	public void updateCard(String s)
	{
		//Break string into column and number
		char ch = s.charAt(0);
		int number = Integer.parseInt(s.substring(1));
		
		//Update Bingo card if number found
		switch (ch)
		{
			//Add code here
    	
    	
    	
		}
	}
	
	public boolean checkRowWin()
	{
		//Add code here
    	
	}
	
	public boolean checkColWin()
	{
		//Add code here
    	
    	
	}
	
	public boolean checkDiagWin()
	{
		//Add code here
    	
    	
	}
	
}
