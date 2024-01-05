package january.targettt50;

import java.util.Scanner;

public class printFactorial {
	public static int  printfactorial(int n) {
		int factroial=1;
		for(int i=n; i>=1; i--) {
			factroial=factroial*i;
		}
		System.out.println(factroial);
		return factroial;
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		 printfactorial(num);
		
		
		
	}

}
