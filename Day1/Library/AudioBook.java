public class AudioBook extends Book {
    private double duration; 

    public AudioBook(String title, String author, String isbn, double duration) {
        super(title, author, isbn);
        this.duration = duration;
    }

 
    public void displayInfo() {
        System.out.println("Audio Book: " + getTitle() + ", Duration: " + duration + " hours");
    }
}
