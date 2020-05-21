package com.lucent.Practical.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucent.Practical.domain.Customer;
import com.lucent.Practical.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
		return customerService.addCustomer(customer);
	}
	
	@GetMapping
	public ResponseEntity<List<Customer>> getAllCustomers(){
		return customerService.getAllCustomers();
	}
	
	@PutMapping
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer){
		return customerService.updateCustomer(customer);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteCustomer(@PathVariable("id") Long id){
		return customerService.deleteCustomer(id);
	}
	
}
