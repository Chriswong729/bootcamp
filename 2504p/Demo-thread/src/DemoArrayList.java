
import java.util.List;
import java.util.Vector;

public class DemoArrayList {

  public static void main(String[] args) {
    // problem ArrayList's behavior is not atomic
    // ! for data structue, we can just change the implementation(polymorphism)
    // Solution, use Vector
    List<Integer> integers = new Vector<>();

    Runnable task = () -> {
      for (int i = 0; i < 100_000; i++) {
        integers.add(1);
      }
    };
   long before = System. currentTimeMillis(); 

    Thread worker1 = new Thread(task);
    Thread worker2 = new Thread(task);

    worker1.start();
    worker2.start();

    try {
      worker1.join(); 
      worker2.join(); 
 } catch(InterruptedException e) {

    }

    long after = System.currentTimeMillis(); 

    // ! for time use, vector has lower performance becaause all of its behavior/method are synchronized
    // ! ArrayList has error because underlying data strcture is array !!!!!!!

    System.out.println("time used" + (after - before));



    System.out.println(integers.size());



    
  }
}
