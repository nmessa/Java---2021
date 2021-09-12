/**
 * @(#)GreatCircle.java
 *
 * GreatCircle application
 *
 * @Author: 
 *
 * @version 1.00 2021/9/14
 */
import java.text.DecimalFormat;
 
public class GreatCircle {
    
    public static void main(String[] args) {
    	//Declare and initialize variables
    	//comment out r declaration for the units you desire
    	//int r = 6371; //Kilometers
    	int r = 3950; //Miles
    	double a, c, d;
    	double lat1 = 48.87;	//Paris
    	double lon1 = -2.33;
    	double lat2 = 37.8;	//San Francisco
    	double lon2 = 122.4;
    	double dlon, dlat;
    	
    	//Convert latitudes and longtiudes from degrees to radians
    	//Add code here
    	
    	
    	//calculate delta latitude and delta longtitude
    	//Add code here
    	
    	
    	//Make calculations
    	//Add code here
    	
    	
    	//round to two decimal places
    	//Add code here
    	
    	
    	//System.out.println(df.format(d) + " kilometers");
    	System.out.println(df.format(d) + " miles");
    }
}

//Output
//5547.69 miles