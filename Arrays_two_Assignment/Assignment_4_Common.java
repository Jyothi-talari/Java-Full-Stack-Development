package Arrays_two_Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_4_Common {
	public static void main(String [] args) {
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the number of rows in Array_1");
//		int Rows_array_1=sc.nextInt();
//		int [][] array_1=new int [Rows_array_1][];
//		for(int i=0;i<Rows_array_1;i++) {
//			System.out.println("Enter the number of Columns in Array_1 "+i);
//			int Column_array_1=sc.nextInt();
//			array_1[i]=new int[Column_array_1];
//			System.out.println("Enter the coloumn values in Array_1 "+i);
//			for(int j=0;j<Column_array_1;j++) {
//				array_1[i][j]=sc.nextInt();
//			
//			}
//		}
//		System.out.println("Enter the number of rows in Array_2");
//		int Rows_array_2=sc.nextInt();
//		int [][]array_2=new int [Rows_array_2][];
//		for(int i=0;i<Rows_array_2;i++) {
//			System.out.println("Enter the number of Columnsin Array_2 "+i);
//			int Column_array_2=sc.nextInt();
//			array_2[i]=new int[Column_array_2];
//			System.out.println("Enter the coloumn values "+i);
//			for(int j=0;j<Column_array_2;j++) {
//				array_2[i][j]=sc.nextInt();
//			}
//		}
		int[] []array_1= {{1,2,1},
				{9,7,2},
				{7,6,4},
		};
		int[] []array_2= {{2,6,8,6},
				{0,1,3,9,7},
				{7,2,0},
				{8,30},
		};
          System.out.println("Array_1 input");
		for(int i=0;i<array_1.length;i++) {
			System.out.println(Arrays.toString(array_1[i]));
			}
		System.out.println("Array_2 input");
		for(int i=0;i<array_2.length;i++) {
		System.out.println(Arrays.toString(array_2[i]));
		}
		boolean isfound=false;
		for(int i=0;i<array_1.length;i++) {
			isfound=false;
			for(int j=0;j<array_1[i].length;j++) {
				int Target=array_1[i][j];
				isfound=true;
				for(int k=0;k<array_2.length;k++) {
					isfound=false;
					for(int l=0;l<array_2[k].length;l++) {
						if(Target==array_2[k][l]) {
							System.out.println(Target);
							isfound=true;
							break;
						}
					}
					if(isfound) {
						break;
					}
				}
	
				}
			
			}
	
		
		}
	}

			
		

