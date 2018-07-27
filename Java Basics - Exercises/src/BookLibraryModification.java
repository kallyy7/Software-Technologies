import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class BookLibraryModification {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int bookCount = Integer.parseInt(scanner.nextLine());
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        BookLibrary library = new BookLibrary(new ArrayList<>());

        for (int index = 0; index < bookCount; index++) {

            String[] bookTokens = scanner.nextLine().split(" ");

            String title = bookTokens[0];
            String author = bookTokens[1];
            String publisher = bookTokens[2];
            LocalDate releaseDate = LocalDate.parse(bookTokens[3], df);
            String isbn = bookTokens[4];
            double price = Double.parseDouble(bookTokens[5]);

            Book book = new Book(title, author, publisher, releaseDate, isbn, price);

            library.getBooks().add(book);
        }

        LocalDate startReleaseDate = LocalDate.parse(scanner.nextLine(), df);

        library.getBooks()
                .stream()
                .filter(b -> b.getReleaseDate().isAfter(startReleaseDate))
                .sorted((a, b) -> {
                    int comparisonResult =
                            a.getReleaseDate().compareTo(b.getReleaseDate());

                    if (comparisonResult == 0) {

                        comparisonResult = a.getTitle().compareTo(b.getTitle());
                    }

                    return comparisonResult;
                })
                .forEach(b -> System.out.println(
                        b.getTitle() + " -> " + df.format(b.getReleaseDate())));
    }

    static class Book {

        private String title;
        private String author;
        private String publisher;
        private LocalDate releaseDate;
        private String isbn;
        private double price;

        Book(String title, String author, String publisher,
             LocalDate releaseDate, String isbn, double price) {

            this.title = title;
            this.author = author;
            this.publisher = publisher;
            this.releaseDate = releaseDate;
            this.isbn = isbn;
            this.price = price;
        }

        String getTitle() {
            return title;
        }

        LocalDate getReleaseDate() {
            return releaseDate;
        }
    }

    public static class BookLibrary {

        private ArrayList<Book> books;

        BookLibrary(ArrayList<Book> books) {

            this.books = books;
        }

        ArrayList<Book> getBooks() {

            return books;
        }
    }
}
