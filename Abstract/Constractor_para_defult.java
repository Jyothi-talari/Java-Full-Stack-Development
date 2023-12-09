package Abstract;
class Circle_5{
	public float radious;
      public Circle_5() {
	}
	public Circle_5(float radious) {
		this.radious=radious;
	}
	public float Area() {
//		return 30f*radious*radious;
		return 30f*this.radious*this.radious;
	}
}
public class Constractor_para_defult {
	public static void main(String[] args) {
		Circle_5 c1= new Circle_5(20f);
		System.out.println(c1.Area());
		Circle_5 c2= new Circle_5();
		System.out.println(c2.Area());
	}

}
