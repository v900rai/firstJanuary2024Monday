package january.targettt50;
import java.util.*;
public class copyAllElement {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int a[]= new int[5];
		int b[]=new int [5];
		//Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Print array the element");
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]+" ");
		}
		System.out.println("Copy of second element");
		
		for(int i=0; i<a.length; i++) {
			b[i]=a[i];
		}
		System.out.println(b[i]);
	}

}
