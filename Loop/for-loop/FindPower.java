// package Loop.for-loop;

public class FindPower {
  public static void main(String[] args) {
    int base = 2; // Change this base to calculate the power of a different number
    int exponent = 3; // Change this exponent to calculate a different power
    int result = 1;

    for (int i = 0; i < exponent; i++) {
      result *= base;
    }

    System.out.println(base + " raised to the power of " + exponent + " is: " + result);
  }
}
