import java.util.*;

public class ListPractice {


  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    List<String> myList = new ArrayList<String>();
    // Add 3 elements to the list (OK to do one-by-one)
    myList.add("hello");
    myList.add("hi");
    myList.add("hey");
    // Print the element at index 1
    System.out.println(myList.get(1));
    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    myList.set(1, "bye");
    // Insert a new element at index 0 (the length of the list will change)
    myList.add(0, "goodbye");
    System.out.println(myList);
    // Check whether the list contains a certain string
    System.out.println(myList.contains("hi"));
    System.out.println(myList.contains("bye"));
    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line
    for(int i = 0; i < myList.size(); i++){
      System.out.println(i + ": " + myList.get(i));
    }
    // Sort the list using the Collections library
    myList.sort(null);
    System.out.println(myList);
    // Iterate over the list using a for-each loop
    // Print each value on a second line
    for (String string : myList) {
      System.out.println();
      System.out.println(string);
    }
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