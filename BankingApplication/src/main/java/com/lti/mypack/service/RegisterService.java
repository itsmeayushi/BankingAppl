package com.lti.mypack.service;

import java.util.List;


import com.lti.mypack.model.Register;

public interface RegisterService {
	public List<Register> getRegisters();
	
	public boolean addRegister(Register register);
	
//	public boolean checkLogin(String userid, String loginpwd);
	

}
