package com.ciicc.practice.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciicc.practice.model.Product;
import com.ciicc.practice.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor 
    
public class ProductController {
    private final ProductRepository productRepository;

   @GetMapping ("/products")
   public ResponseEntity<?> getAllProducts() {
    return ResponseEntity.ok(productRepository.findAll());
   }



@GetMapping("/products/{id}")
public ResponseEntity<?> findById(@PathVariable long id){
return ResponseEntity.ok(productRepository.findById(id));

}}

