public class RemoveSpecificCharacter{
    // Method to remove a specific character from a string
    public static String removeChar(String str, char c) {
        
        return str.replace(String.valueOf(c), "");
    }
    public static void main(String[] args) {
        String str = "Hello World";
        char c = 'l';
        // Display the result
        System.out.println(removeChar(str, c));

    }
}