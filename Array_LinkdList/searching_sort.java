package Array_LinkdList;
import java.util.*;
public class searching_sort {
	public static void sorting_1(int [] array,int N) {
		
		for(int i=0;i<N-2;i++) {
			int min=i;
		for(int j=i;j<=N-1;j++) {
			if(array[j]<array[min]) {
			min=j;
			}
		}
		
		
		int temp=array[min];
		 array[min]=array[i];
		 array[i]=temp;
		
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

/*package Array_LinkdList;
import java.util.*;
public class Sorting {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
		int size =sc.nextInt();
		int [] arr= new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
        
        selectionSort(arr);
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Function to perform selection sort on the given array
    static void selectionSort(int[] arr) {
        int n = arr.length;

        // Traverse through all array elements
        for (int i = 0; i < n-1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Function to print an array
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}*/
