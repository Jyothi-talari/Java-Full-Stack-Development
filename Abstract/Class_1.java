package Abstract;

public class Class_1 {
	public static float rad=30f;
	private static int length=50;
public static void main(String [] args) {
	System.out.println(Cirlce_1.Area(rad));
	System.out.println(Circle_2.Length(length));
	
}
}
class Cirlce_1{
	public static float Area(float radious ) {
		return 30f*radious*radious;
	}
}
class Circle_2{
	public static int Length(int len) {
		return 30*len*len;
	}
}
