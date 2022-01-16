/**
 * @(#)Problem_1.java
 *
 * Problem_1 application
 *
 * @Author 
 * @version 1.00 2022/1/19
 */
import java.text.*;

public class Problem_1 {
    
    public static void main(String[] args) {
    	DecimalFormat f = new DecimalFormat("#.##");
    	double[] result = {0.0, 0.0};
    	result = otherSides(1);
    	System.out.println("[" + f.format(result[0]) + ", " + f.format(result[1]) + "]");
    	result = otherSides(12);
    	System.out.println("[" + f.format(result[0]) + ", " + f.format(result[1]) + "]");
    	result = otherSides(2);
    	System.out.println("[" + f.format(result[0]) + ", " + f.format(result[1]) + "]");
    	result = otherSides(3);
    	System.out.println("[" + f.format(result[0]) + ", " + f.format(result[1]) + "]");
    }
    
    public static double[] otherSides(int s)
    {
    	//Add code here
    	
    }
}
