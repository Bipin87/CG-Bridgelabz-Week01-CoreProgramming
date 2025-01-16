// importing the Scanner class 
import java.util.Scanner;

class FindYoungestAndTallest {
    public static void main(String[] args) {
        // Declaring a variable to store the user's input
        int amarAges, akbarAge, anthonyAge, amarHeights, anthonyHeight, akbarHeight;

        // Declaring Scanner class instance
        Scanner input = new Scanner(System.in);

        System.out.print("Enter  the amar age: ");
        amarAges = input.nextInt();
		
        System.out.print("Enter  the amar height: ");
        amarHeights = input.nextInt();
		
        System.out.print("Enter the akbar age: ");
        akbarAge = input.nextInt();
		
        System.out.print("Enter the akbar height: ");
        akbarHeight = input.nextInt();
		
        System.out.print("Enter the anthony age: ");
        anthonyAge = input.nextInt();
		
        System.out.print("Enter the anthony height: ");
        anthonyHeight = input.nextInt();
		
		//Computing the youngest person and display its name

        if((amarAges < akbarAge) && (amarAges < anthonyAge)) System.out.println("Amar is youngest person");
        else if((akbarAge < amarAges) && (akbarAge < anthonyAge)) System.out.println("Akbar is youngest person");
        else if((anthonyAge < amarAges) && (anthonyAge < akbarAge)) System.out.println("Anthony is youngest person");
		
		//Computing the tallest person and display its name

        if((amarHeights > akbarHeight) && (amarHeights > anthonyHeight)) System.out.println("Amar is tallest person");
        else if((akbarHeight > amarHeights) && (akbarHeight > anthonyHeight)) System.out.println("Akbar is tallest person");
        else if((anthonyHeight > amarHeights) && (anthonyHeight > akbarHeight)) System.out.println("Anthony is tallest person");

        input.close();
    }
}
