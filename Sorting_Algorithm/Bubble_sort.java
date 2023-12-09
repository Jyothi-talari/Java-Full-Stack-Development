package Sorting_Algorithm;
import java.util.Scanner;
import java.util.Arrays;

public class Bubble_sort {
	public static void Bubble_sort_1(int []N) {
		int temp=0;
		for(int i=0;i<N.length;i++) {
			for(int j=1;j<N.length-i;j++) {
				if(N[j-1]>N[j]){
					temp=N[j];
					N[j]=N[j-1];
					N[j-1]=temp;
				}
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
		System.out.println("sorting order is");
		Bubble_sort_1(arr);
		
	}
}
