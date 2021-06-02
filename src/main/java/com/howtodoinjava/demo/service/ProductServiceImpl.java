package com.howtodoinjava.demo.service;

import com.howtodoinjava.demo.exception.RecordNotFoundException;
import com.howtodoinjava.demo.model.Product;
import com.howtodoinjava.demo.model.ProductDetails;
import com.howtodoinjava.demo.model.Seller;
import com.howtodoinjava.demo.model.Variant;
import com.howtodoinjava.demo.repository.ProductDetailsRepository;
import com.howtodoinjava.demo.repository.ProductRepository;
import com.howtodoinjava.demo.repository.SellerRepository;
import com.howtodoinjava.demo.repository.VariantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductDetailsRepository productDetailsRepository;

    @Autowired
    private VariantRepository variantsRepository;

    @Autowired
    private SellerRepository sellerRepository;

    @Override
    public List<Product> findProducts() {
        List<Product> products = productRepository.findAll();
        if (Objects.isNull(products))
            return Collections.EMPTY_LIST;

        return products;
    }

    @Override
    public Product findByProductId(int productId) throws RecordNotFoundException {
        Optional<Product> product = productRepository.findById(productId);
        if (product.isPresent())
            return product.get();
        throw new RecordNotFoundException("Product with Id " + productId + " not found");
    }

    @Override
    public  Map<String, List<ProductDetails>> groupByVariant(String name) throws RecordNotFoundException {
        Variant variants = variantsRepository.findByName(name);
        if (Objects.isNull(variants))
            throw new RecordNotFoundException("No variant matched with " + name);
        List<ProductDetails> productDetailsList = productDetailsRepository.findByVariantId(variants.getId());
        if (productDetailsList == null || productDetailsList.size() == 0)
            return new HashMap<>();
        return productDetailsList.stream().collect(Collectors.groupingBy(productDetails -> productDetails.getVariantValue()));
    }

    @Override
    public List<ProductDetails> findBySku(String sku) {
        List<ProductDetails> products = productDetailsRepository.findBySku(sku);
        if (Objects.isNull(products))
            return new ArrayList();

        return products;
    }

    @Override
    public List<ProductDetails> findBySeller(String name)  {
        Seller seller = sellerRepository.findByName(name);
        if (Objects.isNull(seller))
            return Collections.EMPTY_LIST;

        List<ProductDetails> products = productDetailsRepository.findBySeller(seller.getId());
        if (Objects.isNull(products))
            return Collections.EMPTY_LIST;
        return products;
    }
}
