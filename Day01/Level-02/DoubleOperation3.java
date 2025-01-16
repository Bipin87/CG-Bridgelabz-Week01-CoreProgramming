import java.util.Scanner;
class DoubleOperation3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: variables a, b, and c of type double
        System.out.print("Enter the value of a (double): ");
        double a = scanner.nextDouble();
        System.out.print("Enter the value of b (double): ");
        double b = scanner.nextDouble();
        System.out.print("Enter the value of c (double): ");
        double c = scanner.nextDouble();
        // Perform the operations considering operator precedence
        double result1 = a + b * c;       // Multiplication (*) has higher precedence than addition (+)
        double result2 = a * b + c;       // Multiplication (*) before addition (+)
        double result3 = c + a / b;       // Division (/) before addition (+)
        double result4 = a % b + c;       // Modulus (%) before addition (+)
        // Output the results
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + " and " + result4);

        scanner.close();
    }
}
