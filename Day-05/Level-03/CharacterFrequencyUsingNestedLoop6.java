public class CharacterFrequencyUsingNestedLoop6 {

    public static String[] findCharacterFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] frequency = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            frequency[i] = 1; 
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    frequency[i]++;
                    chars[j] = '0'; // Mark duplicate characters
                }
            }
        }

        String[] result = new String[chars.length];
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0' && chars[i] != ' ') { // Exclude spaces and duplicates
                result[index] = chars[i] + " : " + frequency[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String sentence = "This is a sample string to find character frequencies.";
        String[] result = findCharacterFrequency(sentence);

        System.out.println("Character Frequencies:");
        for (String entry : result) {
            if (entry != null) { 
                System.out.println(entry);
            }
        }
    }
}