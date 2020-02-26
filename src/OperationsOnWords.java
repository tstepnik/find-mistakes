import java.util.ArrayList;
import java.util.List;

public class OperationsOnWords {

    private List<String> words = new ArrayList<>();

    public List<String> getWords() {
        return words;
    }

    public void setWords(List<String> words) {
        this.words = words;
    }

    public void printWords() {
        words.forEach(System.out::println);
    }

    public void changeWordsToLowerCase() {
        words.replaceAll(String::toLowerCase);
    }

    public void changeWordsToUpperCase() {
        words.replaceAll(String::toUpperCase);
    }

    public void addString(String word) {
        words.add(word);
    }
}
