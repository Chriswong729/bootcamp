public abstract class Shape {
  private String color;

  public abstract double area();

  public static void main(String[] args) {
    Shape shape1 = new Circle(3.5);
    System.out.println(shape1.area()); // 38.48451000647496
    shape1 = new Rectangular(3.5, 4.5);
    System.out.println(shape1.area()); // 15.75

    Shape[] shapes = new Shape[3];
    shapes[0] = new Circle(3.5);
    shapes[1] = new Rectangular(3.5, 7.5);
    shapes[2] = new Circle(10.5);
    for (int i = 0; i < shapes.length; i++) {
      System.out.println(shapes[i].area());
    }
  }
}