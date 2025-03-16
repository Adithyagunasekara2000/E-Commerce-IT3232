public class PrintedBook extends Book {
    private int pageCount;

    public PrintedBook(String title, String author, String isbn, int pageCount) {
        super(title, author, isbn);
        this.pageCount = pageCount;
    }

    
    public void displayInfo() {
        System.out.println("Printed Book: " + getTitle() + ", Pages: " + pageCount);
    }
}
