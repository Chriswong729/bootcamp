public class Child {
  // ! static -> common attribute, Not belongs to any object
  // ! but all object cancaccess the static variable
  private static int counter = 0;

  // every child object has id, firstname and lastname, but no counter.
  // Attribute (instance variable)
  // instance = object
  private long id;
  private String firstName;
  private String lastName;

  public Child(String firstName, String lastName){
    counter++;
    this.id = counter;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  
  // Encapsulation
  public String fullName(){
    return this.firstName + "" + this.lastName;
  }

  public String getFirstName(){
    return this.firstName;
  }

  public String getLastName(){
    return this.lastName;
  }

  public long getId(){
    return this.id;
  }

// Rewrite the definition of the child in your would
    public boolean equals(Child child){
      return this.id == child.getId();
    }

public static void main(String[] args) {
  Child c1 = new Child ("Leo", "Chan");

  if (c1.getFirstName().equals("Leo")&& c1.getLastName().equals("Chan")){
    System.out.println("He is Leo Chan");
  }

System.out.println(c1.equals(new Child("Leo", "Chan")));
System.out.println(c1.equals(new Child("Leo", "Lau")));

Child c2 = new Child("Leo", "Wong");
System.out.println(c2.getId());







}
}
