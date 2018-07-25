import java.util.Scanner;

public class SumNIntegers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int linesCount = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int index = 0; index < linesCount; index++) {

            int currentNumber = Integer.parseInt(scanner.nextLine());
            sum += currentNumber;
        }

        System.out.printf("Sum = %d%n", sum);
    }
}
