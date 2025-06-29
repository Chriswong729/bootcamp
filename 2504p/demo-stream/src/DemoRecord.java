public class DemoRecord {
  
  public static void main(String[] args) {
    Staff staff1 = new Staff("John", 25);
    Staff staff2 = new Staff("John", 25);


// Getter
    System.out.println(staff1.age());
    System.out.println(staff1.name());

    // equals()
    System.out.println(staff1.equals(staff2));
    // hashCode()
System.out.println(staff1.hashCode() == staff2.hashCode());
    // toString
System.out.println(staff1.toString());

System.out.println(Staff.sum(3, 4));
  }
}
