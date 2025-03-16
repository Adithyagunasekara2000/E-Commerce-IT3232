public class Grocery extends Product {
    public Grocery(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    
    public void displayProductInfo() {
        System.out.println("Grocery - " + getName() + ", Price: " + getPrice() + ", Quantity: " + getQuantity());
    }
}
