import java.util.Scanner;
class CalculatorUsingSwitchCase {
    public static void main(String[] args) {
        // Create scanner for input
        Scanner input = new Scanner(System.in);
        // Takes input for first number, operator, and second number
        System.out.print("Enter the first number: ");
        double first = inputFuction.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        String operator = input.next();

        System.out.print("Enter the second number: ");
        double second = input.nextDouble();

        // Create an variable for result
        double result;

        // Switch case to perform operators based on the operators
        switch (operator) {
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;
            case "/":
                // Check for division of zero
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division of zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator! Please enter one of the following operators: +, -, *, /");
                break;
        }

        input.close();
    }
}
