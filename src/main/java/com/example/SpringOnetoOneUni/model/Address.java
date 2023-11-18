package com.example.SpringOnetoOneUni.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Address")
public class Address {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Long addressid;
	private String city;
	private String addressType;
	public Long getAddressid() {
		return addressid;
	}
	public void setAddressId(Long addressid) {
		this.addressid = addressid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public Address(Long addressId, String city, String addressType) {
		super();
		this.addressid = addressId;
		this.city = city;
		this.addressType = addressType;
	}
	public Address()
	{
		
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressid + ", city=" + city + ", addressType=" + addressType + "]";
	}
	
	
}
