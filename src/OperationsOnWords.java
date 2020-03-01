import java.util.ArrayList;
import java.util.List;

public class OperationsOnWords {

    public void printWords(List<String> words) {
        words.forEach(System.out::println);
    }

    public void changeWordsToLowerCase(List<String> words) {
        words.replaceAll(String::toLowerCase);
    }

    public void changeWordsToUpperCase(List<String> words) {
        words.replaceAll(String::toUpperCase);
    }

}
