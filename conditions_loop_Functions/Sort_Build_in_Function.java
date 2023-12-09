package conditions_loop_Functions;
import java.util.Arrays;
public class Sort_Build_in_Function {
	
	  public static void main(String[] args) {
	    int[] array = {5,8,12,45,1,85,12,66,20,45,10};
	   Arrays.sort(array);
	   for(int i=0;i<array.length;i++) {
		   System.out.print(array[i] +" ");
	   }
	  }
	}
