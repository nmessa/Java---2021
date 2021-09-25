/**
 * @(#)Cryptology.java
 *
 * Cryptology application
 *
 * @nmessa 
 * @version 1.00 9/30/2021
 */
import java.util.*;

public class Cryptology {
    
    public static void main(String[] args) {
    	
    	Crypto myCryptObject = new Crypto();
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a sentence that is to be encrypted: ");
        String sentence = reader.nextLine();
        String encryptSentence = myCryptObject.encrypt(sentence);
        System.out.println("Encrypted sentence = " + encryptSentence);
        String decryptSentence = myCryptObject.decrypt(encryptSentence);
        System.out.println("Decrypted sentence = " + decryptSentence);
    }
}

//Output
//Cryptological Object Created
//Enter a sentence that is to be encrypted: 
//This is a very big morning.
//Encrypted sentence = This is a ag',rery dug>?/ijeb..w ssadorninjeb..w.
//Decrypted sentence = This is a very big morning.
