import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    private String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        Set<String> set = new HashSet<>();
        String[] array;

        array = text.split("\\P{IsAlphabetic}+");
        for (String wordA : array
        ) {
            set.add(wordA);
        }
        return set.contains(word);
    }
}
