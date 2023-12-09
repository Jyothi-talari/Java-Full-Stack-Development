package Inheritance;

class School{
	protected  String name;
	protected int year;
	private accountDeteils account;
	private int scoolFees=10000;
	public School(String name,int year,accountDeteils account) {
		this.name=name;
		this.year=year;
	}
	public String getDetails(){
		return name+"   "+year*scoolFees;
	}
	
}
class PrimaryStudnets extends School{
	protected int Booksfee;
	
	private int Fees=20000;
	public PrimaryStudnets(String name,int year,int booksfees,accountDeteils account) {
		super(name,year,account);
		this.Booksfee=booksfees;
		
	}
	public String getDetails() {
		return this.name+" "+this.year+" "+(this.year*this.Booksfee);
		
	}
}
class secondaryStudents extends School{
	protected int examfee;
	
	private int Fees=30000;
	public secondaryStudents(String name,int year,int examfees,accountDeteils account) {
		super(name,year,account);
	   this.examfee=examfee;
	}
	public String getDetails() {
		return this.name+" "+this.year+" "+(this.year+this.examfee);
		
	}
}
	class accountDeteils {
		private int accountNumber;
		private int Balance;
	      public accountDeteils(int accoNum,int Balance) {
		this.accountNumber=accoNum;
	    this.Balance=Balance;
	}
}
   
public class Example_5_Composition {
	public static void main(String [] args) {
		accountDeteils a1= new accountDeteils(140051,20000);
		accountDeteils a2=new accountDeteils(140052,20000);
		accountDeteils a3=new accountDeteils(140053,20000);
		School s1= new School("jyothi",2,a1);
		System.out.println(s1.getDetails());
		PrimaryStudnets s2=new PrimaryStudnets("Naveen",3,400,a2);
		System.out.println(s2.getDetails());
		secondaryStudents s3= new secondaryStudents("nari",6,6,a3);
		System.out.println(s3.getDetails());
		
	}

	

}
   

