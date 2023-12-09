package Polymorphism;

abstract class Animal{
  protected final String name ;

  public Animal(String name) {
    this.name = name;

  }

  public abstract String getDetails();

}

class eating extends Animal{

  protected int costyears;

  protected static final int annualspend = 1000;

  public eating(String name, int year) {
    super(name);
    this.costyears = year;
  }


  public String getDetails() {
    return "Name : " + name + '\n' +
            "Fees : " + this.computeFees();
  }

  protected float computeFees() {
    return eating.annualspend * costyears;
  }

}

class cat extends Animal {
  private int ownernumber;
  private static final float startingmonth = 50000;

  public cat(String name, int Number) {
    super(name);
    this.ownernumber = Number;
  }
  public String getDetails(){
      return "Name : " + name + '\n' +
              "Salary : " + this.computeFees();
    }

  public float computeFees(){
    return this.startingmonth;

  }

}


//class Dog extends Animal {
class Dog extends eating{
  protected int year;
  private static final int annualcost = 10000;

  public Dog(String name, int year) {
    super(name,year);
   
   
  }
//  public String getDetails(){
//      return "Name : " + name + '\n' +
//              "Salary : " + this.computeFees();
//    }

  protected float computeFees(){
      return eating.annualspend * this.annualcost*0.9f*100;
  }



  }


public class Abstract {
  public static void main(String[] a) {

    eating s1 = new eating("karan", 2);
    //System.out.println(s1.getDetails());

    cat s2 = new cat("siddharth", 3);
    //System.out.println(s2.getDetails());

    Dog s3= new Dog("SKC", 100);

    Animal[] array = {s1, s2, s3};
    printDetails(array);


  }

  public static void  printDetails (Animal [] persons) {
    for (Animal person: persons) {
      System.out.println(person.getDetails());
    }
  }


}