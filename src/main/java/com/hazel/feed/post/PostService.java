package com.hazel.feed.post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List getAllPoss() {
        return postRepository.findAll();
    }

    public List getUserPosts(Long id) {
        return postRepository.findByUser(id);
    }

    public Post getPost(Long id) {
        return postRepository.findById(id);
    }
}