package Inheritance;
class college{
	protected  String name;
	protected int year;
	private int Fees=10000;
	public college(String name,int year) {
		this.name=name;
		this.year=year;
	}
	public String getDetails(){
		return name+" \n"+year*Fees;
	}
	
}
class Researchstudent_4 extends college{
	protected int labFee;
	private int Fees=20000;
	public Researchstudent_4(String name,int year,int labfee) {
		super(name,year);
		this.labFee=labfee;
		
	}
}
class PhdStudent_4 extends college{
//class PhdStudent_4 extends Researchstudent_4 {
	private int Fees=30000;
	public PhdStudent_4(String name,int year) {
//		super(name,year,labfee);
		super(name,year);
	}
	public String getDetails() {
		return this.name+" "+this.year;
	}
	
}
public class Example_4__protected {
	public static void main(String [] args) {
		college s1= new college("jyothi",2);
		Researchstudent_4 s2=new Researchstudent_4("Naveen",3,400);
		PhdStudent_4 s3= new PhdStudent_4("Narahari",6);
		System.out.println(s1.getDetails());
		System.out.println(s2.getDetails());
		System.out.println(s3.getDetails());

		
	}

}
