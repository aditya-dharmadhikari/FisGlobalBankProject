package com.example.fisBank.Beans;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transaction")
public class Transaction {
	
	@Id
	private int transaction_number;
	private int account_number;
	private LocalDate date_of_transaction;
	private String mode_of_transaction;
	private String transaction_type;
	private int transaction_account;
	
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transaction(int transaction_number, int account_number, LocalDate date_of_transaction,
			String mode_of_transaction, String transaction_type, int transaction_account) {
		super();
		this.transaction_number = transaction_number;
		this.account_number = account_number;
		this.date_of_transaction = date_of_transaction;
		this.mode_of_transaction = mode_of_transaction;
		this.transaction_type = transaction_type;
		this.transaction_account = transaction_account;
	}

	public int getTransaction_number() {
		return transaction_number;
	}

	public void setTransaction_number(int transaction_number) {
		this.transaction_number = transaction_number;
	}

	public int getAccount_number() {
		return account_number;
	}

	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}

	public LocalDate getDate_of_transaction() {
		return date_of_transaction;
	}

	public void setDate_of_transaction(LocalDate date_of_transaction) {
		this.date_of_transaction = date_of_transaction;
	}

	public String getMode_of_transaction() {
		return mode_of_transaction;
	}

	public void setMode_of_transaction(String mode_of_transaction) {
		this.mode_of_transaction = mode_of_transaction;
	}

	public String getTransaction_type() {
		return transaction_type;
	}

	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}

	public int getTransaction_account() {
		return transaction_account;
	}

	public void setTransaction_account(int transaction_account) {
		this.transaction_account = transaction_account;
	}

	@Override
	public String toString() {
		return "Transaction [transaction_number=" + transaction_number + ", account_number=" + account_number
				+ ", date_of_transaction=" + date_of_transaction + ", mode_of_transaction=" + mode_of_transaction
				+ ", transaction_type=" + transaction_type + ", transaction_account=" + transaction_account + "]";
	}
	
	
}
