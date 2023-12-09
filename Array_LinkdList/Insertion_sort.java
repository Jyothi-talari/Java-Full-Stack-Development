package Array_LinkdList;
import java.util.*;
public class Insertion_sort {
	public static void sorting_1(int [] array,int N) {
		
		for(int i=0;i<=N-1;i++) {
		int j=i;
			while(j>0 && array[j-1]>array[j]) {
				int temp=array[j-1];
				 array[j-1]=array[j];
				 array[j]=temp;
				 j--;
			}
		
		}
		
	}
	
			
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size =sc.nextInt();
		int [] array= new int[size];
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		sorting_1(array,size);
		 System.out.println("Sorted array:");
        for(int i=0;i<array.length;i++)
        {
        System.out.print(array[i]+" ");
			
		}
		
		
	
	}
}