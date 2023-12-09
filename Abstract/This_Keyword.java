package Abstract;
class Circle_4{
	public float radious;
	public Circle_4(float radious) {
		this.radious=radious;
	}
	public float Area() {
//		return 30f*radious*radious;
		return 30f*this.radious*this.radious;
	}
}
public class This_Keyword {
	public static void main(String[] args) {
		Circle_4 c1= new Circle_4(20f);
		System.out.println(c1.Area());
		Circle_4 c2= new Circle_4(100f);
		System.out.println(c2.Area());
	}

}
