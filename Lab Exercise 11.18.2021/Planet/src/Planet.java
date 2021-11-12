//Lab Exercise 11/18/2021 Problem 5
//Author: 
//Planet Class definition file

class Planet {
	private String name;
	private double radius;
	private double mass;
	private double distance;
	
	//Constructor
	Planet(String n, double r, double m, double d)
	{
		//Add coded here
		
	}
	
	public String getName()
	{
		//Add coded here
		
	}
	
	public double getRadius()
	{
		//Add coded here
	}
	
	public double getMass()
	{
		//Add coded here
	}
	
	public double getDistance()
	{
		//Add coded here
	}
	
	public double calcVolume()
	{
		//Add coded here
	}
	
	public double calcSurfaceArea()
	{
		//Add coded here
	}
	
	public double calcDensity()
	{
		//Add coded here
	}
	
	public double calcOrbit()
	{
		//Add coded here
	
	public String toString()
	{
		String p = "";
		p += "Name: " + name + "\n";
		p += "Radius: " + Double.toString(radius) + "\n";
		p += "Mass: " + Double.toString(mass) + "\n";
		p += "Distance to Sun: " + Double.toString(distance) + "\n";
		return p;
	}
	
}
