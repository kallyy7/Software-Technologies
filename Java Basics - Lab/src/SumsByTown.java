import java.util.Scanner;
import java.util.TreeMap;

public class SumsByTown {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int linesCount = Integer.parseInt(scanner.nextLine());
        TreeMap<String, Double> townsIncomes = new TreeMap<>();

        for (int index = 0; index < linesCount; index++) {

            String[] inputTokens = scanner.nextLine().split("\\|");
            String town = inputTokens[0].trim();
            double income = Double.parseDouble(inputTokens[1].trim());
            townsIncomes.putIfAbsent(town, 0.0);
            townsIncomes.put(town, townsIncomes.get(town) + income);
        }

        townsIncomes.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
