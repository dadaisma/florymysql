package myfloristapp;

import myfloristapp.controller.ProductController;
import myfloristapp.entity.Product;
import myfloristapp.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseChecker implements CommandLineRunner {

    private final ProductRepository productRepository;

    // Constructor for dependency injection
    public DatabaseChecker(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        ProductController productController = new ProductController(productRepository);

        // Create a new product
        Product product = new Product();
        product.setName("Test Product");
        product.setPrice(99.99);

        // Save the product to the database
        productController.createProduct(product);

        // Retrieve the product from the database
        Product retrievedProduct = productController.getProductById(product.getIdPRODUCT());

        // Check if the product was saved and retrieved successfully
        if (retrievedProduct != null) {
            System.out.println("Product saved and retrieved successfully: " + retrievedProduct.getName());
        } else {
            System.out.println("Product could not be retrieved.");
        }
    }
}
