public class Student extends User {
    private String department;
    private static final int MAX_BOOKS = 3;
    
    public Student(String userId, String name, String department) {
        super(userId, name);
        this.department = department;
    }
    
    @Override
    public boolean borrowBook(Book book) {
        if (borrowedBooks.size() >= MAX_BOOKS) {
            System.out.println("You've reached the maximum limit of " + MAX_BOOKS + " books.");
            return false;
        }
        if (book.borrow()) {
            borrowedBooks.add(book);
            System.out.println("Book borrowed successfully.");
            return true;
        }
        System.out.println("Book not available.");
        return false;
    }
    
    public String getDepartment() { return department; }
}
