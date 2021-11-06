/**
 * @(#)Tester.java
 *
 *
 * @Author: nmessa 
 * @version 1.00 2021/11/10
 */

public class Tester {

    public static void main(String[] args) {
    	//Create 2 matrices (2D Arrays)
        int a[][] = {{1,2,-2,0}, {-3,4,7,2}, {6,0,3,1}};
        int b[][] = {{-1,3}, {0,9}, {1,-11}, {4,-5}};
        
        //int b[][] = {{-1,3}, {0,9}, {1,-11}};  //For testing invalid matrix
        
        //Create matrix of appropriate size
        int product[][] = new int[a.length][b[0].length];
        
        //Only multiply if matrices are of appropriate size to multiply
        if (a[0].length == b.length)
        	product = MatrixMult.mult(a, b);
        else
        	System.out.println("Invalid matrix multiplication" );
        
        //Print the product matrix	
        for (int row = 0; row < product.length; row++)
        {
        	for (int col = 0; col < product[0].length; col++)
        	{
        		System.out.print(product[row][col] + "  ");
        	}
        	System.out.println();
        }
    }
}

//Output
//-3  43  
//18  -60  
//1  -20  