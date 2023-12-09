package Abstract;
//class circle{}   //we con't write this because in the package we have already circle class thats why we con't wrote
class Circle_3{
	public float radious;
	public Circle_3(float r) {
		radious =r;
	}
	public float Area() {
		return 30f*radious*radious;
	}
}
public class Constractor_1 {
public static void main(String [] args) {
	Circle_3 c1= new Circle_3(20f);
	System.out.println(c1.Area());
	Circle_3 c2= new Circle_3(20f);
	System.out.println(c2.Area());
	
	
}
}
