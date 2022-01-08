//Cylinder class definition
//Author: 
//Date: 1/12/2022
public class Cylinder extends Circle{
	// private variable
	//Add code here
   
   	// Constructor with default color, radius and height
   	public Cylinder() {
      	// call superclass no-arg constructor Circle()
      	//Add code here
   	}
   	
   	// Constructor with default radius, color but given height
   	public Cylinder(double height) {
      	// call superclass no-arg constructor Circle()
      	//Add code here
   	}
   	
   	// Constructor with default color, but given radius, height
   	public Cylinder(double radius, double height) {
      	// call superclass constructor Circle(r)
      	//Add code here
   	}
   
   	// A public method for retrieving the height
   	public double getHeight() {
      	//Add code here 
   	}
  
   	// A public method for computing the volume of cylinder
   	//  use superclass method getArea() to get the base area
   	public double getVolume() {
      	//Add code here 
   	}
}
