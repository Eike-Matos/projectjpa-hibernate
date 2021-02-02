package com.jpaproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpaproject.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

