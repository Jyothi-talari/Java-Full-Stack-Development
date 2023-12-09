package Polymorphism;
class Add{
	protected int x;
	protected int y;
	public Add(int a,int b) {
		this.x=a;
		this.y=b;
	}
	public String getDetails() {
		return "The Addition is "+(x+y);
	}
}
class Difference extends Add{
	public Difference(int a,int b) {
		super(a,b);
	}
	public String getDetails() {
		return "The Dofference is "+(x-y);
	}
}
class Multiplication extends Add{
	public Multiplication(int a,int b) {
		super(a,b);
	}
	public String getDetails() {
		return "The Mutiplication  is "+(x*y);
	}
}


public class Dynamic_2 {
	public static void main(String [] args) {
		Add s1=new Add(5,4);
		Difference s2= new Difference(5,4);
		Multiplication s3= new Multiplication(5,4);
		Add [] array= {s1,s2,s3};
		printdetails(array);
		
	}
	public static void printdetails(Add [] sum) {
		for(Add Add:sum) {
			System.out.println(Add.getDetails());
		}
		
	}

}
