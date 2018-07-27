import java.util.Scanner;

public class MostFrequentNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split(" ");
        int maxCounter = 0;
        String mostFrequentElement = elements[0];

        for (int index = 0; index < elements.length; index++) {
            int counter = 1;
            for (int pos = index + 1; pos < elements.length; pos++) {

                if (elements[index].equals(elements[pos])) {
                    counter++;
                }
            }

            if (counter > maxCounter) {
                maxCounter = counter;
                mostFrequentElement = elements[index];
            }
        }

        System.out.println(mostFrequentElement);
    }
}
