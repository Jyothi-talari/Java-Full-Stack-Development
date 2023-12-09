package Inheritance;
class Student_3 {
  private final String name;
  private int year;

  private static final int annualFees = 10000;

  public Student_3(String name, int year) {
    this.name       = name;
    this.year       = year;
  }

  public String getDetails() {
    return "Name : "        + name           + '\n' + 
           "Fees : "        + computeFees() ;
  }

  public int computeFees () {
    return Student_3.annualFees * year;
  }
}

class ResearchStudent_1 extends Student {
  private String researchArea;
  public ResearchStudent_1(String name,int year,String researchArea) {
	  super(name,year);
	  this.researchArea=researchArea;

  }
}
class PhDStudent extends ResearchStudent_1{
	private String thesisTitle;
	public PhDStudent( String name, int year, String researchArea, String thesisTitle) {
		super(name,year,researchArea);
		this.thesisTitle=thesisTitle;
	}
}
public class Example_3_Supper {
  public static void main(String[] a) {
    Student_3 s1 = new Student_3("karan", 3);
    System.out.println(s1.getDetails());
    ResearchStudent_1 s2 = new ResearchStudent_1("siddharth", 6, "Software Engineering");
    System.out.println(s2.getDetails());
    PhDStudent s3 = new PhDStudent("hari", 1, "Software Engineering", "Automated Evaluation");
    System.out.println(s3.getDetails());
  }
}




