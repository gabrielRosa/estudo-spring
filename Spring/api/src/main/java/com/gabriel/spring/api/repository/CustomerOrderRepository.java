package com.gabriel.spring.api.repository;

import com.gabriel.spring.api.domain.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerOrderRepository extends JpaRepository<CustomerOrder, Integer> { }
