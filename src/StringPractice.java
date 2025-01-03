import java.util.ArrayList;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String name = "Luigi";
    System.out.println(name);

    // Find the length of the string
    System.out.println(name.length());
    System.out.println();

    // Concatenate (add) two strings together and reassign the result
    String nameTwo = "Mario ";
    String result = nameTwo + name;
    System.out.println(result);

    // Find the value of the character at index 3
    System.out.println(name.charAt(3));

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    boolean substring = name.contains("abc");
    System.out.println(substring);

    // Iterate over the characters of the string, printing each one on a separate line
    for (char letter : name.toCharArray()) {
      System.out.println(letter);
    }

    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> Spiders = new ArrayList<>();
    // Add multiple strings to the List (OK to do one-by-one)
        Spiders.add("Peter Parker");
        Spiders.add("Miguel O'Hara");
        Spiders.add("Miles Morales");
        Spiders.add("Gwen Stacy");
        Spiders.add("Peni Parker");

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String SpiderPeople = String.join(", ", Spiders);
    System.out.println(SpiderPeople);
    
    // Check whether two strings are equal
    if (Spiders.get(3).equals(4)) {
      System.out.println("Their names are equal!");
    } else {
      System.out.println("Their names are not equal");
    }

    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
    
     //DONE 
  }
}
