package com.example.fisBank.Beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class Account {
	@Id
	private int account_number;
	private int customer_number;
	private int branch_id;
	private double opening_balance;
	private String account_type;
	private String account_status;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int account_number, int customer_number, int branch_id, double opening_balance, String account_type,
			String account_status) {
		super();
		this.account_number = account_number;
		this.customer_number = customer_number;
		this.branch_id = branch_id;
		this.opening_balance = opening_balance;
		this.account_type = account_type;
		this.account_status = account_status;
	}
	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public int getCustomer_number() {
		return customer_number;
	}
	public void setCustomer_number(int customer_number) {
		this.customer_number = customer_number;
	}
	public int getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}
	public double getOpening_balance() {
		return opening_balance;
	}
	public void setOpening_balance(double opening_balance) {
		this.opening_balance = opening_balance;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public String getAccount_status() {
		return account_status;
	}
	public void setAccount_status(String account_status) {
		this.account_status = account_status;
	}
	@Override
	public String toString() {
		return "Account [account_number=" + account_number + ", customer_number=" + customer_number + ", branch_id="
				+ branch_id + ", opening_balance=" + opening_balance + ", account_type=" + account_type
				+ ", account_status=" + account_status + "]";
	}
	
}
