// package Loop.for-loop;
public class SumOfEvenNum {
  public static void main(String[] args) {
    int limit = 100; // Change this limit to calculate the sum of even numbers up to a different number
    int sum = 0;

    for (int num = 2; num <= limit; num += 2) {
      sum += num;
    }

    System.out.println("Sum of even numbers up to " + limit + " is: " + sum);
  }
}
