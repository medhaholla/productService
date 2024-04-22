package Ecommerce.controllers;

import Ecommerce.dtos.GetSingleProductDto;
import Ecommerce.dtos.ProductDto;
import Ecommerce.models.Product;
import Ecommerce.services.ProductService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/products/{productId}")
    public GetSingleProductDto getSingleProduct(@PathVariable("productId") long id) {
        GetSingleProductDto responseDto = new GetSingleProductDto();
        responseDto.setProduct(productService.getSingleProduct(id));
        return responseDto;

    }

    @PostMapping("/products")
    public Product addNewProduct(@RequestBody ProductDto productDto) {
        System.out.println("Hey");
        Product newProduct = productService.addNewProduct(productDto);
        System.out.println(newProduct);

        return newProduct;
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
