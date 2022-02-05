package com.springcore.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component 
public class Address {
	private String address;
	private String city;
	private String state;
	private int zipcode;
	public String getAddress() {
		return address;
	}
	@Value("B-202,MC")
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	@Value("Delhi")
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	@Value("Delhi/NCR")
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	@Value("110011")
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address [address=" + address + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + "]";
	}
}
