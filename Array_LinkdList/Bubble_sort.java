package Array_LinkdList;
import java.util.*;
public class Bubble_sort {
	public static void sorting_1(int [] array,int N) {
		
		for(int i=N-1;i>=0;i--) {
		for(int j=0;j<=i-1;j++) {
			if(array[j]>array[j+1]) {
				int temp=array[j+1];
				 array[j+1]=array[j];
				 array[j]=temp;
			}
		
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