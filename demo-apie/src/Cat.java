// ! Cat is a kind of "Animal"
// ! After "extends", Cat is a child class, while Animal is a parent class 
// ! 1. Inherit all attribues from parent class
// ! 2. Cannot inherit constructor from Parent class, but we can call the parent constructor by super;
// ! 3. Inherit instance method form parent class (Not exactly inherit)
public class Cat extends Animal {
  // private int age;
  private String name;

  public Cat (String name, int age){
    super(age); 
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
 
  public int getAge(){
    return super.getAge() + 10;
  }

  public int getAge2(){
    return super.getAge();  
  }

  public static void main(String[] args) {
    Cat cat = new Cat ("John", 13);
    System.out.println(cat.getAge());
    System.out.println(cat.getAge2());
    System.out.println(cat.getName());

  }
}
