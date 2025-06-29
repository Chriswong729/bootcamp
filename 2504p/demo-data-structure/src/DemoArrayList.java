import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
    public static void main(String[] args) throws Exception {
        String[] arr = new String [] {"abc", "def", "ijk"};
        for (String s : arr){
            System.out.println(s);
        }

        // Disadvantages of array:
        // 1. Fixed length (ArrayList fixed this issue)
        // 2. Same type of value (Java won't solve this issue) 

        // Java allow object array to store any type of object
        // but Java follow Polymorphism the allowed methods refers to the type of object reference
        //Object[] arr2 = new Object[] {"abc", 10, 9.99};
        //for (Object s : arr2){
           // if (s instanceof String){
             //   String str = (String) s; 
             //   System.out.println(str.charAt(0));
        //    }
      //  }

        // Array lIst : variable length
        // The underlying the data structure of arraylist -> array
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Peter");
        System.out.println(names.size());

        names.remove("Peter");
        System.out.println(names.size());

        names.add("Jennie");
        // Author of ArrayList override toString()
        System.out.println(names);

        // ! contains() -> loop & equals()
        if (names.contains("Jennie")){

        }

        if (!names.contains("Peter")){

        }

        System.out.println(names.indexOf("Jennie"));
        System.out.println(names.indexOf("Peter"));
        System.out.println(names.indexOf("John"));

        // !
        if(!names.isEmpty()){

        }

        System.out.println(names.getFirst());// John because arraylist is with ordering
        System.out.println(names.get(1));
        //System.out.println(names.get(-1));

        List<String> reversed = names.reversed();
        System.out.println(reversed);

        reversed.set(1, "Steve");
        System.out.println(reversed);

        names.clear();
        System.out.println(names.isEmpty());
        System.out.println(names.size());
        // names = null; // what is the difference between line 62 clear() and null

        // remove Dog (equals)
        //List<Dog> dogs = new ArrayList<>();
        //dogs.add(new Dog("John"));
        //dogs.add(new Dog("Peter"));

        //dogs.remove(new Dog("Peter"));


        // remove("Peter"), remove the first "Peter

        names.addFirst("Chris");
// for loop 





  }
}