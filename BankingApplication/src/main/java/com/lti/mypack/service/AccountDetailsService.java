package com.lti.mypack.service;

import com.lti.mypack.model.AccountDetails;


public interface AccountDetailsService {
	public AccountDetails findAccountDetails(String accountno);
	
//	public AccountDetails updateAccountDetailsByOldid(AccountDetails accountDetails);
	
	public boolean addAccountDetails(AccountDetails accountDetails);

}
