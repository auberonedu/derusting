import java.util.HashSet;
import java.util.Set;

public class SetPractice {
  public static void main(String[] args) {
    // Create a HashSet of Strings and assign it to a variable of type Set
    Set<String> movies = new HashSet<>();
    System.out.println(movies);

    // Add 3 elements to the set
    // (It's OK to do it one-by-one)
    movies.add("Anna and the Apocalypse");
    movies.add("Wicked");
    movies.add("Lilo and Stitch");
    movies.add("Memento");
    System.out.println(movies);

    // Check whether the Set contains a given String
    if (movies.contains("The Matrix")){
      System.out.println("INSERT QUOTE FROM THE MATRIX HERE");
    } else {
      System.out.println("You should add 'The Matrix' to this movie collection!");
    }

    // Remove an element from the Set
    movies.remove("Wicked");
    System.out.println(movies);

    // Get the size of the Set
    System.out.print("The size of this set is ");
    System.out.println(movies.size());

    // Iterate over the elements of the Set, printing each one on a separate line
    for (String movie : movies) {
      System.out.println(movie);
    }

    /*
     * Warning!
     * 
     * The iteration order over the items in a HashSet is NOT GUARANTEED.
     * 
     * Even running the exact same program multiple times may give different results.
     * Do not use a HashSet if order is important! You can use a TreeSet if you
     * want items in sorted order, or an array or List if you want them in a specified
     * order.
     * 
     * Also remember that sets do NOT have duplicates.
     */
  }
}
