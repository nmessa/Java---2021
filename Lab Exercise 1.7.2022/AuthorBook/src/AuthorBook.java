/**
 * @(#)AuthorBook.java
 *
 * AuthorBook application
 *
 * @Author: nmessa 
 * @version 1.00 2022/1/7
 */
 
public class AuthorBook {
    
    public static void main(String[] args) {
    	
    	Author anAuthor = new Author("Mary Jones", "mjones@somewhere.com", 'f');
		System.out.println(anAuthor);   // call toString()
		anAuthor.setEmail("mjones@nowhere.com");
		System.out.println(anAuthor);
		
		Book aBook = new Book("Java for Experts", anAuthor, 19.95, 1000);
		System.out.println(aBook);
    }
}
//Output
//Mary Jones at mjones@somewhere.com
//Mary Jones at mjones@nowhere.com
//Java for Experts by Mary Jones at mjones@nowhere.com
