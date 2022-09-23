package com.example.fisBank.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fisBank.Beans.Branch;
import com.example.fisBank.Repo.BranchRepo;


@Service
public class BranchService {
	@Autowired
	private BranchRepo brepo;
	
	public String addBranch(Branch newBranch) {
		brepo.saveAndFlush(newBranch);
		return "Branch Added Successfully";
	}
	
	public String removeBranch(int branch_id) {
		if(!brepo.existsById(branch_id)) {
			return "Branch does not exist";
		}
		else {
			brepo.deleteById(branch_id);
			return "Branch record deleted";
		}
	}
}
	