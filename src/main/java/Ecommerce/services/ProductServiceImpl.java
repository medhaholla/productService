package Ecommerce.services;

import Ecommerce.dtos.FakeStoreProductDto;
import Ecommerce.dtos.ProductDto;
import Ecommerce.models.Category;
import Ecommerce.models.Product;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    RestTemplateBuilder restTemplateBuilder;

    public ProductServiceImpl(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }

    @Override
    public List<Product> getAllProducts() {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductDto[]> response = restTemplate.getForEntity("https://fakestoreapi.com/products", FakeStoreProductDto[].class);

        List<Product> ans = new ArrayList<>();

        for (FakeStoreProductDto productDto : response.getBody()) {
            ans.add(convertProductDtoToProduct(productDto));
        }

        return ans;

    }

    @Override
    public Product getSingleProduct(long productId) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductDto> response = restTemplate.getForEntity("https://fakestoreapi.com/products/{id}", FakeStoreProductDto.class, productId);

        FakeStoreProductDto productDto = response.getBody();

        return convertProductDtoToProduct(productDto);
    }

    public Product convertProductDtoToProduct(FakeStoreProductDto productDto) {
        Product product1 = new Product();
        product1.setId(productDto.getId());
        product1.setPrice(productDto.getPrice());
        product1.setDescription(productDto.getDescription());
        product1.setImageUrl(productDto.getImage());
        product1.setName(productDto.getTitle());

        Category category = new Category();
        category.setName(productDto.getCategory());
        product1.setCategory(category);

        return product1;
    }

    @Override
    public Product addNewProduct(ProductDto product) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductDto> response = restTemplate.postForEntity("https://fakestoreapi.com/products", product, FakeStoreProductDto.class);

        FakeStoreProductDto productDto = response.getBody();

        return convertProductDtoToProduct(productDto);
    }

    @Override
    public Product updateProduct(long id, Product product) {
        return null;
    }

    @Override
    public boolean deleteProduct(long id) {
        return false;
    }
}
