

public class StringPrinter {
  private String value;

  public StringPrinter(String value){
    this.value = value;
  }
  public void print() {
    System.out.println(this.value);
  }
  public static void main(String[] args) {
    StringPrinter ip = new StringPrinter("hello");
    ip.print();
    }
}
