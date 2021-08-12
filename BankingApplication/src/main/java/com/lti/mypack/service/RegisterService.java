package com.lti.mypack.service;

import java.util.List;

import com.lti.mypack.model.Register;

public interface RegisterService {
	public List<Register> getRegisters();
	
	public boolean addRegister(Register register);
	
	public List<Register> findRegisterByUserid(String userid, String loginpwd);
	
	public List<Register> updateRegisterByUserid(String userid, String loginpwd);
	

	

}
