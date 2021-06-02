package com.howtodoinjava.demo.web;

import com.howtodoinjava.demo.exception.RecordNotFoundException;
import com.howtodoinjava.demo.model.Product;
import com.howtodoinjava.demo.model.ProductDetails;
import com.howtodoinjava.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/products", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    //@RequestMapping(method = RequestMethod.GET, path = "")
    public List<Product> getAllProducts() {
        return productService.findProducts();
    }

    @GetMapping(path = "/{id}")
    public Product getProduct(@PathVariable("id") int id) throws RecordNotFoundException {
        return productService.findByProductId(id);
    }

    @GetMapping(path = "/group/{name}")
    public Map<String, List<ProductDetails>> getProductsByVariant(@PathVariable("name") String name) throws RecordNotFoundException {
        return productService.groupByVariant(name);
    }

    @GetMapping(path = "/sku/{value}")
    public List<ProductDetails> getProductsBySku(@PathVariable("value") String value) {
        return productService.findBySku(value);
    }

    @GetMapping(path = "/seller/{value}")
    public List<ProductDetails> getProductsSeller(@PathVariable("value") String value) {
        return productService.findBySeller(value);
    }
}
