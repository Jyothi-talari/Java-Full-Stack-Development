package conditions_loop_Functions;

public class Double_buid_in_function {
	public static void main(String [] args) {
		double [] array= {10.34,20.45,30.50,40.51,50.49,60.43,71.71};
		for(int i=0;i<array.length;i++) {
			array[i]=Math.round(array[i]);
		}
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

}
