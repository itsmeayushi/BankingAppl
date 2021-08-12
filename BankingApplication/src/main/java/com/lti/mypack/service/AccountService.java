package com.lti.mypack.service;

import java.util.List;

import com.lti.mypack.model.Account;

public interface AccountService {
	public List<Account> getAccounts();
	public Account addAccount (Account account);
//	public Account updateAccount(Account account);
	public boolean deleteAccount(String oldid);
	public Account findAccount(String oldid);
}