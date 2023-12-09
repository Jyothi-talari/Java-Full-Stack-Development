package String_Assignment;
import java.util.Scanner;
public class Problem_4_Reverse {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a input String");
		String s= sc.nextLine();
		System.out.println("reverse");
		String s1=new String();
		for(int i=s.length()-1;i>=0;i--) {
			s1 = s1+s.charAt(i);
		}
		System.out.println(s1);
	}
	

}
