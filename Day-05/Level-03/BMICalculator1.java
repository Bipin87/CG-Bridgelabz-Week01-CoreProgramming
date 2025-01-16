import java.util.Scanner;
public class BMICalculator1 {
    // Method to take user input for height and weight
    private static double[][] getHeightWeightInput(int n) {
        Scanner scanner = new Scanner(System.in);
        double[][] heightWeight = new double[n][2];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter weight (in kg) for person %d: ", i + 1);
            heightWeight[i][0] = scanner.nextDouble();

            System.out.printf("Enter height (in cm) for person %d: ", i + 1);
            heightWeight[i][1] = scanner.nextDouble();
        }

        return heightWeight;
    }

    // Method to calculate BMI and status
    private static String[][] calculateBMIAndStatus(double[][] heightWeight) {
        String[][] bmiResults = new String[heightWeight.length][4];

        for (int i = 0; i < heightWeight.length; i++) {
            double weight = heightWeight[i][0];
            double heightInMeters = heightWeight[i][1] / 100.0;
            double bmi = Math.round((weight / (heightInMeters * heightInMeters)) * 100.0) / 100.0;

            bmiResults[i][0] = String.valueOf(heightWeight[i][1]); // Height in cm
            bmiResults[i][1] = String.valueOf(weight); // Weight in kg
            bmiResults[i][2] = String.valueOf(bmi); // BMI
            bmiResults[i][3] = getBMIStatus(bmi); // Status
        }

        return bmiResults;
    }

    // Method to determine BMI status
    private static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    // Method to display the results in tabular format
    private static void displayResults(String[][] bmiResults) {
        System.out.println("Person\tHeight (cm)\tWeight (kg)\tBMI\tStatus");
        for (int i = 0; i < bmiResults.length; i++) {
            System.out.printf("%d\t%s\t\t%s\t\t%s\t%s\n",i + 1, bmiResults[i][0], bmiResults[i][1], bmiResults[i][2], bmiResults[i][3]);
        }
    }
     public static void main(String[] args) {
        int persons = 10;

        // Input height and weight for 10 persons
        double[][] heightWeightArray = getHeightWeightInput(persons);

        // Calculate BMI and status
        String[][] bmiResults = calculateBMIAndStatus(heightWeightArray);

        // Display results
        displayResults(bmiResults);
    }
}
