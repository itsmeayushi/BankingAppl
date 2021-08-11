package com.lti.mypack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.mypack.model.Register;
import com.lti.mypack.service.RegisterService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("registerRest/api")
public class RegisterController {
	@Autowired
	RegisterService regService;
	
	@GetMapping("/register")
	public List<Register> getAll(){
		return regService.getRegisters();
	}
	
	@PostMapping("/register")
	public boolean addRegister(@RequestBody Register register) {
		return regService.addRegister(register);
	}

}
