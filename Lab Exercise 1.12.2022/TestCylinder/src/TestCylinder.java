/**
 * @(#)TestCylinder.java
 *
 * TestCylinder application
 *
 * @Author: nmessa 
 * @version 1.00 2022/1/12
 */
import java.text.*;

public class TestCylinder {
    
    public static void main(String[] args) {
    	DecimalFormat ft = new DecimalFormat("#.###");
    	
    	// Declare and allocate a new instance of cylinder
      	//   with default color, radius, and height
      	Cylinder c1 = new Cylinder();
      	System.out.println("Cylinder:"
            + " radius=" + ft.format(c1.getRadius())
            + " height=" + ft.format(c1.getHeight())
            + " base area=" + ft.format(c1.getArea())
            + " volume=" + ft.format(c1.getVolume()));
   
      	// Declare and allocate a new instance of cylinder
      	//   specifying height, with default color and radius
      	Cylinder c2 = new Cylinder(10.0);
      	System.out.println("Cylinder:"
            + " radius=" + ft.format(c2.getRadius())
            + " height=" + ft.format(c2.getHeight())
            + " base area=" + ft.format(c2.getArea())
            + " volume=" + ft.format(c2.getVolume()));
   
      	// Declare and allocate a new instance of cylinder
      	//   specifying radius and height, with default color
      	Cylinder c3 = new Cylinder(2.0, 10.0);
      	System.out.println("Cylinder:"
            + " radius=" + ft.format(c3.getRadius())
            + " height=" + ft.format(c3.getHeight())
            + " base area=" + ft.format(c3.getArea())
            + " volume=" + ft.format(c3.getVolume()));
    }
}

//Output
//Cylinder: radius=1 height=1 base area=3.142 volume=3.142
//Cylinder: radius=1 height=10 base area=3.142 volume=31.416
//Cylinder: radius=2 height=10 base area=12.566 volume=125.664
