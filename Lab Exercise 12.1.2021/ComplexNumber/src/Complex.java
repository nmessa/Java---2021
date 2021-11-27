//Complex class definition
//Author: nmessa
//Date: 12/1/2021
//This program implements a complex number class

public class Complex 
{
   	double real = 0;
   	double imag = 0;  // real, imag are instance variables

	//Default constructor
   	public Complex() { }  // use default value 0 + i0

	//Constructor method
  	public Complex(double r, double i) 
	{
      		//Add code here
      		
   	}

	//Changes to complex conjugate of complex number
   	public void conjugate() 
	{
      		//Add code here
   	}

	//Add 2 complex numbers and return the result
   	public Complex add(Complex c) 
	{
      	/* result is also complex so need to introduce another variable of type Complex */
      		//Add code here
   	}

	//Subtract 2 complex numbers and return the result
	public Complex subtract(Complex c) 
	{
      	/* result is also complex so need to introduce another variable of type Complex */
      		//Add code here
   	}
   	
   	//Multiply 2 complex numbers and return the result
   	public Complex multiply(Complex c) 
	{
      		//Add code here
   	}

	//Divide 2 complex numbers and return the result
	public Complex divide(Complex c) 
	{
      		//Add code here
      		
   	}
   	
   	//Convert complex number to a string for display purposes
   	public String toString() 
	{
  	 // note example of method overriding
      		if (imag >= 0)
        			return real + " + " + Math.abs(imag) + "i";
      		else
        			return real + " - " + Math.abs(imag) + "i";
   	}
}
