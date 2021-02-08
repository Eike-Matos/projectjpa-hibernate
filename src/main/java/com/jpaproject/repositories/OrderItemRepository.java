package com.jpaproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpaproject.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
