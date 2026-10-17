package com.ciicc.practice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ciicc.practice.model.Product;
import java.util.List;

@Repository 
public interface ProductRepository extends JpaRepository<Product, Long>{

    Optional<Product> findById(long id);
}