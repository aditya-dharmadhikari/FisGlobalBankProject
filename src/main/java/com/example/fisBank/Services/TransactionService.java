package com.example.fisBank.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fisBank.Beans.Transaction;
import com.example.fisBank.Repo.TransactionRepo;

@Service
public class TransactionService {
	
	@Autowired
	private TransactionRepo trepo;
	
	public String makeTransaction(Transaction newTransaction) {
		trepo.saveAndFlush(newTransaction);
		return "Transaction made successfully";
	}
}
