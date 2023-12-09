package Searchin;
import java.util.Arrays;
import java.util.Scanner;
public class Binary {
    public int binarySearch(int[] inputArr, int key) {
    	int start=0;
    	int end=inputArr.length-1;
    	while(start<=end) {
    		int mid=(start+end)/2;
    		if(inputArr[mid]==key) {
    			return mid;
    		}
    		else if(inputArr[mid]<key) {
    			start=mid+1;
    		}
    		else {
    			end=mid-1;
    		}
    	}
    	return -1;
    }

    public static void main(String[] args) {

    	Binary mbs = new Binary();
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
        System.out.println("Key 14's position: " + mbs.binarySearch(arr, 14));
        int[] arr1 = {6, 34, 78, 123, 432, 900};
        System.out.println("Key 432's position: " + mbs.binarySearch(arr1, 432));
    }
}

