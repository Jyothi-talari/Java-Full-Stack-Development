package Abstract;
class Student_Class{
	public String name;
	public int roll_number;
	public float cgpa;
	public Student_Class(String a,int b,float c){
		this.name=a;
		this.roll_number=b;
		this.cgpa=c;
		
	}
	public void Display_profile() {
		System.out.println(name+" "+roll_number+" "+cgpa);
		
		
	}
	public float Percentage() {
		return cgpa*10;
	}
}
public class Asissignment_1 {
	public static void main(String [] args) {
		Student_Class s1= new Student_Class("karan",1056,8.8f);
		s1.Display_profile();
		System.out.println("persentage of s1 is"+s1.Percentage());
	}

}
