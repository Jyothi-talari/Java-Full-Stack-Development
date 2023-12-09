package String_Assignment;
import java.util.Scanner;
public class Problem_1_and_2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write the input");
		String s1= sc.nextLine();
		System.out.println("Number of Charecters");
		System.out.println(s1.length());
		
		System.out.println("...........................");
		
		System.out.println("only word count");
		String [] words = s1.split(" ");
		System.out.println(words.length);
		
		
	}

}
