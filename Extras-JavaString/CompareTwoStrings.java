public class CompareTwoStrings {
    public static void main(String[] args) {

        String str1 = "apple";
        String str2 = "banana";
        // Call the compareStrings method
        System.out.println(compareString(str1, str2));

    }
    public static boolean compareString(String string1, String string2) {
        int lengthString1 = string1.length();
        int lengthString2 = string2.length();
        int i = 0;
        while (i < lengthString1 && i < lengthString2) {
            char char1 = string1.charAt(i);
            char char2 = string2.charAt(i);
            if (char1 < char2) {
                return true;
            } else if (char1 > char2) {
                return false;
            }
            i++;
        }
        return lengthString1 < lengthString2;

    }
    
}