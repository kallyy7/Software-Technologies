import java.util.Scanner;

public class CompareCharArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String firstStr = scanner.nextLine();
        String secondStr = scanner.nextLine();
        int comparisonResult = firstStr.compareTo(secondStr);
        firstStr = firstStr.replaceAll(" ", "");
        secondStr = secondStr.replaceAll(" ", "");

        System.out.println(comparisonResult < 0 ? firstStr : secondStr);
        System.out.println(comparisonResult < 0 ? secondStr : firstStr);
    }
}
