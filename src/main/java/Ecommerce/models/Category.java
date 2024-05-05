package Ecommerce.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity


public class Category extends BaseModel {
     private String name;
     private String description;
     private List<Product> products;

}
