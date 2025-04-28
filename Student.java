public class Student extends User {
    String department;
    int maxBooks =3;
    public Student(int userId, String name, String department) {
        super(name, userId);
        this.department = department;
    }
    public void borrowBook(Book book, int availablecopies) {
        if(borrowedBooks.size() >= maxBooks) {
            System.out.println("You've reached the maximum limit of " + maxBooks + " books.");
            return;
        }
        book.borrow(availablecopies);
        borrowedBooks.add(book);
        System.out.println("Book borrowed successfully.");



}

    @Override
    void borrowBook(Book book) {

    }
}

