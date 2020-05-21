package com.lucent.Practical.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String adrLine1;

	private String adrLine2;

	private String city;

	private String state;

	private String country;

	private String zipCode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAdrLine1() {
		return adrLine1;
	}

	public void setAdrLine1(String adrLine1) {
		this.adrLine1 = adrLine1;
	}

	public String getAdrLine2() {
		return adrLine2;
	}

	public void setAdrLine2(String adrLine2) {
		this.adrLine2 = adrLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
}
