package Arrays_one_Assignment;
import java.util.Arrays;
import java.util.Scanner;
public class Problem_4_Max_index {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int Arrsize=sc.nextInt();
		int [] Array= new int[Arrsize];
		System.out.println("Enter the Array values");
		for(int i=0;i<Array.length;i++) {
			Array[i]=sc.nextInt();
		}
		int max=Array[0];
		int index=0;
		for(int i=0;i<Array.length;i++) {
			if(Array[i]< max) {
				max=Array[i];
				index=i;
			}
			
		}
		System.out.println(Arrays.toString(Array));
		System.out.println("max number is "+max);
		System.out.println("index of max number "+index);
		
	}

}
