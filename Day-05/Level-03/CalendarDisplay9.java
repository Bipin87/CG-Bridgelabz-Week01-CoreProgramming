import java.util.Scanner;
public class CalendarDisplay9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        displayCalendar(month, year);
		scanner.close();
    }

    public static void displayCalendar(int month, int year) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(year)) {
            daysInMonth[1] = 29; // February in leap year
        }

        String monthName = months[month - 1];
        int days = daysInMonth[month - 1];
        int firstDay = dayOfWeek(year, month);

        System.out.println("     " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print spaces for the first day of the month
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print the dates
        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    // Check if it's a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Calculate the day of the week for the first day of the month (0 = Sunday, 1 = Monday, ...)
    public static int dayOfWeek(int year, int month) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;
        return d0;
    }
}