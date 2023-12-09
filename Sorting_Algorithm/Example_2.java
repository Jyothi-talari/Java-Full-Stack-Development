package Sorting_Algorithm;
import java.util.Arrays;
import java.util.Scanner;
public class Example_2 {
	 public static int partition_1(int[] ar, int start, int end) {
	        int pivot = ar[end];
	        int i = start;
	        for (int j = start; j < end; j++) {
	            if (ar[j] >= pivot) {
	                int temp1 = ar[j];
	                ar[j] = ar[i];
	                ar[i] = temp1;
	                i++;
	            }
	        }
	        int temp2 = ar[i];
	        ar[i] = ar[end];
	        ar[end] = temp2;

	        return i;
	    }
	  public static void quickSort_1(int[] ar, int start, int end) {
	        if (start < end) {
	            int p = partition_1(ar, start, end);
	            quickSort_1(ar, 0, p - 1);
	            quickSort_1(ar, p + 1, end);
	        }
	    }

	
   public static void main(String [] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the size 1 St array");
	int size_1=sc.nextInt();
	int [] arr_1=new int[size_1];
	System.out.println("enter the values 1 St array");
	for (int i=0;i<arr_1.length;i++) {
		arr_1[i]=sc.nextInt();
	}
	System.out.println("enter the size 2 St array");
	int size_2=sc.nextInt();
	int [] arr_2=new int[size_2];
	System.out.println("enter the values 2 St array");
	for (int i=0;i<arr_2.length;i++) {
		arr_2[i]=sc.nextInt();
	}
	
	int size_3=arr_1.length+arr_2.length;
	int [] arr_3=new int[size_3];
	for(int i=0;i<arr_1.length;i++) {
		arr_3[i]= arr_1[i];	
	}
	for(int i=0;i<arr_2.length;i++) {
		arr_3[i+arr_1.length]= arr_2[i];	
	}
	System.out.println(Arrays.toString(arr_1));
	System.out.println(Arrays.toString(arr_2));
	System.out.println(Arrays.toString(arr_3));
	quickSort_1(arr_3,0,arr_3.length-1);
	System.out.print(Arrays.toString(arr_3));
	
   }
}