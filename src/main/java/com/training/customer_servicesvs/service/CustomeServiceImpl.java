package com.training.customer_servicesvs.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.customer_servicesvs.entity.Customer;
import com.training.customer_servicesvs.repository.CustomerRepository;

@Service
public class CustomeServiceImpl implements CustomerService {

	
	@Autowired
	private CustomerRepository customerRepository;
	@Override
	public void addCustomer(Customer customer) {
		
		customerRepository.save(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public Customer getCustomerById(UUID customerId) {
		Optional<Customer> obj= customerRepository.findById(customerId);
		if (obj.isPresent()) {
			return obj.get();
		}
		else {
			return null;
		}
	}
	
	public void addCustomer1(Customer customer) {
		customerRepository.save(customer);
	}
	
	   @Override
	    public void deleteCustomerById(UUID customerId) {
	        customerRepository.deleteById(customerId);
	    }

	   @Override
	   public Customer updadteCustomer(Customer customer,UUID CustomerId) {
		//1. find the existing customer by id
		   Optional<Customer> obj= customerRepository.findById(CustomerId);
		   Customer oldCustomer=obj.get();
		   //2. update the customer details
		   oldCustomer.setCustomerName(customer.getCustomerName());
		   oldCustomer.setCustomerEmail(customer.getCustomerEmail());
		   //3. save the updated customer details
		   customerRepository.save(oldCustomer);
		   return oldCustomer;
		
	   }

}
