package com.lti.mypack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.mypack.model.Register;

@Repository
public interface RegisterRepository extends JpaRepository<Register, String>{
	
	

}
