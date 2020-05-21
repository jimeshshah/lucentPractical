package com.lucent.Practical.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {
	
	ResponseEntity<String> getAllProducts(String accessToken);

}
