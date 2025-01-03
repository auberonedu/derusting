import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ListPractice {


  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    ArrayList arraylist = new ArrayList();
    // Add 3 elements to the list (OK to do one-by-one)
    arraylist.add("Yo");
    arraylist.add("Yo2");
    arraylist.add("Yo3");
    
    // Print the element at index 1
    System.out.println(arraylist.get(1));
    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    arraylist.set(1, "New Value");
    System.out.println(arraylist.get(1));
    // Insert a new element at index 0 (the length of the list will change)
    arraylist.add(0, "New 0 index Element");
    // Check whether the list contains a certain string
    arraylist.contains("String");
    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line
    for (int i = 0; i < arraylist.size(); i++) {
      System.out.println(arraylist.get(i));
    }
    // Sort the list using the Collections library
    Collections.sort(arraylist);
    // Iterate over the list using a for-each loop
    // Print each value on a second line
    for (Object item : arraylist) {
      System.out.println(item);
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