package conditions_loop_Functions;
import java.util.Scanner;
public class Function_EX_1 {
	 public static int max(int array[])
	   {
	       int max = array[0];
	       for(int index = 0; index < array.length; index++)  // array.length identifies the length of the array
	       {
	           if(max < array[index])
	           {
	               max = array[index];
	           }
	       }
	       return max;
	   

}
	public static void main(String [] args) {
		int num;
	       Scanner scan = new Scanner(System.in);
	       System.out.print("Enter number of elements in the array:");
	       num = scan.nextInt();
	       int array[] = new int[num];
	       System.out.println("Enter elements of array: ");
	       for(int index = 0; index < num; index++)
	       {
	           array[index] = scan.nextInt();
	       }
	       System.out.println("Max. element is " + max(array));
	}

}