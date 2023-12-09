package Searchin;
import java.util.*;
public class Example_2 {
	public static int Binary_search_1(int [] N,int key) {
		int start=0;
		int end=N.length-1;
		int count=0;
		while(start<=end) {
		int	mid=(start+end)/2;
			if(N[mid]==key) {
				return count;
			}
			else if(N[mid]<key) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
			count++;
		}
		return -1;
	
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("enter the size");
		int size=sc.nextInt();
			int [] N= new int[size];
			System.out.println("enter the values");
		for(int i=0;i<N.length;i++) {
			N [i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(N));
		System.out.println("enter the key value");
		int key=sc.nextInt();
		System.out.println("index is "+Binary_search_1(N,key));
	}

}