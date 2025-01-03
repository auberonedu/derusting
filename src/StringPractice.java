import java.util.ArrayList;
import java.util.List;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String myWord = "Welcome";
    // Find the length of the string
    System.out.println("Length of the Word: " + myWord.length());
    // Concatenate (add) two strings together and reassign the result
    myWord = myWord + " Friend";
    System.out.println("Concatenated String: " + myWord);
    // Find the value of the character at index 3
    System.out.println("Value of the character at index 3 is " + myWord.charAt(3));
    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    System.out.println("Does the String have 'abc' in it? " + myWord.contains("abc"));
    // Iterate over the characters of the string, printing each one on a separate line
    for (int i = 0; i < myWord.length(); i++) {
      System.out.println(myWord.charAt(i));
    }
    // Create an ArrayList of Strings and assign it to a variable
    List<String> stringList = new ArrayList<>();
    // Add multiple strings to the List (OK to do one-by-one)
    stringList.add("Cucumber");
    stringList.add("Carrot");
    stringList.add("Pepper");
    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    System.out.println("Joined String: " + String.join(", ", stringList));
    // Check whether two strings are equal
    String anotherWord = "Welcome Friend";
    System.out.println("Are the Strings equal to each other? " + myWord.equals(anotherWord));
    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
