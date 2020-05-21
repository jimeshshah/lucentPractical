package com.lucent.Practical.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.lucent.Practical.domain.Customer;
import com.lucent.Practical.exceptions.CustomException;
import com.lucent.Practical.repository.CustomerRepo;
import com.lucent.Practical.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepo customerRepo;

	@Override
	public ResponseEntity<Customer> addCustomer(Customer customer) {
		return new ResponseEntity<>(customerRepo.save(customer), HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<Customer> updateCustomer(Customer customer) {
		return new ResponseEntity<>(customerRepo.save(customer), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<Customer>> getAllCustomers() {
		return new ResponseEntity<>(customerRepo.findAll(), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Boolean> deleteCustomer(Long id) {
		Customer customer = customerRepo.findById(id).orElseThrow(() -> new CustomException("Customer cannot found"));
		customerRepo.delete(customer);
		return new ResponseEntity<>(Boolean.TRUE, HttpStatus.OK);
	}

}
