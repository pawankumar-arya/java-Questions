// package Loop.for-loop;
public class Multiplication_Table {
  public static void main(String[] args) {
    int number = 5; // Change this number to generate a different multiplication table

    System.out.println("Multiplication Table of " + number + ":");
    for (int i = 1; i <= 10; i++) {
      int result = number * i;
      System.out.println(number + " x " + i + " = " + result);
    }
  }
}
