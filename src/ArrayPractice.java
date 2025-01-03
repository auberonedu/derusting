public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] arrayFour = new String[4];
    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    arrayFour[0] = "ZERO";
    arrayFour[1] = "ONE";
    arrayFour[2] = "TWO";
    arrayFour[3] = "THREE";
    // Get the value of the array at index 2
    System.out.println(arrayFour[2]); //output: TWO
    // Get the length of the array
    System.out.println(arrayFour.length);
    // Iterate over the array using a traditional for loop and print out each item
    for (int i = 0; i < arrayFour.length; i++) {
      System.out.println(arrayFour[i]);
    }
    // Iterate over the array using a for-each loop and print out each item

    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
