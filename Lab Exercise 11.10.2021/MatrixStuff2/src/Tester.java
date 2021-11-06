/**
 * @(#)Tester.java
 * @nmessa 
 * @version 1.00 2021/11/10
 */
import java.io.*; 
import java.util.*;

public class Tester {

    public static void main(String[] args) throws IOException{
    	//Create Scanner object
        Scanner sf = new Scanner(new File("MatrixData.txt"));
		int maxIndx = -1; //Keeps track of text array index
		String text[] = new String[100]; //declare more than we need
		
		//Read data from files
		while(sf.hasNext( ))
		{
			maxIndx++;
			text[maxIndx] = sf.nextLine( );
		}
		sf.close( ); 
			
		//Get the dimensions of the a and b matrix
		int matrixCount = 0, rowCount = 0, colCount = 0;
		int aRows = 0, aCols = 0, bRows = 0, bCols = 0;
		
		//Parse each line of text
		for (int j = 0; j <= maxIndx; j++)
		{
			if(text[j].equals("matrix"))
			{
				//Increment matrixCount
				matrixCount++;
				
				//if matrixCount is to then aRows and bCols are rowCount and colCount
				if(matrixCount == 2)
				{
					aRows = rowCount;
					aCols = colCount;
				}
				//Reset rowCount and colCount to 0 to get ready to count 
				//rows and cols of next matrix
				rowCount = 0;
				colCount = 0;
			}
			else if(text[j].equals("row")) //this counts the rows
			{
				//increment rowCount and set colCount to 0
				rowCount++;
				colCount = 0;
			}
			else  //This counts the columns
			{
				//Increment colCount
				colCount++;
			}	
		}
		//Set bRows and bCols to rowCount and colCount
		bRows = rowCount;
		bCols = colCount;
		
		//Construct a and b arrays
		int a[][] = new int[aRows][aCols];
		int b[][] = new int[bRows][bCols];

		//Fill the a and b matrices
		matrixCount = 0;
		int rowIndx = -1, colIndx = -1;
		
		//Parse the text file
		for (int j = 0; j <= maxIndx; j++)
		{
			if(text[j].equals("matrix"))
			{
				//Increment matrixCount and set rowIndex and colIndex to -1
				matrixCount++;
				rowIndx = -1;
				colIndx = -1;
			}
			else if(text[j].equals("row"))
			{
				//increment rowIndx and set colIndx to -1
				rowIndx++;
				colIndx = -1;
			}
			else
			{
				//Increment colIndex
				colIndx++;
				//If matrixCount is 1, store text[j] in matrix a
				//else store in matrix b using rowIndx and colIndx
				if(matrixCount==1)
				{
					a[rowIndx][colIndx]= Integer.parseInt(text[j]);
				}
				else
				{
					b[rowIndx][colIndx]= Integer.parseInt(text[j]);
				}
			}
		}
		
		//Multiply the a and b matrices
		
		//Create 2D array reference
		int product[][]; //answer goes in product
		
		//Call mult method and store 2D array returned in product[][]
        product = MatrixMult.mult(a, b);
        
        //Print the 2D array
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
