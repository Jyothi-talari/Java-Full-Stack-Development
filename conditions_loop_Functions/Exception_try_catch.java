package conditions_loop_Functions;

public class Exception_try_catch {
	public static void main(String [] args) {
/*		int N=80/0;
		System.out.println("programe run Succesuful"); */
		
		try {
			int N=80/0;
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		System.out.println("Programe run Successful");
	}

}
