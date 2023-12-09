package Array_LinkdList;
import java.util.*;

public class Example_1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        int k = s.nextInt();
        search(arr, k);
    }

    // Method to search for k in an unsorted array
    static void search(int[] arr, int k) {
        // Write your code
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                System.out.println("true");
                 return;
            }
            System.out.println("false");
           
        }
//         System.out.println("false");
    }
}

