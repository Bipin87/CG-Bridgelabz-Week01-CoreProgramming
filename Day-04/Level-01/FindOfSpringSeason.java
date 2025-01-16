import java.util.*;
class FindOfSpringSeason{
	// Method throw find the Spring season or not
    static void springSeason(int month , int day){
        // Check if the date falls within the Spring season
         boolean isSpringSeason = false;

         if ((month == 3 && day >= 20 && day <= 31) ||
            (month == 4 && day >= 1 && day <= 30) ||
            (month == 5 && day >= 1 && day <= 31) ||
            (month == 6 && day >= 1 && day <= 20)) {
            isSpringSeason = true;
        }

        // Print the result
        if (isSpringSeason) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
  }
    
  public static void main(String[] args){
    if (args.length != 2) {
            System.out.println("Not a spring season");
            return;
        }

        // Parse month and day from command-line arguments for inputs
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        springSeason(month, day);
        
    }
}