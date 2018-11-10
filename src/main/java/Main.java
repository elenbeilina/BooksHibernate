import model.Book;
import services.BookService;

import java.sql.SQLException;


public class Main {

    public static void main(String[] args) throws SQLException {

        BookService bookService = new BookService();
        Book book = new Book("Harry Potter","JK Rowling");
        bookService.saveBook(book);
        Book book1 = new Book("To Kill a Mockingbird","Harper Lee");
        bookService.saveBook(book1);

    }
}
