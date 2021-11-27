/**
 * @(#)NormalDist.java
 *
 * NormalDist application
 *
 * @Author:  
 * @version 1.00 2021/11/30
 */
 
public class NormalDist {
    
    public static void main(String[] args) {
    	
    	//Initialize variables
    	double total = 0.0;
    	double dz = 0.001;
    	double z = 0.0;
    	double percent;
    	double x;
    	
    	//define statistical parameters
    	int mu = 1800;
    	int sigma = 150;
    	
    	//define student parameter
    	int numStudents = 20000;
    	int numAccepted = 5000;
    	
    	if (numAccepted < numStudents/2)	//right tail
    	{
    		//Calculate percent of students in this tail
    		//Add code here
        
        
    		//integrate to the right
    		//Add code here
        
        
    	}
    	else //left tail
    	{
    		//Calculate percent of students in this tail
    		//Add code here
    		
    		
    		//integrate to the right
    		//Add code here
    		
    	}
    	
    	//translate z value to x value
    	//Add code here
    	
    	//Output the results
    	System.out.println("Z score = " + z);
    	System.out.println("Minimum SAT score = " + x);
    }
    
    //This function implements the statistical function phi
    public static double phi(double z)
    {
    	//Add code here
    	
    	
    }
}

//Output
//Z score = 0.6750000000000005
//Minimum SAT score = 1901.25