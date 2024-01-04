package january.targettt50;
import java.util.*;
public class Printa2DArrayorMatrixinJava {
	//private static final Exception IOException = null;
	public static void main(String []args) {
		 // throws IOException
		    //throw IOException;
		        int mat[][] = { { 1, 2, 3, 4 },
		                        { 5, 6, 7, 8 },
		                        { 9, 10, 11, 12 } };
		        print2D(mat);
		
	}

	public static void print2D(int mat[][]) {
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				System.out.print(mat[i][j]+" ");
			}
		}
	}
}
	
	



