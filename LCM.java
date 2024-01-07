package january.targettt50;
import java.util.*;
public class LCM {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to LCM");
		System.out.println("Please enter the number");
		int frist=sc.nextInt();
		System.out.println("please enter the number");
		int second=sc.nextInt();
		int lcm=lcm(frist, second);
		System.out.println("LCM of the two number is "+lcm);
	}
	public static int lcm(int frist, int second) {
		int i=1;
		while(i<=second) {
			int factor=frist*i;
			if(factor%second==0) {
				return factor;
			}
			i++;
		}
		return 0 ;// unreachable
	}

}
