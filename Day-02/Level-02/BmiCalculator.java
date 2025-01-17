import java.util.Scanner;
class BmiCalculator {
    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        
        // taking input from the user to enter weight in kilograms
        System.out.print("Enter your weight in kg: ");
        double weight = variable.nextDouble();
        
        // taking input from the user to enter height in centimeters
        System.out.print("Enter your height in cm: ");
        double heightInCentimeter = variable.nextDouble();
        
        // Convert height from centimeters to meters
        double heightInMeters = heightInCentimeter / 100;
        
        // Calculate BMI using the formula
        double bmi = weight / (heightInMeters * heightInMeters);
        
        // Determine the weight status for person
        String weightStatus;
        if (bmi < 18.4) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Normal");
        } else if (bmi >= 25.0 && bmi < 39.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obes");
        }
        
        variable.close();
	}
}