package Sorting_Algorithm;
import java.util.Scanner;
import java.util.Arrays;

public class Selection_sort {
	public static void Selection_sort_1(int []N) {
	    for(int i=0;i< N.length-1;i++) {
	    	int min=i;
	    	for(int j=i+1;j<N.length;j++) {
	    		if(N[j]<N[min]) {
	    			min=j;	
	    		}
	    		
	    	}
	    	int swap=N[i];
			N[i]=N[min];
			N[min]=swap;
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
		Selection_sort_1(arr);
		
	}
}
