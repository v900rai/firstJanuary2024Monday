package january.targettt50;
import java.util.*;
public class findLengthArrays {
	public static void main(String []args) {
		
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter the number");
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("print the element");
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]+" .");
		}
		System.out.println("In Arrays length"+ a.length);
	}

}
