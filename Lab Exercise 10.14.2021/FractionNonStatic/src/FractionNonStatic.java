/**
 * @(#)FractionNonStatic.java
 *
 * FractionNonStatic application
 *
 * @Author: 
 * @version 1.00 2021/10/14
 */
 
public class FractionNonStatic {
    
    public static void main(String[] args) {
    	//Create 3 Fraction objects
    	Fraction one = new Fraction(1, 2);
    	Fraction two = new Fraction(1, 4);
    	Fraction answer = new Fraction();
    	
        // Test Addition
		System.out.println("\nTest of addition");
		answer = one.add(two);
		one.print();
		System.out.print(" + ");
		two.print();
		System.out.print(" = ");
		answer.print();
		System.out.println("\t\t" + answer.getDecimal());
		
		// Test subtraction
		//Add code here
		
		
		
		
		// Test multiplication
		//Add code here
		
		
		
		// Test division
		//Add code here
		
    }
}
//Output
//Test of addition
//1/2 + 1/4 = 3/4     0.75
//
//Test of subtraction
//1/2 - 1/4 = 1/4     0.25
//
//Test of multiplication
//1/2 x 1/4 = 1/8     0.125
//
//Test of division
//1/2 / 1/4 = 2/1     2.0