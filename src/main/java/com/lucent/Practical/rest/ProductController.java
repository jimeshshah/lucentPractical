package com.lucent.Practical.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.lucent.Practical.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@GetMapping("/product/all")
	public ResponseEntity<String> getAllProducts(@RequestHeader("X-Shopify-Access-Token") String accessToken) {
		return productService.getAllProducts(accessToken);
	}
}
