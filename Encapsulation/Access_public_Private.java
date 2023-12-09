package Encapsulation;
import java.util.Scanner;

class Access {
    public  float radious;
//	private  float radious; /// It will be error becase this is private it is used only for the same class
	public Access() {
		this.radious=radious;
	}
	public float Area() {
		return 30f*radious*radious;
	}
	
}

public class Access_public_Private {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the radious value");
	Access c1= new Access();
	c1.radious=sc.nextFloat();// this line will be error because radious has the private class
	System.out.println(c1.Area());
}
}