package String_Assignment;
import java.util.Scanner;
public class Problem_3_occurance {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a input String");
		String s= sc.nextLine();
		System.out.println("Write the Character");
		/*char  ch= sc.next().charAt(0);//we have no data type for the char that's way we can use the next.charAt
		int count =0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==ch) {
				count++;
			}
		}*/
		char  ch= sc.next().charAt(0);
		char [] ch1=s.toCharArray();
		int count =0;
		for(int i=0;i<s.length();i++) {
			if(ch1[i]==ch) {
				count++;
			}
		}
		System.out.println(count);
	}

	

}
