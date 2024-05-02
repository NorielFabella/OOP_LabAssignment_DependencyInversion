import java.util.zip.Adler32;

public class TestProgram {
    public static void main(String[] args) {
       
        Book book = new Book("OOP 101", "Cat", "123123123");
        Journal journal = new Journal("Nature: Journey's End", 2024, 999);

        System.out.println("Borrowing the book!");
        book.borrow();
        System.out.println("Returning the book!");
        book.returnResource();
        System.out.println();
       
        System.out.println("Borrowing the journal!");
        journal.borrow();
        System.out.println("Returning the journal!");
        journal.returnResource();   
        System.out.println();

        // Add another resource "AudioBook" easily
        AudioBook audioBook = new AudioBook("The Catcher of Stick", "Dog", "Buddy Joe", "100 hours 52 minutes");

        System.out.println("Attempting to borrow the audiobook...");
        audioBook.borrow();
        System.out.println("Returning the audiobook...");
        audioBook.returnResource();
        System.out.println();
    }
}
