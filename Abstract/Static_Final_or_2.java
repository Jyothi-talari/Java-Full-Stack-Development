package Abstract;
class Circle_6{
	public final float radious;
	public static final float PI=3.14f;
      public Circle_6() {
    	  this.radious=0f;
	}
	public Circle_6(float radious) {
		this.radious=radious;
	}
	public float Area() {
		return PI*radious*radious;
//		return PI*this.radious*this.radious;
	}
	public float Circumferance() {
		return 2*PI*radious;
}
public class Static_1 {
	public static void main(String[] args) {
		Circle_6 c1= new Circle_6(20f);
		System.out.println(c1.Area());
		Circle_6 c2= new Circle_6(200f);
		System.out.println(c2.Area());
		System.out.println(c2.Circumferance());
	}

}
}