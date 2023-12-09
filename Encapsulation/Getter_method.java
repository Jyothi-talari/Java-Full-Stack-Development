package Encapsulation;

import java.util.Scanner;

class Getter{
	private  float radious_1;
	public Getter(float r) {
		this.radious_1=r;
	}
	public float Area() {
		return 30f*radious_1*radious_1;
	}
	public float getRadious(){
		return this.radious_1;
	}
}

public class Getter_method {
	public static void main(String[] args) {
		Getter c1= new Getter(20f);
//		System.out.println(c1.radious);//in this we have the error thats why we can use the get method
		System.out.println(c1.getRadious());
		System.out.println(c1.Area());

}
}
