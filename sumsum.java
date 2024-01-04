package january.targettt50;
import java.util.*;
public class sumsum {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=0; i<=num; i++) {
			if(num%i!=0) {
				sum=sum+i;
			}
			System.out.println(sum);
			
		}
	}

}
