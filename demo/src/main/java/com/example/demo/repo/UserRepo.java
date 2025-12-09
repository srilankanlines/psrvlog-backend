package com.example.demo.repo;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepo extends JpaRepository<User,Integer> {

    @Query (value = "SELECT * FROM User WHERE id =?1", nativeQuery = true)
    User getUserById(Integer userId);
    //this one not integrated to the frontend web application, only can use with postman to get user by Id
}
