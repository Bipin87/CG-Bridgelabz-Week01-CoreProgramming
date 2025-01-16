import java.util.*;

public class BMICalculator {

    public static double[][] calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0]; // Weight in kg
            double height = data[i][1] / 100; // Height in meters (convert from cm)
            data[i][2] = weight / (height * height); 
        }
        return data;
    }

    public static String[] determineBMIStatus(double[][] data) {
        String[] statuses = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 29.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        return statuses;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] personData = new double[10][3]; // 10 rows, 3 columns: weight, height, BMI

        // Get input from the user
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) for person " + (i + 1) + ":");
            personData[i][0] = input.nextDouble();

            System.out.println("Enter height (cm) for person " + (i + 1) + ":");
            personData[i][1] = input.nextDouble();
        }

        // Calculate BMI for each person
        personData = calculateBMI(personData);

        // Determine BMI status for each person
        String[] statuses = determineBMIStatus(personData);

        // Display the results
        System.out.println();
        System.out.println("Person\tWeight (kg)\tHeight (cm)\tBMI\t\tStatus");
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\t\t%s\n", 
                    i + 1, personData[i][0], personData[i][1], personData[i][2], statuses[i]);
        }

        System.out.println();

    }
}