package com.lata.springcoredemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address { 				//address
	private String address;
	private String city;
	private String state;
	private int zipcode;
	
	
	public Address() {
	}

	public Address(@Value("E-110/49")String address, @Value("Gurugram") String city,@Value("Haryana") String state,@Value("122001") int zipcode) {
		super();
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [address=" + address + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + "]";
	}
}
