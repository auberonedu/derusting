import java.util.HashMap;
import java.util.Map;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    Map<String, Integer> myMap = new HashMap<>();
    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    myMap.put("Alice", 75);
    myMap.put("Brandon", 88);
    myMap.put("Emily", 96);
    // Get the value associated with a given key in the Map
    System.out.println("Valued assosiated with a given key of 'Alice': " + myMap.get("Alice"));
    // Find the size (number of key/value pairs) of the Map
    System.out.println("Size of the Map: " + myMap.size());
    // Replace the value associated with a given key (the size of the Map should not change)
    myMap.put("Alice", 76);
    System.out.println("Updated value for 'Alice' key: " + myMap.get("Alice"));
    // Check whether the Map contains a given key

    // Check whether the Map contains a given value

    // Iterate over the keys of the Map, printing each key

    // Iterate over the values of the map, printing each value

    // Iterate over the entries in the map, printing each key and value

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
