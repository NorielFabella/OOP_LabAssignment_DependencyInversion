public class AudioBook implements Resource {
    private String title;
    private String author;
    private String narrator;
    private String duration; 

    public AudioBook(String title, String author, String narrator, String duration) {
        this.title = title;
        this.author = author;
        this.narrator = narrator;
        this.duration = duration;
    }

    public void borrow() {
        System.out.println("Audiobook \"" + title + "\" has been borrowed.");
        System.out.println("Audiobook Information:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Narrator: " + narrator);
        System.out.println("Duration: " + duration);
        System.out.println();
    }
    
    public void returnResource() {
        System.out.println("Audiobook \"" + title + "\" has been returned.");
        System.out.println("Audiobook Information:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Narrator: " + narrator);
        System.out.println("Duration: " + duration);
    }
}
