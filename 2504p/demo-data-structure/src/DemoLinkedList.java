
import java.util.LinkedList;

public class DemoLinkedList {
  public static void main(String[] args) {
    // Arraylist VS Linkedlist

    // Same: 
    // 1. with ordering
    // 2. store aa set og value

    // Difference:
    // 1. underlying data structure: 
    // 2. Scenario: get(), add(), remove()

    LinkedList<String> fruits = new LinkedList<>();
    fruits.add("apple");
    fruits.add("orange");
    fruits.add("apple");
    fruits.add("lemon");


    System.out.println(fruits);
    System.out.println(fruits.size());
    System.out.println(fruits.get(0));

    fruits.remove(1);

    for(String fruit : fruits){
      System.out.println(fruit);
    }

    if (fruits.contains("apple")){

    }

    fruits.addFirst("waterlemon");
    System.out.println(fruits);




    }
  }

