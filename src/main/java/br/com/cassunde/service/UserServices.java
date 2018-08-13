package br.com.cassunde.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cassunde.domain.User;
import br.com.cassunde.repository.UserRepository;

@Service
public class UserServices {

	@Autowired
	private UserRepository rep;
	
	public List<User> findall(){
		return rep.findAll();
	}
}
