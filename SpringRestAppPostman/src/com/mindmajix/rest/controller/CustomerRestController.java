package com.mindmajix.rest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mindmajix.rest.model.Customer;
import com.mindmajix.rest.service.CustomerService;

@RestController
public class CustomerRestController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customers/getAllCustomers")
	public List<Customer> getCustomers(){
		return customerService.getCustomers();
	}
	
	@GetMapping("/customers/getCustomerById/{customerId}")
	public Customer getCustomer(@PathVariable int customerId){
		Customer customer = customerService.getCustomer(customerId);
		if(customer == null) {
			throw new CustomerNotFoundException("Customer Id not Found : "+customerId);
		}
		return customerService.getCustomer(customerId);
	}
	
	@PostMapping("/customers/addCustomer")
	public Customer addCustomer(@RequestBody Customer customer){
		customer.setId(0);
		customerService.saveCustomer(customer);
		return customer;
	}
	
	@PutMapping("/customers/updateCustomer")
	public Customer updateCustomer(@RequestBody Customer customer){
		customerService.saveCustomer(customer);
		return customer;
	}
	
	@DeleteMapping("/customers/deleteCustomer/{customerId}")
	public String deleteCustomer(@PathVariable int customerId){
		customerService.deleteCustomer(customerId);
		return "Deleted Customer Id: "+customerId;
	}
}