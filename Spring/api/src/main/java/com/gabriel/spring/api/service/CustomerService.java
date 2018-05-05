package com.gabriel.spring.api.service;

import com.gabriel.spring.api.domain.Customer;
import com.gabriel.spring.api.repository.CustomerRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer find(final Integer id) {
        Optional<Customer> optionalCustomer = customerRepository.findById(id);

        return optionalCustomer.orElseThrow(() -> new ObjectNotFoundException(Customer.class, Customer.class.getName()));
    }
}
