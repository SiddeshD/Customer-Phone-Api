/**
 * 
 */
package com.spring.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.errorresponse.CustomerNotFoundException;
import com.spring.boot.errorresponse.PhoneNumberNotFoundException;

/**
 * @author DELL
 *
 */
@RestController
public class CustomerPhoneController {
	
	@Autowired
	CustomerPhoneService customerPhoneService;
	
	@GetMapping("/numbers")
	public List<Phone> getAllTopic() {
		return customerPhoneService.getAllPhoneNumbers();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/customers/{id}")
	public Customer getCustomer(@PathVariable int id) {
		Customer customer = customerPhoneService.getCustomer(id);;
		if(customer != null) {
			return customer;
		}else {
			throw new CustomerNotFoundException("Customer is not found with the ID :"+id);
		}
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/customerPhone/{phoneNumber}")
	public void activatePhoneNumber(@PathVariable Long phoneNumber ) {
		
		if(!customerPhoneService.activatePhoneNumber(phoneNumber)) {
			throw new PhoneNumberNotFoundException("We could not find your mobile number :"+ phoneNumber);
		}
	}
	
	

}
