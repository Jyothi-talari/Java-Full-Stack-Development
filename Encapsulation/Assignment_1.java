package Encapsulation;
class Encaps{
    private String name;
    private int roll_no;
    private double cgpa=0;
    public Encaps(String N,int Roll){
        this.name=N;
        this.roll_no=Roll;
    }
    public String getNamea(){
        return name;
    }
    public int getRoll(){
        return roll_no;
    }
    public double getcgpa(){
        return cgpa;
    }
    public double setCgpa(Double Cgpa){
        return this.cgpa=Cgpa;
    }
    public void  Details(){
        System.out.println(name+" "+roll_no+" "+cgpa);
    }
    public double percentage(){
        return cgpa*10;
    }
}
public class Assignment_1
{
	public static void main(String[] args) {
	    Encaps e1= new Encaps("jyothi",1524);
		e1.Details();
		System.out.println(e1.percentage());
		e1.setCgpa(9.89);
		e1.Details();
		System.out.println(e1.percentage());
		
	}
}
