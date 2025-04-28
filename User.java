import java.util.ArrayList;
import java.util.List;

public abstract class User {
    protected String userId;
    protected String name;
    protected List<Book> borrowedBooks;
    
    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }
    
    // Abstract method to be implemented by subclasses
    public abstract boolean borrowBook(Book book);
    
    // Return a book
    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.returnBook();
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("You didn't borrow this book.");
        }
    }
    
    // View borrowed books
    public void viewBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books borrowed.");
        } else {
            System.out.println("Borrowed Books:");
            for (Book book : borrowedBooks) {
                book.displayInfo();
            }
        }
    }
    
    // Getters
    public String getUserId() { return userId; }
    public String getName() { return name; }
}
