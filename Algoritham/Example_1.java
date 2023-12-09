package Algoritham;
import java.util.Scanner;
public class Example_1 {
	public static void fibonic_1(int n) {
		int sum=0;
		for(int i= n ; i>0;i--) {
		  sum = sum+i;
		}
		System.out.println(sum);

	}
		
	
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the N value");
		int n=sc.nextInt();
		fibonic_1(n);
	}
}


