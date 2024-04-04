package Ecommerce.controllers;

import Ecommerce.services.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products/category")
public class CategoryController {
    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/")
    public String getAllCategories() {
        return "Returning all categories";
    }

    @GetMapping("/{categoryName}")
    public String getProductsInCategory(@PathVariable("categoryName") String categoryName) {
        return "Getting all products in a category";
    }


}
