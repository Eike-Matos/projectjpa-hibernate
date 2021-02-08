package com.jpaproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpaproject.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
