package Arrays_one_Assignment;
import java.util.Arrays;
import java.util.Scanner;
public class Problem_6_Reverse {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int Arrsize=sc.nextInt();
		boolean [] Array= new boolean[Arrsize];
		System.out.println("Enter the Array values");
		for(int i=0;i<Array.length;i++) {
			Array[i]=sc.nextBoolean();
		}
         boolean [] reverse= new boolean[Array.length];
		for(int i=0;i<Array.length;i++)
		{
			reverse[Array.length-i-1] =Array[i];
		}
		System.out.println(Arrays.toString(Array));
		System.out.println(Arrays.toString(reverse));
	}

}
