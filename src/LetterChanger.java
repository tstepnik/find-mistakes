import java.util.List;
import java.util.Scanner;

class LetterChanger {
    private static Scanner scanner = new Scanner(System.in);
    OperationsOnWords onWords = new OperationsOnWords();

    private final String commendToUpperCase = "upper";
    private final String commendTolowerCase = "lower";

    public void addAndPrintWords() {
        addWords(getNumberOfWords());
        String change = "";
        while (!change.equals(commendTolowerCase) && !change.equals(commendToUpperCase)) {
            change = readChangeString();
            if (!change.equals(commendTolowerCase) && !change.equals(commendToUpperCase)) {
                System.out.println("Podałeś nieprawidłową komendę");
                System.out.println("Małe wyrazy - " + commendTolowerCase);
                System.out.println("Duże wyrazy - " + commendToUpperCase);
            }
        }
        changeWordsCase(change);
        onWords.printWords();
    }

    private String readChangeString() {
        System.out.println("Chcesz zamienić na małe (lower), czy wielkie litery (upper)?");
        return scanner.nextLine();
    }

    private void addWords(int size) {
        for (int i = 0; i < size; i++) {
            System.out.println("Podaj wyraz nr " + (i + 1));
            onWords.addString(scanner.nextLine());
        }
    }

    private static int getNumberOfWords() {
        System.out.println("Ile wyrazów chcesz wczytać?");
        int wordsNumber = scanner.nextInt();
        scanner.nextLine();
        return wordsNumber;
    }

    private void changeWordsCase(String change) {
        if (change.equals(commendTolowerCase)) {
            onWords.changeWordsToLowerCase();
        } else if (change.equals(commendToUpperCase)) {
            onWords.changeWordsToUpperCase();
        }
    }
}