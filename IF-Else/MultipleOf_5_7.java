// package IF-Else;

public class MultipleOf_5_7 {
  public static void main(String[] args) {
    int num = 35;

    if (num % 5 == 0 && num % 7 == 0) {
      System.out.println(num + " is a multiple of both 5 and 7.");
    } else if (num % 5 == 0) {
      System.out.println(num + " is a multiple of 5.");
    } else if (num % 7 == 0) {
      System.out.println(num + " is a multiple of 7.");
    } else {
      System.out.println(num + " is not a multiple of either 5 or 7.");
    }
  }
}
