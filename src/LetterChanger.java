import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class LetterChanger {
    private static Scanner scanner = new Scanner(System.in);
    private OperationsOnWords operations = new OperationsOnWords();

    private final String COMMAND_TO_UPPER_CASE = "upper";
    private final String COMMAND_TO_LOWER_CASE = "lower";

    private List<String> words = new ArrayList<>();

    public void addAndPrintWords() {
        addWords(getNumberOfWords());
        String change = chooseOption();
        switch (change) {
            case COMMAND_TO_LOWER_CASE:
                operations.changeWordsToLowerCase(words);
                operations.printWords(words);
                break;
            case COMMAND_TO_UPPER_CASE:
                operations.changeWordsToUpperCase(words);
                operations.printWords(words);
                break;
            default:
                System.out.println("Podałeś nieprawidłową komendę");
                System.out.println("Małe wyrazy - " + COMMAND_TO_LOWER_CASE);
                System.out.println("Duże wyrazy - " + COMMAND_TO_UPPER_CASE);
        }
    }

    private String chooseOption() {
        System.out.println("Chcesz zamienić na małe (lower), czy wielkie litery (upper)?");
        return scanner.nextLine();
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
}