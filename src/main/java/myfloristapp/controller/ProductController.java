package myfloristapp.controller;

import myfloristapp.entity.Product;
import myfloristapp.repository.ProductRepository;

import java.util.List;

public class ProductController {

    private final ProductRepository productRepository;

    // Constructor for dependency injection
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(int id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(int id, Product product) {
        product.setIdPRODUCT(id);
        return productRepository.save(product);
    }

    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }
}
