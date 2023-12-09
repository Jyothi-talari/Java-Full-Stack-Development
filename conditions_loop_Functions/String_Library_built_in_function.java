package conditions_loop_Functions;

public class String_Library_built_in_function {
	public static void main(String [] args) {
		String name="Jyothi";
		boolean compare_1;
		boolean compare_2;
		compare_1=name.equals("jyothi");
		System.out.println(compare_1);
		compare_2=name.equalsIgnoreCase("jyothi");
		System.out.println(compare_2);
		String string1="Talari";
		String string2=" Jyothi";
		String string3=string1.concat(string2);
		System.out.println(string3);
		
	}

}
