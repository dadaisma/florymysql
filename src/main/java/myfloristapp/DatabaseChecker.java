package myfloristapp;

import myfloristapp.entity.Product;
import myfloristapp.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseChecker implements CommandLineRunner {

    private final ProductRepository productRepository;

    private static final Logger logger = LoggerFactory.getLogger(DatabaseChecker.class);

    // Constructor for dependency injection
    public DatabaseChecker(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Create a new product
        Product product = new Product();
        product.setName("Flower");
        product.setPrice(9.99);
        product.setColor("red");
        product.setName("Rosa");

        // Save the product to the database
        productRepository.save(product);

        // Retrieve the product from the database
        Product retrievedProduct = productRepository.findById(product.getIdPRODUCT()).orElse(null);

        // Check if the product was saved and retrieved successfully
        if (retrievedProduct != null) {
            logger.info("Product saved and retrieved successfully: " + retrievedProduct.getName());
        } else {
            logger.error("Product could not be retrieved.");
        }
    }
}
