package Arrays_two_Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_5_Comparesion {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows in Array_1");
		int Rows_array_1=sc.nextInt();
		int [][] array_1=new int [Rows_array_1][];
		for(int i=0;i<Rows_array_1;i++) {
			System.out.println("Enter the number of Columns in Array_1 "+i);
			int Column_array_1=sc.nextInt();
			array_1[i]=new int[Column_array_1];
			System.out.println("Enter the coloumn values in Array_1 "+i);
			for(int j=0;j<Column_array_1;j++) {
				array_1[i][j]=sc.nextInt();
			
			}
		}
		System.out.println("Enter the number of rows in Array_2");
		int Rows_array_2=sc.nextInt();
		int [][]array_2=new int [Rows_array_2][];
		for(int i=0;i<Rows_array_2;i++) {
			System.out.println("Enter the number of Columnsin Array_2 "+i);
			int Column_array_2=sc.nextInt();
			array_2[i]=new int[Column_array_2];
			System.out.println("Enter the coloumn values "+i);
			for(int j=0;j<Column_array_2;j++) {
				array_2[i][j]=sc.nextInt();
			}
		}
          System.out.println("Array_1 input");
		for(int i=0;i<array_1.length;i++) {
			System.out.println(Arrays.toString(array_1[i]));
			}
		System.out.println("Array_2 input");
		for(int i=0;i<array_2.length;i++) {
		System.out.println(Arrays.toString(array_2[i]));
		}
		int [][] array_3=new int[array_1.length][];
		for(int i=0;i<array_1.length;i++) {
			array_3[i]=new int[array_1[i].length];
			for(int j=0;j<array_1[i].length;j++) {
				if(array_1[i][j]==array_2[i][j]) {
					array_3[i][j]=1;
				}
				else {
					array_3[i][j]=0;
				}
			}
		}
		System.out.println("output");
		for(int i=0;i<array_3.length;i++) {
			System.out.println(Arrays.toString(array_3[i]));
		}
}
}