package com.howtodoinjava.demo.repository;

import com.howtodoinjava.demo.model.ProductDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDetailsRepository extends JpaRepository<ProductDetails, Integer> {
    List<ProductDetails> findBySku(String sku);
    List<ProductDetails> findByVariantId(int variantId);
    List<ProductDetails> findBySeller(int seller);
}
