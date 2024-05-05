package Ecommerce.services;

import Ecommerce.dtos.ProductDto;
import Ecommerce.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    Product getSingleProduct(long id);

    Product addNewProduct(ProductDto product);

    Product replaceProduct(long id, Product product);

    Product updateProduct(long id, Product product);

    boolean deleteProduct(long id);
}
