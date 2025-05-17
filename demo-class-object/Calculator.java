public class Calculator {
  private int x;
  private int y;

  public Calculator (int x, int y){
    this.x = x;
    this.y = y;
  }
// presentation
  public int sum(){
    return this.x + this.y;
  }
//presentation
  public int product() {
    return this.x * this.y;
  }
//setter
  public void setX (int x){
    this.x = x;
  }
//setter
  public void setY (int y){
    this.y = y;
  }

//static method
  public static int sum(int x, int y){
    return x + y;
  }
// static method
  public static int product(int x, int y){
    return x * y;
  }

public static void main(String[] args) {
  // store a set of x and y
  Calculator c1 = new Calculator(2, 3);
  System.out.println(c1.sum());
  System.out.println(c1.product());
  c1.setY(10);
  System.out.println(c1.sum());
  System.out.println(c1.product());
  System.out.println(Calculator.sum(2, 9));
  System.out.println(Calculator.product(2, 9));




















}
}
