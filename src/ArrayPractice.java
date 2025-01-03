public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] ofFour = new String[4];
    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    ofFour[0] = "Hello";
    ofFour[1] = "goodbye";
    ofFour[2] = "Hello Again";
    ofFour[3] = "Good Night";

    // Get the value of the array at index 2

    System.out.println(ofFour[2]);
    // Get the length of the array
    System.out.println(ofFour.length);
    // Iterate over the array using a traditional for loop and print out each item
    for (int i = 0; i < ofFour.length; i++) {
      System.out.println(ofFour[i]);
    }
    // Iterate over the array using a for-each loop and print out each item
    for (String string : ofFour) {
      System.out.println(string);
    }
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
