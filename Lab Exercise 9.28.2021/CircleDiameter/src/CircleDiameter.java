/**
 * @(#)CircleDiameter.java
 *
 * CircleDiameter application
 *
 * @Author: nmessa 
 * @version 1.00 9/28/2021
 */
 
public class CircleDiameter {
    
    public static void main(String[] args) {
    	
    	//Construct a circle - parameter is radius
        Circle cir1 = new Circle(35.5);
        
        //Print the diameter of circle
        System.out.println("Diameter = " + cir1.diameter());
    }
}

//Output
//Diameter = 71.0
