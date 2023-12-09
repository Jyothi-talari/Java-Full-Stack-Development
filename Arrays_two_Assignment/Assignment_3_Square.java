package Arrays_two_Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_3_Square {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows");
	    int Row=sc.nextInt();
	    int [][] array=new int[Row][];
	    for(int i=0;i<Row;i++) {
	    	System.out.println("Enter the number of Columns"+i);
	    	int column=sc.nextInt();
	    	array[i]=new int[column];
	    	System.out.println("Enter the column values "+i);
	    	for(int j=0;j<column;j++) {
	    		array[i][j]=sc.nextInt();
			}
		}
	    System.out.println("input");
		for(int i=0;i<array.length;i++) {
		System.out.println(Arrays.toString(array[i]));
		}
		int [][] output=new int[array.length][];
		for(int i=0;i<array.length;i++) {
			output[i]=new int[array[i].length];
			for(int j=0;j<array[i].length;j++) {
				output[i][j]=(int) Math.pow(array[i][j], 2);
	}
		}
		 System.out.println("output");
		for(int i=0;i<output.length;i++) {
			System.out.println(Arrays.toString(output[i]));
			}
		
}
}