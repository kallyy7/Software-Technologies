import java.util.Scanner;

public class IntersectionOfCircles {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] c1Args = scanner.nextLine().split(" ");
        String[] c2Args = scanner.nextLine().split(" ");

        int xS = Integer.parseInt(c1Args[0]) - Integer.parseInt(c2Args[0]);
        int yS = Integer.parseInt(c1Args[1]) - Integer.parseInt(c2Args[1]);
        int radiuses = Integer.parseInt(c1Args[2]) + Integer.parseInt(c2Args[2]);

        double centersDistance = Math.sqrt((Math.pow(xS, 2)) + (Math.pow(yS, 2)));

        System.out.println(radiuses >= centersDistance ? "Yes" : "No");
    }
}
