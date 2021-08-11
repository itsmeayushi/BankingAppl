package com.lti.mypack.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class Account {
	
	@Id
	private String oldid;

	private String user_title;
	private String user_firstname;
	private String user_middlename;
	private String user_lastname;
	private String user_fathername;
	private String user_mobileno;
	private String user_emailid;
	private String user_aadharcard;
	private String user_dob;
	private String user_residentialaddr;
	private String user_permanentaddr;
	private String user_occupation_type;
	private String user_grossannualincome;
	private boolean user_isverified;
	private boolean user_islocked;
	private int counter;
	
	public Account() {
		super();
	}

	public Account(String oldid, String user_title, String user_firstname, String user_middlename,
			String user_lastname, String user_fathername, String user_mobileno, String user_emailid,
			String user_aadharcard, String user_dob, String user_residentialaddr, String user_permanentaddr,
			String user_occupation_type, String user_grossannualincome, boolean user_isverified, boolean user_islocked,
			int counter) {
		super();
		this.oldid = oldid;
		this.user_title = user_title;
		this.user_firstname = user_firstname;
		this.user_middlename = user_middlename;
		this.user_lastname = user_lastname;
		this.user_fathername = user_fathername;
		this.user_mobileno = user_mobileno;
		this.user_emailid = user_emailid;
		this.user_aadharcard = user_aadharcard;
		this.user_dob = user_dob;
		this.user_residentialaddr = user_residentialaddr;
		this.user_permanentaddr = user_permanentaddr;
		this.user_occupation_type = user_occupation_type;
		this.user_grossannualincome = user_grossannualincome;
		this.user_isverified = user_isverified;
		this.user_islocked = user_islocked;
		this.counter = counter;
	}

	public String getOldid() {
		return oldid;
	}

	public void setOldid(String oldid) {
		this.oldid = oldid;
	}

	public String getUser_title() {
		return user_title;
	}

	public void setUser_title(String user_title) {
		this.user_title = user_title;
	}

	public String getUser_firstname() {
		return user_firstname;
	}

	public void setUser_firstname(String user_firstname) {
		this.user_firstname = user_firstname;
	}

	public String getUser_middlename() {
		return user_middlename;
	}

	public void setUser_middlename(String user_middlename) {
		this.user_middlename = user_middlename;
	}

	public String getUser_lastname() {
		return user_lastname;
	}

	public void setUser_lastname(String user_lastname) {
		this.user_lastname = user_lastname;
	}

	public String getUser_fathername() {
		return user_fathername;
	}

	public void setUser_fathername(String user_fathername) {
		this.user_fathername = user_fathername;
	}

	public String getUser_mobileno() {
		return user_mobileno;
	}

	public void setUser_mobileno(String user_mobileno) {
		this.user_mobileno = user_mobileno;
	}

	public String getUser_emailid() {
		return user_emailid;
	}

	public void setUser_emailid(String user_emailid) {
		this.user_emailid = user_emailid;
	}

	public String getUser_aadharcard() {
		return user_aadharcard;
	}

	public void setUser_aadharcard(String user_aadharcard) {
		this.user_aadharcard = user_aadharcard;
	}

	public String getUser_dob() {
		return user_dob;
	}

	public void setUser_dob(String user_dob) {
		this.user_dob = user_dob;
	}

	public String getUser_residentialaddr() {
		return user_residentialaddr;
	}

	public void setUser_residentialaddr(String user_residentialaddr) {
		this.user_residentialaddr = user_residentialaddr;
	}

	public String getUser_permanentaddr() {
		return user_permanentaddr;
	}

	public void setUser_permanentaddr(String user_permanentaddr) {
		this.user_permanentaddr = user_permanentaddr;
	}

	public String getUser_occupation_type() {
		return user_occupation_type;
	}

	public void setUser_occupation_type(String user_occupation_type) {
		this.user_occupation_type = user_occupation_type;
	}

	public String getUser_grossannualincome() {
		return user_grossannualincome;
	}

	public void setUser_grossannualincome(String user_grossannualincome) {
		this.user_grossannualincome = user_grossannualincome;
	}

	public boolean isUser_isverified() {
		return user_isverified;
	}

	public void setUser_isverified(boolean user_isverified) {
		this.user_isverified = user_isverified;
	}

	public boolean isUser_islocked() {
		return user_islocked;
	}

	public void setUser_islocked(boolean user_islocked) {
		this.user_islocked = user_islocked;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	
	

}
