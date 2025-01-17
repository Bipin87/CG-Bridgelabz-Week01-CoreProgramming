import java.util.Random;

public class ZaraCompanyBonus {

    // Method to generate random employee details (salary and years of service)
    public static int[][] getEmployeeDetails(int numEmployees) {
        int[][] employeeDetails = new int[numEmployees][2]; // 2D array: [0] - salary, [1] - years of service
        Random rand = new Random();

        for (int i = 0; i < numEmployees; i++) {
            employeeDetails[i][0] = rand.nextInt(90000) + 10000; // 5-digit salary
            employeeDetails[i][1] = rand.nextInt(10) + 1; // Years of service (1-10 years)
        }

        return employeeDetails;
    }

    public static int[][] calculateBonus(int[][] employeeDetails) {
        int[][] updatedDetails = new int[employeeDetails.length][3]; // [0] - old salary, [1] - bonus, [2] - new salary

        for (int i = 0; i < employeeDetails.length; i++) {
            updatedDetails[i][0] = employeeDetails[i][0]; // Old salary
            if (employeeDetails[i][1] > 5) {
                updatedDetails[i][1] = (int) (employeeDetails[i][0] * 0.05); // 5% bonus
            } else {
                updatedDetails[i][1] = (int) (employeeDetails[i][0] * 0.02); // 2% bonus
            }
            updatedDetails[i][2] = updatedDetails[i][0] + updatedDetails[i][1]; // New salary
        }

        return updatedDetails;
    }

    public static void displayResults(int[][] updatedDetails) {
        int totalOldSalary = 0;
        int totalNewSalary = 0;
        int totalBonus = 0;

        System.out.println();
        System.out.println("Employee\tOld Salary\tBonus\tNew Salary");
        System.out.println();

        for (int[] employee : updatedDetails) {
            totalOldSalary += employee[0];
            totalNewSalary += employee[2];
            totalBonus += employee[1];

            System.out.printf("%d\t%d\t%d\t%d\n", 
                    (updatedDetails.length - employee.length) + 1, // Employee number
                    employee[0], employee[1], employee[2]);
        }

        System.out.println();
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        System.out.println("Total Bonus Amount: " + totalBonus);
        System.out.println();
    }

    public static void main(String[] args) {
        int numEmployees = 10;
        int[][] employeeDetails = getEmployeeDetails(numEmployees);
        int[][] updatedDetails = calculateBonus(employeeDetails);
        displayResults(updatedDetails);
    }
}