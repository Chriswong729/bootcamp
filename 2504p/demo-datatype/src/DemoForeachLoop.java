
import java.util.Arrays;

public class DemoForeachLoop {
  public static void main(String[] args) {
    int[] arr = new int[] {3, 99, 10, 98, -1}; 
    // for loop
    // use i as index pattern to read the array values.
    for (int i = 0; i < arr.length;i++){
      System.out.println(arr[i]);
    }
    
    // for-each loop
    // you want to read the array in sequence and one by one 
    for (int x : arr){
      System.out.println(x);
    }

    int temp;
    for (int i = 0; i < arr.length /2; i++){
temp = arr[i]; 
arr[i] = arr[arr.length-i-1];
arr[arr.length- i -1]= temp;
    }
    System.out.println(Arrays.toString(arr));


Candy[] candies = new Candy[]{new Candy("Red", 10), new Candy("Blue", 20), new Candy("Yellow", 5)};
for (Candy candy : candies){
  if (candy.getColor().equals("Blue")){
    System.out.println(candy.getNumber());
  }
}



  }
}
