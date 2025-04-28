public class Teacher extends User {
    private String designation;
    private static final int MAX_BOOKS = 5;
    
    public Teacher(String userId, String name, String designation) {
        super(userId, name);
        this.designation = designation;
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
    
    public String getDesignation() { return designation; }
}
