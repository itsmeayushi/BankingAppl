package com.lti.mypack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.mypack.model.AccountDetails;
import com.lti.mypack.model.Register;
import com.lti.mypack.repository.RegisterRepository;

@Service
@Transactional
public class RegisterServiceImpl implements RegisterService{
	
	@Autowired
	RegisterRepository regRepo;

	@Override
	public List<Register> getRegisters() {
		return regRepo.findAll();
	}

	@Override
	public boolean addRegister(Register register) {
		 regRepo.save(register);
		return true;
	}

	@Override
	public List<Register> findRegisterByUserid(String userid, String loginpwd) {
		return regRepo.findByUserid(userid, loginpwd);
	}

	@Override
	public List<Register> updateRegisterByUserid(String userid, String loginpwd) {
		return regRepo.updateByUserid(userid, loginpwd);
	}

//	@Override
//	public boolean checkLogin(String userid, String loginpwd) {
//		if()
//		return false;
//	}

	
	

	
	


}
