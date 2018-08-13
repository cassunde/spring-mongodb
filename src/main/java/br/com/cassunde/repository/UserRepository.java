package br.com.cassunde.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.cassunde.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
