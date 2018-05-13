package com.gabriel.spring.api.controller;

import com.gabriel.spring.api.domain.CustomerOrder;
import com.gabriel.spring.api.service.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/customerOrder")
public class CustomerOrderController {

	@Autowired
	private CustomerOrderService customerOrderService;
	
	@RequestMapping(value = "/{id}", method=RequestMethod.GET)
	public ResponseEntity<CustomerOrder> find(@PathVariable final Integer id) {
		CustomerOrder customerOrder = customerOrderService.find(id);

		return ResponseEntity.ok().body(customerOrder);
	}
}
