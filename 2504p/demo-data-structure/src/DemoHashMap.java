import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
  // A Set of same type values : array, ArrayList, HashSet
public static void main(String[] args) {
    //key -> get a set og same type values
  // HashMap<key, value>
  HashMap<String, String> fruitMap = new HashMap<>();
  fruitMap.put("A","Apple");
  fruitMap.put("O", "Orange");
  fruitMap.put("L", "Lemon");


  System.out.println(fruitMap.size());
  System.out.println(fruitMap.get("A"));
  System.out.println(fruitMap.get("X"));

  if (fruitMap.containsKey("A")){
  }
  if (fruitMap.containsValue("Apple")){
  }

String removeValue = fruitMap.remove("O");
System.out.println(removeValue);

for (Map.Entry<String, String> entry : fruitMap.entrySet()){
  System.out.println(entry.getKey() + "," + entry.getValue());
}

// new LinkedHashMap<>();




  }
}
