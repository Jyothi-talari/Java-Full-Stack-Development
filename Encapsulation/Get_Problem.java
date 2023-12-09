package Encapsulation;
class Person{
	private String name;
	public Person(String N){
		this.name=N;
	}
	public String getperson() {
//	public String getName() {
		return name;
	}
}
public class Get_Problem {
	public static void main(String[] args) {
		Person c1=new Person("Ankit");
//		System.out.println(c1.getName());
		System.out.println(c1.getperson());
		
	}

}
