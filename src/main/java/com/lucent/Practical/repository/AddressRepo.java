package com.lucent.Practical.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucent.Practical.domain.Address;

@Repository
public interface AddressRepo  extends JpaRepository<Address, Long>{

}
