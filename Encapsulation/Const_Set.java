package Encapsulation;

class Const{
	private int var;
	public Const(int V) {
		this.var=V;
		setVariable(var);
	}
	public void setVariable(int N) {
		this.var=N;
		if(this.var<0) {
			this.var=0;
		}
	}
	public int Area() {
		return var;
	}
}
public class Const_Set {

	public static void main(String[] args) {
		Const c1=new Const(-100);
		System.out.println(c1.Area());
	c1.setVariable(10);
	System.out.println(c1.Area());
		

	}

}
