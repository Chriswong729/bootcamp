
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {
  private double height;
  private double weight;

  public Person(double height, double weight){
    this.height = height;
    this.weight = weight;
  }
public double bmi(){
  BigDecimal result = 
  BigDecimal.valueOf(this.height).multiply(BigDecimal.valueOf(this.height)); 
  return BigDecimal.valueOf(this.weight).divide(result, 2, RoundingMode.HALF_DOWN)
  .doubleValue();
  }
  //return BigDecimal.valueOf(this.weight)//
  //.divide(BigDecimal.valueOf(this.height))//
  //.multiply(BigDecimal.valueOf(this.height))//
  //.doubleValue();
  //}

public boolean isOverWeight(){
  return this.bmi() > 25;
}


  public static void main(String[] args) {
    Person p1 = new Person(1.73, 70);
    Person p2 = new Person(1.62, 48);
    Person p3 = new Person(1.48, 30);
    System.out.println(p1.bmi()); // 25.83
    System.out.println(p1.isOverWeight()); // true

    System.out.println(p2.bmi()); // 22.44
    System.out.println(p2.isOverWeight()); // false

    Person[] persons = new Person[2]; 
    persons [0] = p1;
    persons [1] = p2;
    persons [2] = p3;

for (int i = 0; i < persons.length; i++){
System.out.println(persons[i].bmi() + ", " + persons[i].isOverWeight());
}































  }
}
