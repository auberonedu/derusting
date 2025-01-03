public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] myArr = new String[4];
    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    myArr[0] = "Hello";
    myArr[1] = "Bonjour";
    myArr[2] = "Hola";
    myArr[3] = "Salam";

    // Get the value of the array at index 2
    System.out.println("Value at index 2: " + myArr[2]);
    // Get the length of the array
    System.out.println("Length of the array: " + myArr.length);
    // Iterate over the array using a traditional for loop and print out each item
    for (int i = 0; i < myArr.length; i++) {
      System.out.println(myArr[i]);
    }
    // Iterate over the array using a for-each loop and print out each item
    for (String item : myArr) {
      System.out.println(item);
    }
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
