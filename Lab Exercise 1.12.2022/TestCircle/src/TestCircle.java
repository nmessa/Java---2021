/**
 * @(#)TestCircle.java
 *
 * TestCircle application
 *
 * @Author: nmessa
 * @version 1.00 2022/1/12
 */
 
public class TestCircle {
    
    public static void main(String[] args) {
    	
    	// Declare and allocate an instance of class Circle called c1
      	//  with default radius and color
      	Circle c1 = new Circle();
      	// Use the dot operator to invoke methods of instance c1.
      	System.out.println("The circle has radius of " + c1.getRadius() 
      		+ " and area of " + c1.getArea());
   
      	// Declare and allocate an instance of class circle called c2
      	//  with the given radius and default color
      	Circle c2 = new Circle(2.0);
      	// Use the dot operator to invoke methods of instance c2.
      	System.out.println("The circle has radius of " 
         + c2.getRadius() + " and area of " + c2.getArea());
    }
}

// Output
// The circle has radius of 1.0 and area of 3.141592653589793
// The circle has radius of 2.0 and area of 12.566370614359172