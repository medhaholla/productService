package Ecommerce.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter

// class for auditing attributes

public class BaseModel {
    private Long id;
    private Date createdAt;
    private Date lastUpdatedAt;
    private boolean isDeleted;


}
