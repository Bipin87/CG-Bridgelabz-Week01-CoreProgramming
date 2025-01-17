import java.util.Scanner;
class StudentMarksCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        
        // Initialize arrays to store marks, percentages, and grades
        int[] physicsMarks = new int[numStudents];
        int[] chemistryMarks = new int[numStudents];
        int[] mathsMarks = new int[numStudents];
        double[] percentages = new double[numStudents];
        char[] grade = new char[numStudents];
		int totalMarks[] = new int[numStudents];
		for(int i = 0 ; i < numStudents; i++){
			
			//taking physics marks as input
			System.out.print("Enter physics marks of student "+(i+1)+": ");
			physicsMarks[i] = input.nextInt();
			
			//check if marks entered are positive or not
			while(physicsMarks[i] <= 0){
				System.out.print("Invalid marks please Enter Positive marks");
				physicsMarks[i] = input.nextInt();
			}
			
			//taking chemistry marks as input
			System.out.print("Enter chemistry marks of student "+(i+1)+": ");
			chemistryMarks[i] = input.nextInt();
			
			//check if marks entered are positive or not
			while(chemistryMarks[i] <= 0){
				System.out.print("Invalid marks please Enter Positive marks");
				chemistryMarks[i] = input.nextInt();
			}
			
			//taking maths marks as input
			System.out.print("Enter maths marks of student "+(i+1)+": ");
			mathsMarks[i] = input.nextInt();
			
			//check if marks entered are positive or not
			while(mathsMarks[i] <= 0){
				System.out.print("Invalid marks please Enter Positive marks");
				mathsMarks[i] = input.nextInt();
			}
			totalMarks[i] = physicsMarks[i]+chemistryMarks[i]+mathsMarks[i];
			percentages[i] = totalMarks[i]/3;
			
			// Determine the grade based on percentage
			if (percentages[i] >= 80) {
				grade[i] = 'A';
			} else if (percentages[i] >= 70) {
				grade[i] = 'B';
			} else if (percentages[i] >= 60) {
				grade[i] = 'C';
			} else if (percentages[i] >= 50) {
				grade[i] = 'D';
			} else if (percentages[i] >= 40) {
				grade[i] = 'E';
			} else {	
				grade[i] = 'R';
			}
		}
		for(int i = 0; i < numStudents; i++){
			System.out.println("Marks of student "+(i+1)+ " is:" +totalMarks[i]);
			System.out.println("Percentage of student "+(i+1)+ " is:" +percentages[i]);
			System.out.println("Grade of student "+(i+1)+ " is:" +grade[i]);
		}

		//closing scanner
        input.close();
    }
}
