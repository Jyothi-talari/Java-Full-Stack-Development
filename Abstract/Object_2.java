package Abstract;

class square{
	public float length;
	public float area() {
		return length*length;
	}
}
public class Object_2 {
	public static void main(String [] args) {
		square s1=new square();
		square s2= new square();
		s1.length=10f;
		s2.length=20f;
		System.out.println(s1.area());
		System.out.println(s2.area());
	}

}
