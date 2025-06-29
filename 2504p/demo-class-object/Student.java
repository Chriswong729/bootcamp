public class Student {
  private static long counter = 0;
  private long id; 
  private Candy[] candies;

  public Student(String name){
    this.id = counter++;
    this.candies = new Candy[0];
  }

  public long getId(){
    return this.id;
  }

  public Candy[] getCandies(){
    return this.candies;
  }

  public int getTotalNumber(){
    int sum = 0;
    for(int i = 0; i < this.candies.length; i++){
      sum += this.candies[i].getNumber();
    }
  }
  
  public int numberOfRed(){
    int sum = 0;
    for (int i = 0; i < this.candies.length; i++){
if(this.candies[i].getColor().equals("Red"));
    }
  }

public int numberOfCandy(){
  return this.candies.length; 
}

  public void receive(Candy candy){
  Candy[] newCandies = new Candy[this.candies.length + 1];
  for (int i = 0; i < this.candies.length; i++){
  newCandies [i] = this.candies[i];
  }
  newCandies[newCandies.length - 1] = candy;
  this.candies = newCandies; 
    }


public static void main(String[] args) {
  Student s1 = new Student("A");
  Student s2 = new Student("B");
  Student s3 = new Student("C");

  Student[] students = new Student[3];
  students[0] = s1;
  students[1] = s2;
  students[2] = s3;

}
}
