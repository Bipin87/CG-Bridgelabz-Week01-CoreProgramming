import java.util.Scanner;

public class LeapYearCheck {

    /**
     * Checks if the given year is a leap year.
     *
     * return true if the year is a leap year, false otherwise.
     */
    public static boolean isLeapYear(int year) {
        // Leap year conditions:
        // 1. Divisible by 4
        // 2. Not divisible by 100 unless it is also divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0); 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the an year: ");
        int year = input.nextInt();

        if (year < 1582) {
            System.out.println("Leap Year calculation is not valid before 1582 (Gregorian calendar).");
        } else {
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }

        input.close();
    }
}