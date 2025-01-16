import java.util.Scanner;
class IntOperation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: variables a, b, and c
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();
        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();
        System.out.print("Enter the value of c: ");
        int c = scanner.nextInt();
        // Perform the operations considering operator precedence
        int result1 = a + b * c;       // Multiplication (*) has higher precedence than addition (+)
        int result2 = a * b + c;       // Multiplication (*) before addition (+)
        int result3 = c + a / b;       // Division (/) before addition (+)
        int result4 = a % b + c;       // Modulus (%) before addition (+)
        // Output the results
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + " and " + result4);
        scanner.close();
    }
}
