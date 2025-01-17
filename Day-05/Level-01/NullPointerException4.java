public class NullPointerException4 {
     
    // generateException Method to generate NullPointerException
    public static void GenerateException() {
        String text = null; // Variable initialized to null
		
        // This will throw a NullPointerException
        int length = text.length();
    }

    // Method to handle NullPointerException
    public static void ExceptionHandling() {
        String text = null; // Variable initialized to null
        try {   
            // This may throw a NullPointerException
            int length = text.length();
            // This line will not be executed
			
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        
		//Invoke generateException() method...
        try {
            GenerateException(); // Call method that generates NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught in main: NullPointerException occurred!");
        }
        ExceptionHandling(); // Call method that handles NullPointerException
	}
}