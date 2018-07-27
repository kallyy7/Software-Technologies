import java.util.Scanner;

public class BooleanVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isBoolTrue = Boolean.parseBoolean(scanner.nextLine());
        System.out.println(isBoolTrue ? "Yes" : "No");
    }
}
