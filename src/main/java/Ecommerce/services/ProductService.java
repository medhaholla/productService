package Ecommerce.services;

import Ecommerce.dtos.ProductDto;
import Ecommerce.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    Product getSingleProduct(long id);

    Product addNewProduct(Product product);

    String updateProduct(long id, Product product);

    String deleteProduct(long id);
}
