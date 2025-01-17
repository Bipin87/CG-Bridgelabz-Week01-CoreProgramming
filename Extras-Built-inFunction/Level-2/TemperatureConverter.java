import java.util.Scanner;

public class TemperatureConverter {

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Choose an option: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                // Convert Fahrenheit to Celsius
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                double celsius = fahrenheitToCelsius(fahrenheit);
                System.out.println(fahrenheit + "°F is equal to " + celsius + "°C");
                break;

            case 2:
                // Convert Celsius to Fahrenheit
                System.out.print("Enter temperature in Celsius: ");
                celsius = scanner.nextDouble();
                fahrenheit = celsiusToFahrenheit(celsius);
                System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
                break;

            default:
                System.out.println("Invalid option. Please choose 1 or 2.");
        }

        scanner.close(); 
    }
}
