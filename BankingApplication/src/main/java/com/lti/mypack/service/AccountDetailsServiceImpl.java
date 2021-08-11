package com.lti.mypack.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.mypack.model.AccountDetails;
import com.lti.mypack.repository.AccountDetailsRepository;

@Service
@Transactional
public class AccountDetailsServiceImpl implements AccountDetailsService {
	
	@Autowired
	AccountDetailsRepository accRepo;

	@Override
	public AccountDetails findAccountDetails(String accountno) {
		return accRepo.findById(accountno).get();
	}

}
