public class BookDTO {
    // Instance variables
     String title;
    String ISBN;
    private String author;
    private String publisher;

    // Static variable
    private static int bookCount = 0;

    // Constructor
    public BookDTO(String title, String ISBN, String author, String publisher) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.publisher = publisher;
        bookCount++;
    }

    // Getter and Setter methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



}
