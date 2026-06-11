package com.training.customer_servicesvs.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.customer_servicesvs.entity.Customer;
import com.training.customer_servicesvs.service.CustomerService;

@RestController
@RequestMapping("/")
public class CustomerController {
	
	@Autowired
    CustomerService customerService;
	@GetMapping
	public String greet() {
		System.out.println("Inside CustomerController.greet()");
		return "Hello from Customer Service";
	}
	
	@GetMapping("customer")
	public ResponseEntity<List<Customer>> getAllCustomers() {
	//	return customerService.getAllCustomers();
		return ResponseEntity.ok(customerService.getAllCustomers());
	}
	
	@PostMapping("customer")
	public ResponseEntity <String> addCustomer(@RequestBody Customer customer , @RequestParam String accountType, @RequestParam double balance) {
		customerService.addCustomer(customer);
		System.out.println("customerId: "+customer.getCustomerId());
		//return "Customer added successfully";
		return new ResponseEntity<String>("Customer added successfully", HttpStatus.CREATED);
	}
	
	@GetMapping("customer/{id}")
	public ResponseEntity<Customer> findbyId(@PathVariable("id") UUID customerId) {
		//return customerService.getCustomerById(customerId);
		//return ResponseEntity.ok(customerService.getCustomerById(customerId));
		return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.FOUND);
	}
	
	
	
	@DeleteMapping("customer")
	public ResponseEntity <String> deleteCustomer(@RequestParam UUID customerId) {
	    customerService.deleteCustomerById(customerId);
	   // return "Customer deleted successfully";
	    return new ResponseEntity<>("Customer deleted successfully", HttpStatus.OK);
	}
	
		
	@PutMapping("customer/{id}")
	public ResponseEntity <Customer> updateCustomer(@RequestBody Customer customer, @PathVariable("id") UUID customerId) {
	    //return customerService.updadteCustomer(customer, customerId);
		return new ResponseEntity<>(customerService.updadteCustomer(customer, customerId), HttpStatus.OK);
		
	}
	
	
}

//CRUD