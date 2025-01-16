import java.util.Scanner;

public class DisplayCalendar {

    // Array to store the names of months
    private static final String[] months = {"January", "February", "March", "April", "May", "June", 
                                           "July", "August", "September", "October", "November", "December"};

    // Array to store the number of days in each month (excluding February)
    private static final int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // Method to get the name of the month
    public static String getMonthName(int month) {
        return months[month - 1]; 
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        if (month == 2) { 
            return isLeapYear(year) ? 29 : 28; 
        } else {
            return daysInMonth[month - 1]; 
        }
    }

    // Method to get the day of the week for the first day of the month
    public static int getFirstDayOfWeek(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;
        return d0; 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        // Get the name of the month
        String monthName = getMonthName(month);

        // Get the number of days in the month
        int daysInMonth = getDaysInMonth(month, year);

        // Get the day of the week for the first day of the month
        int firstDayOfWeek = getFirstDayOfWeek(month, year); 

        // Display the calendar header
        System.out.println("\n" + monthName + " " + year);
        System.out.println();
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print spaces before the first day of the month
        for (int i = 0; i < firstDayOfWeek; i++) {
            System.out.print("   "); 
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d", day); 
            if ((day + firstDayOfWeek) % 7 == 0) {
                System.out.println(" "); 
            }
        }

        input.close();
    }
}