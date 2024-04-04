package Ecommerce.controllers;

import Ecommerce.dtos.ProductDto;
import Ecommerce.services.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String getAllProducts() {
        return "Getting all product";
    }

    @GetMapping("/products/{productId}")
    public String getSingleProduct(@PathVariable("productId") long id) {
        return "Getting a single product with id";
    }

    @PostMapping("/products")
    public String addNewProduct(@RequestBody ProductDto productDto) {
        return "Added a new Product";
    }

    @PutMapping("/products/{productId}")
    public String updateProduct(@PathVariable("productId") long id, @RequestBody ProductDto productDto) {
        return "Updated the product";
    }

    @DeleteMapping("/products/{productId}")
    public String deleteProduct(@PathVariable("productId") long id) {
        return "Deleting the product";
    }

}
