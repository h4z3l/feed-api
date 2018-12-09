package com.hazel.feed.post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PostController {

    @Autowired
    PostService postService;

    @RequestMapping(path="/post", method = RequestMethod.GET)
    public ResponseEntity<List<Post>> listPost() {
        return new ResponseEntity<List<Post>>(postService.getAllPosts(), HttpStatus.OK);
    }

    @RequestMapping(path="/user/{id}/posts", method = RequestMethod.GET)
    public ResponseEntity<List<Post>> listPost(@PathVariable("id") Long id) {
        return new ResponseEntity<List<Post>>(postService.getUserPosts(id), HttpStatus.OK);
    }

    @RequestMethod(path="/post/{id}", method = RequestMapping.GET)
    public ResponseEntity<Post> listPost(@PathVariable("id") Long id) {
        return new ResponseEntity<Post>(postService.getPost(id), HttpStatus.OK);
    }
}