// package Loop.for-loop;
public class Factorial {
  public static void main(String[] args) {
    int number = 5; // Number to calculate factorial
    int factorial = 1;

    for (int i = 1; i <= number; i++) {
      factorial *= i; // Multiply factorial by the current number
    }

    System.out.println("Factorial of " + number + " is: " + factorial);
  }
}
