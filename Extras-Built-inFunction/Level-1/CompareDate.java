import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get the first date from the user
        try {
            // Input for the first date
            System.out.println("Enter the first date (yyyy-MM-dd):");
            String input1 = scanner.nextLine();
            LocalDate date1 = LocalDate.parse(input1);

            // Input for the second date
            System.out.println("Enter the second date (yyyy-MM-dd):");
            String input2 = scanner.nextLine();
            LocalDate date2 = LocalDate.parse(input2);

            // Compare the two dates
            if (date1.isBefore(date2)) {
                System.out.println("The first date is before the second date.");
            } else if (date1.isAfter(date2)) {
                System.out.println("The first date is after the second date.");
            } else if (date1.isEqual(date2)) {
                System.out.println("The first date is the same as the second date.");
            }
        }
        // Handle invalid date inputs
        catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please enter dates in yyyy-MM-dd format.");
        }
    }
}
