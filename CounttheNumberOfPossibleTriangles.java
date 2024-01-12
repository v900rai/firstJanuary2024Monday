package january.targettt50;
import java.io.*;
import java.util.*;

public class CounttheNumberOfPossibleTriangles {
	// Java code to count the number of possible triangles using
	// brute force approach
	

	
		static int findNumberOfTriangles(int arr[], int n)
		{
			// Sort the array
			Arrays.sort(arr);
			// Count of triangles
			int count = 0;
			// The three loops select three different values
			// from array
			for (int i = 0; i < n; i++)
				for (int j = i + 1; j < n; j++)
					for (int k = j + 1; k < n; k++)
						if (arr[i] + arr[j] > arr[k])
							count++;
			return count;
		}

		// Driver code
		public static void main(String[] args)
		{
			int arr[] = { 10, 21, 22, 100, 101, 200, 300, 888,999};
			int size = arr.length;

			// Function call
			System.out.println(
				"Total number of triangles possible is "
				+ findNumberOfTriangles(arr, size));
		}
	}

	// This code is contributed by Sania Kumari Gupta



