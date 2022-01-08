/**
 * @(#)TestVisit.java
 *
 * TestVisit application
 *
 * @Author: nmessa 
 * @version 1.00 2022/1/13
 */

import java.util.*;

public class TestVisit {
    
    public static void main(String[] args) {
    	
    	//Test the Customer class
    	System.out.println("Test of Customer Class");
    	Customer mary = new Customer("Mary Jones");
    	mary.setMember(true);
    	mary.setMemberType("Gold");
    	System.out.println(mary);
    	
    	//Test the Visit class
    	System.out.println("\nTest of Visit and DiscountRate Classes");
    	Visit alice = new Visit("Alice Charmer", new Date());
    	alice.customer.setMember(true);
    	alice.customer.setMemberType("Premium");
    	alice.setServiceExpense(99.95);
    	alice.setProductExpense(49.95);
    	System.out.println(alice);
    	
    }
}

//Output
//Test of Customer Class
//Name: Mary Jones
//Member: true
//Membership Level: Gold
//
//Test of Visit and DiscountRate Classes
//Client name: Alice Charmer
//Member: true
//Membership Level: Premium
//Date: Wed Jan 05 14:25:04 EST 2022
//Service Charge: $79.96
//Product Charge: $44.96
//Total Charge: $124.92