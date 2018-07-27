import java.util.Scanner;

public class URLParser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        int index = url.indexOf("://");
        String protocol = "";
        String serverResource = "";

        if (index != -1) {
            protocol = url.substring(0, index);
            serverResource = url.substring(index + 3);
        } else {
            serverResource = url;
        }

        System.out.printf("[protocol] = \"%s\"%n", protocol);
        index = serverResource.indexOf('/');
        String server = "";
        String resource = "";

        if (index != -1) {
            server = serverResource.substring(0, index);
            resource = serverResource.substring(index + 1);
        } else {
            server = serverResource;
        }

        System.out.printf("[server] = \"%s\"%n", server);
        System.out.printf("[resource] = \"%s\"%n", resource);
    }
}