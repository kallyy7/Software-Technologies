import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        for (int index = str.length() - 1; index >= 0; index--) {
            System.out.print(str.charAt(index));
        }
    }
}
