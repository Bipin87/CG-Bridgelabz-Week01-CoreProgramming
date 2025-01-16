import java.util.Scanner;
class TemperatureConversion5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        // Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;
        // Output the result
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsius + " Celsius.");
        scanner.close();
    }
}
