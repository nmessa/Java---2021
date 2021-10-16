/**
 * @(#)StudentAverages.java
 *
 * StudentAverages application
 *
 * @Author: nmessa 
 * @version 1.00 2021/10/22
 */
import java.io.*;
import java.util.*;

public class StudentAverages {
    
    public static void main(String[] args) throws IOException
    {
    	
    	Scanner input = new Scanner(System.in);
        StudentAverage avg = new StudentAverage();
        System.out.print("Console or File Output (c/f): ");
        String str = input.next();
        if (str.equals("c"))
        	avg.readLines();
        if (str.equals("f"))
        	avg.readAndWriteLines();
    }
}
