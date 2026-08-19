// package Loop.for-loop;

public class ReverseNumber {
  public static void main(String[] args) {
    int number = 12345; // Change this number to reverse a different value
    int reversed = 0;

    while (number != 0) {
      int digit = number % 10;
      reversed = reversed * 10 + digit;
      number /= 10;
    }

    System.out.println("Reversed number: " + reversed);
  }
}
