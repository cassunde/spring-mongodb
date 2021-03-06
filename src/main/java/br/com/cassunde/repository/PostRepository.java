package br.com.cassunde.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.cassunde.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
