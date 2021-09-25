/**
 * @(#)BankAccountTester.java
 *
 * BankAccountTester application
 *
 * @author 
 * @version 1.00 9/28/2021
 */
import java.util.*;

public class BankAccountTester {
    
    public static void main(String[] args) {
    	
    	//Create a Scanner object
    	Scanner reader = new Scanner(System.in);
    	
    	//Declare variables
    	String userName;
    	double balance;
    	
    	//Get account holder name
    	System.out.print("Enter the account holder: ");
    	userName = reader.nextLine();
    	
    	//Get initial balance
    	System.out.print("Enter the amount of your initial balance: ");
    	balance = reader.nextDouble();
    	
    	//Instantiate a BankAccount object myAccount
    	BankAccount myAccount = new BankAccount(userName, balance);
    	
    	//Make deposit
    	myAccount.deposit(505.22);
    	
    	//Print new balance
    	System.out.println("New balance: " + 
    		myAccount.getBalance());
    	
    	//Make withdrawal
    	myAccount.withdraw(100);
    	
    	//Print account info
    	System.out.println("The " + userName + 
    		" account balance is $" + myAccount.getBalance());
    }
}
//Sample Output
//Enter the account holder: Mary Jones
//Enter the amount of your initial balance: 1250
//New balance: 1755.22
//The Mary Jones account balance is $1655.22