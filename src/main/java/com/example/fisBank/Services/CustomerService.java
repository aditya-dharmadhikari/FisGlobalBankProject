package com.example.fisBank.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fisBank.Beans.Customer;
import com.example.fisBank.Beans.Transaction;
import com.example.fisBank.Repo.CustomerRepo;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepo crepo;
	
	public String addCustomer(Customer newCustomer) {
		crepo.saveAndFlush(newCustomer);
		return "Customer Added Successfully";
	}
	
	public String removeCustomer(int customer_number) {
		if(!crepo.existsById(customer_number)) {
			return "Customer does not exist";
		}
		else {
			crepo.deleteById(customer_number);
			return "customer record deleted";
		}
	}
	public Optional<Customer> getCustomer(int customer_number) {
		if(!crepo.existsById(customer_number)) {
			return null;
		}
		return crepo.findById(customer_number);
	}
	public double getBalance( int customer_number) {
		if(!crepo.existsById(customer_number)) {
			return 0.0;
		}
		else {
			Customer cust = crepo.findById(customer_number).get();
			return cust.getAccount().getOpening_balance();
		}
	}
	public String makeTransaction(int customer_number, Transaction newTransaction) {
		if(!crepo.existsById(customer_number)) {
			return "Customer does not exist";
		}
		else {
			
			Customer cust = crepo.findById(customer_number).get();
			cust.getTransactions().add(newTransaction);
			crepo.saveAndFlush(cust);
			
			return "Transaction made successfully";
			}
		
	}
	
	
}
