package Polymorphism;
class sum{
	protected int a=50;
	protected int b=30;
	public String add() {
		return "this is the super calss  "+(a+b);
	}
	public int diff() {
		return a-b;
	}
	
}
class Mul extends sum{
       
	public String add() {
		return (a+b)+" this is the extended class";
	}
	public int diff() {
		return a-b;
	}
}

public class overriding_Dynamic_1 {
	public static void main(String [] args) {
		sum s1=new sum();
		System.out.println(s1.add());
		System.out.println(s1.diff());
		
		/*Mul s2= new Mul();
		System.out.println(s2.add());
		System.out.println(s2.diff());*/
		
		
		/*sum s2= new Mul();
		System.out.println(s2.add());
		System.out.println(s2.diff());*/
		
		
		s1= new Mul();
		System.out.println(s1.add());
		System.out.println(s1.diff());
		
	}

}
