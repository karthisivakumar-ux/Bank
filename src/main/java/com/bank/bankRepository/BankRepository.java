package com.bank.bankRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bank.bankentity.Bank;

public interface BankRepository extends JpaRepository<Bank,Integer> {
	
	
	@Query(value="SELECT bank_name from banktable where hsn_code like ? ",nativeQuery = true)
	public String lss(int a);

}
