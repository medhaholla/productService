package Ecommerce.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter


public class Category extends BaseModel{
     private String name;
     private String description;
     private List<Product> products;


}
