public class Journal implements Resource {
    private String title;
    private int volume;
    private int issue;

    public Journal(String title, int volume, int issue) {
        this.title = title;
        this.volume = volume;
        this.issue = issue;
    }

    public void borrow() {
        System.out.println("Journal \"" + title + "\" has been borrowed.");
        System.out.println("Journal Information:");
        System.out.println("Title: " + title);
        System.out.println("Volume: " + volume);
        System.out.println("Issue: " + issue);
        System.out.println();
    }
    
    public void returnResource() {
        System.out.println("Journal \"" + title + "\" has been returned.");
        System.out.println("Journal Information:");
        System.out.println("Title: " + title);
        System.out.println("Volume: " + volume);
        System.out.println("Issue: " + issue);
    }
}