package Arrays_one_Assignment;
import java.util.Arrays;
import java.util.Scanner;
public class Problem_3_String_Concate {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Array Size1");
		int Arrsize1=sc.nextInt();
		String [] Array1= new String[Arrsize1];
		System.out.println("Enter the Array values1");
		for(int i=0;i<Array1.length;i++) {
			Array1[i]=sc.next();
		}
		System.out.println("Enter the Array Size2");
		int Arrsize2=sc.nextInt();
		String [] Array2= new String[Arrsize2];
		System.out.println("Enter the Array values2");
		for(int i=0;i<Array2.length;i++) {
			Array2[i]=sc.next();
		}
		String[] Array3= new String[Array1.length + Array2.length];
		for(int i=0;i< Array1.length;i++)
		{
			Array3[i]=Array1[i];
		}
		for(int i=0;i< Array2.length;i++)
		{
			Array3[i+Array1.length]=Array2[i];
		}
		System.out.println(Arrays.toString(Array1));
		System.out.println(Arrays.toString(Array2));
		System.out.println(Arrays.toString(Array3));
		
	}
      
}
