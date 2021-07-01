package com.testejavaspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testejavaspring.entities.OrderItem;

public interface  OrderItemRepository extends JpaRepository<OrderItem, Long> {


}
