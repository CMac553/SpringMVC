package com.techtalentsouth.TechTalentBlog.Repository;

import org.springframework.data.repository.CrudRepository;

import com.techtalentsouth.TechTalentBlog.Model.BlogPost;

public interface BlogPostRepository extends CrudRepository<BlogPost, Long>{
	

}
