package com.hazel.feed.user;

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
public class UserController {

    @Autowired
    UserService userService;

	@RequestMapping(path="/user", method = RequestMethod.GET)
	public ResponseEntity<List<User>>  listUser() {
		return new ResponseEntity>(userService.getUsers(), HttpStatus.OK);
	}

	@RequestMapping(path="/user/{id}", method = RequestMethod.GET)
	public ResponseEntity<User>  listUser(@PathVariable(value = "id") Long id){
		return new ResponseEntity(userService.getUserById(id), HttpStatus.OK);

	}

	@RequestMapping(path="/user", method = RequestMethod.POST)
	public ResponseEntity<String>  listUser(@RequestBody User user){
		return new ResponseEntity("18", HttpStatus.OK);
	}
}