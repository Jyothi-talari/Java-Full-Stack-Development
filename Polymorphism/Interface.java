package Polymorphism;
interface Animal_2{


  public String getDetails();

}
interface Animal_3{


	  public String getDetails();

	}

class eating_1 implements Animal_2,Animal_3{
  protected String name_1;
  protected int costyears;

  protected static final int annualspend = 1000;

  public eating_1(String name, int year) {
    this.name_1=name;
    this.costyears = year;
  }


  public String getDetails() {
    return "Name : " + name_1 + '\n' +
            "Fees : " + this.computeFees_1();
  }

  protected float computeFees_1() {
    return eating.annualspend * costyears;
  }

}

class cat_1 implements Animal_2 {
	protected String name_1;
  private int ownernumber;
  private static final float startingmonth = 50000;

  public cat_1(String name, int Number) {
	  this.name_1=name;
    this.ownernumber = Number;
  }
  public String getDetails(){
      return "Name : " + name_1 + '\n' +
              "Salary : " + this.computeFees();
    }

  public float computeFees(){
    return this.startingmonth;

  }

}


//class Dog Implements Animal_1 {
class Dog_1 extends eating{
  protected int year;
  private static final int annualcost = 10000;

  public Dog_1(String name, int years) {
    super(name,years);
   
   
  }
//  public String getDetails(){
//      return "Name : " + name + '\n' +
//              "Salary : " + this.computeFees();
//    }

  protected float computeFees(){
      return eating.annualspend * this.annualcost*0.9f*100;
  }



  }


public class Interface {
  public static void main(String[] a) {

    eating s1 = new eating("karan", 2);
    //System.out.println(s1.getDetails());

    cat s2 = new cat("siddharth", 3);
    //System.out.println(s2.getDetails());

    Dog s3= new Dog("jyothi", 100);

    Animal[] array = {s1, s2, s3};
    printDetails(array);


  }

  public static void  printDetails (Animal [] persons) {
    for (Animal person: persons) {
      System.out.println(person.getDetails());
    }
  }


}
