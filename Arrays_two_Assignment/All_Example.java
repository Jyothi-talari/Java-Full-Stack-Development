package Arrays_two_Assignment;
import java.util.*;
public class All_Example {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows");
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
		
	}

}
