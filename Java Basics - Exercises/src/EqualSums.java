import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int index = 0; index < numbers.length; index++) {

            int leftPartSum = Arrays.stream(numbers)
                    .limit(index)
                    .sum();

            int rightPartSum = Arrays.stream(numbers)
                    .skip(index + 1)
                    .sum();

            if (leftPartSum == rightPartSum) {
                System.out.println(index);
                return;
            }
        }

        System.out.println("no");
    }
}
