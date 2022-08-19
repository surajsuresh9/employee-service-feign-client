package com.example.demo.model;

public class Address {

	private Long addressId;
	private String street;
	private String city;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(Long addressId, String street, String city) {
		this.addressId = addressId;
		this.street = street;
		this.city = city;
	}

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
