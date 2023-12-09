package Algoritham;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Dublicate {
	public static int RandomNumber(int min,int max) {
		int RandomNumber=ThreadLocalRandom.current().nextInt(min,max-1);
		return RandomNumber;
	}
	
	public static int[] getinput(int n) {
		int input[]= new int[n];
		for(int i=0;i<n;i++) {
			input[i]=RandomNumber(1,2^n);
		}
		return input;
	}
	public static void printIds(int [] ids) {
		for(int i=0;i<ids.length;i++) {
			System.out.println(ids[i]);
		}
	}
//	public void duplicate_no(int [] ids) {
//		System.out.println("Duplicate values are");
//		for(int i=0; i<ids.length;i++) {
//			for(int j=i+1; j<ids.length;j++) {
//				if(ids[i]==ids[j]) {
//					System.out.println(ids[i]+" ");
//					break;
//				}
//			}
//		}
//	}
	public void duplicate_2(int [] ids) {
		System.out.println("Duplicate values are");
		int count[]=new int[10000];
		for(int i=0;i<ids.length;i++) {
			count[ids[i]]++;
			if(count[ids[i]]==2) 
				System.out.println(ids[i]+" ");
		}
			System.out.println();
		
		
		
	}
	
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in) ;
		System.out.println("enter the how many ids do you want? :");
		  int n = sc.nextInt();
	        int id[] = getinput(n);
	        System.out.println("Student id : ");
	        printIds(id);
	        Dublicate duplicates = new Dublicate();
	        duplicates.duplicate_2(id);
	    }
	}
	



