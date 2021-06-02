package com.howtodoinjava.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.howtodoinjava.demo.model.Variant;

public interface VariantRepository extends JpaRepository<Variant, Integer> {

    Variant findByName(String name);

}
