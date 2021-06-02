package com.howtodoinjava.demo.service;

import com.howtodoinjava.demo.model.Variant;
import com.howtodoinjava.demo.repository.VariantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VariantServiceImpl implements VariantService {

    @Autowired
    private VariantRepository variantRepository;

    @Override
    public List<Variant> getAllVariants() {
        return variantRepository.findAll();
    }
}
