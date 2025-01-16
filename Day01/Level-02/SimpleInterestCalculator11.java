import java.util.Scanner;
class SimpleInterestCalculator11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: Principal, Rate, and Time
        System.out.print("Enter the Principal amount (INR): ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the Rate of Interest (%): ");
        double rate = scanner.nextDouble();
        System.out.print("Enter the Time (in years): ");
        double time = scanner.nextDouble();
        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;
        // Output the result
        System.out.println("The Simple Interest is INR " + simpleInterest + " for Principal INR " + principal + ", Rate of Interest " + rate + " and Time " + time + " years.");
        scanner.close();
    }
}
