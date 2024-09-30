package ie.atu.week2_refresher;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@FeignClient(value = "Micro2", url = "http://localhost:8081")
public class ProductService {

    private List<Product> productList = new ArrayList<Product>();
    public List<Product> getAllProducts() {
        return productList;
    }
    public Product addProduct(Product product) {
        productList.add(product);
        return product;
    }
    public Product deleteProduct(Product product) {
        productList.remove(product);
        return product;
    }
}
