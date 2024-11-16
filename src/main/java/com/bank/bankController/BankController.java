package com.bank.bankController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.bankService.BankService;
import com.bank.bankentity.Bank;

@RestController
@RequestMapping(value="/bank")
public class BankController {
 @Autowired
 BankService bs;
  
 @PostMapping(value="/detail")
 public List<Bank> bank(@RequestBody List<Bank> a) {
	 return bs.bank(a);
 }
 @GetMapping(value="/ls/{e}")
	public String ls(@PathVariable int e) {
		return bs.ls(e);
	}
}
