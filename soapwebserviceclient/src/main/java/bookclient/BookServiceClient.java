package bookclient;

import java.util.List;

public class BookServiceClient {
    public static void main(String[] args) {
        try {
            BookServiceImplementationService bsis = new BookServiceImplementationService();
            BookServiceInterface bsi = bsis.getBookServiceImplementationPort();

            List<Book> books = bsi.getAllBooks();

            for (Book book : books) {
                System.out.println("Id: " + book.getBookId());
                System.out.println("Title: " + book.getBookTitle());
                System.out.println("Author: " + book.getBookAuthor());
                System.out.println("Price: " + book.getBookPrice());

                System.out.println("=================================");

            }

            Book book = bsi.getBookById("ISBN102");

            System.out.println("Id: " + book.getBookId());
            System.out.println("Title: " + book.getBookTitle());
            System.out.println("Author: " + book.getBookAuthor());
            System.out.println("Price: " + book.getBookPrice());

            System.out.println("=================================");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
