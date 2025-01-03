import java.util.ArrayList;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String five = "ontwo";
    // Find the length of the string
    System.out.println(five.length());
    // Concatenate (add) two strings together and reassign the result
    String secondString = "another";

    five += secondString;
    // Find the value of the character at index 3
    System.out.println(five.charAt(3));
    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    boolean check = five.contains("abc");
    System.out.println(check);
    // Iterate over the characters of the string, printing each one on a separate line
    for (int i = 0; i < five.length() ; i++) {
      System.out.println(five.charAt(i));
    }
    // Create an ArrayList of Strings and assign it to a variable
    ArrayList newAList = new ArrayList<>();
  
    // Add multiple strings to the List (OK to do one-by-one)
    newAList.add("Hello");
    newAList.add("No");
    newAList.add("Back");
    newAList.add("Afhasiuhs");

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    StringBuilder newString = new StringBuilder();

    for (Object word : newAList) {
      newString.append(word);
    }
    System.out.println(newString);
    // Check whether two strings are equal
    boolean checker = five.equals(secondString);
    System.out.println(checker);
    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
