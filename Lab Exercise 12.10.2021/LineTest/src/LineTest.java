/**
 * @(#)LineTest.java
 *
 * LineTest application
 *
 * @author nmessa
 * @version 1.00 2021/12/10
 */
 
public class LineTest {
    
    public static void main(String[] args) {
    	//Construct some lines
    	Line one = new Line(1,2,3); //Point slope
    	Line two = new Line(1,2); //Slope intercept
    	Line three = new Line(1,2,3,4); //Two point
    	Line four = new Line(3); //Vertical line
    	Line five = new Line(1,2,3); //Point slope
    	Line six = new Line(1,3); //Slope interecept
    	Line seven = new Line(5); //Vertical line
    	
    	//Test the methods
    	System.out.println(one.equals(five));	//True
    	System.out.println(one.intersects(two));	//True
    	System.out.println(two.isParallel(six));	//True
    	System.out.println(one.isParallel(three)); //False
    	System.out.println(four.isParallel(seven)); //True
    	System.out.println(four.intersects(seven)); //False
    }
}
