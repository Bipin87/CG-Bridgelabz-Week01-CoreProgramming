// importing the Scanner class
import java.util.Scanner;
class DayOfWeek {
    public static void main(String[] args) {
        // Taking user inputs for month, day, and year
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the an  month (1 for January, 2 for February, ..., 12 for December): ");
        int m = input.nextInt();

        System.out.print("Enter the an  day: ");
        int d = input.nextInt();

        System.out.print("Enter the an  year: ");
        int y = input.nextInt();

        // Calculate the day of the week using the provided formulas
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

        // Display the result
        System.out.println("The day of the week is: " + d0);

        input.close();
	}
}