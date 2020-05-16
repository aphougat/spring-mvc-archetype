package ${package}.controller;

import ${package}.entity.Product;
import ${package}.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping(path = "/product", produces = {"application/json"})
    public @ResponseBody
    Iterable<Product> getAllProducts()
    {
        return productRepository.findAll();
    }

    @GetMapping(path = "/productId", produces = {"application/json"})
    public @ResponseBody Product getProductById(@RequestParam String id)
    {
        System.out.println(id);
        return productRepository.findOne(id);
    }

}
