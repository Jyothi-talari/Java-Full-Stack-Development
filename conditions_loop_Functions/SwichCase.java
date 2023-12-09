package conditions_loop_Functions;
import java.util.Scanner;
public class SwichCase {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the N value");
		int n=sc.nextInt();
		switch(n){
		case 1:
			System.out.println("This is the number 1");
			break;
		case 2:
			System.out.println("This is the number 2");
			break;
		case 3:
			System.out.println("This is the number 3");
			break;
		case 4:
			System.out.println("This is the number 4");
			break;
			default:
				System.out.println("this numbers are Greatenr then 4");
		}
	}

}
