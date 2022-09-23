package com.example.fisBank.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fisBank.Beans.Account;
import com.example.fisBank.Beans.Branch;
import com.example.fisBank.Beans.Customer;
import com.example.fisBank.Services.AccountService;
import com.example.fisBank.Services.BranchService;
import com.example.fisBank.Services.CustomerService;

@RestController
@RequestMapping("/bank")
public class AdminController {
	@Autowired
	private CustomerService cser;
	
	@Autowired
	private BranchService bser;
	
	@Autowired
	private AccountService aser;
	
	@PostMapping("/addbranch")
	public String addBranch(@RequestBody Branch newBranch) {
		return bser.addBranch(newBranch);
	}
	@DeleteMapping("/deletebranch/{branch_id}")
	public String deleteBranch(@PathVariable ("branch_id") int branch_id) {
		return bser.removeBranch(branch_id);
	}
		
	@PostMapping("/addaccount")
	public String addAccount(@RequestBody Account newAccount) {
		return aser.addAccount(newAccount);
	}
	@DeleteMapping("/deleteaccount/{account_number}")
	public String deleteAccount(@PathVariable ("account_number") int account_number) {
		return aser.removeAccount(account_number);
	}
	
	
	@PostMapping("/addcustomer")
	public String addCustomer(@RequestBody Customer newCustomer) {
		return cser.addCustomer(newCustomer);
	}
	@DeleteMapping("/deletecustomer/{customer_number}")
	public String deleteCustomer(@PathVariable ("customer_number") int customer_number) {
		return cser.removeCustomer(customer_number);
	}
	

}
