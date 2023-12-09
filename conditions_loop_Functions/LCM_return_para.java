package conditions_loop_Functions;
import java.util.*;
public class LCM_return_para {
public static int LCM(int num1,int num2){
		int deno=0;
		for(int i=1;i<=num1 && i<=num2;i++) {
			if(num1%i==0 && num2%i==0) {
			   deno=i;
			}
		}
		int lcm=(num1 * num2)/deno;
		return lcm;
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number 1");
		int N1= sc.nextInt();
		System.out.println("enter the number 2");
		int N2=sc.nextInt();
		System.out.println(LCM(N1,N2));
	}
}
	