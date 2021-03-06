package com.hazel.feed.user;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.hazel.feed.post.Post;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue
	private Long id;
	private String username;
	private String password;

	@OneToMany(mappedBy = "user")
	private List<Post> posts;
	
	public User() {
		super();
	}

	public User(Long id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return username;
	}
	public void setName(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
}
		
}