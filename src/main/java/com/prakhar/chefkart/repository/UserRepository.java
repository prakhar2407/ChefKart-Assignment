package com.prakhar.chefkart.repository;

import org.springframework.stereotype.Repository;
import com.prakhar.chefkart.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

@Repository
public interface UserRepository extends MongoRepository<User, Integer> {

    @Query(" { '_id' : ?0 } ")
    public User findUserById(Integer id);
}
