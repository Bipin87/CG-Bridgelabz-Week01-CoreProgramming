import java.util.Scanner;
class TotalIncome6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: salary and bonus
        System.out.print("Enter the salary (INR): ");
        double salary = scanner.nextDouble();
        System.out.print("Enter the bonus (INR): ");
        double bonus = scanner.nextDouble();
        // Calculate total income
        double totalIncome = salary + bonus;
        // Output the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + " Hence Total Income is INR " + totalIncome);
        scanner.close();
    }
}
