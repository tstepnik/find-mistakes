import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class LetterChanger {
    private static Scanner scanner = new Scanner(System.in);

    private final String UPPER_CASE = "upper";
    private final String LOWER_CASE = "lower";

    private List<String> words = new ArrayList<>();

    public void addAndPrintWords() {
        addWords(getNumberOfWords());
        chooseOption();
    }

    private void chooseOption() {
        System.out.println("Chcesz zamienić na małe (lower), czy wielkie litery (upper)?");
        switch (scanner.nextLine()) {
            case LOWER_CASE:
                changeWordsToLowerCase(words);
                printWords(words);
                break;
            case UPPER_CASE:
                changeWordsToUpperCase(words);
                printWords(words);
                break;
            default:
                System.out.println("Podałeś nieprawidłową komendę");
                System.out.println("Małe wyrazy - " + LOWER_CASE);
                System.out.println("Duże wyrazy - " + UPPER_CASE);
        }
    }

    private void addWords(int size) {
        for (int i = 0; i < size; i++) {
            System.out.println("Podaj wyraz nr " + (i + 1));
            words.add(scanner.nextLine());
        }
    }

    private static int getNumberOfWords() {
        System.out.println("Ile wyrazów chcesz wczytać?");
        int wordsNumber = scanner.nextInt();
        scanner.nextLine();
        return wordsNumber;
    }

    private void printWords(List<String> words) {
        words.forEach(System.out::println);
    }

    private void changeWordsToLowerCase(List<String> words) {
        words.replaceAll(String::toLowerCase);
    }

    private void changeWordsToUpperCase(List<String> words) {
        words.replaceAll(String::toUpperCase);
    }
}