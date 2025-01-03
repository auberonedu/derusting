import java.util.ArrayList;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String greeting = "Hello";
    System.out.println(greeting);

    // Find the length of the string
    int length = greeting.length();
    System.out.println(length);

    // Concatenate (add) two strings together and reassign the result
    String name = "Rebecca";
    String nameGreeting = greeting + ", " + name + "!";
    System.out.println(nameGreeting);

    // Find the value of the character at index 3
    System.out.println(nameGreeting.charAt(3)); // expect 'l'

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    boolean hasABitOfCalifornia = nameGreeting.contains("ca");

    if (hasABitOfCalifornia) {
      System.out.println("There's a little bit of California in that! ('ca')"); // expected output
    } else {
      System.out.println("No California here!");
    }

    // Iterate over the characters of the string, printing each one on a separate line
    System.out.println();
    for (int i = 0; i < nameGreeting.length(); i++) {
      System.out.println(nameGreeting.charAt(i));
    }

    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> zoo = new ArrayList<>();
    System.out.println(zoo);

    // Add multiple strings to the List (OK to do one-by-one)
    zoo.add("zebra");
    zoo.add("giraffe");
    zoo.add("penguin");
    zoo.add("tiger");
    System.out.println(zoo);

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String listOfAnimals = zoo.toString();
    listOfAnimals = listOfAnimals.substring(1, listOfAnimals.length() - 1);
    System.out.println(listOfAnimals);
    

    // Check whether two strings are equal
    String string1 = "apples";
    String string2 = "apples";
    String string3 = "oranges";

    System.out.println(compareTwo(string1, string2));
    System.out.println(compareTwo(string1, string3));




    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }

  public static String compareTwo (String a, String b) {
    String compared = "";
    if (a.contentEquals(b)) {
        compared = "Comparing apples to apples!";
      } else {
        compared = "Not comparing apples to apples!";
      }
      return compared;
  }
}


