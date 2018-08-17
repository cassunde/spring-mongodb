package br.com.cassunde;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.cassunde.domain.Post;
import br.com.cassunde.domain.User;
import br.com.cassunde.repository.PostRepository;
import br.com.cassunde.repository.UserRepository;

/**
 * 
 * Class to execute when start application  * 
 * */
@Configuration
public class Instantiantion implements CommandLineRunner {

	@Autowired
	private UserRepository rep;
	
	@Autowired
	private PostRepository repPost;
	
	@Override
	public void run(String... args) throws Exception {

		rep.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		rep.saveAll( Arrays.asList( maria, alex, bob) );
		
		repPost.deleteAll();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Post post1 = new Post(null, sdf.parse("01/01/2018"), "Prmeiro post", "Descrição do Prmeiro post", maria);
		Post post2 = new Post(null, sdf.parse("01/01/2018"), "Segundo post", "Descrição do Prmeiro 2", maria);
	
		repPost.saveAll(Arrays.asList(post1, post2));
	}
}
