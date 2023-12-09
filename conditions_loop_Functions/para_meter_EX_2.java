package conditions_loop_Functions;
import java.util.Scanner;
public class para_meter_EX_2 {
	public static void example_2(int num1,int num2) {
		if(num1>num2) {
			System.out.println(num1+" is grether then "+num2);
		}
		else if(num1<num2) {
			System.out.println(num2+" is less then "+num1);
		}
		else {
			System.out.println(num1+" equal to "+num2);
		}
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int N1 =sc.nextInt();
		int N2 =sc.nextInt();
		example_2(N1,N2);
	}

}
