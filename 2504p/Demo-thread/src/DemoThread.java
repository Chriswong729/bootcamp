public class DemoThread {
  private int x;

    // ! solution 1 Synchronized (method to use)
    // ! locking the method (static or instance)
    // only one commander canc ask this dog to sleep
  public synchronized void addOne() {
    this.x = this.x + 1; // ! read and write (2 operations)
  }

  public int getX() {
    return this.x;
  }

  public static void main(String[] args) { // main thread
    DemoThread demoThread = new DemoThread();

    Runnable task1 = () -> {
      for (int i = 0; i < 100_000; i++) {
        demoThread.addOne();
      }
    };

    // main thread
    Thread worker1 = new Thread(task1); // created thread 1 send email
    Thread worker2 = new Thread(task1); // created thread 2 send sms

    worker1.start(); // inform worker 1 to start working
    worker2.start(); // inform worker 2 to start working

    try {
      worker1.join(); // main thread wait worker 1 here, until worker 1 completed the task
      worker2.join(); // main thread wait worker 2 here, until worker 2 completed the task
    } catch(InterruptedException e) {

    }

    System.out.println(demoThread.getX()); // 200000

  }
}