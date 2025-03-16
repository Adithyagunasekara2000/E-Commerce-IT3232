public class EBook extends Book {
    private double fileSize; // in MB

    public EBook(String title, String author, String isbn, double fileSize) {
        super(title, author, isbn);
        this.fileSize = fileSize;
    }

   
    public void displayInfo() {
        System.out.println("E-Book: " + getTitle() + ", File Size: " + fileSize + "MB");
    }
}
