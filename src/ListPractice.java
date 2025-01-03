import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPractice {


  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    List<String> stringList = new ArrayList<String>();

    // Add 3 elements to the list (OK to do one-by-one)
    stringList.add("banana");
    stringList.add("mango");
    stringList.add("lemon");

    // Print the element at index 1
    System.out.println(stringList.get(1)); // should print "mango"

    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    stringList.set(1, "kiwi");
    System.out.println(stringList); // should print "[banana, kiwi, lemon]"

    // Insert a new element at index 0 (the length of the list will change)
    stringList.add(0, "strawberry");
    System.out.println(stringList); // should print "[strawberry, banana, kiwi, lemon]"

    // Check whether the list contains a certain string
    if (stringList.contains("banana")) {
        System.out.println("That's bananas!"); // expected output
    } else {
      System.out.println("No bananas here.");
    }

    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line
    System.out.println();
    for (int i = 0; i < stringList.size(); i++) {
      String fruit = stringList.get(i);
      System.out.print(i);
      System.out.print(" " + fruit);
      System.out.println();
    }

    // Sort the list using the Collections library
    Collections.sort(stringList);
    System.out.println(stringList); // should print "[banana, kiwi, lemon, strawberry]"
    System.out.println();

    // Iterate over the list using a for-each loop
    // Print each value on a second line
    for (String fruit : stringList) {
      System.out.println(fruit);
    };

    /*
     * Usage tip!
     * 
     * Use a traditional for-loop when you need to use the index or you need to iterate in an
     * unconventional order (e.g. backwards)
     * 
     * Otherwise, if you're iterating the in the conventional order and don't need the
     * index values a for-each loop is cleaner.
     */
  }
}