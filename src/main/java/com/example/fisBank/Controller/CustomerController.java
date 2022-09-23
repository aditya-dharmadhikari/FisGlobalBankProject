package com.example.fisBank.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fisBank.Beans.Customer;
import com.example.fisBank.Beans.Transaction;
import com.example.fisBank.Services.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService custS;
		
	@GetMapping("/getcustomer/{customer_number}")
	public Optional<Customer> getCustomer(@PathVariable ("customer_number") int customer_number) {
		return custS.getCustomer(customer_number);
	}
	
	@GetMapping("/getbalance/{customer_number}")
	public double getBalance(@PathVariable ("customer_number") int customer_number) {
		return custS.getBalance(customer_number);
	}
	@PostMapping("/maketransaction/{customer_number}")
	public String makeTransaction(@PathVariable("customer_number")int customer_number, @RequestBody Transaction newTransaction) {
		return custS.makeTransaction(customer_number, newTransaction);
	}
}
