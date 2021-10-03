/**
 * @(#)CryptoTest.java
 *
 * CryptoTest application
 *This is a test class to test your own algorithm
 *
 * @Author: nmessa 
 * @version 1.00 2021/10/4
 */
import java.util.*;

public class CryptoTest {
    
    public static void main(String[] args) {
    	//Create a Scanner object
    	Scanner reader = new Scanner(System.in);
    	
    	//Declare variables
        String eString, dString;
        
        //Create a Crypto object
        Crypto c = new Crypto();
        
        //Get a test string to encrypt/decrypt
        System.out.println("Enter a string to encrypt: ");
        String str = reader.nextLine();
        
        //Encrypt and print string
        eString = c.encrypt(str);
        System.out.println(eString);
        
        //Decrypt and print string
        dString = c.decrypt(eString);
        System.out.println(dString);
    }
}

