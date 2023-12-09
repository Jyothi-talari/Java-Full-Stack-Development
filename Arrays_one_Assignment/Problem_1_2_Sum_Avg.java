package Arrays_one_Assignment;
import java.util.Arrays;
import java.util.Scanner;
public class Problem_1_2_Sum_Avg {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int Arrsize=sc.nextInt();
		int [] Array= new int[Arrsize];
		System.out.println("Enter the Array values");
		for(int i=0;i<Array.length;i++) {
			Array[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(Array));
		int sum=0;
		for(int i=0;i<Array.length;i++) {
			sum=sum+Array[i];
		}
		System.out.println("sum is  "+sum);
		System.out.println("Avarage is "+sum/Array.length);
	}

}
