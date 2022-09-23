package com.example.fisBank.Beans;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	private int customer_number;
	
	private String firstName;
	
	private String middleName;
	
	private String lastName;
	private String customer_city;
	private long customer_contact_number;
	private String occupation;
	private LocalDate dateOfBirth;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Account account;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Transaction> transactions;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customer_number, String firstName, String middleName, String lastName, String customer_city,
			long customer_contact_number, String occupation, LocalDate dOB) {
		super();
		this.customer_number = customer_number;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.customer_city = customer_city;
		this.customer_contact_number = customer_contact_number;
		this.occupation = occupation;
		this.dateOfBirth = dOB;
	}
	
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Customer(int customer_number, String firstName, String middleName, String lastName, String customer_city,
			long customer_contact_number, String occupation, LocalDate dateOfBirth, Account account) {
		super();
		this.customer_number = customer_number;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.customer_city = customer_city;
		this.customer_contact_number = customer_contact_number;
		this.occupation = occupation;
		this.dateOfBirth = dateOfBirth;
		this.account = account;
	}
	
	public Customer(int customer_number, String firstName, String middleName, String lastName, String customer_city,
			long customer_contact_number, String occupation, LocalDate dateOfBirth, Account account,
			List<Transaction> transactions) {
		super();
		this.customer_number = customer_number;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.customer_city = customer_city;
		this.customer_contact_number = customer_contact_number;
		this.occupation = occupation;
		this.dateOfBirth = dateOfBirth;
		this.account = account;
		this.transactions = transactions;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getCustomer_number() {
		return customer_number;
	}
	public void setCustomer_number(int customer_number) {
		this.customer_number = customer_number;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCustomer_city() {
		return customer_city;
	}
	public void setCustomer_city(String customer_city) {
		this.customer_city = customer_city;
	}
	public long getCustomer_contact_number() {
		return customer_contact_number;
	}
	public void setCustomer_contact_number(long customer_contact_number) {
		this.customer_contact_number = customer_contact_number;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	public List<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	
	@Override
	public String toString() {
		return "Customer [customer_number=" + customer_number + ", firstName=" + firstName + ", middleName="
				+ middleName + ", lastName=" + lastName + ", customer_city=" + customer_city
				+ ", customer_contact_number=" + customer_contact_number + ", occupation=" + occupation + ", Date of birth=" + dateOfBirth
				+ "]";
	}
	

}
