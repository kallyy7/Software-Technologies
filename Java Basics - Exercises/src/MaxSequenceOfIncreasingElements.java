
import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfIncreasingElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int length = 1;
        int maxLength = 1;
        int startElement = 0;
        int startPosition = 0;

        for (int index = 0; index < numbers.length - 1; index++) {

            int currentNumber = numbers[index];
            int nextNumber = numbers[index + 1];

            if (currentNumber < nextNumber) {

                length++;

                if (length > maxLength) {

                    maxLength = length;
                    startElement = startPosition;
                }
            } else {
                length = 1;
                startPosition = index + 1;
            }
        }

        for (int pos = startElement; pos < startElement + maxLength; pos++) {

            System.out.print(numbers[pos] + " ");
        }
    }
}