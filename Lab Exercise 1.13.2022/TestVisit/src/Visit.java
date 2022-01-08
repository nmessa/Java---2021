//Visit class
//Author: 
//Date: 1/13/2022

import java.util.*;
import java.text.*;

public class Visit extends DiscountRate{
	//Instance variables
	//Add code here
	
	public Visit(String s, Date date)
	{
		//Add code here
	}
	
	public String getName()
	{
		//Add code here
	}
	
	public double getServiceExpense()
	{
		//Add code here
	}
	
	public void setServiceExpense(double ex)
	{
		//Add code here
		
	}
	
	public double getProductExpense()
	{
		//Add code here
	}
	
	public void setProductExpense(double ex)
	{
		//Add code here
	}
	
	public double getTotalExpense()
	{
		//Add code here
	}
	
	public String toString()
	{
		NumberFormat f = NumberFormat.getCurrencyInstance();
		return "Client name: " + customer.getName()+ "\n" + 
			"Member: " + customer.isMember() + "\n" + 
				"Membership Level: " + customer.getMemberType() + "\n" + 
					"Date: " + date + "\n" + "Service Charge: " + f.format(serviceExpense) + "\n" + 
						"Product Charge: " + f.format(productExpense) + "\n" +
							"Total Charge: " + f.format(getTotalExpense());
	}
}
