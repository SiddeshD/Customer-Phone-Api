/**
 * 
 */
package com.spring.boot.service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DELL
 *
 */
public class Customer { 
	
	private long customerId;
	private String customerName;
	private List<Phone> customerPhones = new ArrayList<>();
	
	
	public Customer(long customerId, String customerName, List<Phone> customerPhones) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPhones = customerPhones;
	}
	public Customer() {
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public List<Phone> getCustomerPhones() {
		return customerPhones;
	}
	public void setCustomerPhones(List<Phone> customerPhones) {
		this.customerPhones = customerPhones;
	}
	
}
