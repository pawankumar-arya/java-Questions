// package Loop.for-loop;

public class ReverseString {
  public static void main(String[] args) {
    String str = "Hello, World!"; // Change this string to reverse a different value
    String reversed = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      reversed += str.charAt(i);
    }
    System.out.println("Reversed string: " + reversed);
  }
}
