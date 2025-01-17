import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormate {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Define date formats using DateTimeFormatter
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Format the current date in the specified patterns
        String dateInFormat1 = currentDate.format(format1);
        String dateInFormat2 = currentDate.format(format2);
        String dateInFormat3 = currentDate.format(format3);

        // Display the results
        System.out.println("Current date in format dd/MM/yyyy: " + dateInFormat1);

        System.out.println("Current date in format yyyy-MM-dd: " + dateInFormat2);
        
        System.out.println("Current date in format EEE, MMM dd, yyyy: " + dateInFormat3);
    }
}
