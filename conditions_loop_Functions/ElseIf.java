package conditions_loop_Functions;
import java.util.Scanner;
public class ElseIf {
	public static void main(String [] args) {
		
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a<b && b<c) {
			System.out.println("the number is increasing order");
		}
		else if(a>b && b>c) {
			System.out.println("the number is decreasing order");
		}
		else {
			System.out.println("the number is nither increasing or decreasing order");
		}
		
	}

}
