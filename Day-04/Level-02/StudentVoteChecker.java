import java.util.Scanner;

public class StudentVoteChecker {

    /**
     * Checks if a student is eligible to vote based on their age.
     *
     * return true if the student is eligible to vote (age >= 18), false otherwise.
     */
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Invalid age
        }
        return age >= 18; 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] studentAges = new int[10]; // Array to store ages of 10 students

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            studentAges[i] = input.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (canStudentVote(studentAges[i])) {
                System.out.println("Student " + (i + 1) + " is eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " is not eligible to vote.");
            }
        }

        input.close();
    }
}