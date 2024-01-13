package january.targettt50;
import java.util.*;
public class rhombusPattern {
	 public static void printPattern(int n)
	    {
	       
	        int num = 1;
	        // outer loop to handle number of rows
	        for (int i = 1; i <= n; i++) {
	            // inner loop to print spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	 
	            // inner loop to print stars
	            for ( int j = 1; j <= n; j++) {
	                System.out.print("*");
	            }
	            // printing new line for each row
	            System.out.println();
	        }
	    }
	 
	    // Driver Function
	    public static void main(String args[])
	    {
	        int n = 6;
	        printPattern(n);
	    }
	}

