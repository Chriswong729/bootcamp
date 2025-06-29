import java.util.Stack;

public class DemoStack {
  public static void main(String[] args) {
    // Queue first in first out
    // stack first in last out
    Stack<String> s1 = new Stack<>();
    s1.push("john");
    s1.push("Peter");
    s1.push("Vicent");
    System.out.println(s1.pop());
    System.out.println(s1.size());
    System.out.println(s1.pop());
    System.out.println(s1.size());
    
    // undo redo
    

    // hop interview question: Using 2 Stack implement a SuperQueue


  }
}
