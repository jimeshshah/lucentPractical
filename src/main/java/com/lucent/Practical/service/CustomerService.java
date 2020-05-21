package com.lucent.Practical.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.lucent.Practical.domain.Customer;

@Service
public interface CustomerService {
	
	
	public ResponseEntity<Customer> addCustomer(Customer customer);
	
	public ResponseEntity<Customer> updateCustomer(Customer customer);
	
	public ResponseEntity<List<Customer>> getAllCustomers();
	
	public ResponseEntity<Boolean> deleteCustomer(Long id);
}
