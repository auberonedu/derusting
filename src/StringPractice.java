import java.util.ArrayList;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String word = "Jameson";
    // Find the length of the string
    System.out.println(word.length());
    // Concatenate (add) two strings together and reassign the result
    word = word + " Farmer";
    // Find the value of the character at index 3
    System.out.println(word.charAt(3));
    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    String test = "James";
    if(word.contains(test)){
      System.out.println(word + " contains " + test);
    }else{
      System.out.println(word + " does not contain " + test);
    }
    // Iterate over the characters of the string, printing each one on a separate line
    for (int i = 0; i < word.length(); i++) {
      System.out.println(word.charAt(i));
    }
    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> list = new ArrayList<String>();
    // Add multiple strings to the List (OK to do one-by-one)
    list.add("Tina");
    list.add("Josh");
    list.add("Auberon");
    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String combined = String.join(", ", list);
    System.out.println(combined);
    // Check whether two strings are equal
    String test1 = "Jameson";
    String test2 = "James"; 
    if(test1 == test2){
      System.out.println(test1 + " equals " + test2);
    }else{
      System.out.println(test1 + " does not equal " + test2);
    }
    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
