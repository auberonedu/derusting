import java.util.HashMap;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    map.put("Jameson", 18);
    map.put("Jace", 16);
    map.put("Lexie", 17);
    // Get the value associated with a given key in the Map
    int value = map.get("Jameson");
    // Find the size (number of key/value pairs) of the Map
    int size = map.size();
    // Replace the value associated with a given key (the size of the Map shoukld not change)
    map.put("Jameson", 19);
    // Check whether the Map contains a given key
    String testKey = "Jameson";
    if(map.containsKey(testKey)){
      System.out.println("Map contains " + testKey);
    }else{
      System.out.println("Map does not contain " + testKey);
    }
    // Check whether the Map contains a given value
    int testValue = 19;
    if(map.containsValue(testValue)){
      System.out.println("Map contains " + testValue);
    }else{
      System.out.println("Map does not contain " + testValue);
    }
    // Iterate over the keys of the Map, printing each key
    for (String i : map.keySet()) {
      System.out.println(i);
    }
    // Iterate over the values of the map, printing each value
    for (int i : map.values()) {
      System.out.println(i);
    }
    // Iterate over the entries in the map, printing each key and value
    for (String i : map.keySet()) {
      System.out.println("key: " + i + ", value: " + map.get(i));
    }
    /*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}
