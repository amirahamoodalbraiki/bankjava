package com.training.customer_servicesvs.service;

import java.util.List;
import java.util.UUID;

import com.training.customer_servicesvs.entity.Customer;

public interface CustomerService {
	void addCustomer(Customer customer);
	List<Customer> getAllCustomers();
	Customer getCustomerById(UUID customerId);
	void deleteCustomerById(UUID customerId);
	Customer updadteCustomer(Customer customer,UUID customerId);

}
