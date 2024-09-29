package ie.atu.week2_refresher;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
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

    public  Product findById(Long id) {
        return productList.stream().filter(product -> product.getId() == id).findFirst().orElse(null);
    }

    public Product updateProduct(Long id, Product updatedProduct) {
        Product product = findById(id);

        product.setName(updatedProduct.getName());
        product.setPrice(updatedProduct.getPrice());
        return product;
    }
}
