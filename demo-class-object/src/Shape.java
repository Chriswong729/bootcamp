public class Shape {
  private static int counter = 0;
  private static final double PI = 3.14159; // "Static final" -> constant
  // final -> Finalized
  private final String name = "John"; 
  private String color; // attribute (usually we have setter because it is not final)


  public Shape() {

  }
  public String getName(){
    return this.name;
  }

  public static void main(String[] args) {
    System.out.println(Shape.PI);
    //! because Shape PI is a "final" variable, so cannot be modified.
    // Shape.PI += 1,
    Shape.counter++;// Normal usage
    System.out.println(Shape.counter);

    new Shape().counter++; // not recommended
    Shape.counter++;
    System.out.println(Shape.counter);

    // print John
    Shape s1 = new Shape();
    System.out.println(s1.getName());
    System.out.println(new Shape().getName());


  }
}
