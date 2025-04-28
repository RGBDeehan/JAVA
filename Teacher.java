public class Teacher extends User {
    String designation;
    int maxBooks =5;

    Teacher(int userId, String name, String designation) {
        super(name,userId);
        this.designation = designation;
    }
    public void borrowBook(Book book, int availablecopies) {
        if (borrowedBooks.size() >= maxBooks) {
            System.out.println("You've reached the maximum limit of " + maxBooks + " books.");
        }
        book.borrow(availablecopies);
            borrowedBooks.add(book);
        System.out.println("Book borrowed successfully.");
        }


    @Override
    void borrowBook(Book book) {

    }
}

