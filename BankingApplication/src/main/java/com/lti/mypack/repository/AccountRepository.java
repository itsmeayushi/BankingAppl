package com.lti.mypack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.mypack.model.Account;

public interface AccountRepository extends JpaRepository<Account, String>{

	

}