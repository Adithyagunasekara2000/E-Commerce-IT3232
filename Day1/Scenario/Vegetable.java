public class Vegetable extends Product {
    public Vegetable(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    
    public void displayProductInfo() {
        System.out.println("Vegetable - " + getName() + ", Price: " + getPrice() + ", Quantity: " + getQuantity());
    }
}
