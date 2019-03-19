import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;
    private Library library;

    @Before
    public void setUp(){
        book = new Book("Harry Potter and the philosophers stone", "J.K. Rowling", "Fantasy");
        library = new Library();
        library.addBook(book);
        borrower = new Borrower();
    }

    @Test
    public void startsWithNoBooks(){
        assertEquals(0, borrower.countBooks());
    }

    @Test
    public void canAddBook() {
        borrower.addBook(book);
        assertEquals(1, borrower.countBooks());
    }

    @Test
    public void canGetBookFromLibrary(){
        borrower.takeBookFromLibrary(library, book);
        assertEquals(1, borrower.countBooks());
        assertEquals(0, library.countBooks());
    }

}
