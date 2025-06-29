
import java.util.function.Supplier;

public class DemoMethodReference {
  public static void main(String[] args) {
    String name = "John";

    // Lambda expression
    Supplier<Integer> lengthSupplier = () -> name.length(); // is a formula
    int length = lengthSupplier.get();

    // method reference
    Supplier<Integer> lengthSupplier2 = name::length;// variable.intanceMethod
    int length2 = lengthSupplier2.get();

    String s = "Hello";
    // int result = s::length();


    Supplier<String> stringObject = () -> new String(); 
    Supplier<String> stringObject2 = String :: new;
  }
}
