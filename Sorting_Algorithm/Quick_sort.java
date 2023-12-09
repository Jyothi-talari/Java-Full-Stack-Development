package Sorting_Algorithm;
import java.util.Arrays;
import java.util.Scanner;
public class Quick_sort {
public static int Partition_1(int [] N,int start,int end) {
	int pivit=N[end];
	int P=start;
	for(int i=P;i<N.length;i++) {
		if(N[i]<=pivit) {
		int temp1 = N[i];
		N[i]=N[P];
		N[P]=temp1;
		P++;
		}
	}
	int temp2=N[P];
	N[P]=N[end];
	N[end]=temp2;
	return P;
}
  public static void quick_sort_1(int [] N,int start,int end) {
	if(start < end) {
		int pr= Partition_1(N,start,end);
		quick_sort_1(N,0,pr-1);
		quick_sort_1(N,pr+1,end);
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
	quick_sort_1(arr,0,arr.length-1);
	System.out.println(Arrays.toString(arr));
	
   }
}