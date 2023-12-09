package Searchin;
import java.util.*;
public class Linear {
	public static int Liner_search(int [] N,int key) {
		
		for(int i=0;i<N.length;i++) {
			if(N[i]==key) {
				return i;
			}
		}
		return -1;
		//public class Linear {
//		public static int Liner_search(int [] N,int key) {
//			
//			for(int i=N.length-1;i>=0;i--) {
//				if(N[i]==key) {
//					return N.length-1-i;
//				}
//			}
//			return -1;
//		}
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
		System.out.println("index is "+Liner_search(N,key));
	}

}

