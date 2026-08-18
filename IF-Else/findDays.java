// package IF-Else;

public class findDays {
  public static void main(String[] args) {
    int month = 2; // February
    int year = 2024; // Leap year

    int days;

    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
      days = 31;
    } else if (month == 4 || month == 6 || month == 9 || month == 11) {
      days = 30;
    } else if (month == 2) {
      // Check for leap year
      if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        days = 29; // Leap year
      } else {
        days = 28; // Non-leap year
      }
    } else {
      System.out.println("Invalid month.");
      return;
    }

    System.out.println("Number of days in month " + month + " of year " + year + ": " + days);
  }
}
