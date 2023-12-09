package String_Assignment;
import java.util.Scanner;
public class Problem_8_up_low_dig_special {
	private static final String Charecter = null;

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a String");
		String s= sc.nextLine();
		int Upper=0;
		int Lower=0;
		int Digital=0;
		int Special=0;
		char [] charecter= s.toCharArray();
		for (char ch :charecter ) {
			if(Character.isUpperCase(ch)) 
				Upper++;
			else if(Character.isLowerCase(ch))
				Lower++;
			else if(Character.isDigit(ch))
				Digital++;
			else
				Special++;
		}
		System.out.println(Upper);
		System.out.println(Lower);
		System.out.println(Digital);
		System.out.println(Special);
	}

}
