import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SymmetricNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        List<String> symmetricNumbers = new ArrayList<>();

        for (int index = 1; index <= number; index++) {

            String strNum = Integer.toString(index);

            if (isNumberSymmetric(strNum)) {

                symmetricNumbers.add(strNum);
            }
        }

        System.out.println(String.join(" ", symmetricNumbers));
    }

    private static boolean isNumberSymmetric(String strNum) {

        for (int pos = 0; pos < strNum.length() / 2; pos++) {

            if (strNum.charAt(pos) != strNum.charAt(strNum.length() - 1 - pos)) {

                return false;
            }
        }

        return true;
    }
}
