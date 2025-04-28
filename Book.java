public class Book {
    private String bookId;
    private String title;
    private String author;
    private int availableCopies;
    
    // Constructors
    public Book() {}
    
    public Book(String bookId, String title, String author, int availableCopies) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
    }
    
    // Getters and setters
    public String getBookId() { return bookId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getAvailableCopies() { return availableCopies; }
    
    public void setAvailableCopies(int copies) { this.availableCopies = copies; }
    
    // Method to display book info
    public void displayInfo() {
        System.out.println("ID: " + bookId + ", Title: " + title + 
                          ", Author: " + author + ", Available: " + availableCopies);
    }
    
    // Method to borrow a book
    public boolean borrow() {
        if (availableCopies > 0) {
            availableCopies--;
            return true;
        }
        return false;
    }
    
    // Method to return a book
    public void returnBook() {
        availableCopies++;
    }
}
