package Ecommerce.services;

import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    public String getAllCategories() {
        return "Returning all categories";
    }

    public String getProductsInCategory() {
        return "Getting all products in a category";
    }

}
