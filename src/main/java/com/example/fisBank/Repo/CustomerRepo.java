package com.example.fisBank.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fisBank.Beans.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
	
}
