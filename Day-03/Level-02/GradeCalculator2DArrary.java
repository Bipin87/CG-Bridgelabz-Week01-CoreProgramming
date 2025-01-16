import java.util.Scanner;
class GradeCalculator2DArrary {

    public static void main(String[] args) {

        // Create a Scanner object for user input

        Scanner input = new Scanner(System.in);



        // Take input for the number of students

        System.out.print("Enter the number of students: ");

        int numStudents = input.nextInt();



        // Create a 2D array to store marks for Physics, Chemistry, and Maths

        // marks[i][0] -> Physics, marks[i][1] -> Chemistry, marks[i][2] -> Maths

        int[][] marks = new int[numStudents][3];

        double[] percentages = new double[numStudents];

        String[] grades = new String[numStudents];



        // Input marks for each student and calculate percentage and grade

        for (int i = 0; i < numStudents; i++) {

            System.out.println("\nEnter details for student " + (i + 1));



            // Take input for marks in Physics, Chemistry, and Maths

            for (int j = 0; j < 3; j++) {

                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";

                int mark;

                do {

                    System.out.print("Enter marks for " + subject + " (positive value): ");

                    mark = input.nextInt();

                    if (mark < 0) {

                        System.out.println("Please enter a positive value for marks.");

                    }

                } while (mark < 0);

                marks[i][j] = mark;

            }



            // Calculate the total marks and percentage for the student

            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];

            percentages[i] = (totalMarks / 300.0) * 100;



            // Determine the grade based on the percentage

            if (percentages[i] >= 90) {

                grades[i] = "Grade A";

            } else if (percentages[i] >= 70) {

                grades[i] = "Grade B";

            } else if (percentages[i] >= 50) {

                grades[i] = "Grade C";

            } else if (percentages[i] >= 35) {

                grades[i] = "Grade D";

            } else {

                grades[i] = "Grade F";

            }

        }



        // Display the marks, percentages, and grades for each student

        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Student", "Physics", "Chemistry", "Maths", "Grade");



        for (int i = 0; i < numStudents; i++) {

            System.out.printf("%-10d %-10d %-10d %-10d %-10s\n", (i + 1), marks[i][0], marks[i][1], marks[i][2], grades[i]);

        }

        // Close the scanner

        input.close();

	}

}
