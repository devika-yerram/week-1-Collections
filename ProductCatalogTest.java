import java.util.HashSet;

public class ProductCatalog {
    // Use HashSet to store unique product names
    private HashSet<String> products;

    // Constructor
    public ProductCatalog() {
        products = new HashSet<>();
    }

    // Method to add a product to the catalog
    public boolean addProduct(String productName) {
        // HashSet.add() returns false if the item was already present
        return products.add(productName);
    }

    // Method to remove a product from the catalog
    public boolean removeProduct(String productName) {
        // HashSet.remove() returns false if the item was not found
        return products.remove(productName);
    }

    // Method to search for a product in the catalog
    public boolean searchProduct(String productName) {
        return products.contains(productName);
    }

    // Method to display all products in the catalog
    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("No products in the catalog.");
        } else {
            System.out.println("Product Catalog:");
            for (String product : products) {
                System.out.println("- " + product);
            }
        }
    }
}



















public class ProductCatalogTest {
    public static void main(String[] args) {
        // Create an instance of ProductCatalog
        ProductCatalog catalog = new ProductCatalog();

        // Add products
        System.out.println("Adding products:");
        System.out.println("Added 'Laptop': " + catalog.addProduct("Laptop"));
        System.out.println("Added 'Smartphone': " + catalog.addProduct("Smartphone"));
        System.out.println("Added 'Tablet': " + catalog.addProduct("Tablet"));
        System.out.println("Added 'Laptop': " + catalog.addProduct("Laptop")); // Should return false
        
        // Display products
        catalog.displayProducts();
        
        // Search for products
        System.out.println("\nSearching products:");
        System.out.println("Contains 'Smartphone': " + catalog.searchProduct("Smartphone"));
        System.out.println("Contains 'Camera': " + catalog.searchProduct("Camera"));
        
        // Remove products
        System.out.println("\nRemoving products:");
        System.out.println("Removed 'Tablet': " + catalog.removeProduct("Tablet"));
        System.out.println("Removed 'Camera': " + catalog.removeProduct("Camera")); // Should return false
        
        // Display products after removal
        catalog.displayProducts();
    }
}
