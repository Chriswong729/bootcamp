public class Candy {
  private static int count = 20;
  private String color;
  private int number;
  //candy has color, number
  public Candy(String color){
    count--;
    this.number = count;
    this.color = color; 
  }

  public static void main(String[] args) {
  
    // Distribute 20 candy to 3 student (loop)
    // Every Student has his own candies
    // print out the color of candy and number of every students

    // Teacher.java -> Distribute
    // Student.java -> Receive (Candy candy)(candy array)

    // Example
    // warrior.attack(archer)
    // public void atteck (Archer archer){
    // archer.deductHP(10);
    // }


  }
}
