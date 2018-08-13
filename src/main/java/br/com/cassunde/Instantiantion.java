package br.com.cassunde;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.cassunde.domain.User;
import br.com.cassunde.repository.UserRepository;

/**
 * 
 * Class to execute when start application  * 
 * */
@Configuration
public class Instantiantion implements CommandLineRunner {

	@Autowired
	private UserRepository rep;
	
	@Override
	public void run(String... args) throws Exception {

		rep.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
	
		rep.saveAll( Arrays.asList( maria, alex, bob) );
	}
}
