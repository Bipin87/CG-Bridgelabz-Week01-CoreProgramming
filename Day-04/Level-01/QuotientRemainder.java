import java.util.*;

public class QuotientRemainder {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        // Check for division by zero
        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return null;
        }

        int quotient = number / divisor; // Calculate quotient
        int remainder = number % divisor; // Calculate remainder

        int[] result = {quotient, remainder};
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        int[] result = findRemainderAndQuotient(dividend, divisor);

        if (result != null) {
            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        }

    }
}