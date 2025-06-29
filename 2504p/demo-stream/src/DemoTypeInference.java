
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class DemoTypeInference {
  // compile time cannot determine the type of age as attribute type

  // private var age;

  // public static int sum(var x, var y){
  // return x + y
  // }

// ! return typr need to be detemined at complie type
// ! because 
  public static void main(String[] args) {

    // 
    int x = 10; 
    x = (int) 10.3; // strong type: Java has to explicitly convert between type
    
    // ! Java 10/11
    // if you use var as a type of variable, it implies the type of value assigned at first time. 
    // During compile, the compiler convert "var" to "int"
    var age = 10; 
   // age = 10.5;
   // age = "hello";

   List<Dog> dogs = new ArrayList<>(Array.asList(new Dog(10)))
  }

  public static class Dog{
    private int age; 
  }

  public Dog(int age){
    this.age = age;
  }





  }

