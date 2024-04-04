package Ecommerce.controllers;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    public String getAllCategories(){
        return "Returning all categories";
    }

    public String getProductsInCategory(){
        return "Getting all products in a category";
    }


}
