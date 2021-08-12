package com.lti.mypack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.mypack.model.Account;
import com.lti.mypack.repository.AccountRepository;
@Service
@Transactional
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	AccountRepository accRepo; 
	
	@Override
	public List<Account> getAccounts() {
		return accRepo.findAll();
	}

	@Override
	public Account addAccount(Account account) {
//		System.out.println(account.getOldid());
		accRepo.save(account);
		return account;
	}

//	@Override
//	public Account updateAccount(Account account) {
//		Account newa = accRepo.getById(account.getId());
//		newa=account;
//		accRepo.save(newa);
//		return account;
//	}

	@Override
	public Account findAccount(String oldid) {
		// TODO Auto-generated method stub
		return accRepo.getById(oldid);
	}

//	@Override
//	public Account deleteAccount(Account account) {
//		// TODO Auto-generated method stub
//		return null;
//}

	@Override
	public boolean deleteAccount(String oldid) {
		accRepo.deleteById(oldid);
		return true;
	}

}