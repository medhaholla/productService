package Ecommerce.services;

import Ecommerce.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product getSingleProduct(long id) {
        return null;
    }

    @Override
    public Product addNewProduct(Product product) {
        return null;
    }

    @Override
    public String updateProduct(long id, Product product) {
        return null;
    }

    @Override
    public String deleteProduct(long id) {
        return null;
    }
}
