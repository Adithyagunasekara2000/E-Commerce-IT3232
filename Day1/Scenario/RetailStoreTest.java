public class RetailStoreTest {
    public static void main(String[] args) {
        RetailStore store = new RetailStore();

        // Create products
        Fruit apple = new Fruit("Apple", 1.5, 100);
        Vegetable carrot = new Vegetable("Carrot", 0.9, 150);
        Grocery rice = new Grocery("Rice", 2.5, 200);

        // Add products to the store
        store.addProduct(apple);
        store.addProduct(carrot);
        store.addProduct(rice);

       
        store.displayAllProducts();

        
        store.editProduct("Carrot", "Fresh Carrot", 1.0, 120);

        
        store.displayAllProducts();

       
        store.deleteProduct("Rice");

       
        store.displayAllProducts();
    }
}
