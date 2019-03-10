/**
 * 
 */
package com.spring.boot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


/**
 * @author DELL
 *
 */
@Service
public class CustomerPhoneService {
	
	List<Phone> phone = new ArrayList<>(Arrays.asList(new Phone(1,9234567896L,"Y"),new Phone(2,8934567896L,"Y"),
			new Phone(3,7654567896L,"Y"), new Phone(4,1234568754L,"Y")));
	
	List<Phone> phone1 = new ArrayList<>(Arrays.asList(new Phone(5,9004567896L,"Y"),new Phone(6,8934500896L,"Y"),
			new Phone(7,7611567896L,"Y")));
	
	List<Phone> phone2 = new ArrayList<>(Arrays.asList(new Phone(8,9234567000L,"N"),new Phone(9,8934564536L,"Y")));
	
	Customer customer1 = new Customer(1, "Robin", phone);
	Customer customer2 = new Customer(2, "Martin", phone1);
	Customer customer3 = new Customer(3, "Sachin", phone2);
	
	List<Customer> customers = new ArrayList<>(Arrays.asList(customer1,customer2,customer3));
	
	
	public List<Phone> getAllPhoneNumbers() {
		List<Phone> numbers = new ArrayList<>();
		for(Phone number: phone) {
			numbers.add(number);
		}
		for(Phone number: phone1) {
			numbers.add(number);
		}
		for(Phone number: phone2) {
			numbers.add(number);
		}
		return numbers;
	}
	
	public Customer getCustomer(int id) {
		for(Customer customer:customers) {
			if(customer.getCustomerId() == id) {
				return customer;
			}
		}
		return null;
	}

	public boolean activatePhoneNumber(Long phoneNumber) {
		
		//Soliution 1
		List<Phone> phones = getAllPhoneNumbers();
		for(Phone phone: phones) {
			if(phone.getPhoneNumber() == phoneNumber) {
				phone.setActiveFlag("Y");
				return true;
			}
		}
		
		//Solution 2
		
		for(Customer customer:customers) {
			
			if(customer.getCustomerPhones().size() >1) {
				for(Phone phone:customer.getCustomerPhones()) {
					if(phone.getPhoneNumber() == phoneNumber) {
						phone.setActiveFlag("Y");
						return true;
					}
				}
			}
		}
		
		return false;// No Phone number found.
	}

	
	

}


