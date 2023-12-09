package Inheritance;
import java.util.Scanner;
public class proble {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(HCF(a,b));
		
	}
	public static int HCF(int a,int b) {
		while(a!=b) {
			if(a>b) {
				a=a-b;
			}
			else {
				b=b-a;
			}
		}
		return a;
	}
	

}
