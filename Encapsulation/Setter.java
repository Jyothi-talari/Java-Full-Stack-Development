package Encapsulation;
class Set{
	private String name;
	public Set(String N){
		this.name=N;
	}
	public String getperson() {
		return name;
	}
	public String setname(String name) {
		return this.name=name;
	}
}
public class Setter {
	public static void main(String[] args) {
		Set c1=new Set("Ankit");
		System.out.println(c1.getperson());
		c1.setname("Jyothi");
		System.out.println(c1.getperson());
	}

}
