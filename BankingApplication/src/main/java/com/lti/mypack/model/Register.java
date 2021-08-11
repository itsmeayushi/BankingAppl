package com.lti.mypack.model;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="RegisterAndLogin")
public class Register {
	@Id
	private String accountno;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="accountno")
	AccountDetails accDetails;

	
	private String userid;
	private String loginpwd;
	private String transactionpwd;
	
	public Register() {
		super();
	}

	public Register(String accountno, String userid, String loginpwd, String transactionpwd) {
		super();
		this.accountno = accountno;
		this.userid = userid;
		this.loginpwd = loginpwd;
		this.transactionpwd = transactionpwd;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getLoginpwd() {
		return loginpwd;
	}

	public void setLoginpwd(String loginpwd) {
		this.loginpwd = loginpwd;
	}

	public String getTransactionpwd() {
		return transactionpwd;
	}

	public void setTransactionpwd(String transactionpwd) {
		this.transactionpwd = transactionpwd;
	}

	public AccountDetails getAccDetails() {
		return accDetails;
	}

	public void setAccDetails(AccountDetails accDetails) {
		this.accDetails = accDetails;
	}

	public String getAccountno() {
		return accountno;
	}

	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	
	
	
	
	

	

}
