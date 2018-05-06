package com.gabriel.spring.api.service;

import com.gabriel.spring.api.domain.CustomerOrder;
import com.gabriel.spring.api.repository.CustomerOrderRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerOrderService {

    @Autowired
    private CustomerOrderRepository customerOrderRepository;

    public CustomerOrder find(final Integer id) {
        Optional<CustomerOrder> optionalCustomerOrder = customerOrderRepository.findById(id);

        return optionalCustomerOrder.orElseThrow(() -> new ObjectNotFoundException(CustomerOrder.class, CustomerOrder.class.getName()));
    }
}
