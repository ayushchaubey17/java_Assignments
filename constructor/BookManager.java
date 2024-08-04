

 class Book {
    private String title;
    private String author;
    private String isbn;
    private int publicationYear;


    public Book() {
    }

    public Book(String title, String author, String isbn, int publicationYear) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }
}


public class BookManager {
    private Book[] books;
    private int count;

    public BookManager(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    public void addBook(String title, String author, String isbn, int publicationYear) {
        if (count < books.length) {
            books[count++] = new Book(title, author, isbn, publicationYear);
        } else {
            System.out.println("Array is full. Cannot add more books.");
        }
    }

    public void displayBooks() {
        if (count == 0) {
            System.out.println("No books to display.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }

    public static void main(String[] args) {
        BookManager manager = new BookManager(5);

        manager.addBook("The Great", "Ayush", "978", 1925);

        System.out.println("Books added:");
        manager.displayBooks();
    }
}
