package january.targettt50;

import java.util.Scanner;

public class function {
	public static void printName(String name) {
		System.out.println(name);
		return;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name =sc.next();
		printName(name);
	}
	

}
