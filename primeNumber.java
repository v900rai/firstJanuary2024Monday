package january.targettt50;

import java.util.Scanner;

public class primeNumber {
	public static void main(String []args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		for(int i=n1; i<=n2; i++) {
			for(int j=2; j<=i; j++) {
				if(i%j==0)
					break;
			}
			else(i==j) {
				System.out.println(j);
			}
				
		}
	}

}
