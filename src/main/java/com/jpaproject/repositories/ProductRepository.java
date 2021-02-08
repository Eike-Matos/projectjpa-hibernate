package com.jpaproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpaproject.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
