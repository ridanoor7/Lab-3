
import java.util.ArrayList;
import java.util.HashSet;

public class Main2 {
    public static void main(String[] args) {
        String text="A computer is an electronic device that plays an important role in modern times. Charles Babbage first invented it. The device takes in data as input, processes it, and gives output.";
        ArrayList<String> sentences = new ArrayList<>();
        String[] text1 = text.split(" ");

        System.out.println(text1[0]);
        for(String S:text1)
        {
            System.out.println(S);

        }
        System.out.println("Total words: " + getTotalWords(text1));
        System.out.println("Unique words: " + getUniqueWords(text1));
        System.out.println("Total sentences: " + getTotalSentences(text));
        System.out.println("Total characters: " + getTotalCharacters(text));
        System.out.println("Size of ArrayList sentences: " + getArrayListSize(sentences));
    }

public static int getTotalWords(String[] words) {
    return words.length;
}
public static int getTotalSentences(String text) {
    String[] sentences = text.split("[.!?]");
    return sentences.length;
}
    public static int getTotalCharacters(String text) {
        return text.length();
    }
    public static int getArrayListSize(ArrayList<String> sentences) {
        return sentences.size();
    }
    public static int getUniqueWords(String[] words) {
        HashSet<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word.toLowerCase()); // Consider words with different cases as the same word
        }
        return uniqueWords.size();
    }
}