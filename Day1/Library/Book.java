public class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Encapsulation: Getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }

    // Polymorphic method
    public void displayInfo() {
        System.out.println("Book: " + title + " by " + author + " (ISBN: " + isbn + ")");
    }
}
