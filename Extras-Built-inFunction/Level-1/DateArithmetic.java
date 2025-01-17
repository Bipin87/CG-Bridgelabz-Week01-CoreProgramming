import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a date (yyyy-MM-dd):");

        String input = scanner.nextLine();
        // Validate the input
        try {
            // Parse the input date
            LocalDate date = LocalDate.parse(input);

            // Perform date arithmetic
            LocalDate datePlus7Days = date.plusDays(7);
            LocalDate datePlus1Month = datePlus7Days.plusMonths(1);
            LocalDate datePlus2Years = datePlus1Month.plusYears(2);
            LocalDate dateMinus3Weeks = datePlus2Years.minusWeeks(3);

            // Output results
            System.out.println("Initial date: " + date);
            System.out.println("After adding 7 days: " + datePlus7Days);
            System.out.println("After adding 1 month: " + datePlus1Month);
            System.out.println("After adding 2 years: " + datePlus2Years);
            System.out.println("After subtracting 3 weeks: " + dateMinus3Weeks);
            System.out.println("The final date is: " + dateMinus3Weeks);

        }
        // Handle invalid input
        catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please enter the date in yyyy-MM-dd format.");
        }
    }
}
