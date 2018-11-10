package services;

import dao.BooksDao;
import model.Book;

import java.util.List;

public class BookService {

    private BooksDao booksDao = new BooksDao();

    public BookService() {
    }

    public Book findBook(int id)
    {
        return booksDao.findById(id);
    }

    public void saveBook(Book book)
    {
        booksDao.save(book);
    }

    public void deleteBook(Book book)
    {
        booksDao.delete(book);
    }

    public void updateBook(Book book)
    {
        booksDao.update(book);
    }

    public List<Book> findAllUsers()
    {
        return booksDao.findAll();
    }

}
