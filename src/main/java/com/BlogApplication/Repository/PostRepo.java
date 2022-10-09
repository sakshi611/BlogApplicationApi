package com.BlogApplication.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BlogApplication.Entity.Category;
import com.BlogApplication.Entity.Post;
import com.BlogApplication.Entity.User;

public interface PostRepo extends JpaRepository<Post, Integer>{
	
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	
}
