/**
 * 
 */
package com.example.Crud.demoCrud.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.Crud.demoCrud.controller.UserDTO;
import com.example.Crud.demoCrud.entity.UserAccount;
import com.example.Crud.demoCrud.repo.UserAccountRepo;
import com.example.Crud.demoCrud.services.TestServices;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author wahid
 * 20-Apr-2019 12:52:30 am
 */

@Service
public class TestServicesImpl implements TestServices {
	
	@Autowired
	UserAccountRepo userAccountRepo;

	@Override
	@Transactional(propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	public String addUserAccount(UserDTO user) throws Exception {
		ObjectMapper mp= new ObjectMapper();
		UserAccount newUser=mp.convertValue(user, UserAccount.class);
		userAccountRepo.save(newUser);
		
		throw new Exception("some way");
		//return "success";
	}

}
