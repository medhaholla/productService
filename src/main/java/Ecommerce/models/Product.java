package Ecommerce.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter


public class Product extends BaseModel{
    private String name;
    private String description;
    private String imageUrl;
    private double price;
    private Category category;
}
