public class Book {
    String title,author;
    int bookId,availableCopies;
        Book(){}
        Book(String title,String author,int availablecopies,int bookId){
        this.author = author;
        this.availableCopies = availablecopies;
        this.title = title;
        this.bookId = bookId;
        }
        Book(String title,String author,int bookId){
        this.author = author;
        this.availableCopies =0;
        this.title = title;
        this.bookId = bookId;
        }
void displayInfo(){
    System.out.println("ID: "+bookId+","+"Title: "+title+","+"Author: "+author+","+"Available Copies: "+availableCopies+".");
}
void borrow(int neededBook){
    if(neededBook>availableCopies || availableCopies == 0){
        System.out.println("Insufficient Quantity!!!");
    }
    else if(neededBook <= availableCopies){
        System.out.println("Quantity Available...");
        availableCopies--;
    }
        }
void returnBook(int givenBook){
            availableCopies++;
    }
    void returnBook() {
    }

}
