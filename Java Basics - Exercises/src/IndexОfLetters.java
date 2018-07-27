import java.util.Arrays;
import java.util.Scanner;

public class IndexОfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] alphabet = new char[26];

        for (int index = 0; index < alphabet.length; index++) {
            alphabet[index] = (char) ('a' + index);
        }

        String word = scanner.nextLine().toLowerCase();
        for (int pos = 0; pos < word.length(); pos++) {
            char currentChar = word.charAt(pos);
            int currentCharIndex = Arrays.binarySearch(alphabet, currentChar);

            System.out.println(currentChar + " -> " + currentCharIndex);
        }
    }
}