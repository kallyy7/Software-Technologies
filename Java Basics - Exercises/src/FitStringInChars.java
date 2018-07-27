import java.util.Scanner;

public class FitStringInChars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        if (str.length() >= 20) {
            System.out.println(str.substring(0, 20));
        } else {
            System.out.print(str);
            int length = 20 - str.length();

            for (int index = 0; index < length; index++) {
                System.out.print('*');
            }
        }
    }
}
