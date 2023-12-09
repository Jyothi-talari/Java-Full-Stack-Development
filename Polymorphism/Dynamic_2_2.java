package Polymorphism;
class Add_1{
	protected int x;
	protected int y;
	public Add_1(int a,int b) {
		this.x=a;
		this.y=b;
	}
	public String getDetails() {
		return "The Addition is "+(x+y)+ "\n"
				+ computfee();
	}
	public String computfee() {
		return " Hello  " +this.x ;
	}
}
class Difference_1 extends Add_1{
	public Difference_1(int a,int b) {
		super(a,b);
	}
	public String computfee() {
		return "this is the second compute fee" +0.9f+(x-y);
	}
}
class Multiplication_1 extends Add_1{
	public Multiplication_1(int a,int b) {
		super(a,b);
	}
	public String computfee() {
		return "The Mutiplication  is "+(x*y)*0.9f*100  ;
	}

}


public class Dynamic_2_2 {
	public static void main(String [] args) {
		Add_1 s1=new Add_1(5,4);
		System.out.println(s1.getDetails());
		Difference_1 s2= new Difference_1(5,4);
		System.out.println(s2.getDetails());
		Multiplication_1 s3= new Multiplication_1(5,4);
	    System.out.println(s2.getDetails());
	 	
	}
}

/*class Student {
	  protected final String name;
	  protected int year;

	  protected static final int annualFees = 10000;

	  public Student(String name, int year) {
	    this.name = name;
	    this.year = year;
	  }


	  public String getDetails() {
	    return "Name : " + name + '\n' +
	            "Fees : " + computeFees();
	  }

	  protected float computeFees() {
	    return Student.annualFees * year;
	  }


	}

	class ResearchStudent extends Student {
	  protected String researchArea;
	  private static final int annualFees = 10000;

	  public ResearchStudent(String name, int year, String researchArea) {
	    super(name, year);
	    this.researchArea = researchArea;
	  }

	  protected float computeFees(){
	      return Student.annualFees * this.year*100.1f;
	  }


	  }


	public class Dynamic_2_2 {
	  public static void main(String[] a) {

	    Student s1 = new Student("karan", 3);
	    System.out.println(s1.getDetails());

	    ResearchStudent s2 = new ResearchStudent("siddharth", 3, "Software Engineering");
	    System.out.println(s2.getDetails());


	  }


	}*/