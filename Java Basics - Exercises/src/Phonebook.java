import java.util.LinkedHashMap;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, String> phonebook = new LinkedHashMap<>();

        while (true) {
            String[] inputTokens = scanner.nextLine().split(" ");
            String command = inputTokens[0];

            if (command.equals("END")) {
                break;
            }

            String name = inputTokens[1];
            String phoneNumber = "";

            if (command.equals("A")) {

                phoneNumber = inputTokens[2];
                phonebook.put(name, phoneNumber);

            } else if (phonebook.containsKey(name)) {

                phoneNumber = phonebook.get(name);
                System.out.println(name + " -> " + phoneNumber);

            } else {
                System.out.println("Contact " + name + " does not exist.");
            }
        }
    }
}
