package String_Assignment;
import java.util.Scanner;
public class Problem_7_odd_up_even_rev {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a String");
		String s= sc.nextLine();
		String [] words=s.split(" ");
		String output="";
		for(int j=0;j<words.length;j++) {
			String word=words[j];
			if(j%2==0) 
				output=output+word.toUpperCase();
			
			else
			
				output=output+getReverse(word);
			
			if(j!=words.length-1) {
				output+=" ";
			}
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
