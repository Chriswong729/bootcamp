
import java.math.BigDecimal;
// AUTHOR OF CIRCLE
public class Circle1 {
  private double radius;
  private String colour;
  //private double area; // violate 00p concept
  // type of method presentation

  // Construuctor
public Circle1(double radius, String colour){
  this.radius = radius;
  this.colour = colour; 
}

// what is the implication of no setter?
// 1. we cannot modify the date of object 
public void setRadius(double radius){
  this.radius = radius; 
}
public double getRadius(){
  return this.radius;
}
public void setColour(String colour){
  this.colour = colour;
}
public String getColour(){
  return this.colour; 
}

public double diameter(){
  return BigDecimal.valueOf(this.radius)//
  .multiply(BigDecimal.valueOf(2.0))//
  .doubleValue(); 
}

public static double area2(double radius){
  return BigDecimal.valueOf(radius)//
  .multiply(BigDecimal.valueOf(radius))//
  .multiply(BigDecimal.valueOf(Math.PI))//
  .doubleValue();
}

public double area() {
  return BigDecimal.valueOf(this.radius)//
  .multiply(BigDecimal.valueOf(this.radius))//
  .multiply(BigDecimal.valueOf(Math.PI))//
  .doubleValue();
}
public static void main(String[] args){
Circle1 c1 = new Circle1(3.5, "RED");
System.out.println(c1.area());

Circle1 c2 = new Circle1(4.5, "BLUE");

Circle1[] circles = new Circle1[1];
circles [0] = c1;
circles [1] = c2; 

System.out.println(circles[1].getColour());
System.out.println(circles[0].area());

Circle1[] circles2 = new Circle1[3];
circles [0]= new Circle1 (9.0, "BLACK");
circles [1]= new Circle1 (2.3, "YELLOW");
circles [2]= new Circle1 (3.0, "PINK"); 

System.out.println(Circle1.area2(3.5));

}
}
