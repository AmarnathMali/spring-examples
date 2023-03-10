package com.mindmajix.rest.service;

import java.util.List;
import com.mindmajix.rest.model.Customer;
public interface CustomerService {
	public List<Customer> getCustomers();
	public void saveCustomer(Customer theCustomer);
	public Customer getCustomer(int theId);
	public void deleteCustomer(int theId);
}
