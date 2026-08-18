// package IF-Else;

public class YoungOfThree {
  public static void main(String[] args) {
    int num1 = 10;
    int num2 = 20;
    int num3 = 5;

    if (num1 < num2 && num1 < num3) {
      System.out.println(num1 + " is the youngest number.");
    } else if (num2 < num1 && num2 < num3) {
      System.out.println(num2 + " is the youngest number.");
    } else {
      System.out.println(num3 + " is the youngest number.");
    }
  }
}
