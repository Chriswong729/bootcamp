
import java.util.LinkedList;
import java.util.List;

public interface Flyable {
  void fly();


  // we need to create a class to implement Flyable (how to fly)
  // so that we can use the object of the class to invoke fly() method




  public static void main(String[] args) {
    // ! create an object that is able to invoke fly implementation without explicitly writing a class 
    Flyable superman = new Flyable() {
      @Override
      public void fly(){
        System.out.println("Superman is flying");
      }
    };


// this object if for one-off usage 
// not intend to reuse it
    superman.fly();


    Flyable superman2 = new Flyable(){
      @Override
      public void fly(){
        System.out.println("Superman2 is flying...");
      }
    }; 
    superman2.fly();

    List<Flyable> flyableOjects = new LinkedList<>();
    flyableOjects.add(superman);
    flyableOjects.add(superman2);








  }
}
