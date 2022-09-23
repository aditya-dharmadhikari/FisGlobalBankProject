package com.example.fisBank.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fisBank.Beans.Branch;

@Repository
public interface BranchRepo extends JpaRepository<Branch, Integer> {

}
