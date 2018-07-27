import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] bombTokens = scanner.nextLine().split(" ");

        int bombNumber = Integer.parseInt(bombTokens[0]);
        int powerOfBomb = Integer.parseInt(bombTokens[1]);

        while (true) {

            int bombIndex = numbers.indexOf(bombNumber);

            if (bombIndex == -1) {
                break;
            }

            int leftIndex = Math.max(bombIndex - powerOfBomb, 0);
            int rightIndex = Math.min(bombIndex + powerOfBomb, numbers.size() - 1);

            numbers.subList(leftIndex, rightIndex + 1).clear();
        }

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);
    }
}
