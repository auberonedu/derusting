import java.util.HashMap;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map

    HashMap<String, Integer> hmp = new HashMap<String, Integer>();

    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    hmp.put("Number 1", 0);
    hmp.put("Number 2", 1);
    hmp.put("Number 3", 2);

    // Get the value associated with a given key in the Map
    hmp.get("Number 1");
    // Find the size (number of key/value pairs) of the Map
    System.out.println(hmp.size());
    // Replace the value associated with a given key (the size of the Map shoukld not change)
    hmp.replace("Number 1", 00000);
    // Check whether the Map contains a given key
    hmp.containsKey("Number 4");
    // Check whether the Map contains a given value
    hmp.containsValue(3); 
    // Iterate over the keys of the Map, printing each key
     //Iterate over the values of the map, printing each value
         // Iterate over the entries in the map, printing each key and value

    for (String key : hmp.keySet()) {
      Integer value = hmp.get(key);
      System.out.println("Key: " + key + ", Value: " + value);
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
