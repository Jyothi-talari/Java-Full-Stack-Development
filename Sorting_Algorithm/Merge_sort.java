package Sorting_Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_sort {
	public static void merge(int a[] ,int start,int mid,int end)    
	{   
	    int left_len = mid - start + 1;    
	    int right_len = end - mid;    
	      
	    int L[]=new int[left_len];
	    int R[]=new int [right_len]; //temporary arrays  
	      
	    /* copy data to temp arrays */  
	    for (int i = 0; i < left_len; i++)  {  
	    L[i] = a[start + i];    
	    }
	    for (int j = 0; j < right_len; j++)  {  
	    R[j] = a[mid + 1 + j];    
	    }
	   int  i = 0; /* initial index of first sub-array */  
	    int j = 0; /* initial index of second sub-array */   
	   int k = start;  /* initial index of merged sub-array */  
	      
	    while (i < left_len && j < right_len)    
	    {    
	        if(L[i] <= R[j])    
	        {    
	            a[k] = L[i];    
	            i++;    
	        }    
	        else    
	        {    
	            a[k] = R[j];    
	            j++;    
	        }    
	        k++;    
	    }    
	    while (i<left_len)    
	    {    
	        a[k] = L[i];    
	        i++;    
	        k++;    
	    }    
	      
	    while (j<right_len)    
	    {    
	        a[k] = R[j];    
	        j++;    
	        k++;    
	    }    
	    }
	public static void sort(int a[],int start, int end) {
	   if(start<end) {
		   int m=(start+end)/2;
		   sort(a,start,m);
		   sort(a,m+1,end);
		   merge(a,start,m,end);
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
			sort(arr,0,arr.length-1);
			System.out.println(Arrays.toString(arr));
			
		   }
	
}
