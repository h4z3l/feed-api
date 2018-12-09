package com.hazel.feed.post;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

import com.hazel.feed.user.User;

@Entity
@Table(name = "posts")
public class Post {

    @Id
	@GeneratedValue
	private Long id;
    private String content;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    public Post() {
        super();
    }

    public Post(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}