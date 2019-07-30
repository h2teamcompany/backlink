package com.backlink.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backlink.DTO.AccountRepository;
import com.backlink.entities.Account;

@Service
public class AccountService implements ServiceObject<Account, String>{

	@Autowired
	private AccountRepository accountRepository;
	
	@Override
	public List<Account> findAll() {		
		return accountRepository.findAll();
	}

	@Override
	public Account findById(String id) {
		return accountRepository.getOne(id);
	}

	@Override
	public Account save(Account account) {		
		return accountRepository.save(account);
	}

	@Override
	public Account update(Account account) {
		return accountRepository.saveAndFlush(account);
	}

	@Override
	public void delete(String id) {		
		accountRepository.deleteById(id);
	}
	
	
	
}
