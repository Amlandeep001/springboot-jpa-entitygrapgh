package com.jpa.entitygraph.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.entitygraph.entity.Customer;
import com.jpa.entitygraph.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController
{
	private final CustomerService service;

	public CustomerController(CustomerService service)
	{
		this.service = service;
	}

	@PostMapping
	public Customer createCustomer(@RequestBody Customer customer)
	{
		return service.saveCustomer(customer);
	}

	@GetMapping
	public List<Customer> getCustomers()
	{
		return service.getAllCustomers();
	}
}
