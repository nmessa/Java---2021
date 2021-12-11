// Lab Exercise 12.16.2021 Problem 3
// SoccerTeam.java
// Author: 

class SoccerTeam {
	public int wins;
	public int losses;
	public int ties;
	//Class variables shared by all objects of the SoccerTeam class
	public static int games;
	public static int goals;
	
	//Constructor initialize wins, losses and ties to 0
	public SoccerTeam()
	{
		//Add code here
		
	}
	
	//updates wins, ties and losses for each team
	public void played(SoccerTeam other, int myScore, int otherScore)
	{
		//Add code here
		
		
		//Increment games played
		//Add code here
		
		
		//increments total goals scored
		//Add code here
		
	}
		
	public int getPoints()
	{
		//Calculate and return points
		//Add code here
		
	}
		
	public void reset()
	{
		//Reset wins, ties, and losses
		//Add code here
		
	}
	
	public static int getGames()
	{
		//Add code here
		
	}
	
	public static int getGoals()
	{
		//Add code here
		
	}
	
	public static void startTournament()
	{
		//Set games and goals to 0
		//Add code here
		
	}
}
