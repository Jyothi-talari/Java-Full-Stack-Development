package Sorting_Algorithm;
import java.util.Arrays;
import java.util.Scanner;
public class quick_sort_1 {
	 public static int partition(int[] ar, int start, int end) {
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
	  public static void quickSort(int[] ar, int start, int end) {
	        if (start < end) {
	            int p = partition(ar, start, end);
	            quickSort(ar, 0, p - 1);
	            quickSort(ar, p + 1, end);
	        }
	    }

	
   public static void main(String [] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the size");
	int size=sc.nextInt();
	int [] arr=new int[size];
	System.out.println("enter the values");
	for (int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println(Arrays.toString(arr));
	quickSort(arr,0,arr.length-1);
	System.out.println(Arrays.toString(arr));
	
   }
}