package String_Assignment;

import java.util.Scanner;

public class Problem_12_two_present {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a String_1");
		String s1= sc.nextLine();
		System.out.println("Write a String_2");
		String s2= sc.nextLine();
		String output="";
		for(int i=0;i<s1.length();i++) {
			char temp=s1.toLowerCase().charAt(i);
			if(s2.toLowerCase().indexOf(temp)>=0) {
				output=output+s1.charAt(i);
			}
			else
			{
				output=output+"+";
			}
		}
		System.out.println(output);
		
	}
}
