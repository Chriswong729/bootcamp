
public class Dog extends Animal {
  private double weight; // kg

  public Dog (double weight, int age){
    super(age);
    this.weight = weight; 
  }

  // presentation
  // Getter
  public double getWeight(){ // kg
    return this.weight;
  }

  public double getWeightG(){ // g
    return this.weight * 1000;

  }
  public static void main(String[] args) {
    Dog dog = new Dog(3.5, 10);
    System.out.println(dog.getWeight());
    System.out.println(dog.getAge());
  }














}
