package com.bank.bankService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.bankDao.BankDao;
import com.bank.bankentity.Bank;

@Service
public class BankService {
  @Autowired
  BankDao bd;

public List<Bank> bank(List<Bank> a) {
	return bd.bank(a);
}
public String lss(int a) {
	return bd.lss(a);
}
  
}
