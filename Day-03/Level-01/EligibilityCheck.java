import java.util.Scanner;

class EligibilityCheck {
    public static void main(String[] args) {
        // Define an array for storing the age of 10 students
        int[] studentAges = new int[10];
        Scanner scanner = new Scanner(System.in);

        // Take user input for the age of 10 students
        System.out.println("Enter the age of 10 students:");
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Student " + (i + 1) + " age: ");
            studentAges[i] = scanner.nextInt();
        }

        // Check the voting eligibility of each student
        for (int i = 0; i < studentAges.length; i++) {
            if (studentAges[i] < 0) {
                System.out.println("Invalid age for Student " + (i + 1) + ": " + studentAges[i]);
            } else if (studentAges[i] >= 18) {
                System.out.println("The student with the age " + studentAges[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + studentAges[i] + " cannot vote.");
            }
        }

        scanner.close();
    }
}