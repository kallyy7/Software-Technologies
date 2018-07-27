import java.util.Scanner;

public class VowelOrDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String symbol = scanner.nextLine();
        String vowels = "aeiouy";
        String result = "";

        if (vowels.contains(symbol)) {
            result = "vowel";
        } else if (Character.isDigit(symbol.charAt(0))) {
            result = "digit";
        } else {
            result = "other";
        }

        System.out.println(result);
    }
}
