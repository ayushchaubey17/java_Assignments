// Abstract class Document
abstract class Document {
    protected String title;
    protected String author;

    public Document(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Abstract method to get the file type
    public abstract String getFileType();

    // Abstract method to get the size of the document
    public abstract double getSize(); // Size in KB

    // Abstract method to print the content of the document
    public abstract void printContent();

    // Concrete method to display document info
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("File Type: " + getFileType());
        System.out.println("Size: " + getSize() + " KB");
        System.out.println("Content:");
        printContent();
        System.out.println();
    }
}

// Subclass for PDF Documents
class PDFDocument extends Document {
    private double size; // Size in KB
    private String content;

    public PDFDocument(String title, String author, double size, String content) {
        super(title, author);
        this.size = size;
        this.content = content;
    }

    @Override
    public String getFileType() {
        return "PDF";
    }

    @Override
    public double getSize() {
        return size;
    }

    @Override
    public void printContent() {
        System.out.println(content);
    }
}

// Subclass for Text Documents
class TextDocument extends Document {
    private double size; // Size in KB
    private String content;

    public TextDocument(String title, String author, double size, String content) {
        super(title, author);
        this.size = size;
        this.content = content;
    }

    @Override
    public String getFileType() {
        return "Text";
    }

    @Override
    public double getSize() {
        return size;
    }

    @Override
    public void printContent() {
        System.out.println(content);
    }
}

// Subclass for Image Documents
class ImageDocument extends Document {
    private double size; // Size in KB
    private String imagePath;

    public ImageDocument(String title, String author, double size, String imagePath) {
        super(title, author);
        this.size = size;
        this.imagePath = imagePath;
    }

    @Override
    public String getFileType() {
        return "Image";
    }

    @Override
    public double getSize() {
        return size;
    }

    @Override
    public void printContent() {
        System.out.println("Image is located at: " + imagePath);
    }
}

// Main class to demonstrate functionality
public class DocumentSystem {
    public static void main(String[] args) {
        Document[] documents = new Document[3];
        documents[0] = new PDFDocument("Java Programming", "John Doe", 1.5, "This is a PDF about Java programming.");
        documents[1] = new TextDocument("My First Diary", "Jane Doe", 0.5, "Today I learned about abstraction in Java.");
        documents[2] = new ImageDocument("Nature", "Alice Smith", 2.0, "/images/nature.jpg");

        // Display information for each document
        for (Document doc : documents) {
            doc.displayInfo();
        }
    }
}
