package january.targettt50;
import java.util.*;
public class squareHollowPattern {
	public static void printPattern(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==0 || j==0 ||i==n-1 || j==n-1) {
					System.out.print("*");
				}
				 // otherwise print space only.
                else {
                    System.out.print(" ");
                }
				//System.out.println();
			}
			System.out.println();
		}
	}
	public static void main(String []args) {
		int vishal=6;
		printPattern(vishal);
	}

}
