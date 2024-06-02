package codewars;


import java.util.HashMap;
import java.util.Map;

public class SwitchItUp {
  
  public static String switchItUp(int number)
  {
    Map<Integer, String> numberMap = new HashMap<>();

    numberMap.put(0, "Zero");
    numberMap.put(1, "One");
    numberMap.put(2, "Two");
    numberMap.put(3, "Three");
    numberMap.put(4, "Four");
    numberMap.put(5, "Five");
    numberMap.put(6, "Six");
    numberMap.put(7, "Seven");
    numberMap.put(8, "Eight");
    numberMap.put(9, "Nine");

    return numberMap.get(number);
    
  }
}
