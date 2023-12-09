package String_Assignment;
import java.util.Scanner;
public class Problem_9_repeat_no_repeat {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a String");
		String s= sc.nextLine();
		char Repeted=' ';
		char non_repeted=' ';
		for(int i=0;i<s.length();i++) {
		char temp=s.charAt(i);	
			if(temp!=' ') {
				if(s.indexOf(temp)==s.lastIndexOf(temp))
					non_repeted =temp;
		
				else if(Repeted ==' ')
					Repeted =temp;
				if(non_repeted != ' ' && Repeted != ' ' )
					break;
		}
		}
		System.out.println("Repeted is  "+Repeted);
		System.out.println("Non repeted  "+non_repeted);
	}

}
