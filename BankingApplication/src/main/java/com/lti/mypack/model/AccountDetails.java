package com.lti.mypack.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="AccountDetails")
public class AccountDetails {
	
	@Id
	private String accountno;
	
	private String userid;
	private String accounttype;
	private String accountbalance;
	private String userifsccode;
	private String oldid;
	
	@NotNull
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="oldid", insertable=false, updatable= false)
	Account accountoldid;
	
	public AccountDetails() {
		super();
	}

	public AccountDetails(String accountno, String userid, String accounttype, String accountbalance,
			String userifsccode) {
		super();
		this.accountno = accountno;
		this.userid = userid;
		this.accounttype = accounttype;
		this.accountbalance = accountbalance;
		this.userifsccode = userifsccode;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getAccountno() {
		return accountno;
	}

	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public String getAccountbalance() {
		return accountbalance;
	}

	public void setAccountbalance(String accountbalance) {
		this.accountbalance = accountbalance;
	}
	
	public String getUserifsccode() {
		return userifsccode;
	}

	public void setUserifsccode(String userifsccode) {
		this.userifsccode = userifsccode;
	}

	public Account getAccountoldid() {
		return accountoldid;
	}

	public void setAccountoldid(Account accountoldid) {
		this.accountoldid = accountoldid;
	}

	@Override
	public String toString() {
		return "AccountDetails [accountno=" + accountno + ", userid=" + userid + ", accounttype=" + accounttype
				+ ", accountbalance=" + accountbalance + ", userifsccode=" + userifsccode + ", accountoldid="
				+ accountoldid + "]";
	}

	public String getOldid() {
		return oldid;
	}

	public void setOldid(String oldid) {
		this.oldid = oldid;
	}

	
	
	


	}
