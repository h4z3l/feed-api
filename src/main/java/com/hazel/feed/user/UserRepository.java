package com.hazel.feed.user;

import java.util.List;
import java.util.concurrent.Future;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.query.Async;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends CrudRepository<User, Long> {

    @Async
    @Query("SELECT u FROM users u where u.username = :username")
    Future<User> findByUsername(@Param("username") String username);

    @Async
    Future<User> findById(Long id);
}