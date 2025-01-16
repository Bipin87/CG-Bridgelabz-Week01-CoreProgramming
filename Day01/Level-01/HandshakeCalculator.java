import java.util.Scanner;
class HandshakeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: number of students
        System.out.print("Enter the number of students:- ");
        int numberOfStudents = scanner.nextInt();
        // Calculate the maximum number of handshakes
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        // Output the result
        System.out.println("The maximum number of possible handshakes among " + numberOfStudents + " students is " + maxHandshakes);
        scanner.close();
    }
}
