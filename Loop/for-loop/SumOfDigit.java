// package Loop.for-loop;

public class SumOfDigit {
  public static void main(String[] args) {
    int number = 12345; // Change this number to calculate the sum of digits for a different number
    int sum = 0;

    for (int temp = number; temp > 0; temp /= 10) {
      sum += temp % 10;
    }

    System.out.println("Sum of digits in " + number + " is: " + sum);
  }
}
