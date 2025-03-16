public class LibraryTest {
    public static void main(String[] args) {
        Book[] books = new Book[3];

        books[0] = new PrintedBook("Java Basics", "Aedrf", "111-AAA", 300);
        books[1] = new EBook("Python Guide", "edrf", "222-BBB", 2.5);
        books[2] = new AudioBook("C# Spoken", "ygtyh", "333-CCC", 5.0);

        System.out.println("Library Collection:");
        for (Book b : books) {
            b.displayInfo(); 
        }
    }
}
