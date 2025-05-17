public class Student {
  private String name;
  private Candy[] candys;

  public Student(String name){
    this.name = name;
  }
  public Student(){
    this.candy = new Candy[0];
  }


  Student s1 = new student("Chris");
  Student s2 = new student("Wong");
  Student s3 = new student("X");

  Student[] students = new Student[3];
  students[0] = s1;
  students[1] = s2;
  students[2] = s3;








}
