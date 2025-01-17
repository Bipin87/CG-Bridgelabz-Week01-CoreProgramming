
public class ReplaceWordInSentence {
    // Replace method to replace a word with another word in a sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replace(oldWord, newWord);
    }

    public static void main(String[] args) {
        String sentence = "I love to eat apples and bananas.";
        String oldWord = "apples";
        String newWord = "oranges";
        // Display result 
        System.out.println(replaceWord(sentence, "apples", "oranges"));
    }
}
