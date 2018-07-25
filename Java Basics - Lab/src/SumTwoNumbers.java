import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double firstNum = Double.parseDouble(scan.nextLine());
        double secondNum = Double.parseDouble(scan.nextLine());

        double sum = firstNum + secondNum;

        System.out.printf("%.2f%n", sum);
    }
}
