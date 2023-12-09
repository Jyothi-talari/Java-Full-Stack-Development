package String_Assignment;

import java.util.Scanner;

public class Problem_11_max_word {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a String");
		String s= sc.nextLine();
		String []words=s.split(" ");
		String max=words[0];
		for(int i=0;i<words.length;i++) {
			if(max.length()< words[i].length()) {
				max=words[i];
			}
		}
		System.out.println(max);
}
}
