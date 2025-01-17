import java.util.Scanner;
import java.util.Random;
public class VotingEligibility8 {

    // Method to generate random ages for n students
    public static int[] generateAges(int numberOfStudents) {
        int[] ages = new int[numberOfStudents];
        Random randomValue = new Random();
        for (int i = 0; i < numberOfStudents; i++) {
            ages[i] = randomValue.nextInt(89) + 10; // Generates random age between 10 and 99
        }
        return ages;
    }
    // Method to check voting eligibility and return a 2D array with age and voting status
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] >= 18) {
                result[i][1] = "True"; // Can vote
            } else {
                result[i][1] = "False"; // Cannot vote
            }
        }

        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayResults(String[][] data) {
        System.out.println("Age\tCan Vote");
        System.out.println("----\t--------");
        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
    public static void main(String[] args) {
	
		//creating an instance of scanner class
        Scanner input = new Scanner(System.in);

        // Get the number of students from the user
        System.out.println("Enter the number of students:");
        int numberOfStudents = input.nextInt();

        // Generate random ages for students
        int[] ages = generateAges(numberOfStudents);

        // Check voting eligibility
        String[][] votingResults = checkVotingEligibility(ages);

        // Call of method throw display the result
        displayResults(votingResults);
		
	//closing scanner 
	input.close();
    }
}
