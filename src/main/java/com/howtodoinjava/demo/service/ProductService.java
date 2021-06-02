package com.howtodoinjava.demo.service;

import com.howtodoinjava.demo.exception.RecordNotFoundException;
import com.howtodoinjava.demo.model.Product;
import com.howtodoinjava.demo.model.ProductDetails;

import java.util.List;
import java.util.Map;

/*
6.	Available number of product by seller*/
public interface ProductService {

    List<Product> findProducts();

    Product findByProductId(int productId) throws RecordNotFoundException;

    /**
     * 1.	Group by brand / client
     * 2.	Group by price
     * 3.	Group by Color
     * 4.	Group by Size
     */
    Map<String, List<ProductDetails>> groupByVariant(String variant) throws RecordNotFoundException;

    /**
     * 	Get by SKU
     */
    List<ProductDetails> findBySku(String sku);

    List<ProductDetails> findBySeller(String seller);

}
