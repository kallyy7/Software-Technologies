import java.util.Scanner;

public class ChangeToUppercase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        while (true) {
            int startIndex = text.indexOf("<upcase>");
            int endIndex = text.indexOf("</upcase>");

            if (startIndex == -1 || endIndex == -1) {
                break;
            }

            String strToRemove = text.substring(startIndex, endIndex + 9);
            String replacement = text.substring(startIndex + 8, endIndex).toUpperCase();
            text = text.replaceAll(strToRemove, replacement);
        }

        System.out.println(text);
    }
}
