package january.targettt50;
import java.util.*;
public class returnProgram {
	public static void main(String args[]) {
	
		Scanner sc=new Scanner(System.in);
		greet();
		System.out.println("Please enter the  number");
		int frist=sc.nextInt();
		System.out.println(" Please Enter the number");
		int second=sc.nextInt();
		int sum=frist +second;
		System.out.println(sum  +"   summ of the number");
	}
	public static void greet() {
		System.out.println("welcome to calculate number");
	}

}
