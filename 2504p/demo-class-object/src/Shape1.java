public class Shape1 {
  private static int counter = 0;
  private static final double PI = 3.14159; // "Static final" -> constant
  // final -> Finalized
  private final String name = "John"; 
  private String color; // attribute (usually we have setter because it is not final)


  public Shape1() {

  }
  public String getName(){
    return this.name;
  }

  public static void main(String[] args) {
    System.out.println(Shape1.PI);
    //! because Shape PI is a "final" variable, so cannot be modified.
    // Shape.PI += 1,
    Shape1.counter++;// Normal usage
    System.out.println(Shape1.counter);

    new Shape1().counter++; // not recommended
    Shape1.counter++;
    System.out.println(Shape1.counter);

    // print John
    Shape1 s1 = new Shape1();
    System.out.println(s1.getName());
    System.out.println(new Shape1().getName());


  }
}
