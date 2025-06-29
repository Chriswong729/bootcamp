public class Employee {
  // Attributes
  private String name;
  private int age;
  private String email; 

  // object Method 
    public void setName(String name){
    this.name = name; 
  }
  public String getname(){
    return this.name;
  }

    public void setAge(int age){
    this.age = age;
  }
  public int getage(){
    return this.age;
  }

  public void setEmail(String email){
    this.email = email; 
    }
  public String getemail(){
    return this.email; 
 }

  public static void main(String[] args) {
    
    String employee1Name = "John";
    int employee1Age = 26;
    String employee1Email = "john@gmail.com";

    String employee2Name = "Steven";
    int employee2Age = 30;
    String employee2Email = "steven@gmail.com";

// Solution -class and object
Employee e1 = new Employee();
e1.setName("John"); 
e1.setAge(26);
e1.setEmail("John@gmail.com");
Employee e2 = new Employee();
e2.setName("Steven"); 
e2.setAge(30);
e2.setEmail("steven@gmail.com");
System.out.println(e1.getname());
System.out.println(e1.getage());
System.out.println(e1.getemail());
System.out.println(e2.getname());
System.out.println(e2.getage());
System.out.println(e2.getemail());

  }
}
