// package Loop.for-loop;
public class printAll_Prime {
  public static void main(String[] args) {
    int limit = 100; // Change this limit to print primes up to a different number

    System.out.println("Prime numbers up to " + limit + ":");
    for (int num = 2; num <= limit; num++) {
      if (isPrime(num)) {
        System.out.print(num + " ");
      }
    }
  }

  private static boolean isPrime(int num) {
    if (num < 2) {
      return false;
    }

    for (int divisor = 2; divisor <= num / divisor; divisor++) {
      if (num % divisor == 0) {
        return false;
      }
    }

    return true;
  }
}
