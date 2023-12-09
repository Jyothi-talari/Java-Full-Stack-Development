package String_Assignment;

import java.util.Scanner;

public class Problem_13__14_First_last_pdf {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a String_1");
		String s1= sc.nextLine();
		System.out.println("Write a String_2");
		String s2= sc.nextLine();
		String output_1=s2+","+s1.charAt(0);
		System.out.println(output_1);
		System.out.println(" ........................");
		String output_2=s1.substring(s1.lastIndexOf(".")+1,s1.length());
		System.out.println(output_2);
		

}
}