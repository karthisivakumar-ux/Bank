package com.bank.bankDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.bankRepository.BankRepository;
import com.bank.bankentity.Bank;

@Repository
public class BankDao {
  @Autowired
  BankRepository br;

public List<Bank> bank(List<Bank> a) {
	return br.saveAll(a);
}

public String lss(int a) {
	return br.lss(a);
}
  
}
