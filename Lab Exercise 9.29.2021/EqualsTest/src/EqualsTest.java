/**
 * @(#)EqualsTest.java
 *
 * EqualsTest application
 *
 * @nmessa 
 * @version 1.00 10/13/2020
 */
 
public class EqualsTest {
    
    public static void main(String[] args) {
    	System.out.println("Comparing strings");
    	String myString = "Yellow";
		String yourString = "Yellow";
		String hisString = new String("Yellow");
		String ourString = myString;
		System.out.println(myString == yourString);  //true
		System.out.println(myString == ourString);   //true
		System.out.println( myString.equals(yourString) );   //true
		System.out.println( myString.equals(ourString) );   //true
		System.out.println( myString == hisString );    //false
		System.out.println( myString.equals(hisString));   //true
		
		System.out.println("\n\n\nComparing objects");
		Circle cir1 = new Circle(11);
		Circle cir2 = new Circle(11);
		Circle cir3;
		cir3 = cir1;
		System.out.println(cir1 == cir2);
		System.out.println(cir1.equals(cir2));
		System.out.println(cir1 == cir3);
		System.out.println(cir1.equals(cir3));
    }
}
//Output
//Comparing strings
//true
//true
//true
//true
//false
//true
//
//
//
//Comparing objects
//false
//false
//true
//true