package january.targettt50;

import java.util.Scanner;

public class addTwoNumberReturnSum {
	public static int calculateSum(int a, int b) {
		int sum=a+b;
		return sum;
	}
	public static int substract(int a, int b) {
		int sub=a-b;
		return sub;
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
	    int	sum=calculateSum(num1, num2);
	    System.out.println(sum);
	    int sub=substract(num1, num2);
	    System.out.println(sub);
	
		
	}

}
