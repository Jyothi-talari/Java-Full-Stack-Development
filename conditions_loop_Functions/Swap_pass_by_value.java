package conditions_loop_Functions;
import java.util.*;
public class Swap_pass_by_value {
	public static void Swap(int N1,int N2) {
		int temp=0;
		temp = N2;
      	N2 = N1;
	    N1 = temp;
	}
public static void main(String [] args) {
	Scanner sc= new Scanner(System.in);
	int var1=sc.nextInt();
	int var2=sc.nextInt();
	System.out.println("before swapping "+var1 +"   " +var2);
	Swap(var1, var2);
	System.out.println("num = " + var1 + " and decimal  = " + var2);
}
}
