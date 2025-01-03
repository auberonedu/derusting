import java.util.*;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String myString = "At Least Five";
    // Find the length of the string
    System.out.println(myString.length());
    // Concatenate (add) two strings together and reassign the result
    String concatResult = myString + " Characters";
    System.out.println(concatResult);
    // Find the value of the character at index 3
    System.out.println(myString.charAt(3));
    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    System.out.println(myString.contains("east"));
    // Iterate over the characters of the string, printing each one on a separate line
    for(char c : myString.toCharArray()){
      System.out.println(c);
    }
    // Create an ArrayList of Strings and assign it to a variable
    List<String> myArrayList = new ArrayList<>();
    // Add multiple strings to the List (OK to do one-by-one)
    myArrayList.add("this ");
    myArrayList.add("is ");
    myArrayList.add("my ");
    myArrayList.add("list.");
    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String singleString = myArrayList.toString();
    System.out.println(singleString);
    // Check whether two strings are equal
    System.out.println(myString.equals(myArrayList.get(0)));
    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
