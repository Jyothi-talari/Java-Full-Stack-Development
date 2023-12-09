package conditions_loop_Functions;
import java.util.*;

public class Return_Para {
	public static String example_2(int num) {

			boolean primecheck = true;
			String result;
			for (int i = 2; i <= Math.sqrt(num); i++) {
				
				if (num % i == 0) {

					primecheck = false;
					break;
				}
			}

			if (primecheck == true) {
				result = "Prime";
			} else {
				result = "Not a prime";
			}
			return result;
		
	}
	public static void main (String [] args) {
		System.out.println("Enter the Number ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String Prime_Num=example_2(num);
		System.out.println(Prime_Num);
	}
	
}
