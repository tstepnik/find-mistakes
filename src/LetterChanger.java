import java.util.Scanner;

class LetterChanger {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfWords = getNumberOfWords();
        String[] words = readWords(numberOfWords);
        String change = readChangeString();
        if (change == "upper") {
            changeWordsToUpperCase(words);
        } else if(change == "lower") {
            changeWordsToLowerCase(words);
        } else {
            System.out.println("Nieprawidłowy tekst, zostawiam oryginalny tekst");
        }

        printArray(words);
    }

    private static String readChangeString() {
        System.out.println("Chcesz zamienić na małe (lower), czy wielkie litery (upper)?");
        return scanner.nextLine();
    }

    private static void printArray(String[] array) {
        for (String word : array) {
            System.out.println(word);
        }
    }

    private static void changeWordsToLowerCase(String[] words) {
        for (String word : words) {
            word.toLowerCase();
        }
    }

    private static void changeWordsToUpperCase(String[] words) {
        for (String word : words) {
            word.toUpperCase();
        }
    }

    private static String[] readWords(int size) {
        String[] result = new String[size];
        for (int i = 0; i < result.length; i++) {
            System.out.println("Podaj wyraz numer " + (i+1));
            result[i] = scanner.nextLine();
        }
        return result;
    }

    private static int getNumberOfWords() {
        System.out.println("Ile wyrazów chcesz wczytać?");
        return scanner.nextInt();
    }
}