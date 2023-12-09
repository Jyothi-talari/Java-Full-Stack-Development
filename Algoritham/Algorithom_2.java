package Algoritham;
import java.util.Scanner;
public class Algorithom_2 {
	public static void fibonic_5(int n) {
		int f[]=new int[n+1];
		f[0]=0;
		f[1]=1;
		for(int i= 2 ; i<=n;i++) 
			f[i]=(f[i-1]+f[i-2])%10;
		System.out.println(f[n]);
	

	}
		
	
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the N value");
		int n=sc.nextInt();
		fibonic_5(n);
	}
}


