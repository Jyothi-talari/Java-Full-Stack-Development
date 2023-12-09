package Arrays_one_Assignment;
import java.util.Arrays;
import java.util.Scanner;
public class Problem_5_min_index_String {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int Arrsize=sc.nextInt();
		String [] Array= new String[Arrsize];
		System.out.println("Enter the Array values");
		for(int i=0;i<Array.length;i++) {
			Array[i]=sc.next();
		}
		String min=Array[0];
		int index=0;
		for(int i=0;i<Array.length;i++) {
			if(Array[i].length()<min.length()) {
				min=Array[i];
				index=i;
			}
			
		}
		System.out.println(Arrays.toString(Array));
		System.out.println("max number is "+min);
		System.out.println("index of max number "+index);
	}

}
