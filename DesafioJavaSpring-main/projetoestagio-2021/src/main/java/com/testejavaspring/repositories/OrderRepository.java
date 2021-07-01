package com.testejavaspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testejavaspring.entities.Order;

public interface  OrderRepository extends JpaRepository<Order, Long> {

}
