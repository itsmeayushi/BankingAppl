package com.lti.mypack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.mypack.model.AccountDetails;
import com.lti.mypack.model.Register;
import com.lti.mypack.service.AccountDetailsService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/accountdetailsRest/api")
public class AccountDetailsController {
	
	@Autowired
	AccountDetailsService accService;
	
	@GetMapping("/accountdetails/{accountno}")
	public AccountDetails getAccountDetailsById(@PathVariable(value="accountno")String accountno) {
		//System.out.println(accountno);
		return accService.findAccountDetails(accountno);
	}
	
//	@PutMapping("/accountdetails")
//	public AccountDetails updateAccountDetailsByOldid(@RequestBody AccountDetails accountDetails) {
//		return accService.updateAccountDetailsByOldid(accountDetails);
//	}
	
	@PostMapping("/accountdetails")
	public boolean addAccountDetails(@RequestBody AccountDetails accountDetails) {
		return accService.addAccountDetails(accountDetails);
	}


}
