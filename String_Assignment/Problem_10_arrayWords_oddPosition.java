package String_Assignment;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Problem_10_arrayWords_oddPosition {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a String");
		String s= sc.nextLine();
		String []words=s.split(" ");
		int index=0;
		String[] outputArray=new String[words.length/2];
		for (int i=0;i<words.length;i++) {
			if(i%2!=0) {
				outputArray[index]=words[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(outputArray));
	}
	

}
