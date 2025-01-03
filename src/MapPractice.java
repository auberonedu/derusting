import java.util.HashMap;
import java.util.Map;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    Map<String, Integer> simpsons = new HashMap<String, Integer>();
    System.out.println(simpsons);

    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    simpsons.put("Homer", 38);
    simpsons.put("Marge", 36);
    simpsons.put("Bart", 10);
    simpsons.put("Lisa", 8);
    simpsons.put("Maggie", 1);
    System.out.println(simpsons);

    // Get the value associated with a given key in the Map
    System.out.println(simpsons.get("Maggie")); // expect 1

    // Find the size (number of key/value pairs) of the Map
    System.out.print("The map size is ");
    System.out.println(simpsons.size());

    // Replace the value associated with a given key (the size of the Map shoukld not change)
    System.out.print("It's Lisa's birthday! Now she is: ");
    simpsons.put("Lisa", simpsons.get("Lisa") + 1);
    System.out.println(simpsons.get("Lisa"));

    // Check whether the Map contains a given key
    if (simpsons.containsKey("Homer")) {
      System.out.println("Homer is a Simpson.");
    } else {
      System.out.println("Where did Homer go??");
    }

    // Check whether the Map contains a given value
    if (simpsons.containsValue(42)) {
      System.out.println("42 is a cool age!");
    } else {
      System.out.println("None of the Simpsons are 42.");
    }

    // Iterate over the keys of the Map, printing each key
    for (String name : simpsons.keySet()) {
      System.out.println(name);
    }

    // Iterate over the values of the map, printing each value
    for (Integer age : simpsons.values()) {
      System.out.println(age);
    }

    // Iterate over the entries in the map, printing each key and value
    for (Map.Entry<String,Integer> person : simpsons.entrySet()) {
      System.out.println(person.getKey() + " is " + person.getValue() + " years old.");
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
