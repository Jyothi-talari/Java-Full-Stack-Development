package Sorting_Algorithm;
import java.util.Scanner;
import java.util.Arrays;
public class Insertion_sort {
	public static void Inserting(int []N) {
	   for(int i=0;i<N.length;i++) {
		   int j=i;
		   while(j>0 && N[j-1] < N[j] ) {
	    	int swap=N[j-1];
			N[j-1]=N[j];
			N[j]=swap;
			j=j-1;
	    }	
	   }
	System.out.println(Arrays.toString(N));
	}
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size");
		int size =sc.nextInt();
		int [] arr=new int[size];
		System.out.println("enter the values");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("seraching order is");
		Inserting(arr);
		
	}
}
