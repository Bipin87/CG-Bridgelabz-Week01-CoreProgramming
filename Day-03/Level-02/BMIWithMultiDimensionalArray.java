import java.util.Scanner;

class BMIWithMultiDimensionalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = input.nextInt();

        // Create a multidimensional array to store weight, height, and BMI
        double[][] personData = new double[numberOfPersons][3]; // [height, weight, BMI]
        String[] weightStatus = new String[numberOfPersons];

        // Get input for weight and height of each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Enter details for person " + (i + 1));

            // Input height and weight with validation for positive values
            double height, weight;
            do {
                System.out.print("Height (in meters): ");
                height = input.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be a positive value. Please enter again.");
                }
            } while (height <= 0);

            do {
                System.out.print("Weight (in kilograms): ");
                weight = input.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be a positive value. Please enter again.");
                }
            } while (weight <= 0);

            // Store the height and weight in the array
            personData[i][0] = height; // Store height
            personData[i][1] = weight; // Store weight

            // Calculate BMI: BMI = weight / height^2
            double bmi = weight / (height * height);
            personData[i][2] = bmi; // Store BMI

            // Determine weight status based on BMI
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        // Display the results in tabular form
        System.out.println("\nBMI Report:");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Person", "Height", "Weight", "BMI", "Status");
        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-10s\n", (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        input.close();
    }
}



