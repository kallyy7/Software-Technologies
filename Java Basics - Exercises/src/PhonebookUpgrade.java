import java.util.Scanner;
import java.util.TreeMap;

public class PhonebookUpgrade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TreeMap<String, String> phonebook = new TreeMap<>();

        while (true) {

            String[] inputTokens = scanner.nextLine().split(" ");
            String command = inputTokens[0];

            if (command.equals("END")) {
                break;
            }

            String name = "";
            String phoneNumber = "";

            if (command.equals("ListAll")) {

                for (String personName : phonebook.keySet()) {
                    phoneNumber = phonebook.get(personName);
                    System.out.println(personName + " -> " + phoneNumber);
                }
            } else if (command.equals("A")) {

                name = inputTokens[1];
                phoneNumber = inputTokens[2];
                phonebook.put(name, phoneNumber);

            } else {

                name = inputTokens[1];

                if (phonebook.containsKey(name)) {
                    phoneNumber = phonebook.get(name);
                    System.out.println(name + " -> " + phoneNumber);

                } else {
                    System.out.println("Contact " + name + " does not exist.");
                }
            }
        }
    }
}