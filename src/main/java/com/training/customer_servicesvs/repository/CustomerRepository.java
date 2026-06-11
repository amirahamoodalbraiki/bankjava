package com.training.customer_servicesvs.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.training.customer_servicesvs.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {
	
	Customer findByCustomerEmail(String email);
	
	
	//@Query("SELECT c FROM Customer c WHERE c.customerEmail LIKE %:domain")
	@Query(nativeQuery=true, value="SELECT * FROM customer WHERE customer_email LIKE %:domain")
	List<Customer> findByEmail(String domain);

}
