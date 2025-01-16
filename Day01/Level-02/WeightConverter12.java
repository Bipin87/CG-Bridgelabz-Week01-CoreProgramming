import java.util.Scanner;
class WeightConverter12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: Weight in pounds
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = scanner.nextDouble();
        // Conversion: Pounds to Kilograms
        double weightInKilograms = weightInPounds / 2.2;
        // Output the results
        System.out.println("The weight of the person in pounds is " + weightInPounds + " and in kilograms is " + weightInKilograms);
        scanner.close();
    }
}
