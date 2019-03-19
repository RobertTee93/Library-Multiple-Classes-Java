import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library() {
        this.books = new ArrayList<Book>();
        this.capacity = 2;
    }

    public int countBooks() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if (this.countBooks() < this.capacity) {
            this.books.add(book);
        }
    }

    public Book removeBook(Book book) {
        if (this.books.remove(book)){
            return book;
        } else {
            return null;
        }
    }
}
