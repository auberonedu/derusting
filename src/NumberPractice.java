public class NumberPractice {
  public static void main(String args[]) {
    // Create a float with a negative value and assign it to a variable
    float negativeFloat = -0.12345f;

    // Create an int with a positive value and assign it to a variable
    int positiveInteger = 42;

    // Use the modulo % operator to find the remainder when the int is divided by 3
    int remainder = positiveInteger % 3;

    // Use the modulo % operator to determine whether the number is even
    // (A number is even if it has a remainder of zero when divided by 2)
    // Use an if-else to print "Even" if the number is even and "Odd"
    // if the number is odd.
    if (remainder % 2 == 0) {
      System.out.println("Even");
    } else if (remainder % 2 != 0) {
      System.out.println("Odd");
    };

    // Divide the number by another number using integer division
    int dividend = remainder / 2;

    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example: 
     * 7 / 3 = 2 when performing int division
     */

  }
}
