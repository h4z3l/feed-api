package com.hazel.feed.post;

import java.util.List;
import java.util.concurrent.Future;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.query.Async;
import org.springframework.data.jpa.repository.Query;

public interface PostRepository extends CrudRepository<Post, Long> {

    @Async
    @Query("SELECT p FROM posts p where p.user_id = :id")
    Future<List<Post>> findByUser(@Param("id") Long id);
}