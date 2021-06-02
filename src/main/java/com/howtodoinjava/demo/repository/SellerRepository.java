package com.howtodoinjava.demo.repository;

import com.howtodoinjava.demo.model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Integer> {
    Seller findByName(String name);
}
