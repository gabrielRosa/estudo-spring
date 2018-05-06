package com.gabriel.spring.api.repository;

import com.gabriel.spring.api.domain.CustomerOrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerOrderItemRepository extends JpaRepository<CustomerOrderItem, Integer> { }
