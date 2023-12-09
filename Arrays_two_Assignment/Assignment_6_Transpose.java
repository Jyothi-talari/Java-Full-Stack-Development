package Arrays_two_Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_6_Transpose {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int Rows=sc.nextInt();
		int [][] array=new int [Rows][];
		for(int i=0;i<Rows;i++) {
			System.out.println("Enter the number of Columns "+i);
			int Column=sc.nextInt();
			array[i]=new int[Column];
			System.out.println("Enter the coloumn values "+i);
			for(int j=0;j<Column;j++) {
				array[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<array.length;i++) {
		System.out.println(Arrays.toString(array[i]));
		}
		int [][] output=new int[array.length][];
		for(int i=0;i<array.length;i++) {
			output[i]=new int[array[i].length];
			for(int j=0;j<array[i].length;j++) {
				output[i][j]=array[j][i];
			}
			}
		System.out.println("output");
		for(int i=0;i<output.length;i++) {
		System.out.println(Arrays.toString(output[i]));
		}
		
}
}