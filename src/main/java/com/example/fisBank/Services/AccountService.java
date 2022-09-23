package com.example.fisBank.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fisBank.Beans.Account;
import com.example.fisBank.Repo.AccountRepo;


@Service
public class AccountService {
	@Autowired
	private AccountRepo arepo;
	
	public String addAccount(Account newAccount) {
		arepo.saveAndFlush(newAccount);
		return "Account Added Successfully";
	}
	
	public String removeAccount(int account_number) {
		if(!arepo.existsById(account_number)) {
			return "Account does not exist";
		}
		else {
			arepo.deleteById(account_number);
			return "Branch record deleted";
		}
	}
}
	