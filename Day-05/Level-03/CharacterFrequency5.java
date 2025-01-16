public class CharacterFrequency5{

    public static char[] findUniqueCharacters(String text) {
        boolean[] isUnique = new boolean[256]; // Assuming ASCII characters
        char[] uniqueChars = new char[text.length()];
        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (!isUnique[currentChar]) {
                isUnique[currentChar] = true;
                uniqueChars[uniqueCount++] = currentChar;
            }
        }

        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }

    public static String[][] findCharacterFrequency(String text) {
        int[] charFrequency = new int[256]; // Assuming ASCII characters

        for (int i = 0; i < text.length(); i++) {
            charFrequency[text.charAt(i)]++;
        }

        char[] uniqueChars = findUniqueCharacters(text);
        String[][] results = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            results[i][0] = String.valueOf(uniqueChars[i]);
            results[i][1] = String.valueOf(charFrequency[uniqueChars[i]]);
        }

        return results;
    }

    public static void main(String[] args) {
        String sentence = "This is a sample string to find character frequencies.";
        String[][] results = findCharacterFrequency(sentence);

        System.out.println("Character Frequencies:");
        for (String[] entry : results) {
            System.out.println(entry[0] + " : " + entry[1]);
        }
    }
}