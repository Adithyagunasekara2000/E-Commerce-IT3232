public class Fruit extends Product {
    public Fruit(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    
    public void displayProductInfo() {
        System.out.println("Fruit - " + getName() + ", Price: " + getPrice() + ", Quantity: " + getQuantity());
    }
}
