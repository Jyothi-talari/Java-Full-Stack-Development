package Polymorphism;
class sum_1{
	
	public String add(int a,int b) {
		return "this is the super calss  "+(a+b);
	}
	public int diff(int x,int y) {
		return x-y;
	}
	
}

public class overloading {
	public static void main(String [] args) {
		sum_1 s1=new sum_1();
		System.out.println(s1.add(2,3));
		System.out.println(s1.diff(30,10));
	}
}	
		
		
		
		