package String_Assignment;
import java.util.Scanner;
public class Problem_6_word_reverse {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a String");
		String s= sc.nextLine();
	    String [] words=s.split(" ");
	    String output="";
	    for(int i=0;i<words.length;i++) {
	    	String word=words[i];
	    	String reverse="";
	    for(int j=word.length() -1 ;j>=0;j--) {
	    	reverse+=word.charAt(j);
	    }
	    	output=output+reverse+" ";	    	
	    }
	    System.out.println(output);
		
		
	}

}
