import java.util.Scanner;

class FindMultipleNumber {
    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);

        // input from the user
        System.out.print("Enter The an number: ");
        int number = variable.nextInt();

        System.out.println("Multiples of " + number + " below 100 are:");

        // For loop start as backeward 
        for (int i = 100; i >= 1; i--) {
            // Check if the number perfectly divisible by  i
            if (i % number == 0) {
                System.out.println(i);
            }
        }

        variable.close();
    }
}
