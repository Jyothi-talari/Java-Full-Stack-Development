package String_Assignment;

import java.util.Scanner;

public class Problem_15_polindrome {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a String");
		String s= sc.nextLine();
		String output=" ";
		
			if(getReverse(s).equals(s)) {
				output="Is a paliondrome";
			}
			else {
				output="Not a palindrome";
			}
			
		
		System.out.println(output);
}
	public static String getReverse(String input) {
		String reverse="";
		for(int i=input.length()-1;i>=0;i--) {
			reverse= reverse+input.charAt(i);
		}
		return reverse;
	}
}

