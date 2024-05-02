public class Book implements Resource {
    private String title;
    private String author;
    private String ISBN;
    

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public void borrow() {
        System.out.println("Book \"" + title + "\" has been borrowed.");
        System.out.println("Book Information:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println();
    }
    
    public void returnResource() {
        System.out.println("Book \"" + title + "\" has been returned.");
        System.out.println("Book Information:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
    }
}