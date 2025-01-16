import java.util.Scanner;

class CalculateBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get number of people
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = input.nextInt();

        // Create arrays to store height, weight, BMI, and weight status
        double[] heights = new double[numberOfPersons];
        double[] weights = new double[numberOfPersons];
        double[] bmi = new double[numberOfPersons];
        String[] weightStatus = new String[numberOfPersons];

        // Get input for weight and height of each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Enter details for person " + (i + 1));

            // Input height and weight
            System.out.print("Height (in meters): ");
            heights[i] = input.nextDouble();

            System.out.print("Weight (in kilograms): ");
            weights[i] = input.nextDouble();

            // Calculate BMI
            bmi[i] = weights[i] / (heights[i] * heights[i]);

            // Determine weight status based on BMI
            if (bmi[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] < 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi[i] >= 25 && bmi[i] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        // Display the results
        System.out.println("\nBMI Report:");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Person", "Height", "Weight", "BMI", "Status");
        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-10s\n", (i + 1), heights[i], weights[i], bmi[i], weightStatus[i]);
        }

        input.close();
    }
}
