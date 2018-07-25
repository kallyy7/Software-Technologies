import java.util.Arrays;
import java.util.Scanner;

public class ThreeIntegersSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int firstNum = numbers[0];
        int secondNum = numbers[1];
        int thirdNum = numbers[2];

        if (!checkThreeIntSum(firstNum, secondNum, thirdNum)
                && !checkThreeIntSum(firstNum, thirdNum, secondNum)
                && !checkThreeIntSum(secondNum, thirdNum, firstNum)) {

            System.out.println("No");
        }
    }

    private static boolean checkThreeIntSum(int firstNum, int secondNum, int thirdNum) {

        if (firstNum + secondNum != thirdNum) {

            return false;
        }

        int smallerNum = Math.min(firstNum, secondNum);
        int biggerNum = Math.max(firstNum, secondNum);

        System.out.printf("%d + %d = %d%n", smallerNum, biggerNum, thirdNum);

        return true;
    }
}

