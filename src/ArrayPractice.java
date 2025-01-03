import java.util.Arrays; 
public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] strArray = {"red", "orange", "yellow", "green"};
    System.out.println(Arrays.toString(strArray));

    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    strArray[0] = "blue";
    strArray[1] = "purple";
    strArray[2] = "red";
    strArray[3] = "orange";
    System.out.println(Arrays.toString(strArray));

    // Get the value of the array at index 2
    System.out.println("The value at index 2 is " + strArray[2]); // expect "The value at index 2 is red"

    // Get the length of the array
    System.out.print("The array length is ");
    System.out.print(strArray.length);
    // expects "The array length is 4"
    System.out.println();


    // Iterate over the array using a traditional for loop and print out each item
    System.out.println();
    for (int i = 0; i < strArray.length; i++) {
      System.out.println(strArray[i]);
    }

    // Iterate over the array using a for-each loop and print out each item
    System.out.println();
    for (String color: strArray) {
      System.out.println(color);
    }

    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
