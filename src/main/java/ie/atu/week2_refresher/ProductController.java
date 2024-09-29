package ie.atu.week2_refresher;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
//test
    private  ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/hello")
    public String message()
    {
        return "Hello";
    }
    @GetMapping("/hello/{name}")
    public String myName(@PathVariable String name)
    {
        return "Your name is " + name;
    }
    @GetMapping("/search")
    public String search(@RequestParam String search1, @RequestParam(defaultValue = "") String search2){
        return search1 + " " + search2;
    }

    @GetMapping("/product")
    public List<Product> getProductList()
    {
        return productService.getAllProducts();
    }


    @PostMapping("/product")
    public Product addProduct(@Valid @RequestBody Product product)
    {
        return productService.addProduct(product);

    }
    @PutMapping("/products/update/{id}")
    public Product updateProduct(@PathVariable Long id, @Valid @RequestBody Product updatedProduct)
    {
        return productService.updateProduct(id, updatedProduct);

    }

    @PostMapping("/product/delete")
    public Product deleteProduct(@Valid @RequestBody Product product)
    {
        return productService.deleteProduct(product);

    }
}
