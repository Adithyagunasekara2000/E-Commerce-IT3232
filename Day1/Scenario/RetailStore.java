import java.util.ArrayList;

public class RetailStore {
    private ArrayList<Product> products;

    public RetailStore() {
        products = new ArrayList<>();
    }

    // Add a product to the store
    public void addProduct(Product product) {
        products.add(product);
    }

    // Edit a product's details (by name)
    public void editProduct(String name, String newName, double newPrice, int newQuantity) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                product.setName(newName);
                product.setPrice(newPrice);
                product.setQuantity(newQuantity);
                System.out.println("Product updated: " + newName);
                return;
            }
        }
        System.out.println("Product not found.");
    }

    // Delete a product (by name)
    public void deleteProduct(String name) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equalsIgnoreCase(name)) {
                products.remove(i);
                System.out.println("Product deleted: " + name);
                return;
            }
        }
        System.out.println("Product not found.");
    }

    // Display all products
    public void displayAllProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }
        System.out.println("\nAvailable Products:");
        for (Product product : products) {
            product.displayProductInfo();
        }
    }
}
