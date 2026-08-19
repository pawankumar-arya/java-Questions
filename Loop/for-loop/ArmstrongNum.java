// package Loop.for-loop;
public class ArmstrongNum {
  public static void main(String[] args) {
    int limit = 1000; // Change this limit to check for Armstrong numbers up to a different number

    System.out.println("Armstrong numbers up to " + limit + ":");
    for (int num = 1; num <= limit; num++) {
      if (isArmstrong(num)) {
        System.out.print(num + " ");
      }
    }
  }

  private static boolean isArmstrong(int num) {
    int original = num;
    int sum = 0;
    int digits = String.valueOf(num).length();

    while (num > 0) {
      int digit = num % 10;
      sum += Math.pow(digit, digits);
      num /= 10;
    }

    return sum == original;
  }
}
