import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book book1;
    private Book book2;
    private Book book3;
    private Library library;

    @Before
    public void setUp() {
        book1 = new Book("Harry Potter and the philosophers stone", "J.K. Rowling", "Fantasy");
        book2 = new Book("Harry Potter and the chamber of secrets", "J.K. Rowling", "Fantasy");
        book3 = new Book("Harry Potter and the prisoner of azkaban", "J.K. Rowling", "Fantasy");
        library = new Library();
    }

    @Test
    public void startsWithNoBooks(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBook() {
        library.addBook(book1);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void shouldNotAddBookIfCapacityReached() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.countBooks());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book1);
        library.addBook(book2);
        library.removeBook(book2);
        assertEquals(1, library.countBooks());
    }
}
