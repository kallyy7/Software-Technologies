import java.util.Scanner;

public class IntegerToHexAndBinary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int decimalNum = Integer.parseInt(scanner.nextLine());
        String hex = Integer.toHexString(decimalNum);
        String binary = Integer.toBinaryString(decimalNum);

        System.out.println(hex.toUpperCase());
        System.out.println(binary);
    }

}
