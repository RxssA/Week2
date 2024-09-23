package ie.atu.week2_refresher;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Week2Refresher {

    private List<Product> productList = new ArrayList<Product>();
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
        return productList;
    }


    @PostMapping("/product")
    public Product addProduct(@RequestBody Product product)
    {
        productList.add(product);
        return product;
    }
}
