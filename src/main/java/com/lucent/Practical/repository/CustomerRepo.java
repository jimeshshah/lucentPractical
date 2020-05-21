package com.lucent.Practical.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucent.Practical.domain.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long>{

}
