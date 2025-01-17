import java.util.Scanner;

clas BonusOfEmployees {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define arrays for storing employees data
        double[] salary = new double[10];
        int[] yearsOfService = new int[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        // Variables to store total bonus, old salary, and new salary
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Loop to take input from the user
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            salary[i] = input.nextDouble();

            // Validate salary input
            while (salary[i] <= 0) {
                System.out.print("Invalid salary. Please enter a positive number: ");
                salary[i] = input.nextDouble();
            }

            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            yearsOfService[i] = input.nextInt();

            // Validate years of service input
            while (yearsOfService[i] < 0) {
                System.out.print("Invalid years of service. Please enter a non-negative number: ");
                yearsOfService[i] = input.nextInt();
            }
        }

        // Loop to calculate bonus and new salary
        for (int i = 0; i < 10; i++) {
            // Calculate bonus based on years of service
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            // Calculate new salary
            newSalary[i] = salary[i] + bonus[i];

            // Update total bonus and salary values
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display total bonus, old salary, and new salary
        System.out.println("Total Bonus Paid: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        input.close();
    }
}
