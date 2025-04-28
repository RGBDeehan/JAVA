import java.util.ArrayList;
public abstract class User{
    String name; int userId;
    ArrayList<Book> borrowedBooks;

public User(String name,int userId){
    this.userId = userId;
    this.name = name;
    this.borrowedBooks = new ArrayList<>();
}




    abstract void borrowBook(Book book);
    void returnBook(Book book){
        if(borrowedBooks.remove(book)){
            book.returnBook();
            System.out.println("Book returned.");
        }else{
            System.out.println("Circumstance didn't borrow this book.");
        }
    }
    void viewBorrowedBooks(){
        if(borrowedBooks.isEmpty()){
            System.out.println("No books borrowed.");
        }else{
            System.out.println("Borrowed Books:");
            for(Book book : borrowedBooks){
                book.displayInfo();
            }
        }
    }

}
