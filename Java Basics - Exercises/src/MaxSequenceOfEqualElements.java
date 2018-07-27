import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split(" ");

        int currentLength = 1;
        int bestLength = 1;

        String bestStart = elements[0];

        for (int index = 0; index < elements.length - 1; index++) {
            String currentElement = elements[index];
            String nextElement = elements[index + 1];

            if (currentElement.equals(nextElement)) {
                currentLength++;

                if (currentLength > bestLength) {
                    bestLength = currentLength;
                    bestStart = currentElement;
                }
            } else {
                currentLength = 1;
            }
        }

        for (int pos = 0; pos < bestLength; pos++) {
            System.out.print(bestStart + " ");
        }
    }
}