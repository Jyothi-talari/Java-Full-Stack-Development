package Searchin;
import java.util.*;
public class Example_3 {
	public static int Liner_search_2(int [] N,int key) {
		int count=0;
		for(int i=0;i<N.length;i++) {
			if(N[i]==key) {
				return count;
			}
			count++;
		}
	return count;
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
		System.out.println("index is "+Liner_search_2(N,key));
	}

}
