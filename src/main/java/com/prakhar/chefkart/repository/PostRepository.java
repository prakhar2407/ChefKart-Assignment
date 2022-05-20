package com.prakhar.chefkart.repository;

import java.util.List;

import com.prakhar.chefkart.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, Integer> {

    @Query("{ 'userId' : ?0 }")
    public List<Post> findPostByUserId(Integer id);

}
