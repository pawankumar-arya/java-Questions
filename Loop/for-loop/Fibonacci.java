// package Loop.for-loop;
public class Fibonacci {
  public static void main(String[] args) {
    int n = 10;
    int ft = 0;
    int st = 1;
    for(int i=1; i<=n; i++){
      System.out.print(ft + " ");
      int next = ft + st;
      ft = st;
      st = next;
    }
  }
}
