package Algoritham;
import java.util.Scanner;
public class Fibonacci {
	public static int fibonic(int n) {
		if(n<2) 
			return n;
		else
			return (fibonic(n-1)+fibonic(n-2))%10;
		
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the N value");
		int n=sc.nextInt();
		System.out.println(fibonic(n));
	}
}
