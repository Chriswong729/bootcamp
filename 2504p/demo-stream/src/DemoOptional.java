
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DemoOptional {
// ! optional is ONLY for return type use
// how about 


  public static void main(String[] args) {
    List<Integer> integers = new ArrayList<>(Arrays.asList(8, 2, -100));
    Integer result = findFirstOddNumber(integers);
    if (result != null) {
      System.out.println(result.doubleValue());
    }


    // Java 8 Optional -> For method caller, more safe, avoid NPE
    Optional<Integer> optionalResult = findFirstOddNumber2(integers);

    // Approach 1
    if (optionalResult.isPresent()){
      System.out.println(optionalResult.get().doubleValue());
    } else{
      System.out.println("No add number");
    }
  }

  // Approach 2 (default value)
  Integer result2 = OptionalResult.orElse(-99);


// Approach 3
  Integer result3 = optionalResult.orElseThrow(()->new RuntimeException("No add number."));







    // what if no odd number
    // not found -> is not an exception
    // ! Java 8 has a better solution for this scenario

    public static Integer findFirstOddNumber(List<Integer> integers){
      for(Integer integer : integers){
        if (integer % 2 == 1)
        return integer; 
      }
      return null; 
    }


public static Optional <Integer> findFirstOddNumber2(List<Integer> integers){
      for(Integer integer : integers){
        if (integer % 2 == 1){
       return Optional.of(integer);
        }
      }
      return Optional.empty();
    }

    // ! how about we use Optional for input param?

public static Integer sum(Optional<Integer> x, Optional<Integer> y){ // bad 
  if (x== null || y == null)
  throw new IllegalArgumentException("x and y should not be null.");
  return 
}


// ! Wrong design 
// ! 1) we won't set an optional object to the attribute
// ! 2) Optional is not for auto-serializtion : Java object -> JSON (API) or Database
private Optional<String> name;

public DemoOptional(Optional<String> name){
  this.name = name;
}

public Optional<String> getName(){
  return this.name;
}

public void setName(Optional<String> name){
  this.name = name;
}

public void clearName(){
  this.name = null;
}




























  
}
