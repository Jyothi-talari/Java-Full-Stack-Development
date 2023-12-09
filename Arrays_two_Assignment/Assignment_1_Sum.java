package Arrays_two_Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_1_Sum {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int Rows=sc.nextInt();
		System.out.println("Enter the number of Columns ");
		int Column=sc.nextInt();
		int [][] array=new int [Rows][Column];
		
		for(int i=0;i<Rows;i++) {
			System.out.println("Enter the coloumn values "+i);
			for(int j=0;j<Column;j++) {
				array[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<array.length;i++) {
		System.out.println(Arrays.toString(array[i]));
		}
		int sum=0;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
			sum+=array[i][j];	
			}
		}
		System.out.println(sum);
}
}