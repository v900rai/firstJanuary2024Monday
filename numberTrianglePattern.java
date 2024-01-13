package january.targettt50;
import java.util.*;
public class numberTrianglePattern {
	public static void printStar(int n) {
		for(int i=1; i<=0; i++) {// row
			for(int j=1; j<=n-1; j++) {
				System.out.print(" "); //space
			}
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
			
		}
	}
	public static void main(String [] args) {
		int rai=6;
		printStar(rai);
	}

}
