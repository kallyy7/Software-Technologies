import java.util.Scanner;

public class CensorEmailAddress {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        String[] emailTokens = email.split("@");
        int usernameLength = emailTokens[0].length();
        String replacement = "";

        for (int index = 0; index < usernameLength; index++) {
            replacement += '*';
        }

        String domain = '@' + emailTokens[1];
        replacement += domain;
        String censoredEmail = scanner.nextLine().replaceAll(email, replacement);
        System.out.println(censoredEmail);
    }
}
