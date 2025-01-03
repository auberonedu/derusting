public class NumberPractice {
  public static void main(String args[]) {
    // Create a float with a negative value and assign it to a variable
    double negativeValue = -4.0; 
    // Create an int with a positive value and assign it to a variable
    int positveValue = 4;
    // Use the modulo % operator to find the remainder when the int is divided by 3
    double remainder = positveValue % 3;
    // Use the modulo % operator to determine whether the number is even
    // (A number is even if it has a remainder of zero when divided by 2)
    if (remainder % 2 == 0) {
      System.out.println("the Number is even");
    }
    else {System.out.println("Number is odd");}
    // Use an if-else to print "Even" if the number is even and "Odd"
    // if the number is odd.

    // Divide the number by another number using integer division
    int dividiedInts = 7/7;
    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example: 
     * 7 / 3 = 2 when performing int division
     */

  }
}
