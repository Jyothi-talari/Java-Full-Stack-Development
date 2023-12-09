package Abstract;

public class Objects_1 {
	
public static void main(String [] args) {
	Circle c1= new Circle();
	c1.radious=30f;
	System.out.println(c1.Area());
	
	Circle c2= new Circle();
	c2.radious=20f;
	System.out.println(c2.Area());
}
}
class Circle{
	public float radious;
	public  float Area( ) {
		return 30f*radious*radious;
	}
}


