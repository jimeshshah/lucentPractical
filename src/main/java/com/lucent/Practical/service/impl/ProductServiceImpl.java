package com.lucent.Practical.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.lucent.Practical.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	private static final Logger LOG = LoggerFactory.getLogger(ProductServiceImpl.class);

	public final RestTemplate restTemplate = new RestTemplate();

	@Override
	public ResponseEntity<String> getAllProducts(String accessToken) {

		HttpHeaders headers = new HttpHeaders();

		headers.set("X-Shopify-Access-Token", accessToken);
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		String url = "https://e3519ce8d2b72750210800f3ba7115f2:a87522cc2e2551e43549aceb52e5d141@securecod4.myshopify.com/admin/api/2020-04/products.json";

		try {
			ResponseEntity<String> result = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
			return result;
		} catch (Exception e) {
			LOG.error(e.getMessage(), e.getCause());
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.UNAUTHORIZED);
		}
		
	}

}
