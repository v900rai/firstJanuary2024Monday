package january.targettt50;

public class findthelargestthreedistinctelementsinanarray {
	public static void main(String []args) {
		 int arr[] = { 12, 13, 1, 10, 34, 1 };
		 for(int i=0; i<arr.length; i++) {
			 System.out.println(arr[i]);
			 print3largest(arr, i);
		 }
	        //int n = arr.length;
		 
		
	}
	 static void print3largest(int arr[], int arr_size) {
		 int first; 
		 int second;
		 int third;
		 if(arr_size<3) {
			 System.out.println("invailed");
			 return;
		 }
		 third = first = second = Integer.MIN_VALUE;
		 for(int i=0; i<arr_size; i++ ) {
			 if(arr[i]>first) {
				 third = second;
	                second = first;
	                first = arr[i];
			 }
			 /* If arr[i] is in between first and
	            second then update second  */
	            else if (arr[i] > second) {
	                third = second;
	                second = arr[i];
	            }
	 
	            else if (arr[i] > third)
	                third = arr[i];
	        }
		  System.out.println("Three largest elements are " + first + " " + second + " " + third);
		 }
	 
		 
	 }


