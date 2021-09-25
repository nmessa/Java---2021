/**
 * @(#)AutomobileTest.java
 *
 * AutomobileTest application
 *
 * @nmessa 
 * @version 1.00 9/29/2021
 */
 
public class AutomobileTest {
    
    public static void main(String[] args) {
    	
    	//Create Automobile object
        Automobile myBMW = new Automobile(24);
        
        //Add 20 gallons of gas
        myBMW.fillUp(20);
        
        //Take a 100 mile trip
        myBMW.takeTrip(100);
        
        //Get a fuel report and store in fuel_left
        double fuel_left = myBMW.reportFuel();
        
        //Output the anount of fuel left
        System.out.println("Fuel left: " + fuel_left);
    }
}

//Output
//Fuel left: 16.0