/**
 * 
 */
package com.example.Crud.demoCrud.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.Crud.demoCrud.entity.UserAccount;

/**
 * @author wahid
 * 20-Apr-2019 12:20:53 am
 */
public interface UserAccountRepo extends CrudRepository<UserAccount, Long>{

	List<UserAccount> findByUsername(String username);
	
	List<UserAccount> findByUsernameAndEmail(String username,String email);
}
