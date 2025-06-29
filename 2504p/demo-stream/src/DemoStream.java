
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class DemoStream {
  public static void main(String[] args) {

    List<Dog> dogs = new ArrayList<>();
    dogs.add(new Dog("ABC", 10));
    dogs.add(new Dog("DEFO", 7));
    dogs.add(new Dog("IJK", 8));

    // Prepare a new arrayList contains dogs with age >= 8
    // ! Tranditional way Filtering
    List<Dog> newDogs = new ArrayList<>();
    for (Dog dog : dogs) {
        if (dog.getAge() >= 8){
          newDogs.add(dog);
        }
    }
    System.out.println(newDogs);


// ! Filtering - Stream
Stream<Dog> newDogs2 = dogs.stream();
// Use filter 
// use predicate
Stream<Dog> newDogs3 = newDogs2.filter(d -> d.getAge() >= 8);
// form stream<dog> to List<dog>
List<Dog> newDogs4 = newDogs3.collect(Collectors.toList());
System.out.println(newDogs4);

List<Dog> newDogs5 = dogs.stream()
.filter(d -> d.getAge() >= 8)
.collect(Collectors.toList());
System.out.println(newDogs5);

// Dog name starts with "D"

List<Dog> newDogs6 = dogs.stream()
.filter(d -> d.getName().startsWith("D"))
.collect(Collectors.toList());
System.out.println(newDogs6);

// name length >3 and age <8 
// filter support AND OR
List<Dog> newDogs7 = dogs.stream()
.filter(d -> d.getName().length() > 3 && d.getAge() < 8) // Predicate
.collect(Collectors.toList()); 
System.out.println(newDogs7);


// ! Traditional way to get Dog names
// List <Dog> -> List<String> (Conversion of type)

List<String> names = new ArrayList<>();
for (Dog d : dogs){
 names.add(d.getName());
}
System.out.println(names);

// ! Map - Stream 

List<String> names2 = dogs.stream()
.map(d -> d.getName())// Function 
.collect(Collectors.toList());
System.out.println(names2);

// ! stream - filter + map 
// find all dog names, whose age > 9

List<String> names3 = dogs.stream()
.filter(dog -> dog.getAge() > 9)
.map(dog -> dog.getName())
.collect(Collectors.toList());
System.out.println(names3);

  List<Staff> staffs = new ArrayList<>();
  staffs.add(new Staff("Alex", LocalDate.of(2010, 1, 1), "alex@gmail.com"));
  staffs.add(new Staff("John", LocalDate.of(2024, 1, 20), "john@gmail.com"));
  staffs.add(new Staff("Mary", LocalDate.of(2022, 1, 20), "mary@gmail.com"));

 // List<String> staffs1 = staffs.stream()
 // .filter(s -> s. yearOfExp() > 10)
//  .map(s -> s.getEmail())
  

// Collections.sort() -> Comparator
// You can use " -> " to create an object when you have an interface with 1 abstract method only
Comparator<Staff> sortByYearOfExp = (staff1, staff2) -> staff1.yearOfExp() < staff2.yearOfExp() ? -1 : 1;
// Sort() - stream
List<String> emails = staffs.stream()
.sorted(sortByYearOfExp)
.map(s -> s.getEmail())
.collect(Collectors.toList());


long result = staffs.stream()
.filter(s -> s.getEmail().length() > 10)
.count();
System.out.println(result);


long result2 = staffs.stream()
.map(s -> {
  System.out.println(s.getEmail());
  return s.getEmail();
}).count();
System.out.println(result2);


Stream<Integer> integers = Stream.of(3, 100, -2);
Stream<Staff> staffs2 = Stream.empty();



















  }
  public static class Staff{
    private String name;
    private LocalDate joinDate;
    private String email;


    public Staff(String name, LocalDate joinDate, String email){
      this.name = name;
      this.email = email;
    }

    // Presentation of joindate
    public int yearOfExp(){
      return LocalDate.now().getYear() - this.joinDate.getYear();
    }

public String getEmail(){
  return this.email;
}



  }























  public static class Dog {
  private String name;
  private int age;

  public Dog(String name, int age) {
    this.name = name;
    this.age = age;
  }
  public String getName() {
    return this.name;
  }


  @Override
  public String toString(){
    return "Dog("
    + "name=" + this.name
    + "age=" + this.age+ ")";
  }


  
  public int getAge() {
    return this.age;
  } 
}

  
}

  

