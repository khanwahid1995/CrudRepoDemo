/**
 * 
 */
package com.example.Crud.demoCrud.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.Crud.demoCrud.services.TestServices;

/**
 * @author wahid 20-Apr-2019 12:24:41 am
 */

@Controller
@RequestMapping(path = "/test")
public class TestController {
	@Autowired
	TestServices testServices;

	@PostMapping(path = "/add")
	@ResponseBody
	public String addUser(@RequestBody @Valid UserDTO user) {

		try {
			return testServices.addUserAccount(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "fail";
		}

	}

}
