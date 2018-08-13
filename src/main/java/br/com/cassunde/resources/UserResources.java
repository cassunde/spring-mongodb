package br.com.cassunde.resources;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cassunde.domain.User;
import br.com.cassunde.service.UserServices;

@RestController
@RequestMapping(value="/users")
public class UserResources {

	@Autowired
	private UserServices service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		
		return ResponseEntity.ok().body(service.findall());
	}
}
